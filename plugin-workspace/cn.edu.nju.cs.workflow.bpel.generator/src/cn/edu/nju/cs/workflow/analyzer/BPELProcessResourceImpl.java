package cn.edu.nju.cs.workflow.analyzer;


import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.resource.BPELResourceImpl;
import org.eclipse.emf.common.util.URI;

public class BPELProcessResourceImpl extends BPELResourceImpl{
	Process bpelProcess;
	public BPELProcessResourceImpl(URI uri,Process process) {
		// TODO Auto-generated constructor stub
		super(uri);
		this.bpelProcess=process;
	}
	@Override
	public Process getProcess() {
		// TODO Auto-generated method stub
		return bpelProcess;
	}
	

}
