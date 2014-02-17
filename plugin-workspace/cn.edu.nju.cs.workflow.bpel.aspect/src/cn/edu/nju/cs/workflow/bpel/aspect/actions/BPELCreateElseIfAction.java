package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.ElseIf;
import org.eclipse.bpel.ui.actions.editpart.CreateElseIfAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetNameAndDirectEditCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELCreateElseIfAction extends CreateElseIfAction{

	public BPELCreateElseIfAction(EditPart editPart) {
		super(editPart);
		
	}
	@Override
	public boolean onButtonPressed() {
		
		CompoundCommand command = new CompoundCommand();
		final ElseIf child = (ElseIf)UIObjectFactoryProvider.getInstance().getFactoryFor(
			BPELPackage.eINSTANCE.getElseIf()).createInstance();
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, child, null));
		command.add(new BPELSetNameAndDirectEditCommand(child, viewer));
		AspectEditor editor = AspectModelHelper.getAspectEditor(modelObject);
		editor.getCommandStack().execute(command);
		return true;
	}

}
