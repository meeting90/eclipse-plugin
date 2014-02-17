package cn.edu.nju.cs.workflow.aspect.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpel.ui.IFileChangeListener;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

public class AspectResourceChangeListener implements IResourceChangeListener{

	protected IResourceDeltaVisitor visitor;
	protected List<IFileChangeListener> listeners;
	class ResourceDeltaVisitor implements IResourceDeltaVisitor {

		@SuppressWarnings("unused")
		public boolean visit(final IResourceDelta delta) throws CoreException {
			IResource target = delta.getResource();
			//TODO if is AspectFile
			//if (Builder.isBPELFile(target)) 
			{
				handleAspect(delta);
			}
			return true;
		}

		private void handleAspect(final IResourceDelta delta)
			throws CoreException {
			IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor)
					throws CoreException {
					
					IResource target=delta.getResource();
					
					switch (delta.getKind()) {
						case IResourceDelta.REMOVED :
							{
								int flags = delta.getFlags();
								if ((flags & IResourceDelta.MOVED_TO) != 0) {
									fileMoved(target, delta.getMovedToPath());
								} else {
									fileDeleted(target, monitor);
								}
								break;
							}
					}
				}

				
			};
			ResourcesPlugin.getWorkspace().run(runnable, null);
		}
	}

	
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// TODO Auto-generated method stub
		try {
			event.getDelta().accept(getResourceDeltaVisitor());
		} catch (CoreException e) {
			AspectUIPlugin.log(e);
		}
		
	}
	private void fileDeleted(IResource target, IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

	private void fileMoved(IResource target, IPath movedToPath) {
		// TODO Auto-generated method stub
		
	}
	public AspectResourceChangeListener() {
		listeners = new ArrayList<IFileChangeListener>();
	}
	public void addListener(IFileChangeListener listener) {
		listeners.add(listener);
	}
	public void removeListener(IFileChangeListener listener) {
		listeners.remove(listener);
	}



	private IResourceDeltaVisitor getResourceDeltaVisitor() {
		// TODO Auto-generated method stub
		if (visitor == null) {
			visitor = new ResourceDeltaVisitor();
		}
		return visitor;
	}

}
