package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Else;
import org.eclipse.bpel.ui.actions.editpart.CreateElseAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetNameAndDirectEditCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELCreateElseAction extends CreateElseAction{

	public BPELCreateElseAction(EditPart editPart) {
		super(editPart);
		
	}
	@Override
	public boolean onButtonPressed() {
		CompoundCommand command = new CompoundCommand();
		Else child = (Else)UIObjectFactoryProvider.getInstance().getFactoryFor(
			BPELPackage.eINSTANCE.getElse()).createInstance();
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, child, null));
		command.add(new BPELSetNameAndDirectEditCommand(child, viewer));
		AspectEditor editor = AspectModelHelper.getAspectEditor(modelObject);
		editor.getCommandStack().execute(command);
		return true;
	}

}
