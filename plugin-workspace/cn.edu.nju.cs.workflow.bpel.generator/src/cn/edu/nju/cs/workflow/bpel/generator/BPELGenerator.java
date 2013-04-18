package cn.edu.nju.cs.workflow.bpel.generator;

import java.io.File;



import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collections;

import java.util.Iterator;



import org.eclipse.bpel.model.resource.BPELResource;
import org.eclipse.bpel.model.resource.BPELWriter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import cn.edu.nju.cs.workflow.analyzer.TWFAnalyzer;
import cn.edu.nju.cs.workflow.analyzer.TWFAnalyzerImpl;


public class BPELGenerator implements IObjectActionDelegate {

	public BPELGenerator() {
		// TODO Auto-generated constructor stub
	}

	IFile twfFile=null;
	BPELResource bpelResource=null;
	BPELWriter bpelwriter=null;

	@Override
	public void run(IAction action) {	    
		try {
			generateBpel();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		Iterator<?> theSet =((IStructuredSelection)selection).iterator();
		while (theSet.hasNext()) {
			Object obj = theSet.next();
			if(obj instanceof IFile){
				twfFile=(IFile)obj;
				break;
			}
			
		}
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub	
	}
	private void generateBpel() throws URISyntaxException, IOException, CoreException{
	    final URI uri=URI.createPlatformResourceURI(twfFile.getFullPath().toString(), true);
		final ResourceSet resourceSet =new ResourceSetImpl();
		
		
		final Resource resource=resourceSet.createResource(uri);
		final InputStream stream=twfFile.getContents();

		
		final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
			public void run(final IProgressMonitor monitor) throws CoreException {
				try {
					
					resource.load(stream,Collections.EMPTY_MAP);
					String path=twfFile.getLocation().toString().replace(".twf", ".bpel");
					File file=new File(path);
					file.createNewFile();
					URI uri=URI.createFileURI(file.getAbsolutePath());
					TWFAnalyzer twfResource= new TWFAnalyzerImpl(resource, twfFile);
					
					twfResource.generateBpelProcess(uri,monitor);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			};
		};
		try {
			ResourcesPlugin.getWorkspace().run(wsRunnable, null);
		} catch (final CoreException e) {
			final Throwable cause = e.getStatus().getException();
			if (cause instanceof RuntimeException) {
				throw (RuntimeException) cause;
			}
			throw new RuntimeException(e);
		}finally{
			try {
				twfFile.getProject().refreshLocal( IResource.DEPTH_INFINITE, null );
			} catch( CoreException e ) {
				e.printStackTrace();
			}
		}
		
		
		
	
	   
		
	}



}
