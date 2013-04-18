package cn.edu.nju.cs.workflow.analyzer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.bpel.model.Process;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

import cn.edu.nju.cs.workflow.model.Workflow;

public interface TWFAnalyzer{
	
	
	
	public void initFromResource(Resource resource);
	
	public void setTwfFile(IFile twfFile);
	
	public void reorderTasks(final IProgressMonitor monitor);
	
	public void reorderAcitivities(final IProgressMonitor monitor);
	
	public void completeBpelProcess(final IProgressMonitor monitor);
	
	
	public void generateBpelProcess(URI uri,final IProgressMonitor monitor) throws IOException;

	

}
