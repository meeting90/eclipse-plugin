package cn.edu.nju.cs.workflow.bpel.aspect;

import java.util.List;

import org.eclipse.bpel.common.ui.tray.AddChildInTrayAction;
import org.eclipse.bpel.model.adapters.AdapterRegistry;
import org.eclipse.bpel.ui.BPELEditor;
import org.eclipse.bpel.ui.BPELMultipageEditorPart;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.actions.AbstractDeclarationAction;
import org.eclipse.bpel.ui.actions.AutoArrangeFlowsAction;
import org.eclipse.bpel.ui.actions.BPELCopyAction;
import org.eclipse.bpel.ui.actions.BPELCutAction;
import org.eclipse.bpel.ui.actions.BPELDeleteAction;
import org.eclipse.bpel.ui.actions.BPELDuplicateAction;
import org.eclipse.bpel.ui.actions.BPELPasteAction;
import org.eclipse.bpel.ui.actions.EditPartContextAction;
import org.eclipse.bpel.ui.actions.MakePartner2WayAction;
import org.eclipse.bpel.ui.actions.ShowPaletteInPaletteViewAction;
import org.eclipse.bpel.ui.actions.ShowPropertiesViewAction;
import org.eclipse.bpel.ui.actions.ToggleAutoFlowLayout;
import org.eclipse.bpel.ui.actions.ToggleLayoutOrientationAction;
import org.eclipse.bpel.ui.actions.ToggleShowCompensationHandler;
import org.eclipse.bpel.ui.actions.ToggleShowEventHandler;
import org.eclipse.bpel.ui.actions.ToggleShowFaultHandler;
import org.eclipse.bpel.ui.actions.ToggleShowTerminationHandler;
import org.eclipse.bpel.ui.actions.editpart.IEditPartAction;
import org.eclipse.bpel.ui.adapters.IEditPartActionContributor;
import org.eclipse.bpel.ui.editparts.BPELEditPart;
import org.eclipse.bpel.ui.editparts.CorrelationSetsEditPart;
import org.eclipse.bpel.ui.editparts.MessageExchangesEditPart;
import org.eclipse.bpel.ui.editparts.PartnerLinksEditPart;
import org.eclipse.bpel.ui.editparts.ReferencePartnerLinksEditPart;
import org.eclipse.bpel.ui.editparts.VariablesEditPart;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;

import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;


public class AspectContentMenuProvider extends ContextMenuProvider{
	private ActionRegistry actionRegistry;
	private ITextEditor textEditor;
	private AspectEditor designEditor;
	
	protected static final String EDITPART_ACTIONS = "org.eclipse.bpel.ui.EditPartActions"; //$NON-NLS-1$
	protected static final String FREQUENT_ACTIONS = "org.eclipse.bpel.ui.FrequentActions"; //$NON-NLS-1$
	
	protected static final String ADVANCED_ACTIONS = IWorkbenchActionConstants.MB_ADDITIONS;

	protected static final String LAYOUT_ACTIONS = "org.eclipse.bpel.ui.LayoutActions"; //$NON-NLS-1$
	protected static final String DEBUG_ACTIONS = "org.eclipse.bpel.ui.DebugActions"; //$NON-NLS-1$

	public AspectContentMenuProvider(AspectEditor  editor,ActionRegistry registry) {
		super(editor.getGraphicalViewer());
		this.actionRegistry=registry;
		textEditor = editor.getMultipageEditor().getTextEditor(); 
		designEditor=editor;
		
	}

	@Override
	public void buildContextMenu(IMenuManager menu) {
		IAction action, action2;

		menu.add(new Separator(GEFActionConstants.GROUP_UNDO));
		menu.add(new Separator(EDITPART_ACTIONS));
		menu.add(new Separator(FREQUENT_ACTIONS));
		menu.add(new Separator(GEFActionConstants.GROUP_COPY));
		menu.add(new Separator(GEFActionConstants.GROUP_EDIT));
		menu.add(new Separator(GEFActionConstants.GROUP_REST));
		menu.add(new Separator(ADVANCED_ACTIONS));
		menu.add(new Separator(GEFActionConstants.GROUP_VIEW));
		menu.add(new Separator(LAYOUT_ACTIONS));
		menu.add(new Separator(DEBUG_ACTIONS));
		menu.add(new Separator(IWorkbenchActionConstants.GROUP_SHOW_IN));

		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, textEditor.getAction(ITextEditorActionConstants.UNDO));
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, textEditor.getAction(ITextEditorActionConstants.REDO));
		
		//action = actionRegistry.getAction(ActionFactory.REVERT.getId());
		//if (action.isEnabled()) menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
