package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.adapters.IContainer;
import org.eclipse.bpel.ui.adapters.OnMessageAdapter;

import cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates.BPELActivityContainer;

public class BPELOnMessageAdapter extends OnMessageAdapter {


	@SuppressWarnings("rawtypes")
	@Override
	public IContainer createContainerDelegate() {
		return new BPELActivityContainer(BPELPackage.eINSTANCE.getOnMessage_Activity());
	}
}
