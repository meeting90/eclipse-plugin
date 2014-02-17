package cn.edu.nju.cs.workflow.bpel.aspect.factories;

import org.eclipse.bpel.model.adapters.AdapterProvider;
import org.eclipse.bpel.model.util.BPELAdapterFactory;
import org.eclipse.bpel.ui.adapters.IMarkerHolder;
import org.eclipse.bpel.ui.adapters.MarkerDelegateAdapter;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELAssignAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCatchAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCatchAllAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCompensateAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCompensateScopeAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCompensationHandlerAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCopyAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCorrelationSetAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCorrelationSetsAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELCustomActivityAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELElseAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELElseIfAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELEmptyAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELEventHandlerAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELExitAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELExpressionAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELExtensionActivityAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELFaultHandlerAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELFlowAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELForEachAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELFromAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELIfAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELInvokeAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELLinkAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELMessageExchangeAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELMessageExchangesAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELOnAlarmAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELOnEventAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELOnMessageAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELPartnerLinkAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELPartnerLinksAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELPickAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELReceiveAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELRepeatUntilAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELReplyAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELRethrowAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELScopeAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELSequenceAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELTerminationHandlerAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELThrowAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELToAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELValidateAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELVariableAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELVariablesAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELWaitAdapter;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.BPELWhileAdapter;



public class BPELUIAdapterFactory extends BPELAdapterFactory {
	static BPELUIAdapterFactory instance;

	protected AdapterProvider fProvider;

	/**
	 * Brand new shiny adapter factory.
	 */

	public BPELUIAdapterFactory() {
		fProvider = new AdapterProvider();
	}

	/**
	 * Get the instance of this factory.
	 * 
	 * @return an instance of this factory.
	 */

