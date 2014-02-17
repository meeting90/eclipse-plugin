package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Catch;
import org.eclipse.bpel.ui.actions.editpart.CreateCatchAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetNameAndDirectEditCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELCreateCatchAction extends CreateCatchAction {

	public BPELCreateCatchAction(EditPart anEditPart) {
		super(anEditPart);
		
	}
	@Override
	public boolean onButtonPressed() {
		CompoundCommand command = new CompoundCommand();
		final Catch child = (Catch)UIObjectFactoryProvider.getInstance().getFactoryFor(
				BPELPackage.eINSTANCE.getCatch()).createInstance();
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, child, null));
		command.add(new BPELSetNameAndDirectEditCommand(child, viewer));

		AspectEditor aspectEditor = AspectModelHelper.getAspectEditor(modelObject);
		aspectEditor.getCommandStack();
		return true;
	}

}
