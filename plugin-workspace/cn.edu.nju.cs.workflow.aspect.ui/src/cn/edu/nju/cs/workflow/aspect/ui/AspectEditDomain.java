package cn.edu.nju.cs.workflow.aspect.ui;

import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.ui.uiextensionmodel.EndNode;
import org.eclipse.bpel.ui.uiextensionmodel.StartNode;
import org.eclipse.bpel.ui.uiextensionmodel.UiextensionmodelFactory;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.ui.IEditorPart;

public class AspectEditDomain extends DefaultEditDomain{
	StartNode startNode;
    EndNode endNode;
    
    public AspectEditDomain(IEditorPart editorPart) {
        super(editorPart);
        endNode = UiextensionmodelFactory.eINSTANCE.createEndNode();
        startNode = UiextensionmodelFactory.eINSTANCE.createStartNode();
    }
    public StartNode getStartNode() {
    	return startNode;
    }
    public EndNode getEndNode() {
    	return endNode;
    }
    public void setProcess(Process process) {
    	startNode.setProcess(process);
    }

}
