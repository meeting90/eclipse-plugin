package cn.edu.nju.cs.workflow.aspect.ui;


import java.util.HashMap;

import org.eclipse.bpel.ui.BPELMultipageEditorPart;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.util.BPELEditModelClient;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.w3c.dom.Document;

import cn.edu.nju.cs.workflow.aspect.model.Aspect;
import cn.edu.nju.cs.workflow.aspect.model.Aspects;
import cn.edu.nju.cs.workflow.aspect.model.resource.AspectResourceSetImpl;









public class AspectMultipageEditorPart extends BPELMultipageEditorPart {

	protected AspectEditor fDesignViewer;
	private Aspects aspects;
	

	
	
	
	
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
	public ITextEditor getTextEditor(){
		return this.fTextEditor;
	}
	
	
	
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class type) {
		if (type == Aspects.class) {
			return this.aspects;
		}
		if(type==Aspect.class){
			return this.aspects.getChildren().get(0);
		}
		if(type==Process.class){
			return this.aspects.getChildren().get(0).getAdvice();
		}
		if(type==CommandStack.class){
				return getCommandStack();
		}
	
		if (type == ActionRegistry.class) {
			return getActionRegistry();
		}

		return super.getAdapter(type);
	}

	@Override
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

		this.fDesignViewer.setEditModelClient(editModelClient);
		getEditDomain().setCommandStack(editModelClient.getCommandStack());
  
		Resource aspectsResource=editModelClient.getPrimaryResourceInfo().getResource();
		
		AspectReader reader=new AspectReader();
		reader.read(aspectsResource, getFileInput(),
				this.fDesignViewer.getResourceSet());
		this.aspects=reader.getAspects();
		System.out.println(this.aspects);
		
	}




	
	
	
	}
