package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.ui.actions.CreateCorrelationSetAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.commands.InsertInContainerCommand;
import org.eclipse.bpel.ui.commands.SetNameAndDirectEditCommand;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetSelectionCommand;

public class BPELCreateCorrelationSetAction extends CreateCorrelationSetAction{

	public BPELCreateCorrelationSetAction(EditPart anEditPart) {
		super(anEditPart);
		
	}
	@Override
	public boolean onButtonPressed() {
		parent = getParent();
		child = getChild();
		if (parent==null || child==null)
			return false;

		InsertInContainerCommand insertCmd = new InsertInContainerCommand(parent, child, null);
		CompoundCommand command = new CompoundCommand(insertCmd.getLabel());
		command.add( insertCmd ); 
		command.add( new BPELSetSelectionCommand ( parent, true ) );
		command.add( new BPELSetSelectionCommand ( child, false ) );
		command.add(new SetNameAndDirectEditCommand(child, viewer));
		AspectModelHelper.getAspectEditor(modelObject).getCommandStack().execute(command);
		return true;
	}

}
