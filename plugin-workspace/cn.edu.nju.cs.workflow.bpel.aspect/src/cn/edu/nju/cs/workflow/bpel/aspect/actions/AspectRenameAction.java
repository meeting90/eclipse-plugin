package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.adapters.ILabeledElement;
import org.eclipse.bpel.ui.adapters.INamedElement;
import org.eclipse.bpel.ui.editparts.CollapsableEditPart;
import org.eclipse.bpel.ui.editparts.policies.BPELDirectEditPolicy;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.NameDialog;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class AspectRenameAction extends SelectionAction {
	private AspectEditor editor;
	private Request request = new DirectEditRequest();
	public AspectRenameAction(IWorkbenchPart editor) {
		super(editor);
		this.editor=(AspectEditor) editor;
	}
	@Override
	protected void init() {
		super.init();
		setText(Messages.RenameAction_Rename_0); 
		setToolTipText(Messages.RenameAction_Rename_1); 
		setId(ActionFactory.RENAME.getId());
		setEnabled(false);
	}
	@Override
	protected boolean calculateEnabled() {
		if (getSelectedObjects().size() != 1) return false;
		Object o = getSelectedObjects().get(0);
		EditPart part = (EditPart)editor.getGraphicalViewer().getEditPartRegistry().get(o);
		if (part == null) return false;
		return part.understandsRequest(request);
	}

	@Override
	public void run() {
		Object o = getSelectedObjects().get(0);
		GraphicalEditPart part = (GraphicalEditPart)editor.getGraphicalViewer().getEditPartRegistry().get(o);
		if (shouldShowDialog(o)) {
			Object model = part.getModel();
			// This assumes that if model implements both INamedElement and ILabeledElement, then it
			// can be renamed using labeledElement.getLabel() and SetDisplayNameCommand().
			INamedElement namedElement = BPELUtil.adapt(model, INamedElement.class);
			ILabeledElement labeledElement = BPELUtil.adapt(model, ILabeledElement.class);
			
			boolean canSetName = (namedElement != null);
			
			if (labeledElement != null && (canSetName)) {
				String name = labeledElement.getLabel(model);
				NameDialog nameDialog = new NameDialog(part.getViewer().getControl().getShell(),
					Messages.BPELEditPart_Rename_2, Messages.BPELEditPart_Enter_a_new_name_3, name, null); 
				if (nameDialog.open() == Window.OK) {
					Command cmd = BPELDirectEditPolicy.getFinalizeCommand(model, nameDialog.getValue());
					part.getViewer().getEditDomain().getCommandStack().execute(cmd);
				}
			}
			return;
		}
		part.performRequest(request);
	}
	
	/**
	 * Whether the rename should be done through a dialog or direct edit.
	 */
	protected boolean shouldShowDialog(Object model) {
		if (model instanceof Sequence) return false;
		if (model instanceof Process) return true;
		EditPart part = (EditPart)editor.getGraphicalViewer().getEditPartRegistry().get(model);
		if (part instanceof CollapsableEditPart) return !((CollapsableEditPart)part).isCollapsed();
		return false;
	}

}
