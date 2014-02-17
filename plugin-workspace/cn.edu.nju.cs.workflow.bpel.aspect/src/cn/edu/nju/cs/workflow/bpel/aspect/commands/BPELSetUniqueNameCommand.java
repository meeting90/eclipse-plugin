package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import java.util.Collections;

import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.ui.adapters.ILabeledElement;
import org.eclipse.bpel.ui.adapters.INamedElement;
import org.eclipse.bpel.ui.commands.SetNameCommand;
import org.eclipse.bpel.ui.commands.SetUniqueNameCommand;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.emf.ecore.EObject;

public class BPELSetUniqueNameCommand extends org.eclipse.gef.commands.CompoundCommand {
	protected EObject rootModel;
	protected Object model;

	public BPELSetUniqueNameCommand(EObject rootModel, Object model) {
		this.model = model;
		this.rootModel = rootModel;
		ILabeledElement element = BPELUtil.adapt(model, ILabeledElement.class);
		String name = (element != null) ? element.getTypeLabel(model) : ""; //$NON-NLS-1$
		String uniqueModelName = BPELUtil.getUniqueModelName(rootModel, name, Collections.singletonList(model));
		if (BPELUtil.adapt(model, INamedElement.class) != null) {
			add(new SetNameCommand((EObject)model, uniqueModelName));
		}
	}
}
