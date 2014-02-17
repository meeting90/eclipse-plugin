package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Correlation;
import org.eclipse.bpel.ui.commands.AddCorrelationCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddCorrelationCommand extends AddCorrelationCommand {
	
	public BPELAddCorrelationCommand(EObject target, Correlation newCorrelation) {
		super(target, newCorrelation);
		
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}

}
