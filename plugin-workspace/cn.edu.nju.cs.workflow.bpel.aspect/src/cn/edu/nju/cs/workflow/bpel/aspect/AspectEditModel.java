package cn.edu.nju.cs.workflow.bpel.aspect;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.eclipse.bpel.common.ui.editmodel.EditModelCommandStack;

import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class AspectEditModel{

	protected static AspectEditModelCache cache = new AspectEditModelCache();

	protected Map<IFile,AspectResourceInfo> fileToResourceInfo = new HashMap<IFile,AspectResourceInfo>();

	protected ResourceSet resourceSet;

	protected int referenceCount = 0;

	protected IResource primaryFile;

	protected EditModelCommandStack commandStack;

	private List<IAspectEditModelListener> updateListeners = null;
	
	protected IFile extensionsFile;
	
	protected IFile artifactsFile;
	
	protected AspectEditModel(ResourceSet rSet, IResource primaryResource) {
		this.resourceSet = rSet;
		this.primaryFile = primaryResource;		
		this.updateListeners = new ArrayList<IAspectEditModelListener>();
	
	}
	public IResource getPrimaryFile() {
		return primaryFile;
	}
	
	public void setPrimaryFile(IFile newFile) {
		IResource oldFile = primaryFile;
		primaryFile = newFile;
		cache.updatePrimaryFile(oldFile, newFile);
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
			IPath artifactsPath = getPrimaryFile().getFullPath().removeFileExtension();
			String shortName = artifactsPath.lastSegment()+"Artifacts"; //$NON-NLS-1$
			artifactsPath = artifactsPath.removeLastSegments(1).append(shortName).addFileExtension(IBPELUIConstants.EXTENSION_WSDL);
			artifactsFile = ResourcesPlugin.getWorkspace().getRoot().getFile(artifactsPath);
		}
		return artifactsFile;
	}


	
	public static AspectEditModel getEditModel(IResource primaryFile) {
		return cache.getEditModel(primaryFile);
	}
	public void addListener (IAspectEditModelListener listener) {
		if (updateListeners.contains(listener)) {
			return;
		}
		updateListeners.add(listener);
	}

	public void removeListener(IAspectEditModelListener modelListener) {
		updateListeners.remove(modelListener);
	}
	
	
	
	protected void fireModelDirtyStateChanged(AspectResourceInfo sr) {
		for (IAspectEditModelListener next : updateListeners ) {
			next.modelDirtyStateChanged(sr);
		}
	}

	protected void fireModelDeleted(AspectResourceInfo sr) {
		
		ArrayList<IAspectEditModelListener> listeners = new ArrayList<IAspectEditModelListener>(updateListeners.size());
		listeners.addAll(updateListeners);
		for (IAspectEditModelListener next : listeners ) {
			next.modelDeleted(sr);
		}
	}
	
	protected void fireModelReloaded(AspectResourceInfo sr) {
		ArrayList<IAspectEditModelListener> listeners = new ArrayList<IAspectEditModelListener>(updateListeners.size());
		listeners.addAll(updateListeners);
		for (IAspectEditModelListener next : listeners ) {
			next.modelReloaded(sr);
		}
	}

	protected void fireModelLocationChanged(AspectResourceInfo sr, IFile movedToFile) {
		ArrayList<IAspectEditModelListener> listeners = new ArrayList<IAspectEditModelListener>(updateListeners.size());
		listeners.addAll(updateListeners);
		for (IAspectEditModelListener next : listeners ) {
			next.modelLocationChanged(sr,movedToFile);
		}
	}

	protected void fireModelMarkersChanged (AspectResourceInfo sr, IMarkerDelta[] markerDelta ) {
		ArrayList<IAspectEditModelListener> listeners = new ArrayList<IAspectEditModelListener>(updateListeners.size());
		listeners.addAll(updateListeners);
		for (IAspectEditModelListener next : listeners ) {
			next.modelMarkersChanged(sr,markerDelta );
		}
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	AspectResourceInfo getResourceInfoForLoadedResource(Resource resource) {
		
		URI uri = resource.getURI();
		IFile file = getIFileForURI(uri);
		if (file == null)
			return null;
		AspectResourceInfo resourceInfo = fileToResourceInfo.get(file);
		if (resourceInfo == null) {
			resourceInfo = new AspectResourceInfo(this, file);
			resourceInfo.setResource(resource);
			addResourceInfo(resourceInfo);
			resourceInfo.resourceLoaded();
		}
		if (!resourceInfo.loading)
			resourceInfo.referenceCount++;
		return resourceInfo;
	}

	
	public AspectResourceInfo getResourceInfo(IFile file) {
		AspectResourceInfo resourceInfo = fileToResourceInfo.get(file);
		if (resourceInfo == null) {
			resourceInfo = new AspectResourceInfo(this, file);
			addResourceInfo(resourceInfo);
			try {
				resourceInfo.load();
			} catch (RuntimeException ex) {
				resourceInfo.referenceCount++;
				releaseReference(resourceInfo);
				throw ex;
			}
		}
		resourceInfo.referenceCount++;
		return resourceInfo;
	}

	
	static AspectResourceInfo [] EMPTY_RESOURCE_ARRAY = {};
	

	
	public AspectResourceInfo[] getResourceInfos() {
		return fileToResourceInfo.values().toArray(EMPTY_RESOURCE_ARRAY);
	}


	public void releaseReference (AspectResourceInfo resourceInfo) {
		resourceInfo.referenceCount--;
		if (resourceInfo.referenceCount == 0) {
			resourceInfo.dispose();
			removeResourceInfo(resourceInfo);
		}
	}

	
	
	protected void addResourceInfo(AspectResourceInfo sr) {
		fileToResourceInfo.put(sr.getFile(), sr);
	}


	protected void removeResourceInfo(AspectResourceInfo sr) {
		fileToResourceInfo.remove(sr.getFile());
	}

	public void release() {
		referenceCount--;
		if (referenceCount == 0) {
			cache.remove(this);
			for (AspectResourceInfo resourceInfo : fileToResourceInfo.values().toArray(EMPTY_RESOURCE_ARRAY) ) {
				resourceInfo.dispose();
			}
			fileToResourceInfo.clear();
		}
		
	}

	public static IFile getIFileForURI(URI uri) {
		String filePath = null;
		String scheme = uri.scheme();
		IFile file = null;
		if ("file".equals(scheme)) { //$NON-NLS-1$
			filePath = uri.toFileString();
			if (filePath == null)
				return null;
			file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(
					new Path(filePath));
		} else if ("platform".equals(scheme) && uri.segmentCount() > 1 && "resource".equals(uri.segment(0))) { //$NON-NLS-1$//$NON-NLS-2$
			StringBuffer platformResourcePath = new StringBuffer();
			for (int i = 1, size = uri.segmentCount(); i < size; ++i) {
				platformResourcePath.append('/');
				platformResourcePath.append(uri.segment(i));
			}
			filePath = platformResourcePath.toString();
			if (filePath == null)
				return null;
			file = ResourcesPlugin.getWorkspace().getRoot().getFile(
					new Path(filePath));
		}
		return file;
	}


	public EditModelCommandStack getCommandStack() {
		return commandStack;
	}

	
	public void setCommandStack(EditModelCommandStack stack) {
		this.commandStack = stack;
	}

	public boolean saveAll(IProgressMonitor progressMonitor) {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws InvocationTargetException {
				getCommandStack().markSaveLocation();
				try {
					AspectResourceInfo[] sResource = getResourceInfos();
					for (int i = 0; i < sResource.length; i++) {
						AspectResourceInfo resource = sResource[i];
						if (resource.isDirty())
							resource.save();
					}
				} catch (IOException e) {
					throw new InvocationTargetException(e);
				}
			}
		};

		try {
			operation.run(progressMonitor);
		} catch (InvocationTargetException e) {
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}

	
	public boolean savePrimaryResourceAs(final AspectResourceInfo resourceInfo,
			final IFile savedFile, IProgressMonitor progressMonitor) {
		boolean result = saveResourceAs(resourceInfo, savedFile,
				progressMonitor);
		if (result)
			setPrimaryFile(savedFile);
		return result;
	}

	public boolean saveResourceAs(final AspectResourceInfo resourceInfo,
			final IFile savedFile, IProgressMonitor progressMonitor) {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			
			@Override
			protected void execute(IProgressMonitor monitor)
					throws InvocationTargetException  {
				try {
					getCommandStack().markSaveLocation();
					resourceInfo.saveAs(savedFile);
				} catch (IOException e) {
					throw new InvocationTargetException(e);
				}
			}
		};

		try {
			operation.run(progressMonitor);
		} catch (InvocationTargetException e) {
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}

	
}
	
	