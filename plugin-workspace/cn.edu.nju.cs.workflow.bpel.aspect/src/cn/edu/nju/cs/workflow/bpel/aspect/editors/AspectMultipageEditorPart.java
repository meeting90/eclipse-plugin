package cn.edu.nju.cs.workflow.bpel.aspect.editors;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;

import org.eclipse.bpel.ui.IFileChangeListener;
import org.eclipse.bpel.ui.Messages;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.ui.actions.ActionRegistry;

import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.ui.StructuredTextEditor;
import org.w3c.dom.Document;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectEditDomain;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectEditModelClient;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectReader;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectResourceInfo;
import cn.edu.nju.cs.workflow.bpel.aspect.AspectUIPlugin;
import cn.edu.nju.cs.workflow.bpel.aspect.IAspectEditModelListener;
import cn.edu.nju.cs.workflow.bpel.aspect.IAspectUIConstants;
import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectResourceSetImpl;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.Aspects;






@SuppressWarnings("restriction")
public class AspectMultipageEditorPart extends MultiPageEditorPart implements IAspectEditModelListener{
	private static int DESIGN_PAGE_INDEX = 0;
	private static int SOURCE_PAGE_INDEX = 1;
	private DefaultEditDomain editDomain;
	private IFileChangeListener fileChangeListener;
	private RefactoringListener preBuildRefactoringListener;
	private IResourceChangeListener postBuildRefactoringListener;
	private ActionRegistry actionRegistry;
	protected StructuredTextEditor fTextEditor;
	protected AspectEditor fDesignViewer;
	private Aspects aspects;
	private int currentPage;
	private IFile openFile;
	private static String filePrefix = new SimpleDateFormat( "yyyyMMF_" ).format( new GregorianCalendar().getTime());
	
	
	
	public class RefactoringListener implements IResourceChangeListener {

		public void resourceChanged(IResourceChangeEvent event) {
			
			IResourceDeltaVisitor dv = new IResourceDeltaVisitor() {

				public boolean visit(IResourceDelta delta) throws CoreException {
					IPath newPath = delta.getMovedToPath();
					if (delta.getKind()==IResourceDelta.REMOVED && newPath!=null) {
						// a file was moved or renamed - check if it's an imported file
//						List<Import> imports = process.getImports();
//						for (Import imp : imports)
//						{
//							IPath path = new Path(imp.getLocation());
//							IPath folder = ((IFileEditorInput)getEditorInput()).getFile().getFullPath().removeLastSegments(1);
//							if (!path.isAbsolute()) {
//								// need absolute path
//								path = folder.append(path);
//							}
//							if (path.equals(delta.getResource().getFullPath())) {
//								IPath relPath = newPath.makeRelativeTo(folder);
//								imp.setLocation(relPath.toString());
//
//								Display.getDefault().asyncExec( new Runnable() {
//								    public void run() {
//										doSave(null);
//								    }
//								});
//							}
//						}
					}
					return true;
				}
			};
			
			try {
				event.getDelta().accept(dv);
			} catch (CoreException e) {
				AspectUIPlugin.log(e);
			}
		}
	
	}
	public AspectMultipageEditorPart(){
		super();
		setEditDomain(new AspectEditDomain(this));
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		try {
			super.init(site, input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setPartName(input.getName());
	}
	@Override
	protected void createPages() {
		
		try {
			// source page must be created before design page
			createSourcePage();
			createDesignPage();
			firePropertyChange(PROP_TITLE);
			// TODO Auto-generated method stub
			initializeFileChangeListener();
			initializeRefactoringListener();
		} catch (PartInitException e) {
			//Logger.logException(e);
			throw new RuntimeException(e);
		}
		if (AspectUIPlugin.INSTANCE.getDefaultPage().equals(IAspectUIConstants.SOURCE_PAGE)) {
			setActivePage(SOURCE_PAGE_INDEX);
		} else {
			setActivePage(DESIGN_PAGE_INDEX);
		}
		
	}
	@Override
	protected void pageChange(int newPageIndex) {
		this.currentPage = newPageIndex;
		super.pageChange(newPageIndex);
	}
	@Override
	public boolean isDirty() {
		return this.fTextEditor.isDirty() ;
		//TODO || this.editDomain.getCommandStack().isDirty();
	}

	@Override
	public IEditorPart getActiveEditor() {
		return super.getActiveEditor();
	}
	
	@Override
	protected IEditorSite createSite(IEditorPart page) {
		IEditorSite site = null;
		if (page == fTextEditor) {
			site = new org.eclipse.ui.part.MultiPageEditorSite(this, page) {
				public String getId() {
					return AspectResourceSetImpl.ASPECT_CONTENT_TYPE;
				}
			};
		}
		else {
			site = super.createSite(page);
		}
		return site;
	}
	

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub
		//this.fDesignViewer.getCommandFramework().applyCurrentChange();
		this.fTextEditor.doSave(progressMonitor);
		// Reset sync stamp and modified flag after save
		//this.fDesignViewer.getEditModelClient().getPrimaryResourceInfo().resetSynchronizeStamp();
		//this.fDesignViewer.getEditModelClient().getPrimaryResourceInfo().getResource().setModified(false);
		// Save extensions
		//this.fDesignViewer.doSave(progressMonitor);
		//getCommandStack().markSaveLocation();
	
	}


	@Override
	public boolean isSaveAsAllowed() {
		
		return false;
	}
	@Override
	public void doSaveAs() {
		//not allowed doing nothingd
		
	}
	
	@Override
	public void dispose() {

		if (this.currentPage == SOURCE_PAGE_INDEX) {
			AspectUIPlugin.INSTANCE.setDefaultPage(IAspectUIConstants.SOURCE_PAGE);
		} else {
			AspectUIPlugin.INSTANCE.setDefaultPage(IAspectUIConstants.DESIGN_PAGE);
		}

		//this.outlinePage = null;
		//this.process = null;

		if (this.fileChangeListener != null) {
			AspectUIPlugin.INSTANCE.getResourceChangeListener().removeListener(this.fileChangeListener);
		}

		if (this.postBuildRefactoringListener != null) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.removeResourceChangeListener(this.postBuildRefactoringListener);
		}

		
		if (this.preBuildRefactoringListener != null) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.removeResourceChangeListener(this.preBuildRefactoringListener);
		}
		IStructuredModel model = this.fTextEditor.getModel();
		if (model != null) {
			model.releaseFromEdit();
			this.fDesignViewer.dispose();
			this.fTextEditor.dispose();
		}

