package cn.edu.nju.cs.workflow.analyzer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.bpel.common.wsdl.parsers.WsdlParser;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.resource.BPELResource;
import org.eclipse.bpel.model.resource.BPELWriter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.wst.wsdl.Definition;


import cn.edu.nju.cs.workflow.model.WorkflowProcess;
public class TWFAnalyzerImpl  implements TWFAnalyzer{
	//private BPELProcessWriter writer=null;
	private BPELResource bpelResource=null;
	private Process bpelProcess=null;
	private WorkflowProcess workflowProcess=null;
	private IFile twfFile=null;
	
	public TWFAnalyzerImpl(){
		super();
	}
	public TWFAnalyzerImpl(Resource resource){
		this();
		initFromResource(resource);
	}
	public TWFAnalyzerImpl(Resource resource,IFile twfFile){
		this(resource);
		this.twfFile=twfFile;
	}
	
	public void setTwfFile(IFile twfFile) {
		this.twfFile = twfFile;
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
	public void generateBpelProcess(URI uri,IProgressMonitor monitor) throws IOException {
		
		reorderAcitivities(monitor);
		completeBpelProcess(monitor);
		bpelResource=new BPELProcessResourceImpl(uri,bpelProcess);
		Map<Object,Object> saveOptions = new HashMap<Object,Object> ();
		saveOptions.put( BPELWriter.SKIP_AUTO_IMPORT, Boolean.TRUE );
		bpelResource.save(saveOptions);
	}
	
	@Override
	public void completeBpelProcess(final IProgressMonitor monitor) {
		IFile wsdlFile = twfFile.getParent().getFile( new Path( computeWsdlArtifactsName()));
		URI wsdlEmfUri = URI.createPlatformResourceURI( wsdlFile.getFullPath().toString(), true );
		Definition artifactsDefinition=WsdlParser.loadWsdlDefinition(wsdlEmfUri, WsdlParser.createBasicResourceSetForWsdl());
		BpelHelper bpelHelper=new BpelHelper(bpelProcess, artifactsDefinition);
		bpelHelper.addPartnerLinks();
		bpelHelper.initVariables();
		
	}
	@Override
	public void reorderAcitivities(IProgressMonitor monitor) {
		TaskHelper helper=new TaskHelper(this.workflowProcess);
		try {
			helper.orderActivities();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private  String computeWsdlArtifactsName() {
		IPath path = new Path( this.twfFile.getName());
		return path.removeFileExtension().toString() + "Artifacts.wsdl";
	}

			
					
				
					
		

	

	




	
}