	public static BPELUIAdapterFactory getInstance() {
		if (instance == null) {
			instance = new BPELUIAdapterFactory();
		}
		
		return instance;
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createRepeatUntilAdapter()
	 */
	@Override
	public Adapter createRepeatUntilAdapter() {
		return fProvider.getAdapter(BPELRepeatUntilAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createAssignAdapter()
	 */
	@Override
	public Adapter createAssignAdapter() {
		return fProvider.getAdapter(BPELAssignAdapter.class);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCopyAdapter()
	 */
	@Override
	public Adapter createCopyAdapter() {
		return fProvider.getAdapter(BPELCopyAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createElseIfAdapter()
	 */
	@Override
	public Adapter createElseIfAdapter() {
		return fProvider.getAdapter(BPELElseIfAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCatchAdapter()
	 */
	@Override
	public Adapter createCatchAdapter() {
		return fProvider.getAdapter(BPELCatchAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createFaultHandlerAdapter()
	 */
	@Override
	public Adapter createFaultHandlerAdapter() {
		return fProvider.getAdapter(BPELFaultHandlerAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCompensationHandlerAdapter()
	 */
	@Override
	public Adapter createCompensationHandlerAdapter() {
		return fProvider.getAdapter(BPELCompensationHandlerAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createTerminationHandlerAdapter()
	 */
	@Override
	public Adapter createTerminationHandlerAdapter() {
		return fProvider.getAdapter(BPELTerminationHandlerAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createEventHandlerAdapter()
	 */
	@Override
	public Adapter createEventHandlerAdapter() {
		return fProvider.getAdapter(BPELEventHandlerAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createVariableAdapter()
	 */
	@Override
	public Adapter createVariableAdapter() {
		return fProvider.getAdapter(BPELVariableAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createEmptyAdapter()
	 */
	@Override
	public Adapter createEmptyAdapter() {
		return fProvider.getAdapter(BPELEmptyAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createFlowAdapter()
	 */
	@Override
	public Adapter createFlowAdapter() {
		return fProvider.getAdapter(BPELFlowAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createInvokeAdapter()
	 */
	@Override
	public Adapter createInvokeAdapter() {
		return fProvider.getAdapter(BPELInvokeAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createLinkAdapter()
	 */
	@Override
	public Adapter createLinkAdapter() {
		return fProvider.getAdapter(BPELLinkAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createOnAlarmAdapter()
	 */
	@Override
	public Adapter createOnAlarmAdapter() {
		return fProvider.getAdapter(BPELOnAlarmAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createOnMessageAdapter()
	 */
	@Override
	public Adapter createOnMessageAdapter() {
		return fProvider.getAdapter(BPELOnMessageAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createOnEventAdapter()
	 */
	@Override
	public Adapter createOnEventAdapter() {
		return fProvider.getAdapter(BPELOnEventAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createPartnerLinkAdapter()
	 */
	@Override
	public Adapter createPartnerLinkAdapter() {
		return fProvider.getAdapter(BPELPartnerLinkAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createMessageExchangeAdapter()
	 */
	@Override
	public Adapter createMessageExchangeAdapter() {
		return fProvider.getAdapter(BPELMessageExchangeAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createPickAdapter()
	 */
	@Override
	public Adapter createPickAdapter() {
		return fProvider.getAdapter(BPELPickAdapter.class);
	}

	

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createIfAdapter()
	 */
	@Override
	public Adapter createIfAdapter() {
		return fProvider.getAdapter(BPELIfAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createReceiveAdapter()
	 */
	@Override
	public Adapter createReceiveAdapter() {
		return fProvider.getAdapter(BPELReceiveAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createReplyAdapter()
	 */
	@Override
	public Adapter createReplyAdapter() {
		return fProvider.getAdapter(BPELReplyAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createSequenceAdapter()
	 */
	@Override
	public Adapter createSequenceAdapter() {
		return fProvider.getAdapter(BPELSequenceAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createScopeAdapter()
	 */
	@Override
	public Adapter createScopeAdapter() {
		return fProvider.getAdapter(BPELScopeAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createThrowAdapter()
	 */
	@Override
	public Adapter createThrowAdapter() {
		return fProvider.getAdapter(BPELThrowAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createWaitAdapter()
	 */
	@Override
	public Adapter createWaitAdapter() {
		return fProvider.getAdapter(BPELWaitAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createWhileAdapter()
	 */
	@Override
	public Adapter createWhileAdapter() {
		return fProvider.getAdapter(BPELWhileAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createForEachAdapter()
	 */
	@Override
	public Adapter createForEachAdapter() {
		return fProvider.getAdapter(BPELForEachAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCorrelationSetAdapter()
	 */
	@Override
	public Adapter createCorrelationSetAdapter() {
		return fProvider.getAdapter(BPELCorrelationSetAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCorrelationSetsAdapter()
	 */
	@Override
	public Adapter createMessageExchangesAdapter() {
		return fProvider.getAdapter(BPELMessageExchangesAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCorrelationSetsAdapter()
	 */
	@Override
	public Adapter createCorrelationSetsAdapter() {
		return fProvider.getAdapter(BPELCorrelationSetsAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createPartnerLinksAdapter()
	 */
	@Override
	public Adapter createPartnerLinksAdapter() {
		return fProvider.getAdapter(BPELPartnerLinksAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createVariablesAdapter()
	 */
	@Override
	public Adapter createVariablesAdapter() {
		return fProvider.getAdapter(BPELVariablesAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCatchAllAdapter()
	 */
	@Override
	public Adapter createCatchAllAdapter() {
		return fProvider.getAdapter(BPELCatchAllAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createElseAdapter()
	 */
	@Override
	public Adapter createElseAdapter() {
		return fProvider.getAdapter(BPELElseAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCompensateAdapter()
	 */
	@Override
	public Adapter createCompensateAdapter() {
		return fProvider.getAdapter(BPELCompensateAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createCompensateScopeAdapter()
	 */
	@Override
	public Adapter createCompensateScopeAdapter() {
		return fProvider.getAdapter(BPELCompensateScopeAdapter.class);
	}

	/**
	 * 
	 * @return the custom activity adapter.
	 */
	public Adapter createCustomActivityAdapter() {
		return fProvider.getAdapter(BPELCustomActivityAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createRethrowAdapter()
	 */
	@Override
	public Adapter createRethrowAdapter() {
		return fProvider.getAdapter(BPELRethrowAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createExitAdapter()
	 */
	@Override
	public Adapter createExitAdapter() {
		return fProvider.getAdapter(BPELExitAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createValidateAdapter()
	 */
	@Override
	public Adapter createValidateAdapter() {
		return fProvider.getAdapter(BPELValidateAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createToAdapter()
	 */
	@Override
	public Adapter createToAdapter() {
		return fProvider.getAdapter(BPELToAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createFromAdapter()
	 */
	@Override
	public Adapter createFromAdapter() {
		return fProvider.getAdapter(BPELFromAdapter.class);
	}

	/**
	 * @see org.eclipse.bpel.model.util.BPELAdapterFactory#createExpressionAdapter()
	 */
	@Override
	public Adapter createExpressionAdapter() {
		return fProvider.getAdapter(BPELExpressionAdapter.class);
	}

	@Override
	// https://jira.jboss.org/browse/JBIDE-6917
	public Adapter createExtensionActivityAdapter() {
		return fProvider.getAdapter(BPELExtensionActivityAdapter.class);
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#adaptNew(org.eclipse.emf.common.notify.Notifier,
	 *      java.lang.Object)
	 */
	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		Adapter adapter = createAdapter(target, type);
		// https://bugs.eclipse.org/bugs/show_bug.cgi?id=330813
		// https://jira.jboss.org/browse/JBIDE-7497
		// only associate the adapter with the target (i.e. add it to the
		// target's eAdapters list) if the adapter is for the requested type
		if (adapter == null) {
			if (IMarkerHolder.class.equals(type)) {
				adapter = new MarkerDelegateAdapter();
				associate(adapter, target);
				return adapter;
			}
		}
		else if (adapter.isAdapterForType(type)) {
			associate(adapter, target);
			return adapter;
		}
		return null;
	}

	@Override
	protected Object resolve(Object object, Object type) {
		return null;
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		if (BPELUtil.isCustomActivity(target)) {
			// If we have a custom activity that did not provide a
			// custom adapter we create a default adapter.
			return createCustomActivityAdapter();
		}
		return super.createAdapter(target, type);
	}


}
