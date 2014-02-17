package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.bpel.model.EventHandler;
import org.eclipse.bpel.model.FaultHandler;
import org.eclipse.bpel.model.Flow;
import org.eclipse.bpel.model.Link;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.adapters.AdapterRegistry;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.adapters.IContainer;
import org.eclipse.bpel.ui.adapters.ILabeledElement;
import org.eclipse.bpel.ui.commands.DeleteLinkCommand;
import org.eclipse.bpel.ui.commands.DeletePartnerLinkTypeCommand;
import org.eclipse.bpel.ui.commands.util.AutoUndoCommand;

import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.FlowLinkUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PlatformUI;
import org.eclipse.wst.wsdl.Definition;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;
@SuppressWarnings({"rawtypes","unchecked"})
public class BPELDeleteChildCommand extends AutoUndoCommand{

	private EObject fChild;
	private EObject fParent;

	
	IContainer fContainer;

	Resource[] resourcesToModify = null;

	BPELCompoundCommand fDeleteLinksCmd;
	BPELCompoundCommand fDeletePLTsCmd;

	

	public BPELDeleteChildCommand(EObject child) {
		super(new ArrayList(2));

		fParent = child.eContainer();

		if (fParent instanceof FaultHandler || fParent instanceof EventHandler) {
			// If the child of the FH/EH is the *only* child, then we want to
			// delete the
			// entire FH/EH, since it has no meaningful attributes of its own.
			IContainer<EObject> container = BPELUtil.adapt(fParent,
					IContainer.class);
			List<EObject> children = container.getChildren(fParent);
			if (children.size() == 1 && children.contains(child)) {
				// delete the FH instead
				child = fParent;
				fParent = child.eContainer();
			}
		}
		this.fChild = child;

		if (fParent != null) {
			addModelRoot(fParent);
		}

		fContainer = AdapterRegistry.INSTANCE.adapt(fParent, IContainer.class);

		String childType = null;

		ILabeledElement labeledElement = AdapterRegistry.INSTANCE.adapt(child,
				ILabeledElement.class);
		if (labeledElement != null) {
			childType = labeledElement.getTypeLabel(child);
		}
		if (childType == null) {
			childType = Messages.DeleteChildCommand_Item_1;
		}
		setLabel(NLS.bind(Messages.DeleteChildCommand_Delete_2,
				(new Object[] { childType })));
	}

	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
	/**
	 * @see org.eclipse.bpel.ui.commands.util.AutoUndoCommand#canDoExecute()
	 */
	@Override
	public boolean canDoExecute() {
		if (fChild == null || fParent == null || fContainer == null) {
			return false;
		}
		return fContainer.canRemoveChild(fParent, fChild);
	}


