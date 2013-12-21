package cn.edu.nju.cs.workflow.bpel.aspect.editors;




import java.util.HashMap;

import org.eclipse.bpel.common.extension.model.ExtensionMap;
import org.eclipse.bpel.common.ui.editmodel.ResourceInfo;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.ui.BPELEditDomain;
import org.eclipse.bpel.ui.BPELEditor;
import org.eclipse.bpel.ui.BPELMultipageEditorPart;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.ModelListenerAdapter;
import org.eclipse.bpel.ui.editparts.ProcessTrayEditPart;
import org.eclipse.bpel.ui.util.BPELEditModelClient;
import org.eclipse.bpel.ui.util.BPELReader;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.sse.ui.StructuredTextEditor;

import org.w3c.dom.Document;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectModelReconlieAdapter;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectReader;


public class AspectMultipageEditPart extends BPELMultipageEditorPart{
	
	private Process process=null;
	private Aspect aspect=null;
	private Resource aspectResource=null;
	private Resource extensionsResource=null;
	private AspectModelReconlieAdapter aspectModelReconcileAdapter=null;
	private ExtensionMap extensionMap;

	public AspectMultipageEditPart(){
		super();
	}
	@Override
	protected void createDesignPage() {
		// TODO Auto-generated method stub
		this.fDesignViewer = new AspectEditor(getEditDomain(), this);
		// Bug #209341 - starting patch
		if( getFileInput() == null ) {
			MessageDialog.openError(
					getSite().getShell(),
					Messages.Editor_load_error_title, // Bugzilla 330513
					Messages.Editor_load_error
			);
			return;
		}
		// End of patch
		try
		{
			loadModel();
			addPage(0, this.fDesignViewer, getEditorInput());
			//FIXME I18N
			setPageText(0, "Design");
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					Messages.Editor_design_page_error, // Bugzilla 330513
					null,
					e.getStatus()); //$NON-NLS-1$
		} catch (CoreException e) {
			// TODO: what to do here?
		}
	}
	@SuppressWarnings("restriction")
	@Override
	protected void loadModel() throws CoreException {
		// TODO Auto-generated method stub
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
		BPELEditModelClient editModelClient = new BPELEditModelClient(this);

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

		// next load the extensions resource (the *.bpelex file)
		try {
			editModelClient.loadExtensionsResource();
		}
		catch (RuntimeException ex) {
			file = editModelClient.getExtensionsFile();
			String msg = NLS.bind(Messages.EditModelClient_bpelex_load_error,
					new String[]{file.toString()}
			); 

			keepGoing = MessageDialog.openQuestion(
					shell, 
					Messages.EditModelClient_load_error_title,  
					msg);
			
			if (!keepGoing)
				throw ex;
			
			try {
				file.delete(true, null);
				editModelClient.loadExtensionsResource();
			} catch (CoreException ce) {
				MessageDialog.openError(shell, Messages.EditModelClient_delete_error_title, Messages.EditModelClient_delete_error_message);
				throw ce;
			}
		}

		// finally load the artifacts resource (the *.wsdl file)
		try {
			editModelClient.loadArtifactsResource();
		}
		catch (RuntimeException ex) {
			file = editModelClient.getArtifactsFile();
			String msg = NLS.bind(Messages.EditModelClient_wsdl_load_error,
					new String[]{file.toString()}
			); 

			keepGoing = MessageDialog.openQuestion(
					shell, 
					Messages.EditModelClient_load_error_title,  
					msg);
			
			if (!keepGoing)
				throw ex;
			
			try {
				file.delete(true, null);
				editModelClient.loadArtifactsResource();
			} catch (CoreException ce) {
				MessageDialog.openError(shell, Messages.EditModelClient_delete_error_title, Messages.EditModelClient_delete_error_message);
				throw ce;
			}
		}
		this.fDesignViewer.setEditModelClient(editModelClient);
		getEditDomain().setCommandStack(editModelClient.getCommandStack());

		Resource aspectResource = editModelClient.getPrimaryResourceInfo().getResource();
		AspectReader reader = new AspectReader();
		reader.read(aspectResource, getFileInput(), this.fDesignViewer.getResourceSet());
		this.aspect=reader.getAspect();
		this.process = reader.getProcess();
		this.aspectModelReconcileAdapter = new AspectModelReconlieAdapter(structuredDocument, this.aspect, this.aspectResource, (AspectEditor) this.fDesignViewer); 
		if (getEditDomain() != null) {
			((BPELEditDomain)getEditDomain()).setProcess(getProcess());
		}
		this.extensionsResource=reader.getExtensionsResource();
		this.extensionMap = reader.getExtensionMap();
		this.modelListenerAdapter = new ModelListenerAdapter();
		this.modelListenerAdapter.setExtensionMap(this.extensionMap);
		updateMarkersHard();
	}
	@Override
	public Process getProcess() {
		// TODO Auto-generated method stub
		return this.process;
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		this.aspect=null;
		this.process=null;
		
		super.dispose();
	}
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class type) {
		// TODO Auto-generated method stub
		if(type==Process.class)
			return this.process;
		if (type == BPELEditModelClient.class) {
			return this.process;
		}
		if (type == ModelListenerAdapter.class) {
			return this.modelListenerAdapter;
		}
		if (type == Resource.class) {
			return this.extensionsResource;
		}
		else{
			return super.getAdapter(type);
		}
	}

	@Override
	public void modelReloaded(ResourceInfo resourceInfo) {
	
			Resource aspectResource = this.fDesignViewer.getEditModelClient().getPrimaryResourceInfo().getResource();

			IFile file = getFileInput();
			AspectReader reader = new AspectReader();
			reader.read(aspectResource, file, this.fDesignViewer.getResourceSet());
			this.aspect=reader.getAspect();
			this.process = reader.getProcess();
			if (getEditDomain() != null) {
				((BPELEditDomain)getEditDomain()).setProcess(getProcess());
			}
			this.extensionMap = reader.getExtensionMap();

			this.modelListenerAdapter.setExtensionMap(this.fDesignViewer.getExtensionMap());

			this.fDesignViewer.getGraphicalViewer().setContents(getProcess());

			ProcessTrayEditPart processTrayEditPart = (ProcessTrayEditPart)this.fDesignViewer.getTrayViewer().getContents();
			this.fDesignViewer.getGraphicalViewer().removeSelectionChangedListener(processTrayEditPart.getSelectionChangedListener());
			this.fDesignViewer.getTrayViewer().setContents(getProcess());
			Display.getDefault().asyncExec( new Runnable() {
			    public void run() {
			    	updateMarkersHard();
			    }
			});

		}
	}
