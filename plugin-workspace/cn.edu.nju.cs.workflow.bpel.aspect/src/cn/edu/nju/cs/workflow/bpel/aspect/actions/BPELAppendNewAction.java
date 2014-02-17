package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.ui.actions.AppendNewAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.AbstractUIObjectFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetSelectionCommand;

public class BPELAppendNewAction extends AppendNewAction {

	public BPELAppendNewAction(IWorkbenchPart editor,
			AbstractUIObjectFactory aFactory) {
		super(editor, aFactory);
	}
	@Override
	public Command getCreateCommand() {
	
		if (fSelection == null) {
			return null;
		}
		
		CompoundCommand compoundCmd = new CompoundCommand();
		
		//AspectEditor aspectEditor = (AspectEditor) getWorkbenchPart();
		//EditPartViewer viewer = aspectEditor.getGraphicalViewer();
		
		EObject model = (EObject) factory.getNewObject();
		
		compoundCmd.add( new BPELInsertInContainerCommand( fSelection,model,null ) );
		compoundCmd.add( new BPELSetSelectionCommand ( fSelection, true ) );
		compoundCmd.add( new BPELSetSelectionCommand ( model, false ) );
		//compoundCmd.add( new SetNameAndDirectEditCommand (model, viewer) );
		
		return compoundCmd;
		
		
	}
	@Override
	protected boolean calculateEnabled() {
		return true;
		//TODO 
	}

}
