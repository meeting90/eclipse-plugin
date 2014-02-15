package cn.edu.nju.cs.workflow.bpel.aspect;

import java.util.HashMap;
import java.util.Map;


import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectResourceSetImpl;

public class AspectEditModelCache {

	protected Map<ResourceSet,AspectEditModel> resourceSetToEditModel = new HashMap<ResourceSet,AspectEditModel>();

	protected Map<IResource,ResourceSet> fileToResourceSet = new HashMap<IResource,ResourceSet>();
	
	public AspectEditModel getEditModel(IResource primaryFile) {
		ResourceSet resourceSet = getResourceSet(primaryFile);
		return getEditModel(resourceSet, primaryFile);
	}
	

	private AspectEditModel getEditModel(ResourceSet resourceSet,
			IResource primaryFile) {
		AspectEditModel editModel = resourceSetToEditModel.get(resourceSet);
		if (editModel != null) {
			editModel.referenceCount++;
			return editModel;
		}
		editModel = new AspectEditModel(resourceSet, primaryFile);
		editModel.referenceCount++;
		resourceSetToEditModel.put(resourceSet, editModel);
		final AspectEditModel finalEditModel = editModel;
		
		resourceSet.eAdapters().add(new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification msg) {
				Resource r = (Resource) msg.getNewValue();
				finalEditModel.getResourceInfoForLoadedResource(r);
			}
			
		});
		return editModel;
	}

	private ResourceSet getResourceSet(IResource primaryFile) {
		ResourceSet resourceSet = fileToResourceSet.get(primaryFile);
		if(resourceSet != null)
			return resourceSet;
		resourceSet = new AspectResourceSetImpl();
		fileToResourceSet.put(primaryFile,resourceSet);
		return resourceSet;	
	}

	
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




