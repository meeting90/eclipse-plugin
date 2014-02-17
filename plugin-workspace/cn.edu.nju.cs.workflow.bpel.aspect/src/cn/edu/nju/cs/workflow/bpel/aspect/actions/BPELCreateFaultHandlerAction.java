package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Catch;
import org.eclipse.bpel.model.FaultHandler;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.actions.editpart.CreateFaultHandlerAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetNameAndDirectEditCommand;

public class BPELCreateFaultHandlerAction extends CreateFaultHandlerAction{

	public BPELCreateFaultHandlerAction(EditPart editPart) {
		super(editPart);
	}
	@Override
	public boolean onButtonPressed() {
		CompoundCommand command = new CompoundCommand(IBPELUIConstants.CMD_ADD_FAULTHANDLER);
		final FaultHandler faultHandler = BPELFactory.eINSTANCE.createFaultHandler();
		// Create an empty Catch inside it.
		final Catch _catch = (Catch)UIObjectFactoryProvider.getInstance().getFactoryFor(
				BPELPackage.eINSTANCE.getCatch()).createInstance();
		faultHandler.getCatch().add(_catch);
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, faultHandler, null)); 
		command.add(new BPELSetNameAndDirectEditCommand(_catch, viewer));
		AspectModelHelper.getAspectEditor(modelObject).getCommandStack().execute(command);
		BPELUtil.setShowFaultHandler(editPart, true);
		return true;
	}

}
