package cn.edu.nju.cs.workflow.bpel.aspect.editors;

import org.eclipse.bpel.ui.BPELEditor;
import org.eclipse.bpel.ui.BPELMultipageEditorPart;
import org.eclipse.gef.DefaultEditDomain;

public class AspectEditor extends BPELEditor{

	public AspectEditor(DefaultEditDomain ed,
			BPELMultipageEditorPart multipageEditor) {
		super(ed, multipageEditor);
		
	}

}
