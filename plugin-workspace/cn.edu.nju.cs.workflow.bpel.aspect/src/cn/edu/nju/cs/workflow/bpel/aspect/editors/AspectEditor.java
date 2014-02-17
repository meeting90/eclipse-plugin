package cn.edu.nju.cs.workflow.bpel.aspect.editors;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.bpel.common.ui.CommonUIPlugin;
import org.eclipse.bpel.common.ui.ICommonUIConstants;
import org.eclipse.bpel.common.ui.command.EditModelCommandFramework;
import org.eclipse.bpel.common.ui.command.ICommandFramework;
import org.eclipse.bpel.common.ui.tray.AdaptingSelectionProvider;
import org.eclipse.bpel.common.ui.tray.GraphicalEditorWithPaletteAndTray;
import org.eclipse.bpel.common.ui.tray.MultiViewerSelectionProvider;
import org.eclipse.bpel.common.ui.tray.TrayComposite;
import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Flow;
import org.eclipse.bpel.ui.BPELAdaptingSelectionProvider;
import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.IHelpContextIds;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.WeakMultiViewerSelectionProvider;
import org.eclipse.bpel.ui.actions.AppendNewAction;
import org.eclipse.bpel.ui.actions.AutoArrangeFlowsAction;
import org.eclipse.bpel.ui.actions.BPELPrintAction;
import org.eclipse.bpel.ui.actions.ChangeTypeAction;
import org.eclipse.bpel.ui.actions.InsertNewAction;
import org.eclipse.bpel.ui.actions.MakePartner2WayAction;
import org.eclipse.bpel.ui.actions.ShowPaletteInPaletteViewAction;
import org.eclipse.bpel.ui.actions.ShowPropertiesViewAction;
import org.eclipse.bpel.ui.actions.ShowViewAction;
import org.eclipse.bpel.ui.actions.ToggleAutoFlowLayout;
import org.eclipse.bpel.ui.actions.ToggleLayoutOrientationAction;
import org.eclipse.bpel.ui.actions.ToggleShowCompensationHandler;
import org.eclipse.bpel.ui.actions.ToggleShowEventHandler;
import org.eclipse.bpel.ui.actions.ToggleShowFaultHandler;
import org.eclipse.bpel.ui.actions.ToggleShowTerminationHandler;
import org.eclipse.bpel.ui.commands.util.ModelAutoUndoRecorder;
import org.eclipse.bpel.ui.editparts.FlowEditPart;
import org.eclipse.bpel.ui.factories.AbstractUIObjectFactory;
import org.eclipse.bpel.ui.util.BPELCreationToolEntry;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.ModelHelper;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.PrintAction;
import org.eclipse.gef.ui.actions.RedoAction;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectAllAction;
import org.eclipse.gef.ui.actions.UndoAction;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorSite;
import org.eclipse.wst.wsdl.Definition;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectContentMenuProvider;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectEditModelClient;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectEditPartFactory;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectRootEditPart;
import cn.edu.nju.cs.workflow.bpel.aspect.IAspectUIConstants;
import cn.edu.nju.cs.workflow.bpel.aspect.ScollingAspectGraphicalViewer;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.AspectRenameAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELAppendNewAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELAutoArrangeFlowsAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELInsertNewAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELMakePartner2WayAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELRevertAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELToggleAutoFlowLayout;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELToggleLayoutOrientationAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELToggleShowCompensationHandler;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELToggleShowEventHandler;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELToggleShowFaultHandler;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELToggleShowTerminationHandler;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;

public class AspectEditor extends GraphicalEditorWithPaletteAndTray{
	protected AspectEditModelClient editModelClient;
	
	protected AspectMultipageEditorPart multipageEditor;
	
	protected AspectEditorAdapter editorAdapter;
	
	protected EditPart lastSelectedEditPart;
	
	protected Set<IAction> appendNewActions;
	protected Set<IAction> insertNewActions;
	protected Set<IAction> changeTypeActions;
	
	protected ICommandFramework commandFramework;
	
	private ModelAutoUndoRecorder modelAutoUndoRecorder;

	private ISelectionChangedListener selectionChangeListener;

	private AdaptingSelectionProvider adaptingSelectionProvider;

	private WeakMultiViewerSelectionProvider weakMultiViewerSelectionProvider;
	
	public AspectEditor(DefaultEditDomain editDomain,
			AspectMultipageEditorPart multipageEditor) {
		super();
		setEditDomain(editDomain);
		this.multipageEditor = multipageEditor;
		this.modelAutoUndoRecorder = new ModelAutoUndoRecorder();
		
	}

