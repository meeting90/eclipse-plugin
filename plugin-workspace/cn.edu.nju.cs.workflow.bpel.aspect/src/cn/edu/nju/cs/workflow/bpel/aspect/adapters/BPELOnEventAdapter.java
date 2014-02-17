package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.adapters.IContainer;
import org.eclipse.bpel.ui.adapters.OnEventAdapter;

import cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates.BPELActivityContainer;

public class BPELOnEventAdapter extends OnEventAdapter {

	@SuppressWarnings("rawtypes")
	@Override
	public IContainer createContainerDelegate() {
		return new BPELActivityContainer(BPELPackage.eINSTANCE.getOnEvent_Activity());
	}

}
