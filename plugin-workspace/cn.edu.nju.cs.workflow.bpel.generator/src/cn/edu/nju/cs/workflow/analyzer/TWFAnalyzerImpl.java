package cn.edu.nju.cs.workflow.analyzer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.resource.BPELResource;
import org.eclipse.bpel.model.resource.BPELResourceImpl;
import org.eclipse.bpel.model.resource.BPELWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;


import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;
public class TWFAnalyzerImpl  implements TWFAnalyzer{
	//private BPELProcessWriter writer=null;
	private BPELResource bpelResource=null;
	private Process bpelProcess=null;
	private WorkflowProcess workflowProcess=null;
	
	public TWFAnalyzerImpl(){
		super();
	}
	public TWFAnalyzerImpl(Resource resource){
		this();
		initFromResource(resource);
	}
	
	public void initFromResource(Resource resource){
		EList<EObject> contents=resource.getContents();
		for(EObject ob: contents){
			if(ob instanceof WorkflowProcess){
				this.workflowProcess=(WorkflowProcess)ob;
			}
			if(ob instanceof Process){
				this.bpelProcess=(Process)ob;
			}
		}
	}
	


	@Override
	public void generateBpelProcess(URI uri) throws IOException {
		System.out.println("bpelProcess:"+bpelProcess.getVariables().getChildren().get(0).getMessageType());
		// TODO Auto-generated method stub
		bpelResource=new BPELProcessResourceImpl(uri,bpelProcess);
		//bpelResource.getContents().add(bpelProcess);
		//bpelResource.
		
		Map<Object,Object> saveOptions = new HashMap<Object,Object> ();
		saveOptions.put( BPELWriter.SKIP_AUTO_IMPORT, Boolean.TRUE );
//		BPELWriter writer=new BPELWriter();
//		writer.write(bpelResource, System.out, saveOptions);
//		//System.out.println(writer.getResource().getProcess().getVariables().getChildren().get(0).getMessageType());
		bpelResource.save(saveOptions);

	}
	@Override
	public void reorderTasks() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void completeBpelProcess() {
		// TODO Auto-generated method stub
		
	}

	




	
}
