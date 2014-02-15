package cn.edu.nju.cs.workflow.bpel.aspect;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;

public interface IAspectEditModelListener {

	public void modelDeleted (AspectResourceInfo resourceInfo);
	
	public void modelReloaded (AspectResourceInfo resourceInfo);
	
	public void modelLocationChanged (AspectResourceInfo resourceInfo,IFile movedToFile);

	public void modelDirtyStateChanged (AspectResourceInfo resourceInfo);
		
	public void modelMarkersChanged ( AspectResourceInfo resourceInfo , IMarkerDelta [] markerDelta );

}