//
//		menu.appendToGroup(GEFActionConstants.GROUP_COPY, actionRegistry.getAction(BPELCutAction.ID));
//		menu.appendToGroup(GEFActionConstants.GROUP_COPY, actionRegistry.getAction(BPELCopyAction.ID));
//		menu.appendToGroup(GEFActionConstants.GROUP_COPY, actionRegistry.getAction(BPELPasteAction.ID));	
//		menu.appendToGroup(GEFActionConstants.GROUP_COPY, actionRegistry.getAction(BPELDuplicateAction.ACTION_ID));


		MenuManager addMenu = new MenuManager(Messages.ProcessContextMenuProvider_Add_1);
		
		// Frequently-used actions
		List selected = getViewer().getSelectedEditParts();
		if (selected.size() == 1) {// any more than 1 is ambiguous
			if (selected.get(0) instanceof BPELEditPart) {
				BPELEditPart p = (BPELEditPart)selected.get(0);
				Object model = p.getModel();
				IEditPartActionContributor contributor =BPELUtil.adapt(model, IEditPartActionContributor.class);
				if (contributor != null) {
					for (IEditPartAction epAction : contributor.getEditPartActions(p)) {
						String s = epAction.getToolTip();
						
						ImageDescriptor imageDes = epAction.getIcon();
						if (s != null && imageDes != null) {
							EditPartContextAction conAction = new EditPartContextAction(null, p, epAction);
							
							if ( epAction instanceof AbstractDeclarationAction )
								addMenu.add(conAction);
							else
								menu.appendToGroup(EDITPART_ACTIONS, conAction);
						}
					}
				}
			}
		}
		
		// Add and Insert actions
		if (addMenu.getItems().length>0)
			addMenu.add(new Separator());
		MenuManager insertMenu = new MenuManager(Messages.ProcessContextMenuProvider_Insert_Before_2); 

		
	
		for (IAction anAction : designEditor.getAppendNewActions()) {
			if (anAction != null) {
				if (anAction instanceof SelectionAction)
					((SelectionAction)anAction).update();
				if (anAction.isEnabled())
					addMenu.add(anAction);
			}			
		}
		for (IAction anAction : designEditor.getInsertNewActions()) {
			if (anAction != null) {
				
				if (anAction instanceof SelectionAction)
					((SelectionAction)anAction).update();
				if (anAction.isEnabled())
				insertMenu.add(anAction);
			}
		}
		
		if (!addMenu.isEmpty()) {
			menu.appendToGroup(FREQUENT_ACTIONS, addMenu);
		}
		if (!insertMenu.isEmpty()) {
			menu.appendToGroup(FREQUENT_ACTIONS, insertMenu);
		}
		
		// Change Type Actions
		MenuManager changeTypeMenu = new MenuManager(Messages.ProcessContextMenuProvider_Change_Type_3);
		
		for(IAction anAction : designEditor.getChangeTypeActions()) {
			if (anAction != null && anAction.isEnabled()) {
				changeTypeMenu.add( anAction );
			}
		}
		
		menu.appendToGroup(FREQUENT_ACTIONS, changeTypeMenu);

		action = actionRegistry.getAction(AddChildInTrayAction.calculateId(PartnerLinksEditPart.class));
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(FREQUENT_ACTIONS, action);
		}
		
		action = actionRegistry.getAction(AddChildInTrayAction.calculateId(ReferencePartnerLinksEditPart.class));
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(FREQUENT_ACTIONS, action);
		}
		
		action = actionRegistry.getAction(AddChildInTrayAction.calculateId(VariablesEditPart.class));
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(FREQUENT_ACTIONS, action);
		}
		
		action = actionRegistry.getAction(AddChildInTrayAction.calculateId(CorrelationSetsEditPart.class));
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(FREQUENT_ACTIONS, action);
		}

		action = actionRegistry.getAction(AddChildInTrayAction.calculateId(MessageExchangesEditPart.class));
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(FREQUENT_ACTIONS, action);
		}
		
		action = actionRegistry.getAction(MakePartner2WayAction.ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(FREQUENT_ACTIONS, action);
		}
		
		// Delete (always shown) and Rename (if appropriate)
//	    menu.appendToGroup(GEFActionConstants.GROUP_EDIT, actionRegistry.getAction(BPELDeleteAction.ID));
		action = actionRegistry.getAction(ActionFactory.RENAME.getId());
		
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		}
		
		action = actionRegistry.getAction(GEFActionConstants.ZOOM_IN); 
		action2 = actionRegistry.getAction(GEFActionConstants.ZOOM_OUT); 
		if (action.isEnabled() || action2.isEnabled()) {
			menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
			menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action2);
		}
		
		action = actionRegistry.getAction(ToggleAutoFlowLayout.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
			action.setChecked(true);
		}

		action = actionRegistry.getAction(AutoArrangeFlowsAction.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
		}
		
		action = actionRegistry.getAction(ToggleLayoutOrientationAction.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
		}
		
		action = actionRegistry.getAction(ToggleShowFaultHandler.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
			action.setChecked(true);
		}
		
		action = actionRegistry.getAction(ToggleShowCompensationHandler.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
			action.setChecked(true);
		}

		action = actionRegistry.getAction(ToggleShowTerminationHandler.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
			action.setChecked(true);
		}

		action = actionRegistry.getAction(ToggleShowEventHandler.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(LAYOUT_ACTIONS, action);
			action.setChecked(true);
		}
		
		action = actionRegistry.getAction(ShowPropertiesViewAction.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(IWorkbenchActionConstants.GROUP_SHOW_IN, action);
			action.setChecked(false);
		}
		
		action = actionRegistry.getAction(ShowPaletteInPaletteViewAction.ACTION_ID);
		if (action != null && action.isEnabled()) {
			menu.appendToGroup(IWorkbenchActionConstants.GROUP_SHOW_IN, action);
			action.setChecked(false);
		}
	}
		
	

}