		super.dispose();
	}
	
	@Override
	public Object getAdapter(Class type) {
		if (type == Aspects.class) {
			return this.aspects;
		}
		if(type==Aspect.class){
			return this.aspects.getChildren().get(0);
		}
	
		if (type == ActionRegistry.class) {
			return getActionRegistry();
		}

		return super.getAdapter(type);
	}
	private ActionRegistry getActionRegistry() {
		if (this.actionRegistry == null)
			this.actionRegistry = new ActionRegistry();
		return this.actionRegistry;
	}

	protected void createSourcePage() throws PartInitException {
		this.fTextEditor = new StructuredTextEditor();
		try
		{
			addPage(0, this.fTextEditor, getEditorInput());
			setPageText(0, "Source");
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(), "Error creating Source page", null, e.getStatus()); //$NON-NLS-1$
		}
	}
	protected void createDesignPage() throws PartInitException{
		this.fDesignViewer = new AspectEditor(getEditDomain(), this);
		if( getFileInput() == null ) {
			MessageDialog.openError(
					getSite().getShell(),
					Messages.Editor_load_error_title, // Bugzilla 330513
					Messages.Editor_load_error
			);
			return;
		}
		
		try
		{
			loadModel();
			addPage(0, this.fDesignViewer, getEditorInput());
			setPageText(0, "Design");
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					Messages.Editor_design_page_error, 
					null,
					e.getStatus()); 
		} catch (CoreException e) {
			// TODO:
		}
	}
	protected void setEditDomain(DefaultEditDomain defaultEditDomain) {
		this.editDomain=defaultEditDomain;
		
		
	}
	protected DefaultEditDomain getEditDomain() {
		return this.editDomain;
	}
	protected ITextEditor getTextEditor() {
		// TODO Auto-generated method stub
		return this.fTextEditor;
	}
 
	protected void initializeRefactoringListener() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		this.postBuildRefactoringListener = new IResourceChangeListener() {
			@Override
			public void resourceChanged(IResourceChangeEvent event) {
				IFile newFile = ((IFileEditorInput)getEditorInput()).getFile();
				final IResourceDelta bpelFileDelta = event.getDelta().findMember(newFile.getFullPath());
				// we only care about the change if it is a move or a rename
				if (bpelFileDelta != null && (bpelFileDelta.getFlags() & IResourceDelta.MOVED_FROM) != 0) {
					getSite().getShell().getDisplay().syncExec(new Runnable() {
						public void run() {
							doRevertToSaved(null);
						}

						
					});
				}
				
			}
		};
		workspace.addResourceChangeListener(this.postBuildRefactoringListener, IResourceChangeEvent.POST_BUILD);

		// https://bugs.eclipse.org/bugs/show_bug.cgi?id=330813
		// https://jira.jboss.org/browse/JBIDE-6365
		this.preBuildRefactoringListener = new RefactoringListener();
		workspace.addResourceChangeListener(this.preBuildRefactoringListener, IResourceChangeEvent.PRE_BUILD);
	}
	protected void doRevertToSaved(Object object) {
		// TODO Auto-generated method stub
		
	}
	protected void initializeFileChangeListener() {
		
		
		this.fileChangeListener = new IFileChangeListener() {
		
			@Override
			public void moved(IFile source, IFile destination) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void deleted(IFile file) {
				IEditorInput input=getEditorInput();
				IFile current = ((IFileEditorInput)input).getFile();
				if (current.equals(file)) {
					Display display = getSite().getShell().getDisplay();
					display.asyncExec(new Runnable() {
						public void run() {
							getSite().getPage().closeEditor(AspectMultipageEditorPart.this, false);
						}
					});
				}
			}
		};
		AspectUIPlugin.INSTANCE.getResourceChangeListener().addListener(this.fileChangeListener);
	}
	protected Aspects getAspects(){
		return this.aspects;
	}
	
	protected void loadModel() throws CoreException {
		Document structuredDocument = null;

		try {
			IDocument doc = this.fTextEditor.getDocumentProvider().getDocument(getEditorInput());
			if (doc instanceof IStructuredDocument) {
				IStructuredModel model = StructuredModelManager.getModelManager().getExistingModelForEdit(doc);
				if (model == null) {
					model = StructuredModelManager.getModelManager().getModelForEdit((IStructuredDocument) doc);
				}
				if (model != null) {
					structuredDocument = ((IDOMModel) model).getDocument();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<String, Document> loadOptions = null;
		if (structuredDocument != null) {
			loadOptions = new HashMap<String, Document> (1);
			loadOptions.put("DOMDocument", structuredDocument);
		}

		IFile file = null;
		AspectEditModelClient editModelClient = new AspectEditModelClient(this);

		
		boolean keepGoing = false;
		Shell shell = getEditorSite().getShell();
		try {
			file = getFileInput();
			editModelClient.loadPrimaryResource(file,loadOptions);
		}
		catch (RuntimeException ex) {
			String msg = NLS.bind(Messages.EditModelClient_bpel_load_error,
					new String[]{file.toString()}
			); 

			keepGoing = MessageDialog.openQuestion(
					shell, 
					Messages.EditModelClient_load_error_title,  
					msg);
			
			if (!keepGoing)
				throw ex;
		}

		this.fDesignViewer.setEditModelClient(editModelClient);
		getEditDomain().setCommandStack(editModelClient.getCommandStack());
  
		Resource aspectsResource=editModelClient.getPrimaryResourceInfo().getResource();
		
		AspectReader reader=new AspectReader();
		reader.read(aspectsResource, getFileInput(),
				this.fDesignViewer.getResourceSet());
		this.aspects=reader.getAspects();
		System.out.println(this.aspects);
		
		//Resource bpelResource = editModelClient.getPrimaryResourceInfo().getResource();
		//BPELReader reader = new BPELReader();
		//reader.read(bpelResource, getFileInput(), this.fDesignViewer.getResourceSet());
		

		
//		if (getEditDomain() != null) {
//			//((BPELEditDomain)getEditDomain()).setProcess(getProcess());
//		}
//		this.extensionsResource = reader.getExtensionsResource();
//		this.extensionMap = reader.getExtensionMap();
//
//		this.modelListenerAdapter = new ModelListenerAdapter();
//		this.modelListenerAdapter.setExtensionMap(this.extensionMap);

	}
	
	protected IFile getFileInput() {

		if( this.openFile == null ) {
			try {
				// Case where the file is in the workspace
				if( getEditorInput() instanceof IFileEditorInput )
					this.openFile = ((IFileEditorInput) getEditorInput()).getFile();

				// Outside the workspace
				// Since everything relies on IFiles, we create a temporary file in the workspace
				// linking to the file outside the workspace
				else if( getEditorInput() instanceof FileStoreEditorInput ) {
					File f = new File(((FileStoreEditorInput) getEditorInput()).getURI());
					IPath path = new Path( f.getAbsolutePath());

					// Create a temporary project
					IProgressMonitor monitor =  new NullProgressMonitor();
					IProject tempProject = ResourcesPlugin.getWorkspace().getRoot().getProject( ".temp" );
					if( ! tempProject.exists())
						tempProject.create( monitor );

					if( ! tempProject.isOpen())
						tempProject.open( monitor );

					// Remove old temporary files
					// The file prefix is designed so that natural comparison order is enough
					for( IResource res : tempProject.members()) {
						if( res.getName().substring( 0, 7 ).compareTo( filePrefix ) < 0 ) {
							try {
								res.delete( false, monitor );
							} catch( Exception e ) {
								e.printStackTrace();
							}
						}
					}

					// Create a temporary file
					this.openFile = tempProject.getFile( filePrefix + path.lastSegment());
					this.openFile.createLink( path, IResource.NONE, monitor );
				}

			} catch( CoreException e ) {
				e.printStackTrace();
			}
		}

		return this.openFile;
	}

	@Override
	public void modelDeleted(AspectResourceInfo resourceInfo) {
		// TODO Auto-generated method stub
		if (!isDirty()) {
			getSite().getPage().closeEditor(this, false);
		}
	}

	@Override
	public void modelReloaded(AspectResourceInfo resourceInfo) {
		
	}

	@Override
	public void modelLocationChanged(AspectResourceInfo resourceInfo,
			IFile movedToFile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modelDirtyStateChanged(AspectResourceInfo resourceInfo) {
		// TODO Auto-generated method stub
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public void modelMarkersChanged(AspectResourceInfo resourceInfo,
			IMarkerDelta[] markerDelta) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	}
