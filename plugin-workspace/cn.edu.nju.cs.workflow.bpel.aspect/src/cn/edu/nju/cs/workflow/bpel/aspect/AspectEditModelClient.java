package cn.edu.nju.cs.workflow.bpel.aspect;

import java.io.IOException;
import java.util.Map;


import org.eclipse.bpel.common.ui.editmodel.EditModelCommandStack;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorPart;

import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectResourceSetImpl;

public class AspectEditModelClient {

	
	private AspectResourceInfo primaryResourceInfo;
	
	private AspectEditModel editModel;

	private IAspectEditModelListener modelListener;

	private IEditorPart editor;
		

	/**
	 * Creates a new EditModelClient
	 * 
	 * @param editor the editor that is using this model manager
	 * @param file the editor's input
	 * @param modelListener the listener which is used to communicate back to the editor.
	 * @param loadOptions a Map of EMF load/save options. May be empty.
	 */
	public AspectEditModelClient(IEditorPart editor,IAspectEditModelListener modelListener) {
		this.editor = editor;
		this.modelListener = modelListener;
	}
	public AspectEditModelClient(IEditorPart editor){
		this(editor,(IAspectEditModelListener)editor);
	}

	



	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void loadPrimaryResource(IFile file, Map loadOptions) throws RuntimeException {
		editModel = getSharedResourceSet(file);
		((AspectResourceSetImpl)editModel.getResourceSet()).setLoadOptions(loadOptions);
		try {
			SynchronizationHandler handler = new Synchronizer();
			if(getCommandStack() == null) {
				EditModelCommandStack commandStack = createCommandStack();
				editModel.setCommandStack(commandStack);
			}
			primaryResourceInfo = editModel.getResourceInfo(file);
			if(loadOptions != null)
				primaryResourceInfo.setLoadOptions(loadOptions);
			getEditModel().addListener(modelListener);
			new SynchronizationManager(editor,editModel,handler);
		} catch (RuntimeException ex) {
			if(editModel != null)
				editModel.release();
			throw ex;
		}
	}
	protected AspectEditModel getSharedResourceSet(IFile file) {
		return AspectEditModel.getEditModel(file);
	}
	/**
	 * Creates and returns a command stack to be used by this
	 * model manager and the editor.
	 */
	protected EditModelCommandStack createCommandStack() {
		return new EditModelCommandStack();
	}
	/**
	 * Returns the command stack to be used by this
	 * model manager and the editor.
	 */
	public EditModelCommandStack getCommandStack() {
		return editModel.getCommandStack();
	}
	/**
	 * Returns the EMFModel editModel used by this model manager.
	 * The EditModel is a model reference count cache.
	 */
	public AspectEditModel getEditModel() {
		return editModel;
	}
	/**
	 * Returns the ResourceInfo which is used by the EditModel
	 * and counts the reference for each model cached in the model
	 * editModel.
	 */
	public AspectResourceInfo getPrimaryResourceInfo() {
		return primaryResourceInfo;
	}
	/**
	 * Disposes this model manager, its command stack, and 
	 * its model editModel.
	 */
	public void dispose() {
		getEditModel().removeListener(modelListener);
		editModel.releaseReference(primaryResourceInfo);
		editModel.release();
	}
	/**
	 * Saves the model
	 */
	public boolean saveAll(IProgressMonitor progressMonitor) {
		return editModel.saveAll(progressMonitor);
	}

	/**
	 * Saves the model with a new name
	 */
	public boolean savePrimaryResourceAs(IFile savedFile, IProgressMonitor progressMonitor) {
		return editModel.savePrimaryResourceAs(primaryResourceInfo,savedFile,progressMonitor);
	}
	void close() {
		editor.getSite().getPage().closeEditor(editor, false);
	}
	private class Synchronizer implements SynchronizationHandler  {
		public void closeEditor() {
			AspectEditModelClient.this.close();
		}
		public boolean saveFileAs(AspectResourceInfo resourceInfo,IFile file) throws CoreException, IOException {
			if (resourceInfo.equals(primaryResourceInfo))
				return savePrimaryResourceAs(file, null);
			else {
				resourceInfo.saveAs(file);
				return true;
			}
		}
		public void refresh(AspectResourceInfo resourceInfo) {
			try {
			resourceInfo.refresh();
			}
			catch (Exception e) {
				AspectUIPlugin.log(e);
			}
			getCommandStack().flush();
		}
	}
	public void loadExtensionsResource() {
		// TODO Auto-generated method stub
		
	}
	public IFile getExtensionsFile() {
		// TODO Auto-generated method stub
		return null;
	}
	public void loadArtifactsResource() {
		// TODO Auto-generated method stub
		
	}
	public IFile getArtifactsFile() {
		// TODO Auto-generated method stub
		return null;
	}
}	