	/**
	 * @see org.eclipse.bpel.ui.commands.util.AutoUndoCommand#doExecute()
	 */
	@Override
	public void doExecute() {

		if (!canExecute()) {
			throw new IllegalStateException();
		}
//
//		Process process = BPELUtils.getProcess(fParent);
//		if (process == null)
//			return;
		AspectEditor aspectEditor = AspectModelHelper.getAspectEditor(fParent);

		EObject topModelObject = fParent;

		// Multi-delete safety: if the child does not have a resource, assume it
		// has
		// already been deleted, and do nothing.
		if (fChild.eResource() == null) {
			return;
		}

		// Figure out which model objects are being deleted.
		HashSet deletingSet = new HashSet();
		AspectModelHelper.addSubtreeToCollection(fChild, deletingSet);

		// If we are deleting any PartnerLinks which reference PLTs in the
		// Artifacts WSDL
		// file, also delete the referenced PLTs.
		Set<PartnerLinkType> partnerLinkTypes = null;
		Definition artifactsDefinition = aspectEditor.getArtifactsDefinition();

		for (Iterator it = deletingSet.iterator(); it.hasNext();) {
			Object object = it.next();
			if (object instanceof PartnerLink) {
				PartnerLinkType plt = ((PartnerLink) object)
						.getPartnerLinkType();
				if ((plt != null)
						&& (plt.getEnclosingDefinition() == artifactsDefinition)) {
					// We should ask the user if delete the partner link type
					if (MessageDialog
							.openQuestion(
									PlatformUI.getWorkbench()
											.getActiveWorkbenchWindow()
											.getShell(),
									Messages.DeletePartnerLinkTypeWarningDialogTitle,
									NLS.bind(Messages.DeletePartnerLinkTypeWarningMessage,
											 (new Object[] {((PartnerLink) object).getName(), plt.getName() })))) {
						if (partnerLinkTypes == null)
							partnerLinkTypes = new HashSet<PartnerLinkType>();
						if (partnerLinkTypes.add(plt)) {
							if (fDeletePLTsCmd == null)
								fDeletePLTsCmd = new BPELCompoundCommand();
							fDeletePLTsCmd
									.add(new DeletePartnerLinkTypeCommand(plt));
						}
					}
				}
			}
		}

		// TODO: Build the set of "all model objects" and subtract...
		HashSet notDeletingSet = new HashSet();
		AspectModelHelper.addSubtreeToCollection(topModelObject, notDeletingSet);
		notDeletingSet.removeAll(deletingSet);

		// We also need to find any flow links which involve a deleted object
		// and remove them.
		// This is a hack, but it could be worse..

		// step 1: find all the flows which contain deleted objects
		HashSet<Flow> flowSet = new HashSet<Flow>();
		for (Iterator<EObject> it = deletingSet.iterator(); it.hasNext();) {
			Flow[] flws = FlowLinkUtil.getParentFlows(it.next());
			flowSet.addAll(Arrays.asList(flws));
		}
		// step 2: if any of the flows is being deleted, we can ignore it
		// this is safe because the source, dest and link itself are all
		// children of the flow
		flowSet.removeAll(deletingSet);

		// step 3: check each link in each of the remaining flows to see if it
		// involves a
		// deleted object. Even if both source and target are being deleted, we
		// should still
		// delete the link, since it is a child of the Flow which is not being
		// deleted.
		fDeleteLinksCmd = new BPELCompoundCommand();
		for (Iterator<Flow> flowIt = flowSet.iterator(); flowIt.hasNext();) {
			Flow flow = flowIt.next();
			for (Iterator<Link> it = FlowLinkUtil.getFlowLinks(flow).iterator(); it
					.hasNext();) {
				Link link = it.next();
				if (deletingSet.contains(FlowLinkUtil.getLinkSource(link))
						|| deletingSet.contains(FlowLinkUtil
								.getLinkTarget(link))) {
					// NOTE: this is safe even if the link is scheduled for
					// deletion by
					// a GEF DeleteAction, see comment in DeleteLinkCommand.
					DeleteLinkCommand child = new DeleteLinkCommand(link);
					if (child.canExecute())
						fDeleteLinksCmd.add(child);
				}
			}
		}

		fDeleteLinksCmd.doExecute();

		if (fDeletePLTsCmd != null) {
			fDeletePLTsCmd.doExecute();
		}

		// finally, we can remove the child.
		fContainer.removeChild(fParent, fChild);

		// IMPORTANT: since the parent is a not-deleted object and the child
		// will be
		// a deleted object, this step must be done *after* the IContainer
		// removal ;)
		for (Iterator it = notDeletingSet.iterator(); it.hasNext();) {
			BPELUtil.deleteNonContainmentRefs((EObject) it.next(), deletingSet);
		}
	}

	// TODO: this is a hack.
	@Override
	public Resource[] getResources() {
		if (resourcesToModify == null) {
//			Process process = BPELUtils.getProcess(fParent);
//			if (process == null)
//				return EMPTY_RESOURCE_ARRAY;
			AspectEditor aspectEditor = AspectModelHelper.getAspectEditor(fParent);

			Set<Resource> resultSet = new HashSet<Resource>();
			resultSet.add(fParent.eResource());

			// Figure out which model objects are being deleted.
			HashSet<Object> deletingSet = new HashSet<Object>();
			AspectModelHelper.addSubtreeToCollection(fChild, deletingSet);

			// If we are deleting any PartnerLinks which reference PLTs in the
			// Artifacts WSDL
			// file, also delete the referenced PLTs.
			Set<PartnerLinkType> partnerLinkTypes = null;
			Definition artifactsDefinition = aspectEditor
					.getArtifactsDefinition();

			for (Iterator it = deletingSet.iterator(); it.hasNext();) {
				Object object = it.next();
				if (object instanceof PartnerLink) {
					PartnerLinkType plt = ((PartnerLink) object)
							.getPartnerLinkType();
					if ((plt != null)
							&& (plt.getEnclosingDefinition() == artifactsDefinition)) {
						if (partnerLinkTypes == null)
							partnerLinkTypes = new HashSet<PartnerLinkType>();
						if (partnerLinkTypes.add(plt)) {
							resultSet.add(plt.eResource());
						}
					}
				}
			}
			resourcesToModify = resultSet
					.toArray(new Resource[resultSet.size()]);
		}
		return resourcesToModify;
	}
	


}
