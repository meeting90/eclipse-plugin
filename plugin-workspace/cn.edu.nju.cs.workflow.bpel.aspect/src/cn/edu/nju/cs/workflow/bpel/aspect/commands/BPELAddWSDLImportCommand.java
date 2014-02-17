package cn.edu.nju.cs.workflow.bpel.aspect.commands;

import org.eclipse.bpel.ui.commands.AddWSDLImportCommand;
import org.eclipse.wst.wsdl.Definition;

import cn.edu.nju.cs.workflow.bpel.aspect.commands.util.BPELCommandUtil;

public class BPELAddWSDLImportCommand extends AddWSDLImportCommand {
	BPELCommandUtil commandUtil;
	public BPELAddWSDLImportCommand(Definition defn, Object object) {
		super(defn, object);
		
	}
	@Override
	public void execute() {
			commandUtil.autoUndoExecute();
	}

}
