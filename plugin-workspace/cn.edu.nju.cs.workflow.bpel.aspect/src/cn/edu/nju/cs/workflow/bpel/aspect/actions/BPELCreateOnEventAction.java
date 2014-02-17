package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.actions.editpart.CreateOnEventAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.commands.InsertInContainerCommand;
import org.eclipse.bpel.ui.commands.SetNameAndDirectEditCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELCreateOnEventAction extends CreateOnEventAction{

	public BPELCreateOnEventAction(EditPart editPart) {
		super(editPart);
		
	}
	@Override
	public boolean onButtonPressed() {
		CompoundCommand command = new CompoundCommand();
		EObject child = UIObjectFactoryProvider.getInstance().getFactoryFor(
			BPELPackage.eINSTANCE.getOnEvent()).createInstance();
		command.add(new InsertInContainerCommand((EObject)modelObject, child, null));
		command.add(new SetNameAndDirectEditCommand(child, viewer));
		AspectEditor editor = AspectModelHelper.getAspectEditor(modelObject);
		editor.getCommandStack().execute(command);
		return true;
	}

}
