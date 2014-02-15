package cn.edu.nju.cs.workflow.bpel.aspect;



import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Display;

public class AspectResourceListener implements IResourceChangeListener{

	AspectResourceInfo fModelInfo;
	
	IFile fFile;

	
	static Runner runner = new Runner ( ) {
		public void run(Runnable runnable) {
			Display.getDefault().asyncExec(runnable);
		}		
	};
	
	
	protected AspectResourceListener (AspectResourceInfo modelInfo,IFile fileResource) {
		this.fModelInfo = modelInfo;
		this.fFile = fileResource;
	}
	

	
	public void setFile(IFile file) {
		this.fFile = file;
	}

	
	public void resourceChanged (IResourceChangeEvent e) {			
		
		IResourceDelta delta = e.getDelta();
		
		if (delta != null) {
			delta = delta.findMember(fFile.getFullPath());
		}

		if (delta != null) {				
			switch (delta.getKind()) {
				 
				case IResourceDelta.CHANGED:
					if ((delta.getFlags() & IResourceDelta.CONTENT) != 0) {			
						if (!isDirty())
							fireModelRefresh();
					}
					
					if ((delta.getFlags() & IResourceDelta.MARKERS) != 0) {
						fireMarkerChange( delta.getMarkerDeltas() );
					}
					break;

				case IResourceDelta.REMOVED:
					if ((delta.getFlags() & IResourceDelta.MOVED_TO) != 0) {
						fireModelMoved(delta.getMovedToPath());
					} else if (!isDirty()) {
						fireModelDeleted();	
					}
					break;
			}
		}
	}
	
	private void fireMarkerChange ( final IMarkerDelta [] delta ) {
		Runnable runnable = new Runnable () {
			public void run() {
				fModelInfo.markersChanged( delta );
			}			
		};
		run(runnable);
	}
	
	
	private void fireModelRefresh() {
		Runnable runnable = new Runnable() {
			public void run() {
				fModelInfo.refresh();
			}
		};
		run(runnable);
	}
	
	private void fireModelMoved(final IPath path) {
		Runnable runnable = new Runnable() {
			public void run() {
				IFile movedTofile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
				if (fFile == null) {
					return;
				}
				fModelInfo.move(movedTofile);
				fFile = movedTofile;
			}
		};
		
		run(runnable);
	}
	
	private void fireModelDeleted() {
		Runnable runnable = new Runnable() {
			public void run() {
				fModelInfo.deleted();
				fModelInfo.dispose();
			}
		};
		run(runnable);
	}
	protected boolean isDirty() {
		// if we are not initialized we are not dirty
		if (fModelInfo.getResource() == null)
			return false;
		return fModelInfo.getResource().isModified();
	}
	

	public void run(Runnable runnable) {
		if(runner == null) {
			runnable.run();
		} else {
			runner.run(runnable);
		}
	}
	
	
	interface Runner {
	
		void run(Runnable runnable);
	}
}
