package cn.edu.nju.cs.workflow.ui.wizard;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;



import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.examples.common.Messages;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.ui.services.GraphitiUi;

import cn.edu.nju.cs.workflow.bpel.BPELSkeletonGenerator;
import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;



public class FileService {
	
	


	
	public static void createEmfFileForRootDiagramWithWSDL(final IFile diagramFile, final Diagram diagram,final String wsdl) {

		
		// Create a resource set and EditingDomain
		final TransactionalEditingDomain editingDomain = GraphitiUi.getEmfService()
				.createResourceSetAndEditingDomain();
		final ResourceSet resourceSet = editingDomain.getResourceSet();
		final BPELSkeletonGenerator bpelGenerator=new BPELSkeletonGenerator(diagramFile, wsdl);
		final URI diagramResourceUri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		final Resource createdResource = resourceSet.createResource(diagramResourceUri);
		
		
		final CommandStack commandStack = editingDomain.getCommandStack();
		commandStack.execute(new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				createdResource.setTrackingModification(true);
				createdResource.getContents().add(diagram);		
				PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
				diagram.setLink(link);
				
				WorkflowProcess workflowProcess=ModelFactory.eINSTANCE.createWorkflowProcess();
				createdResource.getContents().add(workflowProcess);	
				
				
				
				bpelGenerator.loadDependencies();
				bpelGenerator.createWsdlFile();
				bpelGenerator.createBpelSkeleton();
				
				
				workflowProcess.setRootWorkflow(ModelFactory.eINSTANCE.createWorkflow());
				workflowProcess.setBpelProcess(bpelGenerator.getBpelProcess());
				workflowProcess.getImplPortTypes().addAll(bpelGenerator.getImplementedPortTypes());
				workflowProcess.getToImplPortTypes().addAll(bpelGenerator.getToImplPortTypes());
				
				//createdResource.getContents().add(workflowProcess.getRootWorkflow());
				createdResource.getContents().add(workflowProcess.getBpelProcess());
				
				link.getBusinessObjects().add(workflowProcess);
				link.getBusinessObjects().add(workflowProcess.getRootWorkflow());	
				
				Pick mainPick=(Pick) ((Sequence)workflowProcess.getBpelProcess().getActivity()).getActivities().get(0);
				workflowProcess.getRootWorkflow().setRootActivity(mainPick);
				
				
				 
			}
		});	
		save(editingDomain,Collections.<Resource, Map<?, ?>> emptyMap());
		editingDomain.dispose();
		
		
	}

	

	
	
	public static void createEmfFileForSubDiagram(URI diagramResourceUri, final Diagram diagram,final Workflow subworkflow,final WorkflowProcess wfprocess){
		// Create a resource set and EditingDomain
				final TransactionalEditingDomain editingDomain = GraphitiUi.getEmfService()
						.createResourceSetAndEditingDomain();
				final ResourceSet resourceSet = editingDomain.getResourceSet();
				// Create a resource for this file.
				final Resource resource = resourceSet.createResource(diagramResourceUri);
				final CommandStack commandStack = editingDomain.getCommandStack();
				commandStack.execute(new RecordingCommand(editingDomain) {
					@Override
					protected void doExecute() {
						resource.setTrackingModification(true);
						resource.getContents().add(diagram);
						//resource.getContents().add(subworkflow);
						PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
						diagram.setLink(link);
						link.getBusinessObjects().add(wfprocess);
						link.getBusinessObjects().add(subworkflow);	
					}
				});
				save(editingDomain, Collections.<Resource, Map<?, ?>> emptyMap());
				editingDomain.dispose();
	}
	private static void save(TransactionalEditingDomain editingDomain, Map<Resource, Map<?, ?>> options) {
		saveInWorkspaceRunnable(editingDomain, options);
	}

	private static void saveInWorkspaceRunnable(final TransactionalEditingDomain editingDomain, final Map<Resource, Map<?, ?>> options) {

		final Map<URI, Throwable> failedSaves = new HashMap<URI, Throwable>();
		final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
			public void run(final IProgressMonitor monitor) throws CoreException {

				final Runnable runnable = new Runnable() {
					public void run() {
						Transaction parentTx;
						if (editingDomain != null
								&& (parentTx = ((TransactionalEditingDomainImpl) editingDomain).getActiveTransaction()) != null) {
							do {
								if (!parentTx.isReadOnly()) {
									throw new IllegalStateException(
											"FileService.save() called from within a command (likely produces a deadlock)"); //$NON-NLS-1$
								}
							} while ((parentTx = ((TransactionalEditingDomainImpl) editingDomain).getActiveTransaction().getParent()) != null);
						}

						final EList<Resource> resources = editingDomain.getResourceSet().getResources();
						// Copy list to an array to prevent
						// ConcurrentModificationExceptions
						// during the saving of the dirty resources
						Resource[] resourcesArray = new Resource[resources.size()];
						resourcesArray = resources.toArray(resourcesArray);
						final Set<Resource> savedResources = new HashSet<Resource>();
						for (int i = 0; i < resourcesArray.length; i++) {
							// In case resource modification tracking is
							// switched on, we can check if a resource
							// has been modified, so that we only need to same
							// really changed resources; otherwise
							// we need to save all resources in the set
							final Resource resource = resourcesArray[i];
							System.out.println(resource.getURI());
							
							if (resource.isModified()) {
								try {
									
									resource.save(options.get(resource));
									savedResources.add(resource);
								} catch (final Throwable t) {
									failedSaves.put(resource.getURI(), t);
								}
							}
						}
					}
				};

				try {
					editingDomain.runExclusive(runnable);
				} catch (final InterruptedException e) {
					throw new RuntimeException(e);
				}
				
				editingDomain.getCommandStack().flush();
			}
		};
		try {
			ResourcesPlugin.getWorkspace().run(wsRunnable, null);
			if (!failedSaves.isEmpty()) {
				throw new WrappedException(createMessage(failedSaves), new RuntimeException());
			}
		} catch (final CoreException e) {
			final Throwable cause = e.getStatus().getException();
			if (cause instanceof RuntimeException) {
				throw (RuntimeException) cause;
			}
			throw new RuntimeException(e);
		}
	}

	private static String createMessage(Map<URI, Throwable> failedSaves) {
		final StringBuilder buf = new StringBuilder(Messages.FileService_ErrorMessageStart);
		for (final Entry<URI, Throwable> entry : failedSaves.entrySet()) {
			buf.append(Messages.FileService_ErrorMessageUri).append(entry.getKey().toString()).append(Messages.FileService_ErrorMessageCause).append(getExceptionAsString(entry.getValue()));
		}
		return buf.toString();
	}

	private static String getExceptionAsString(Throwable t) {
		final StringWriter stringWriter = new StringWriter();
		final PrintWriter printWriter = new PrintWriter(stringWriter);
		t.printStackTrace(printWriter);
		final String result = stringWriter.toString();
		try {
			stringWriter.close();
		} catch (final IOException e) {
			// $JL-EXC$ ignore
		}
		printWriter.close();
		return result;
	}
}