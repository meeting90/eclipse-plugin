package cn.edu.nju.cs.workflow.bpel.aspect.adapters;

import java.util.List;

import org.eclipse.bpel.ui.actions.editpart.AbstractAction;
import org.eclipse.gef.EditPart;

import cn.edu.nju.cs.workflow.bpel.aspect.actions.BPELSetCompensateLinkAction;

public class BPELCompensateScopeAdapter extends BPELActivityAdapter {

	@Override
	public List<AbstractAction> getEditPartActions(final EditPart editPart) {
		List<AbstractAction> actions=super.getEditPartActions(editPart);
		actions.add(new BPELSetCompensateLinkAction(editPart));
		return actions;
	}	
}
