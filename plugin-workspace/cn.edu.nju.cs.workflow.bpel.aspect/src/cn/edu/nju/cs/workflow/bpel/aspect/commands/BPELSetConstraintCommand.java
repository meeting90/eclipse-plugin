package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.ui.commands.SetConstraintCommand;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELSetConstraintCommand extends SetConstraintCommand {
	public BPELSetConstraintCommand(Activity activity, Point location,
			Dimension size) {
		super(activity, location, size);
	}
	BPELCommandUtil commandUtil=new BPELCommandUtil(this);
	@Override
	public void execute() {
		commandUtil.autoUndoExecute();
	}
}
