package cn.edu.nju.cs.workflow.bpel.aspect;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;


public class AspectResourceInfo {

		/** The edit model */
		AspectEditModel editModel;

		/** The emf resource */
		Resource resource;

		/** The workbench IFile that the resource came from */
		IFile file;

		/** Resource listener, notifications from workbench */
		AspectResourceListener resourceListener;

		/** The adapter on the EMF resource */
		Adapter resourceAdapter;

		/** Last synchronization stamp */
		long synchronizeStamp = 0;

		/** Load options */
		@SuppressWarnings("rawtypes")
		Map loadOptions = new HashMap();

		
		public int referenceCount = 0;

		protected boolean loading = false;

		protected boolean fileExists = false;

		
		/**
		 * Brand new shiny ResourceInfo object.
		 *  
		 * @param editModel
		 * @param file
		 */
		
		AspectResourceInfo (AspectEditModel anEditModel, IFile aFile) {
			this.editModel = anEditModel;
			this.file = aFile;
			
			resetSynchronizeStamp();
			resourceListener = new AspectResourceListener(this, this.file);
			ResourcesPlugin.getWorkspace().addResourceChangeListener (resourceListener);
			
			resourceAdapter = new AdapterImpl() {
				
				@Override
				public void notifyChanged(Notification msg) {
					if ((msg.getEventType() == Notification.SET)
							&& (resource != null && msg.getNotifier() == resource)) {
						if (msg.getFeatureID(Resource.class) == Resource.RESOURCE__IS_MODIFIED) {
							AspectResourceInfo.this.editModel
									.fireModelDirtyStateChanged(AspectResourceInfo.this);
						}
					}
				}
			};
		}

		/**
		 * 
		 * @return the file which represents this resource in the workspace.
		 */
		
		public IFile getFile() {
			return file;
		}

		
		protected boolean getFileExists() {		
			return fileExists;
		}

		/**
		 * Answer if dirty.
		 * 
		 * @return  true if dirty, false if clean.
		 */
		
		public boolean isDirty() {
			if (resource == null) {
				return false;
			}
			return resource.isModified();
		}

		
		/**
		 * Return the EMF resource that this resource info is holding onto.
		 * 
		 * @return the EMF resource.
		 */
		
		public Resource getResource() {
			return resource;
		}

		/**
		 * Set the EMF resource that this resource is holding onto.
		 * 
		 * @param aResource the EMF resource.
		 */
		
		protected void setResource (Resource aResource) {
			this.resource = aResource;
		}

		/**
		 * Return the EMF load options.
		 * 
		 * @return the EMF resource load options.
		 */
		
		@SuppressWarnings("rawtypes")
		public Map getLoadOptions() {
			return loadOptions;
		}

		
		/**
		 * Set the EMF load options.
		 * 
		 * @param loadOptions
		 */
		@SuppressWarnings("rawtypes")
		public void setLoadOptions(Map loadOptions) {
			
			this.loadOptions = loadOptions;
		}

		/**
		 * The listener has notified us that the resource has moved in the Eclipse workbench. 
		 * We need to take appropriate cover.
		 * 
		 * @param movedToFile the moved to file.
		 */
		
		
		protected void move(IFile movedToFile) {
			editModel.removeResourceInfo(this);
			file = movedToFile;
			resource.setURI(URI.createPlatformResourceURI(file.getFullPath().toString(),true));
			resetSynchronizeStamp();
			
			resourceListener.setFile(movedToFile);
			editModel.addResourceInfo(this);
			editModel.fireModelLocationChanged(this, movedToFile);
		}

		/** 
		 * The listener has notified us that the resource has been deleted in the Eclipse workbench.
		 */
		protected void deleted() {
			if (editModel == null) {
				return;
			}
			editModel.fireModelDeleted(this);
		}

		/**
		 * The listener has notified us that the resource has had markers updated.
		 * We need to let the edit model know about about this.
		 * 
		 */
		
		protected void markersChanged ( IMarkerDelta [] markerDelta ) {
			if (editModel == null) {
				return ;
			}
			editModel.fireModelMarkersChanged ( this, markerDelta );
		}
		
		
		/**
		 * 
		 * Should not be used by clients
		 * 
		 */
		
		public void refresh() {		
			if (getSynchronizeStamp() == getCurrentFileModified()) {
				return;
			}
			load();
			editModel.fireModelReloaded(this);
		}

		
		
		public void dispose() {
			if (editModel == null) {
				return;
			}
			if (resource != null) {
				resource.eAdapters().clear();			
			}
			editModel.removeResourceInfo(this);
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceListener);
			if (resource != null) {
				resource.unload();
			}
			editModel = null;
			resource = null;
			resourceListener = null;
		}

		
		protected void load() {
			if (resource != null) {
				resource.unload();
			}
			try {
				loading = true;
				resource = editModel.getResourceSet().getResource(
						URI.createPlatformResourceURI(file.getFullPath()
										.toString(),true), true);
			} finally {
				loading = false;
			}
			resourceLoaded();
		}

		
		protected void resourceLoaded() {
			
			if (loading) {
				return;
			}
			
			resetSynchronizeStamp();
			resource.eAdapters().add(resourceAdapter);
			fileExists = file.exists();
		}

		/**
		 * Should not be used by clients
		 * 
		 * @throws IOException 
		 */
		
		public void save() throws IOException {
			
			getResource().save(getLoadOptions());
			fileExists = true;
			resetSynchronizeStamp();
		}

		/**
		 * Should not be used by clients
		 * @param savedFile 
		 * @throws IOException 
		 */
		
		public void saveAs(IFile savedFile) throws IOException {
			// TODO Revert to old file name if save fails
			move(savedFile);
			save();
		}

		/**
		 * Resets the synchronization stamp. Should not be used by clients
		 */
		
		public void resetSynchronizeStamp() {
			synchronizeStamp = getCurrentFileModified();
		}

		/**
		 * Returns the last synchronization stamp. Should not be used by clients
		 * @return the last synchronization stamp.
		 */
		
		public long getSynchronizeStamp() {
			return synchronizeStamp;
		}

		/*
		 * Returns the resource current modified time.
		 */
		private long getCurrentFileModified() {
			return file.getLocation().toFile().lastModified();
		}
	}


