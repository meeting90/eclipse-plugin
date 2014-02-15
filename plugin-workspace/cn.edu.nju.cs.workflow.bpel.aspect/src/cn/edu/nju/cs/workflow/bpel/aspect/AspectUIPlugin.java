package cn.edu.nju.cs.workflow.bpel.aspect;




import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.adapters.AdapterRegistry;
import org.eclipse.bpel.model.adapters.BasicBPELAdapterFactory;
import org.eclipse.bpel.model.messageproperties.MessagepropertiesPackage;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypePackage;
import org.eclipse.bpel.ui.adapters.BPELUIAdapterFactory;
import org.eclipse.bpel.ui.adapters.BPELUIExtensionAdapterFactory;
import org.eclipse.bpel.ui.adapters.BPELUIMessagePropertiesAdapterFactory;
import org.eclipse.bpel.ui.adapters.BPELUIPartnerLinkTypeAdapterFactory;
import org.eclipse.bpel.ui.adapters.BPELUIWSDLAdapterFactory;
import org.eclipse.bpel.ui.adapters.BPELUIXSDAdapterFactory;
import org.eclipse.bpel.ui.uiextensionmodel.UiextensionmodelPackage;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ISaveContext;
import org.eclipse.core.resources.ISaveParticipant;
import org.eclipse.core.resources.ISavedState;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.wst.wsdl.WSDLPackage;
import org.eclipse.xsd.XSDPackage;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class AspectUIPlugin extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "org.eclipse.bpel.ui"; //$NON-NLS-1$

	/**  */
	static public AspectUIPlugin INSTANCE;

	//private ColorRegistry colorRegistry;
	protected boolean imagesAndColorsInitialized;

	// takes care of changes to the BPEL file
	private AspectResourceChangeListener resourceChangeListener;
	private ISaveParticipant saveParticipant;

	// The templates that are provided for new file creation
	//private Templates mTemplates;

	public AspectUIPlugin() {
		super();
		AdapterRegistry.INSTANCE.registerAdapterFactory(
				BPELPackage.eINSTANCE, BasicBPELAdapterFactory.INSTANCE);
		AdapterRegistry.INSTANCE.registerAdapterFactory(
				BPELPackage.eINSTANCE, BPELUIAdapterFactory.getInstance());

		AdapterRegistry.INSTANCE.registerAdapterFactory(
			    WSDLPackage.eINSTANCE, BPELUIWSDLAdapterFactory.getInstance());

		AdapterRegistry.INSTANCE.registerAdapterFactory(
			    PartnerlinktypePackage.eINSTANCE, BPELUIPartnerLinkTypeAdapterFactory.getInstance());

		AdapterRegistry.INSTANCE.registerAdapterFactory(
			    XSDPackage.eINSTANCE, BPELUIXSDAdapterFactory.getInstance());

		AdapterRegistry.INSTANCE.registerAdapterFactory(
			    MessagepropertiesPackage.eINSTANCE, BPELUIMessagePropertiesAdapterFactory.getInstance());

		AdapterRegistry.INSTANCE.registerAdapterFactory(
			    UiextensionmodelPackage.eINSTANCE, BPELUIExtensionAdapterFactory.getInstance());

	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		initializePreferences();
		initializeResourceChangeListener();
		initFunctions ();
	}
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		if (workspace != null) {
			workspace.removeResourceChangeListener(this.resourceChangeListener);
		}
	}

	private void initFunctions() {
		// TODO Auto-generated method stub
		
	}

	private void initializeResourceChangeListener() {
		
		this.resourceChangeListener = new AspectResourceChangeListener();
		// Add the save participant in a separate thread
		// to make sure that it doesn't block the UI thread and potentially cause
		// deadlocks with the code that caused our plugin to be started.
		Thread initSaveParticipantThread = new Thread(new Runnable() {
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				try {
					IWorkspace workspace = ResourcesPlugin.getWorkspace();
					workspace.addResourceChangeListener(AspectUIPlugin.this.resourceChangeListener, IResourceChangeEvent.POST_BUILD);
					ISavedState savedState = workspace.addSaveParticipant(AspectUIPlugin.this, getSaveParticipant());
					if (savedState != null) {
						savedState.processResourceChangeEvents(AspectUIPlugin.this.resourceChangeListener);
					}
				} catch (CoreException e) {
					throw new RuntimeException(e);
				}
			}

			
		});
		initSaveParticipantThread.setName("AspectUIPlugin init"); //$NON-NLS-1$
		initSaveParticipantThread.start();
	}
	private ISaveParticipant getSaveParticipant() {
		if (this.saveParticipant == null) {
			this.saveParticipant = new ISaveParticipant() {
				@Override
				public void doneSaving(ISaveContext context) {
				}
				@Override
				public void prepareToSave(ISaveContext context) throws CoreException {
				}
				@Override
				public void rollback(ISaveContext context) {
				}
				@Override
				public void saving(ISaveContext context) throws CoreException {
					context.needDelta();
				}
			};
		}
		return this.saveParticipant;
	}
	private void initializePreferences() {
		IPreferenceStore store = getPreferenceStore();
		store.setDefault(IAspectUIConstants.PREF_SHOW_FREEFORM_FLOW, true);
		store.setDefault(IAspectUIConstants.PREF_WARN_LINKS, true);
		store.setDefault(IAspectUIConstants.PREF_AUTO_FLOW_LAYOUT, false);
		store.setDefault(IAspectUIConstants.PREF_USE_ANIMATION, true);
		store.setDefault(IAspectUIConstants.PREF_CREATE_SPEC_COMPLIANT_PROCESS, false);
		
	}

	public static void log(Exception e) {
		// TODO Auto-generated method stub
		
	}

	public AspectResourceChangeListener getResourceChangeListener() {
		// TODO Auto-generated method stub
		return this.resourceChangeListener;
	}

	public String getDefaultPage() {
		// TODO Auto-generated method stub
		return getPreferenceStore().getString(IAspectUIConstants.DEFAULT_EDITOR_PAGE);
	}
	public void setDefaultPage(String page) {
		getPreferenceStore().setValue(IAspectUIConstants.DEFAULT_EDITOR_PAGE, page);
	}

}
