package cn.edu.nju.cs.workflow.aspect.ui;

import org.eclipse.bpel.ui.BPELEditor;
import org.eclipse.bpel.ui.BPELMultipageEditorPart;
import org.eclipse.gef.DefaultEditDomain;

public class AspectEditor extends BPELEditor{

	AspectMultipageEditorPart multipageEditorPart;
	public AspectEditor(DefaultEditDomain ed,
			BPELMultipageEditorPart multipageEditor) {
		super(ed, multipageEditor);
		this.multipageEditorPart=(AspectMultipageEditorPart)multipageEditor;
	}
	
	public AspectMultipageEditorPart getMultipageEditor() {
		// TODO Auto-generated method stub
	
		return this.multipageEditorPart;
	}

	

	


	
}
