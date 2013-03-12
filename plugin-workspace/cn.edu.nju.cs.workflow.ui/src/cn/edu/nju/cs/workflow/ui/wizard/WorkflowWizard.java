package cn.edu.nju.cs.workflow.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.examples.common.ExamplesCommonPlugin;
import org.eclipse.graphiti.examples.common.Messages;
import org.eclipse.graphiti.examples.common.navigator.nodes.base.AbstractInstancesOfTypeContainerNode;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import cn.edu.nju.cs.workflow.provider.ITextProvider;
import cn.edu.nju.cs.workflow.ui.wizard.CreateWorkflowFirstPage.WorkflowCreationMode;
public class WorkflowWizard extends BasicNewResourceWizard   {
	
	private static final String WIZARD_WINDOW_TITLE = Messages.CreateDiagramWizard_WizardTitle;
	private IStructuredSelection selection;
	private Diagram diagram;

	@Override
	public void addPages() {
		super.addPages();
		
		//addPage(new CreateWorkflowFirstPage());
		//addPage(new CreateWorkflowDirectlyWizardPage());
		//addPage(new CreateWorkflowFromWSDLWizardPage());
		addPage(new NewWorkflowFromWSDLWizardPage());
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		this.selection=currentSelection;
		setWindowTitle(WIZARD_WINDOW_TITLE);
	}
	

	@Override
	public boolean performFinish() {
		
      // boolean complete = getPage(CreateWorkflowFirstPage.PAGE_NAME).isPageComplete();
      // if(complete){
//			 //return true;
			return createDiagram();
      // }else
    //	   return false;
	}

	public Diagram getDiagram() {
		return diagram;
	}
	private boolean createDiagram(){	
		NewWorkflowFromWSDLWizardPage page=((NewWorkflowFromWSDLWizardPage)getPage(NewWorkflowFromWSDLWizardPage.PAGE_NAME));
		final String workflowName=page.getProcessName();
		final String wsdlName=page.getWsdlUrl();
		final String diagramTypeId = "workflow";
		
		IProject project = null;
		IFolder diagramFolder = null;
	
		Object element =selection.getFirstElement();
		if (element instanceof IProject) {
			project = (IProject) element;
		} else if (element instanceof AbstractInstancesOfTypeContainerNode) {
			AbstractInstancesOfTypeContainerNode aiocn = (AbstractInstancesOfTypeContainerNode) element;
			project = aiocn.getProject();
		} else if (element instanceof IFolder) {
			diagramFolder = (IFolder) element;
			project = diagramFolder.getProject();
		}

		if (project == null || !project.isAccessible()) {
			String error = Messages.CreateDiagramWizard_NoProjectFoundError;
			IStatus status = new Status(IStatus.ERROR, ExamplesCommonPlugin.getID(), error);
			ErrorDialog.openError(getShell(), Messages.CreateDiagramWizard_NoProjectFoundErrorTitle, null, status);
			return false;
		}

		Diagram diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId, workflowName, true);
		diagram.setGridUnit(0);
		if (diagramFolder == null) {
			diagramFolder = project.getFolder("src/"); //$NON-NLS-1$
		}

		String editorID = DiagramEditor.DIAGRAM_EDITOR_ID;
		String editorExtension = "twf"; //$NON-NLS-1$
		String diagramTypeProviderId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagramTypeId);
		String namingConventionID = diagramTypeProviderId + ".editor"; //$NON-NLS-1$
		IEditorDescriptor specificEditor = PlatformUI.getWorkbench().getEditorRegistry().findEditor(namingConventionID);

		// If there is a specific editor get the file extension
		if (specificEditor != null) {
			editorID = namingConventionID;
			IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
			IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint("org.eclipse.ui.editors"); //$NON-NLS-1$
			IExtension[] extensions = extensionPoint.getExtensions();
			for (IExtension ext : extensions) {
				IConfigurationElement[] configurationElements = ext.getConfigurationElements();
				for (IConfigurationElement ce : configurationElements) {
					String id = ce.getAttribute("id"); //$NON-NLS-1$
					if (editorID.equals(id)) {
						String fileExt = ce.getAttribute("extensions"); //$NON-NLS-1$
						if (fileExt != null) {
							editorExtension = fileExt;
							break;
						}
					}

				}
			}
		}

		IFile diagramFile = diagramFolder.getFile(workflowName + "." + editorExtension); //$NON-NLS-1$
		

		//FileService.createEmfFileForRootDiagram(uri, diagram);
		FileService.createEmfFileForRootDiagramWithWSDL(diagramFile,diagram,wsdlName);
		
		String providerId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagram.getDiagramTypeId());
		DiagramEditorInput editorInput = new DiagramEditorInput(EcoreUtil.getURI(diagram), providerId);
		
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput, editorID);
		} catch (PartInitException e) {
			String error = Messages.CreateDiagramWizard_OpeningEditorError;
			IStatus status = new Status(IStatus.ERROR, ExamplesCommonPlugin.getID(), error, e);
			ErrorDialog.openError(getShell(), Messages.CreateDiagramWizard_ErrorOccuredTitle, null, status);
			return false;
		}
		return true;
		
	}

}
