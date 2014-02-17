package cn.edu.nju.cs.workflow.bpel.aspect.actions;

import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.EventHandler;
import org.eclipse.bpel.model.OnEvent;
import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.actions.editpart.AbstractAction;
import org.eclipse.bpel.ui.commands.CompoundCommand;
import org.eclipse.bpel.ui.factories.UIObjectFactoryProvider;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import cn.edu.nju.cs.workflow.bpel.aspect.AspectModelHelper;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELInsertInContainerCommand;
import cn.edu.nju.cs.workflow.bpel.aspect.commands.BPELSetNameAndDirectEditCommand;

public  class BPELCreateEventHandlerAction extends AbstractAction{

	public BPELCreateEventHandlerAction(EditPart anEditPart) {
		super(anEditPart);
	}

	@Override
	public ImageDescriptor getIcon() {
		return BPELUIPlugin.INSTANCE.getImageDescriptor(IBPELUIConstants.ICON_ACTION_EVENTHANDLER);
	}
	public Image getIconImg() {
		return BPELUIPlugin.INSTANCE.getImage(IBPELUIConstants.ICON_ACTION_EVENTHANDLER);
	}
	@Override
	public String getToolTip() {
		return Messages.CreateEventHandlerAction_Add_Event_Handler_1; 
	}

	@Override
	public boolean onButtonPressed() {
		CompoundCommand command = new CompoundCommand(IBPELUIConstants.CMD_ADD_EVENTHANDLER);
		final EventHandler eventHandler = BPELFactory.eINSTANCE.createEventHandler();
		// Create an empty OnEvent inside it.
		final OnEvent onEvent = (OnEvent)UIObjectFactoryProvider.getInstance().getFactoryFor(
				BPELPackage.eINSTANCE.getOnEvent()).createInstance();
		eventHandler.getEvents().add(onEvent);
		command.add(new BPELInsertInContainerCommand((EObject)modelObject, eventHandler, null)); 
		command.add(new BPELSetNameAndDirectEditCommand(onEvent, viewer));
		AspectModelHelper. getAspectEditor(modelObject).getCommandStack().execute(command);
		BPELUtil.setShowEventHandler(editPart, true);
		return true;
	}
	@Override
	public ImageDescriptor getDisabledIcon() { return ImageDescriptor.getMissingImageDescriptor(); }
	@Override
	public boolean isEnabled() { return true; }	
	
	

}
