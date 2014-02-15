package cn.edu.nju.cs.workflow.bpel.aspect.editors;




import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPartSite;

import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

public class AspectEditorContributor extends MultiPageEditorActionBarContributor{

	private IEditorPart activeEditorPart;
	private AspectEditor aspectEditor;
	@Override
	public void setActivePage(IEditorPart part) {
		if (activeEditorPart == part)
			return;

		activeEditorPart = part;

		IActionBars actionBars = getActionBars();

		if (activeEditorPart != null && activeEditorPart instanceof ITextEditor) {
			IActionBars siteActionBars = ((IEditorSite)activeEditorPart.getEditorSite()).getActionBars();
			siteActionBars.setGlobalActionHandler(ITextEditorActionConstants.UNDO, getAction((ITextEditor)activeEditorPart, ITextEditorActionConstants.UNDO));
			siteActionBars.setGlobalActionHandler(ITextEditorActionConstants.REDO, getAction((ITextEditor)activeEditorPart, ITextEditorActionConstants.REDO));
			siteActionBars.updateActionBars();              
		} else {
			if (part instanceof AspectEditor) {
				aspectEditor = (AspectEditor) part;
			}
			if (aspectEditor != null) {
				Object adapter = aspectEditor.getAdapter(ActionRegistry.class);
				if (adapter instanceof ActionRegistry) {
					//TODO register actions
//					ActionRegistry registry = (ActionRegistry) adapter;
//					// COPY
//					IAction action = registry.getAction(BPELCopyAction.ID);
//					actionBars.setGlobalActionHandler(ActionFactory.COPY
//							.getId(), action);
//					// CUT
//					action = registry.getAction(BPELCutAction.ID);
//					actionBars.setGlobalActionHandler(
//							ActionFactory.CUT.getId(), action);
//					// PASTE
//					action = registry.getAction(BPELPasteAction.ID);
//					actionBars.setGlobalActionHandler(ActionFactory.PASTE
//							.getId(), action);
//					// DELETE
//					action = registry.getAction(BPELDeleteAction.ID);
//					actionBars.setGlobalActionHandler(ActionFactory.DELETE
//							.getId(), action);
				}
				
				IWorkbenchPartSite site = aspectEditor.getSite();
		        if (site instanceof IEditorSite) 
		        {
		          ITextEditor textEditor = aspectEditor.getMultipageEditor().getTextEditor();
		          IActionBars siteActionBars = ((IEditorSite) site).getActionBars();
		          siteActionBars.setGlobalActionHandler(ITextEditorActionConstants.UNDO, getAction(textEditor, ITextEditorActionConstants.UNDO));
		          siteActionBars.setGlobalActionHandler(ITextEditorActionConstants.REDO, getAction(textEditor, ITextEditorActionConstants.REDO));
		          siteActionBars.updateActionBars();              
		        }       
			}
		}

		if (actionBars != null) {
			// update menu bar and tool bar
			actionBars.updateActionBars();
		}

	
		
	}
	protected IAction getAction(ITextEditor editor, String actionID) {
		// TODO Auto-generated method stub
		return (editor == null ? null : editor.getAction(actionID));
	}
	

}
