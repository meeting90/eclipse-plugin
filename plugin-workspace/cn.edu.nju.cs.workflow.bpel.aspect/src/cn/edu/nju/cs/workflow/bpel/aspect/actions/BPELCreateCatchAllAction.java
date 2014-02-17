package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.CatchAll;
import org.eclipse.bpel.ui.actions.editpart.CreateCatchAllAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.editors.AspectEditor;

public class BPELCreateCatchAllAction extends CreateCatchAllAction{

	public BPELCreateCatchAllAction(EditPart anEditPart) {
		super(anEditPart);
		
	}
	@Override
	public boolean onButtonPressed() {
		CompoundCommand command = new CompoundCommand();
		final CatchAll child = (CatchAll)UIObjectFactoryProvider.getInstance().getFactoryFor(
			BPELPackage.eINSTANCE.getCatchAll()).createInstance();
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, child, null));
		AspectEditor aspectEditor = AspectModelHelper.getAspectEditor(modelObject);
		aspectEditor.getCommandStack().execute(command);
		return true;
	}

}
