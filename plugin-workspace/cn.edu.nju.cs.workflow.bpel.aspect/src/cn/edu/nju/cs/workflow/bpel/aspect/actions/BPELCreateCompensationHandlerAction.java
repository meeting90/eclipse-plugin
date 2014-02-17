package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.actions.editpart.CreateCompensationHandlerAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetNameAndDirectEditCommand;

public class BPELCreateCompensationHandlerAction extends CreateCompensationHandlerAction{

	public BPELCreateCompensationHandlerAction(EditPart anEditPart) {
		super(anEditPart);
	}
	@Override
	public boolean onButtonPressed() {
		
		CompoundCommand command = new CompoundCommand(IBPELUIConstants.CMD_ADD_COMPENSATIONHANDLER);
		final EObject child = UIObjectFactoryProvider.getInstance().getFactoryFor(
				BPELPackage.eINSTANCE.getCompensationHandler() ).createInstance();
		
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, child, null)); 
		command.add(new BPELSetNameAndDirectEditCommand(child, viewer));
		AspectModelHelper.getAspectEditor(modelObject).getCommandStack().execute(command);
		
		BPELUtil.setShowCompensationHandler(editPart, true);
		return true;
	}

}
