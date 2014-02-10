package cn.edu.nju.cs.workflow.model.aspect.util;




import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.bpel.common.ui.editmodel.EditModel;
import org.eclipse.bpel.common.ui.editmodel.ResourceInfo;
import org.eclipse.bpel.ui.IBPELUIConstants;



import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectResourceSetImpl;



public class AspectEditModel  extends EditModel{

	protected static AspectEditModelCache aspectCache = new AspectEditModelCache();
	
	protected IFile extensionsFile;
	protected IFile artifactsFile;
	
	protected AspectEditModel(ResourceSet rSet, IResource bpelFile) {
		super(rSet, bpelFile);
		// TODO Auto-generated constructor stub
	}
	public static AspectEditModel getAspectEditModel(IResource primaryFile, Factory factory) {
		return aspectCache.getAspectEditModel(primaryFile, factory);
	}

	public static AspectEditModel getAspectEditModel(IResource primaryFile) {
		return aspectCache.getAspectEditModel(primaryFile, new Factory());
	}
	
	private void setPrimaryFile(IFile newFile) {
		IResource oldFile = primaryFile;
		primaryFile = newFile;
		aspectCache.updatePrimaryFile(oldFile, newFile);
	}

	@Override
	public boolean savePrimaryResourceAs(final ResourceInfo resourceInfo,
			final IFile savedFile, IProgressMonitor progressMonitor) {
		boolean result = saveResourceAs(resourceInfo, savedFile,
				progressMonitor);
		if (result)
			setPrimaryFile(savedFile);
		return result;
	}
	
	public IFile getExtensionsFile() {
		if (extensionsFile == null) {
			IPath extensionsPath = getPrimaryFile().getFullPath().removeFileExtension().addFileExtension(IBPELUIConstants.EXTENSION_MODEL_EXTENSIONS);
			extensionsFile = ResourcesPlugin.getWorkspace().getRoot().getFile(extensionsPath);
		}
		return extensionsFile;
	}
	
	public IFile getArtifactsFile() {
		if (artifactsFile == null) {
			// TODO: there might be a simpler way to do this.
			IPath artifactsPath = getPrimaryFile().getFullPath().removeFileExtension();
			String shortName = artifactsPath.lastSegment()+"Artifacts"; //$NON-NLS-1$
			artifactsPath = artifactsPath.removeLastSegments(1).append(shortName).addFileExtension(IBPELUIConstants.EXTENSION_WSDL);
			artifactsFile = ResourcesPlugin.getWorkspace().getRoot().getFile(artifactsPath);
		}
		return artifactsFile;
	}	

	public void release() {
		referenceCount--;
		if (referenceCount == 0) {
			aspectCache.remove(this);
			for (ResourceInfo resourceInfo : fileToResourceInfo.values() ) {
				Method method;
				try {
					method = resourceInfo.getClass().getDeclaredMethod("dispose");
					method.setAccessible(true);
					method.invoke(resourceInfo);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				//resourceInfo.dispose();
			}
			fileToResourceInfo.clear();
		}
		
	}
	public static class Factory {
		protected AspectEditModel createEditModel(ResourceSet resourceSet,
				IResource primaryFile) {
			return new AspectEditModel(resourceSet, primaryFile);
		}
	}

	static class AspectEditModelCache {

		protected Map<ResourceSet,AspectEditModel> resourceSetToEditModel = new HashMap<ResourceSet,AspectEditModel>();

		protected Map<IResource,ResourceSet> fileToResourceSet = new HashMap<IResource,ResourceSet>();

		/**
		 * Return a new ResourceSet for the specified file.
		 * @param primaryFile 
		 * @param factory 
		 * @return the edit model.
		 */
		
		public AspectEditModel getAspectEditModel(IResource primaryFile, Factory factory) {
			ResourceSet resourceSet = getResourceSet(primaryFile);
			return getAspectEditModel(resourceSet, primaryFile, factory);
		}

		/**
		 * Return the EditModel for specified resource set.
		 * 
		 * Creates a new EditModel it is not found in the cache, otherwise
		 * increment the reference count and return it.
		 */
		
		@SuppressWarnings("unchecked")
		private AspectEditModel getAspectEditModel(ResourceSet resourceSet,
				IResource primaryFile, Factory factory) {
			AspectEditModel editModel = resourceSetToEditModel.get(resourceSet);
			if (editModel != null) {
				editModel.referenceCount++;
				return editModel;
			}
			editModel = factory.createEditModel(resourceSet, primaryFile);
			editModel.referenceCount++;
			resourceSetToEditModel.put(resourceSet, editModel);
			final AspectEditModel finalEditModel = editModel;
			
			resourceSet.eAdapters().add(new AdapterImpl() {
				
				@Override
				public void notifyChanged(Notification msg) {
					Resource r = (Resource) msg.getNewValue();
					
					Method method;
					try {
						method = finalEditModel.getClass().getDeclaredMethod("getResourceInfoForLoadedResource", new Class[] {Resource.class});
						method.setAccessible(true);
						method.invoke(finalEditModel, new Object[]{r});
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					//finalEditModel.getResourceInfoForLoadedResource(r);
				}
				
			});
			return editModel;
		}

	/*
	 * Return a new ResourceSet for the specified file.
	 */
	private ResourceSet getResourceSet(IResource primaryFile) {
		ResourceSet resourceSet = fileToResourceSet.get(primaryFile);
		if(resourceSet != null)
			return resourceSet;
		// TODO: Extensibility
		resourceSet = new AspectResourceSetImpl();
		fileToResourceSet.put(primaryFile,resourceSet);
		return resourceSet;	
	}

		/**
		 * 
		 * @param editModel
		 */
		public void remove(AspectEditModel editModel) {
			resourceSetToEditModel.remove(editModel.resourceSet);
			fileToResourceSet.remove(editModel.primaryFile);
		}

		
		void updatePrimaryFile(IResource oldFile, IResource newFile) {
			ResourceSet rs = fileToResourceSet.get(oldFile);
			fileToResourceSet.remove(oldFile);
			fileToResourceSet.put(newFile, rs);
		}
	}
	
	
	
	



}
