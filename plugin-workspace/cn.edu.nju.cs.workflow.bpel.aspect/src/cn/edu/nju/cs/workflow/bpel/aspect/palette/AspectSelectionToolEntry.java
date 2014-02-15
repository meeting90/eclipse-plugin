package cn.edu.nju.cs.workflow.bpel.aspect.palette;

import org.eclipse.bpel.ui.palette.BPELSelectionTool;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.SelectionToolEntry;

public class AspectSelectionToolEntry extends SelectionToolEntry {
	public AspectSelectionToolEntry() {
		super();
	}

	public AspectSelectionToolEntry(String label) {
		super(label);
	}

	public AspectSelectionToolEntry(String label, String shortDesc) {
		super(label, shortDesc);
	}

	@Override
	public Tool createTool() {
		return new AspectSelectionTool();
	}
}