	@Override
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		IFile input = (IFile) editorInput.getAdapter(IFile.class);
		if (input == null)			
			throw new PartInitException(Messages.BPELEditor_Cant_read_input_file_1); 
		
		super.init(site, editorInput);
		getCommandStack().removeCommandStackListener(this);

		ResourceSet resourceSet = getEditModelClient().getEditModel().getResourceSet();

		resourceSet.eAdapters().add(editorAdapter = new AspectEditorAdapter());
		
		commandFramework = new EditModelCommandFramework(getEditModelClient().getCommandStack());
		
		getCommandStack().addCommandStackListener(this);
		
		createPaletteDependentActions();
	}
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		
		GraphicalViewer viewer = getGraphicalViewer();
		registerViewer(viewer);
		AspectRootEditPart root = (AspectRootEditPart) viewer.getRootEditPart();
		ZoomInAction zoomInAction = new ZoomInAction(root.getZoomManager());
		zoomInAction.setImageDescriptor(CommonUIPlugin.getDefault().getImageRegistry().getDescriptor(ICommonUIConstants.ICON_ZOOM_IN_TOOL));
		getActionRegistry().registerAction(zoomInAction);
		ZoomOutAction zoomOutAction = new ZoomOutAction(root.getZoomManager());
		zoomOutAction.setImageDescriptor(CommonUIPlugin.getDefault().getImageRegistry().getDescriptor(ICommonUIConstants.ICON_ZOOM_OUT_TOOL));
		getActionRegistry().registerAction(zoomOutAction);
		
	    //getSite().getKeyBindingService().registerAction(zoomInAction);
	    //getSite().getKeyBindingService().registerAction(zoomOutAction);
		
//		ContextMenuProvider provider = new ProcessContextMenuProvider(this, getActionRegistry());
//		getGraphicalViewer().setContextMenu(provider);
//		getSite().setSelectionProvider(getAdaptingSelectionProvider());
//		getSite().registerContextMenu("org.eclipse.bpel.editor.contextmenu", //$NON-NLS-1$
//			provider, getSite().getSelectionProvider());
//		getGraphicalViewer().setKeyHandler(new BPELGraphicalKeyHandler(getGraphicalViewer()).setParent(getEditorKeyHandler()));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void createActions() {

		ActionRegistry registry = getActionRegistry();
		IAction action;

		action = new UndoAction(this);
		registry.registerAction(action);
		getStackActions().add(action.getId());
		
		action = new RedoAction(this);
		registry.registerAction(action);
		getStackActions().add(action.getId());
		
		action = new SelectAllAction(this);
		registry.registerAction(action);
		
		action = new SaveAction(this);
		registry.registerAction(action);
		getPropertyActions().add(action.getId());
		
		registry.registerAction(new PrintAction(this));
		
		// hook up some custom actions that are specialized versions of 
		// the default actions.
