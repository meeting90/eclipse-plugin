package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Correlation;
import org.eclipse.bpel.ui.commands.RemoveCorrelationCommand;
import org.eclipse.emf.ecore.EObject;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELRemoveCorrelationCommand extends RemoveCorrelationCommand {

	public BPELRemoveCorrelationCommand(EObject target,
			Correlation oldCorrelation) {
		super(target, oldCorrelation);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
