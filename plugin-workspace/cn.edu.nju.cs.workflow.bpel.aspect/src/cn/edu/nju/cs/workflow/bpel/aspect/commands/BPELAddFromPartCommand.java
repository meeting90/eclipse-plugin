package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.commands.AddFromPartCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wst.wsdl.Part;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddFromPartCommand extends AddFromPartCommand {
	public BPELAddFromPartCommand(EObject target, Variable variable, Part part) {
		super(target, variable, part);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}

}