//		action = new BPELDeleteAction(this);
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//		
//		action = new BPELCutAction(this);
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//	
//		action = new BPELCopyAction(this);
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//
//		action = new BPELPasteAction(this);
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//		
//		action = new BPELDuplicateAction(this);
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//
		action = new BPELRevertAction(this);
		registry.registerAction(action);
		getPropertyActions().add(action.getId());

		action = new AspectRenameAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new BPELToggleAutoFlowLayout(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new BPELToggleShowFaultHandler(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new BPELToggleShowCompensationHandler(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());

		action = new BPELToggleShowTerminationHandler(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());

		action = new BPELToggleShowEventHandler(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new BPELAutoArrangeFlowsAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new BPELToggleLayoutOrientationAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		// show properties action
		ShowViewAction showViewAction = new ShowPropertiesViewAction();	
		showViewAction.setPage( getSite().getPage() );
		registry.registerAction(showViewAction);

		// Show Palette in Palette View action
		showViewAction = new ShowPaletteInPaletteViewAction();
		showViewAction.setPage( getSite().getPage() );
		registry.registerAction(showViewAction);


		action = new BPELPrintAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());

//		action = new BPELAddChildInTrayAction(this, 
//				PartnerLinksEditPart.class, 
//				Messages.BPELEditor_addPartnerLink,  
//				BPELUIPlugin.INSTANCE.getImageDescriptor(IBPELUIConstants.ICON_PARTNER_IN_16));
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
	
//		action = new BPELAddChildInTrayAction(this, 
//				PartnerLinksEditPart.class, 
//				Messages.BPELEditor_addInterfacePartner,  
//				BPELUIPlugin.getPlugin().getImageDescriptor(IBPELUIConstants.ICON_PARTNER_IN_16));
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//		
//		action = new BPELAddChildInTrayAction(this, 
//				ReferencePartnerLinksEditPart.class, 
//				Messages.BPELEditor_addReferencePartner,  
//				BPELUIPlugin.getPlugin().getImageDescriptor(IBPELUIConstants.ICON_PARTNER_OUT_16));
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
		
//		action = new BPELAddChildInTrayAction(this, 
//				VariablesEditPart.class, 
//				Messages.BPELEditor_addVariable,  
//				BPELUIPlugin.INSTANCE.getImageDescriptor(IBPELUIConstants.ICON_VARIABLE_16));
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//		
//		action = new BPELAddChildInTrayAction(this, 
//				CorrelationSetsEditPart.class, 
//				Messages.BPELEditor_addCorrelationSet,  
//				BPELUIPlugin.INSTANCE.getImageDescriptor(IBPELUIConstants.ICON_CORRELATIONSET_16));
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());
//		
//		action = new BPELAddChildInTrayAction(this, 
//				MessageExchangesEditPart.class, 
//				Messages.BPELEditor_addMessageExchange,  
//				BPELUIPlugin.INSTANCE.getImageDescriptor(IBPELUIConstants.ICON_EXIT_16));//TODO - replace icon with right one
//		registry.registerAction(action);
//		getSelectionActions().add(action.getId());

		action = new BPELMakePartner2WayAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
	}

	@Override
	protected void createGraphicalViewer(Composite parent) {
		GraphicalViewer viewer = new ScollingAspectGraphicalViewer();
		viewer.createControl(parent);
		setGraphicalViewer(viewer);
		configureGraphicalViewer();
		hookGraphicalViewer();
		initializeGraphicalViewer();
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(
			parent, IHelpContextIds.EDITOR_CANVAS);	
	}
	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
		getGraphicalViewer().setEditPartFactory(new AspectEditPartFactory());
		
		BPELUIPlugin.INSTANCE.getPreferenceStore().setValue(IBPELUIConstants.PREF_SHOW_FREEFORM_FLOW, true);
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setContents(getAspect());
		
		ContextMenuProvider provider = new AspectContentMenuProvider(this, getActionRegistry());
		viewer.setContextMenu(provider);
		getSite().registerContextMenu("cn.edu.nju.cs.worklfow.aspect.contentmenu", //$NON-NLS-1$
			provider, getSite().getSelectionProvider());


		this.selectionChangeListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				StructuredSelection selection = (StructuredSelection)event.getSelection();
				if (selection.isEmpty()) {
					return;
				}
				// if this is a multi-selection we should not present anything on the details area
				if (selection.size() > 1) {
					// TODO: This doesn't work
//					getBPELDetailsEditor().getDetailsArea().setInput(null);
				} else {
					final Object o = selection.getFirstElement();
					if (o instanceof EditPart) {
						// CAREFUL: must setInput() on the DetailsArea *before* we remember
						// the lastSelectedEditPart (because setInput() might execute a pending
						// command for an IOngoingChange whose wrapper will not execute correctly
						// unless lastSelectedEditPart has its old value).
						lastSelectedEditPart = (EditPart)o;
					}
				}
			}
		};
		getGraphicalViewer().addSelectionChangedListener(this.selectionChangeListener);
		arrangeEditParts(getGraphicalViewer());
		
	}
	@Override
	protected void initializeTrayViewer() {
//		GraphicalViewer viewer = getTrayViewer();
//		
//		viewer.setEditPartFactory(new BPELTrayEditPartFactory());
//		viewer.setEditDomain(getEditDomain());
//		getEditDomain().addViewer(viewer);
//		//viewer.addSelectionChangedListener(this.traySelectionChangeListener);
//		registerViewer(viewer);
		
		
	}

	

	private void arrangeEditParts(GraphicalViewer graphicalViewer) {
		// Make a list of all FlowEditParts whose children all have no positional metadata
				List<FlowEditPart> flowsToArrange = new ArrayList<FlowEditPart>();
				List<Point> flowChildlocations = new ArrayList<Point>();

				for (TreeIterator<EObject> it = getAspect().eAllContents(); it.hasNext(); ) {
					EObject model = it.next();
					if (model instanceof Flow) {
						boolean missingLoc = false;
						for (Iterator<Activity> it2 = ((Flow)model).getActivities().iterator();
							!missingLoc && it2.hasNext(); )
						{
							Activity child = it2.next();
							if (child == null) continue;
							Point loc = ModelHelper.getLocation(child);
							if (loc.x == Integer.MIN_VALUE)  missingLoc = true;
							flowChildlocations.add(new Point(loc));
						}
						
						if (flowChildlocations.size()>1)
						{
							for ( int i=0; !missingLoc && i<flowChildlocations.size(); ++i )
							{
								int x = flowChildlocations.get(i).x;
								int y = flowChildlocations.get(i).y;
								for ( int j=i+1; !missingLoc && j<flowChildlocations.size(); ++j )
								{
									Point loc = flowChildlocations.get(j);
									if (loc.x == x && loc.y==y)
										missingLoc = true;
								}
							}
						}
						if (missingLoc) {
							EditPart editPart = (EditPart)graphicalViewer.getEditPartRegistry().get(model); 
							if (editPart instanceof FlowEditPart)  flowsToArrange.add((FlowEditPart) editPart);		
						}
					}
				}
				
				BPELUtil.sortFlowList(flowsToArrange);
				for (FlowEditPart flowEditPart : flowsToArrange) {
					flowEditPart.doImmediateAutoLayout();
				}
		
	}

	@Override
	public IEditorSite getEditorSite() {
		// TODO Auto-generated method stub
		return super.getEditorSite();
	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected String getPaletteAdditionsContributorId() {
		
		return IAspectUIConstants.ASPECT_EDITOR_ID;
	}
	@Override
	protected PaletteViewerProvider createPaletteViewerProvider() {
		 return new PaletteViewerProvider(getEditDomain()) {     
		      @Override
		      protected void configurePaletteViewer(PaletteViewer viewer) {
		        super.configurePaletteViewer(viewer);
		
		        viewer.addDragSourceListener(new TemplateTransferDragSourceListener(viewer));
		
		        PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), IHelpContextIds.EDITOR_PALETTE);
		      }
		    };
	}
	@Override
	public GraphicalViewer getGraphicalViewer() {
		// TODO Auto-generated method stub
		return super.getGraphicalViewer();
	}
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		getTrayComposite().setState(TrayComposite.STATE_EXPANDED);
		getTrayComposite().setTrayWidth(150);
		getEditorSite().getKeyBindingService();
		selectModelObject(getAspect());
	}
	

	public void selectModelObject(Object modelObject) {
		setFocus(); // give focus to the editor so that it can notify the properties view of input change
		if (modelObject == null) {
			adaptingSelectionProvider.setSelection(StructuredSelection.EMPTY);
		} else {
			adaptingSelectionProvider.setSelection(new StructuredSelection(modelObject));
		}
		
	}

	//make public
	@Override
	public ActionRegistry getActionRegistry() { return super.getActionRegistry(); }
	protected class AspectEditorAdapter implements Adapter {
		public Notifier getTarget() { return null; }
		public void setTarget(Notifier newTarget) { }
		public boolean isAdapterForType(Object type) { return (type == AspectEditorAdapter.class); }
		public void notifyChanged(Notification notification) { }
		public AspectEditor getAspectEditor() { return AspectEditor.this; }
	}

	
	public static AspectEditor getAspectEditor(ResourceSet resourceSet) {
	    Iterator<Adapter> it = resourceSet.eAdapters().iterator();
	    while (it.hasNext()) {
	        Object next = it.next();
	        if (next instanceof AspectEditorAdapter) {
	            return ((AspectEditorAdapter)next).getAspectEditor();
	        }
	    }
	    return null;
	}
	//public Resource getResource() { return getAspects().eResource(); }
	public Aspect getAspect() {
		IWorkbenchPartSite editorSite = getSite();
		if (editorSite instanceof MultiPageEditorSite) {
			Aspect aspect= (Aspect)((org.eclipse.ui.part.MultiPageEditorSite)getSite()).getMultiPageEditor().getAdapter(Aspect.class);
			return aspect;
		}
		return null;
	}

	public AspectMultipageEditorPart getMultipageEditor() {
		
		return this.multipageEditor;
	}
	
	public AspectEditModelClient getEditModelClient() {	
		return editModelClient;
	}
	
	public void setEditModelClient(AspectEditModelClient cl) {	
		this.editModelClient = cl;
	}
	public ICommandFramework getCommandFramework() { return commandFramework; }
	public ModelAutoUndoRecorder getModelAutoUndoRecorder() { return modelAutoUndoRecorder; }
	public Set<IAction> getAppendNewActions() { return appendNewActions; }
	public Set<IAction> getInsertNewActions() { return insertNewActions; }
	public Set<IAction> getChangeTypeActions() { return changeTypeActions; }
	
	private void createPaletteDependentActions() {
		Comparator<IAction> actionComparator = new Comparator<IAction>() {
			Collator collator = Collator.getInstance();
			public int compare(IAction o1, IAction o2) {
				return collator.compare(o1.getText(), o2.getText());
			}
		};
		
		appendNewActions = new TreeSet<IAction>(actionComparator);
		insertNewActions = new TreeSet<IAction>(actionComparator);
		changeTypeActions = new TreeSet<IAction>(actionComparator);
		createPaletteDependentActions(getPaletteRoot());
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void createPaletteDependentActions(PaletteContainer container) {
		ActionRegistry registry = getActionRegistry();
		for(Iterator iter = container.getChildren().iterator(); iter.hasNext();) {
			Object element = iter.next();
			if (element instanceof PaletteContainer) {
				createPaletteDependentActions((PaletteContainer)element);
			} else if (element instanceof BPELCreationToolEntry) {
				BPELCreationToolEntry entry = (BPELCreationToolEntry) element;
				AbstractUIObjectFactory factory = entry.getUIObjectFactory();
				
				// append
				IAction action = new BPELAppendNewAction(this, factory);
				appendNewActions.add(action);
				registry.registerAction(action);
				
				getSelectionActions().add(action.getId());

				// insert
				action = new BPELInsertNewAction(this, factory);
				registry.registerAction(action);
				insertNewActions.add(action);
				getSelectionActions().add(action.getId());
				
				// change type
				action = new ChangeTypeAction(this, factory);
				registry.registerAction(action);
				changeTypeActions.add(action);
				getSelectionActions().add(action.getId());
			}
		}
		
	}

	private void registerViewer(GraphicalViewer viewer) {
	
		getAdaptingSelectionProvider().addViewer(viewer);
		getMultiViewerSelectionProvider().addViewer(viewer);
	}

	public ResourceSet getResourceSet() {
		// TODO Auto-generated method stub
		return getEditModelClient().getEditModel().getResourceSet();
	}

	public AdaptingSelectionProvider getAdaptingSelectionProvider() {
		if (adaptingSelectionProvider == null) {
			adaptingSelectionProvider = new BPELAdaptingSelectionProvider();
		}
		return adaptingSelectionProvider;
		
	}
	public ISelection getSelection() {
		ISelection editPartSelection = getGraphicalViewer().getSelection();
		if (editPartSelection == null || !(editPartSelection instanceof StructuredSelection) || editPartSelection.isEmpty()) {
			return StructuredSelection.EMPTY;
		}
		ArrayList<Object> list = new ArrayList<Object>();
		Iterator it = ((StructuredSelection)editPartSelection).iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof EditPart) {
				list.add(((EditPart)o).getModel());
			}
		}
		return new StructuredSelection(list);
	}
	

	private MultiViewerSelectionProvider getMultiViewerSelectionProvider() {
		if (weakMultiViewerSelectionProvider == null) {
			weakMultiViewerSelectionProvider = new WeakMultiViewerSelectionProvider() {
				protected ISelection cachedAdaptingSelection;
				@Override
				public ISelection getSelection() {
					// HACK to fix selection coherency problems:
					// If the AdaptingSelectionProvider selection has changed, assume ours
					// has changed as well!
					if (getAdaptingSelectionProvider().getSelection() != cachedAdaptingSelection) {
						cachedSelection = null;  // force super to recalculate
					}
					return super.getSelection();
				}
			};
		}
		return weakMultiViewerSelectionProvider;
	}

	public boolean isHorizontalLayout() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public CommandStack getCommandStack() {
		IWorkbenchPartSite editorSite = getSite();
		if (editorSite instanceof MultiPageEditorSite) {
			return (CommandStack)((org.eclipse.ui.part.MultiPageEditorSite)getSite()).getMultiPageEditor().getAdapter(CommandStack.class);
		}
		return null;
	}

	public void setHorizontalLayout(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void refreshGraphicalViewer() {
		// TODO Auto-generated method stub
		
	}

	public boolean getAutoFlowLayout() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAutoFlowLayout(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public Definition getArtifactsDefinition() {
		// TODO Auto-generated method stub
		return null;
	}




	
}
