package cn.edu.nju.cs.workflow.bpel.aspect.resource;


import org.eclipse.bpel.model.resource.BPELResourceSetImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;

public class AspectResourceSetImpl extends BPELResourceSetImpl{
	public static final String ASPECT_CONTENT_TYPE = "cn.edu.nju.cs.workflow.bpel.aspect.contenttype"; //$NON-NLS-1$
	@Override
	public Registry getResourceFactoryRegistry() {
		// TODO Auto-generated method stub
		return super.getResourceFactoryRegistry();
	}
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// TODO Auto-generated method stub
		IResourceDelta[] deltas = event.getDelta().getAffectedChildren( IResourceDelta.CHANGED | IResourceDelta.REMOVED, IResource.FILE );	
		processDeltas2(deltas);
	}
	void processDeltas2(IResourceDelta[] deltas){
		for(IResourceDelta delta : deltas) {			
			processDeltas2( delta.getAffectedChildren(IResourceDelta.CHANGED | IResourceDelta.REMOVED, IResource.FILE) );
			IResource resource = delta.getResource();
			if (resource.getType () != IResource.FILE) {
				continue;
			}
			if (delta.getKind() == IResourceDelta.REMOVED){
				resourceChanged((IFile)resource);
				continue;
			}
			if ((delta.getFlags() & IResourceDelta.CONTENT) == 0){
				continue;
			}
			if (isAspectFile(resource)){
				continue;
			}
			resourceChanged((IFile) resource);
		}		
	}
	public static boolean isAspectFile(IResource res)
	{
		try
		{
			if (res.getType() == IResource.FILE) {
				IContentDescription desc = ((IFile) res).getContentDescription();
				if (desc != null) {
					IContentType type = desc.getContentType();
					if (type.getId().equals(ASPECT_CONTENT_TYPE))
						return true;
				}
			}
		}
		catch(Exception ex)
		{
		}
		return false;	
	}
	

}
