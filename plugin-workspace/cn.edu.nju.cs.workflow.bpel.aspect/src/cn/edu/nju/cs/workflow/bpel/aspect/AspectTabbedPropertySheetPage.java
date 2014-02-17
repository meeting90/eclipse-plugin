package cn.edu.nju.cs.workflow.bpel.aspect;



import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;

import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyRegistry;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyViewer;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

@SuppressWarnings("restriction")
public class AspectTabbedPropertySheetPage extends TabbedPropertySheetPage{

	protected AspectEditor editor;
	protected TabbedPropertyViewer viewer;
	protected TabbedPropertyRegistry registry;
	
	
	public AspectTabbedPropertySheetPage(
			ITabbedPropertySheetPageContributor tabbedPropertySheetPageContributor,AspectEditor editor) {
		super(tabbedPropertySheetPageContributor);
		this.editor=editor;
	}
	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		// add some actions to the properties view
		setAspectEditorActions();
	}
	private void setAspectEditorActions() {
		IPageSite pageSite = getSite();
		IActionBars actionBars = pageSite.getActionBars(); 
		String id = ActionFactory.REVERT.getId();
		IAction action = editor.getActionRegistry().getAction(id);
		actionBars.setGlobalActionHandler(id, action);
		
		id = ActionFactory.UNDO.getId();
		action = editor.getActionRegistry().getAction(id);
		actionBars.setGlobalActionHandler(id, action);
		
		id = ActionFactory.REDO.getId();
		action = editor.getActionRegistry().getAction(id);
		actionBars.setGlobalActionHandler(id, action);
		actionBars.updateActionBars();
		
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// If we change selection in the Designer then it causes
		// changing selection in the SourceTab too. We are not going to create
		// PropertySheetPage twice, so, ignore the second case
		if (selection instanceof ITextSelection) {
			return;
		}
		selection = calculateSelection(selection);
		super.selectionChanged(part, selection);

	}

	@SuppressWarnings("unchecked")
	protected ISelection calculateSelection(ISelection selection) {
		Set<Object> newSet = new HashSet<Object>();
		if (selection != null && !selection.isEmpty() && (selection instanceof IStructuredSelection)) {
			Iterator<Object> it = ((IStructuredSelection)selection).iterator();
			while (it.hasNext()) {
				Object o = it.next();
				if (o instanceof EditPart) {
					o = ((EditPart)o).getModel();
				}
				if (editor.getMultipageEditor().getActiveEditor() == editor.getMultipageEditor().getTextEditor()) {
					// the selection came from the Source view of this multipage editor so we have to
					// be careful here: if a selection does not have a corresponding property sheet page
					// (e.g. a <copy>, <from>. <to>, etc.) then traverse the selection's ancestors to find
					// an element which DOES have a property sheet page associated with it. 
					while (o!=null && o instanceof EObject && !hasPropertySheetPage(o)) {
						o = ((EObject)o).eContainer();
					}
				}
				newSet.add(o);
			}
		}
		return new StructuredSelection(newSet.toArray(new Object[newSet.size()]));
	}
	
	private boolean hasPropertySheetPage(Object o) {
		return
			o instanceof org.eclipse.bpel.model.Activity ||
			o instanceof org.eclipse.bpel.model.Assign ||
			o instanceof org.eclipse.bpel.model.Catch ||
			o instanceof org.eclipse.bpel.model.CatchAll ||
			o instanceof org.eclipse.bpel.model.CompensateScope ||
			o instanceof org.eclipse.bpel.model.CorrelationSet ||
			o instanceof org.eclipse.bpel.model.Else ||
			o instanceof org.eclipse.bpel.model.ElseIf ||
			o instanceof org.eclipse.bpel.model.Empty ||
			o instanceof org.eclipse.bpel.model.ForEach ||
			o instanceof org.eclipse.bpel.model.If ||
			o instanceof org.eclipse.bpel.model.Invoke ||
			o instanceof org.eclipse.bpel.model.Link ||
			o instanceof org.eclipse.bpel.model.MessageExchange ||
			o instanceof org.eclipse.bpel.model.MessageExchanges ||
			o instanceof org.eclipse.bpel.model.OnAlarm ||
			o instanceof org.eclipse.bpel.model.OnEvent ||
			o instanceof org.eclipse.bpel.model.OnMessage ||
			o instanceof org.eclipse.bpel.model.PartnerLink ||
			o instanceof org.eclipse.bpel.model.PartnerLinks ||
			o instanceof org.eclipse.bpel.model.Pick ||
			o instanceof org.eclipse.bpel.model.Process ||
			o instanceof org.eclipse.bpel.model.Receive ||
			o instanceof org.eclipse.bpel.model.RepeatUntil ||
			o instanceof org.eclipse.bpel.model.Reply ||
			o instanceof org.eclipse.bpel.model.Scope ||
			o instanceof org.eclipse.bpel.model.Throw ||
			o instanceof org.eclipse.bpel.model.Validate ||
			o instanceof org.eclipse.bpel.model.Variable ||
			o instanceof org.eclipse.bpel.model.Variables ||
			o instanceof org.eclipse.bpel.model.Wait ||
			o instanceof org.eclipse.bpel.model.While;
	}
	
	protected TabbedPropertyRegistry getRegistry() {
		if (registry == null) {
			// TODO: hack - use reflection to get the field - it should be API in the super class
			try {
				Field field = TabbedPropertySheetPage.class.getDeclaredField("registry"); //$NON-NLS-1$
				field.setAccessible(true);
				registry = (TabbedPropertyRegistry) field.get(this); 
			} catch (Exception e) {
				AspectUIPlugin.log(e);
			}
		}
		return registry;
	}
	

}
