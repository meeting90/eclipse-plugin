package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.adapters.ElseIfAdapter;
import org.eclipse.bpel.ui.adapters.IContainer;

import cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates.BPELActivityContainer;

public class BPELElseIfAdapter extends ElseIfAdapter {
	@SuppressWarnings("rawtypes")
	@Override
	public IContainer createContainerDelegate() {
		
		return new BPELActivityContainer(BPELPackage.eINSTANCE.getElseIf_Activity());
	}
}
