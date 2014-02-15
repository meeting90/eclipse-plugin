package cn.edu.nju.cs.workflow.bpel.aspect;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;



public interface SynchronizationHandler {

	boolean saveFileAs(AspectResourceInfo resourceInfo, IFile file) throws CoreException, IOException;

	void closeEditor();

	void refresh(AspectResourceInfo resourceInfo);

	

}
