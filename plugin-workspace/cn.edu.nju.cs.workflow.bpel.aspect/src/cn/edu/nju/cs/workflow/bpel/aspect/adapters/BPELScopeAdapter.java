package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.adapters.AdapterRegistry;
import org.eclipse.bpel.ui.actions.editpart.AbstractAction;
import org.eclipse.bpel.ui.adapters.ICompensationHandlerHolder;
import org.eclipse.bpel.ui.adapters.IContainer;
import org.eclipse.bpel.ui.adapters.IEventHandlerHolder;
import org.eclipse.bpel.ui.adapters.IFaultHandlerHolder;
import org.eclipse.bpel.ui.adapters.ITerminationHandlerHolder;
import org.eclipse.bpel.ui.adapters.ScopeAdapter;
import org.eclipse.bpel.ui.adapters.delegates.MultiContainer;
import org.eclipse.bpel.ui.adapters.delegates.OptionalIndirectContainer;
import org.eclipse.bpel.ui.adapters.delegates.ReferenceContainer;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.bpel.ui.util.FlowLinkUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateCompensationHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateCorrelationSetAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateEventHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateFaultHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateFlowLinkAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateMessageExchangeAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreatePartnerLinkAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateTerminationHandlerAction;
import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELCreateVariableAction;
import cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates.BPELActivityContainer;

public class BPELScopeAdapter extends ScopeAdapter {


	
	@SuppressWarnings("rawtypes")
	@Override
	public IContainer createContainerDelegate() {
		MultiContainer omc = new MultiContainer();
		omc.add(new BPELActivityContainer(BPELPackage.eINSTANCE.getScope_Activity()));
		// TODO: Support scoped partner links, correlation sets, variables and message exchanges
		omc.add(new OptionalIndirectContainer(BPELPackage.eINSTANCE.getScope_PartnerLinks(),			
			new ReferenceContainer(BPELPackage.eINSTANCE.getPartnerLinks_Children())));
		omc.add(new OptionalIndirectContainer(BPELPackage.eINSTANCE.getScope_CorrelationSets(),			
			new ReferenceContainer(BPELPackage.eINSTANCE.getCorrelationSets_Children())));
		omc.add(new OptionalIndirectContainer(BPELPackage.eINSTANCE.getScope_Variables(),			
			new ReferenceContainer(BPELPackage.eINSTANCE.getVariables_Children())));
		omc.add(new OptionalIndirectContainer(BPELPackage.eINSTANCE.getScope_MessageExchanges(),			
				new ReferenceContainer(BPELPackage.eINSTANCE.getMessageExchanges_Children())));
		
		omc.add(new ReferenceContainer(BPELPackage.eINSTANCE.getScope_FaultHandlers()));
		omc.add(new ReferenceContainer(BPELPackage.eINSTANCE.getScope_CompensationHandler()));
		omc.add(new ReferenceContainer(BPELPackage.eINSTANCE.getScope_TerminationHandler()));
		omc.add(new ReferenceContainer(BPELPackage.eINSTANCE.getScope_EventHandlers()));
		return omc;
	}

	
	@Override
	public List<AbstractAction> getEditPartActions(final EditPart editPart) {
		List<AbstractAction> actions = new ArrayList<AbstractAction>();
		Object modelObject = editPart.getModel();
		
		IFaultHandlerHolder ifh = BPELUtil.adapt(modelObject, IFaultHandlerHolder.class);
		if (ifh != null && ifh.getFaultHandler(modelObject) == null) {
			actions.add(new BPELCreateFaultHandlerAction(editPart));
		}			
		ICompensationHandlerHolder ich = BPELUtil.adapt(modelObject, ICompensationHandlerHolder.class);
		if (ich != null && ich.getCompensationHandler(modelObject) == null) {
    		actions.add(new BPELCreateCompensationHandlerAction(editPart));
		}
		ITerminationHandlerHolder ith = BPELUtil.adapt(modelObject, ITerminationHandlerHolder.class);
		if (ith != null && ith.getTerminationHandler(modelObject) == null) {
    		actions.add(new BPELCreateTerminationHandlerAction(editPart));
		}
		IEventHandlerHolder ieh = BPELUtil.adapt(modelObject, IEventHandlerHolder.class);
		if (ieh != null && ieh.getEventHandler(modelObject) == null) {
	    	actions.add(new BPELCreateEventHandlerAction(editPart));
		}
		if (FlowLinkUtil.hasParentFlow((EObject)modelObject)) {
			actions.add(new BPELCreateFlowLinkAction(editPart));
		}
		
		actions.add(new BPELCreatePartnerLinkAction(editPart));
		actions.add(new BPELCreateVariableAction(editPart));
		actions.add(new BPELCreateCorrelationSetAction(editPart));
		actions.add(new BPELCreateMessageExchangeAction(editPart));
		return actions;
	}

}
