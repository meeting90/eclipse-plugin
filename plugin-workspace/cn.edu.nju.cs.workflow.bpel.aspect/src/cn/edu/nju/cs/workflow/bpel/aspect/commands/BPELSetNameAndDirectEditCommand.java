package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.common.ui.editmodel.AbstractEditModelCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.requests.DirectEditRequest;

public class BPELSetNameAndDirectEditCommand extends BPELSetUniqueNameCommand {
	protected EditPartViewer viewer;
	public BPELSetNameAndDirectEditCommand(Object model, EditPartViewer viewer) {
		super((EObject)viewer.getContents().getModel(), model);
		this.viewer=viewer;	
	}
	@Override
	public void execute() {
		// we should only do direct edit if we were able to set a name or label
		if (!getCommands().isEmpty()) {
			// direct edit
			add(new AbstractEditModelCommand() {
				@Override
				public void execute() {
					
					// Before calling direct edit the figure and its border have to layout properly
					// in order for the cell editor to appear in the correct location. So we postpone
					// the direct edit using an async call.
					viewer.getControl().getDisplay().asyncExec(new Runnable() {
						public void run() {
							// TODO: HACK HACK: since we used batched adapters to refresh the edit parts,
							// this *only works* because of the asyncExec().
							GraphicalEditPart editPart = (GraphicalEditPart)viewer.getEditPartRegistry().get(model);
							if (editPart != null) {
								editPart.getFigure().getParent().getLayoutManager().invalidate();
								editPart.performRequest(new DirectEditRequest());
							}
						}
					});
				}
				@Override
				public Resource[] getResources() { return EMPTY_RESOURCE_ARRAY; }
				@Override
				public Resource[] getModifiedResources() { return EMPTY_RESOURCE_ARRAY; }
			});
		}

		// execute the contained commands.
		super.execute();
	}
	
	@Override
	public boolean canExecute() {
		if (getCommands().isEmpty()) {
			// it will be a no-op but it is harmless since this command is always
			// together with a command creating a model object
			return true;
		}
		return super.canExecute();
	}
	
	@Override
	public boolean canUndo() {
		if (getCommands().isEmpty()) {
			// it will be a no-op but it is harmless since this command is always
			// together with a command creating a model object
			return true;
		}
		return super.canUndo();
	}

	

}
