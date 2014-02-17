package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.adapters.CatchAdapter;
import org.eclipse.bpel.ui.adapters.IContainer;

import cn.edu.nju.cs.workflow.bpel.aspect.adapters.delegates.BPELActivityContainer;

public class BPELCatchAdapter extends CatchAdapter {
	@SuppressWarnings("rawtypes")
	@Override
	public IContainer createContainerDelegate() {
		return new BPELActivityContainer(BPELPackage.eINSTANCE.getCatch_Activity());
	}
}
