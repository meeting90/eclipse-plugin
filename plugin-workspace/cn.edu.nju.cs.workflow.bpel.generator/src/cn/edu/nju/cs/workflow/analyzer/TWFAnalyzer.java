package cn.edu.nju.cs.workflow.analyzer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.bpel.model.Process;
import cn.edu.nju.cs.workflow.model.Workflow;

public interface TWFAnalyzer{
	
	
	
	void initFromResource(Resource resource);
	
	void reorderTasks();
	
	void completeBpelProcess();
	
	public void generateBpelProcess(URI uri) throws IOException;

}
