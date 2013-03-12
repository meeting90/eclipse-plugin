package cn.edu.nju.cs.workflow.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import cn.edu.nju.cs.workflow.provider.ITextProvider;

public class CreateWorkflowDirectlyWizardPage extends WizardPage implements ITextProvider{

	public static String PAGE_NAME="workflow-directly";


	protected CreateWorkflowDirectlyWizardPage() {
		super(PAGE_NAME);
		setTitle("Input Workflow Name");
		setDescription("Input a certain name of your workflow");
		
		// TODO Auto-generated constructor stub
	}
	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	Text textField;

	private Listener nameModifyListener = new Listener() {
		public void handleEvent(Event e) {
			boolean valid = validatePage();
			setPageComplete(valid);

		}
	};


	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setFont(parent.getFont());

		initializeDialogUnits(parent);

		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		createWizardContents(composite);

		setPageComplete(validatePage());

		// Show description on opening
		setErrorMessage(null);
		setMessage(null);
		setControl(composite);
	}

	public String getText() {
		if (textField == null) {
			return getInitialTextFieldValue();
		}

		return getTextFieldValue();
	}

	protected boolean validatePage() {
		String text = getTextFieldValue();
		if (text.equals("")) { //$NON-NLS-1$
			setErrorMessage(null);
			setMessage(Messages.DiagramNameWizardPage_Message);
			return false;
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus status = doWorkspaceValidation(workspace, text);
		if (!status.isOK()) {
			setErrorMessage(status.getMessage());
			return false;
		}

		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	
	protected void createWizardContents(Composite parent) {
		createProjectNameGroup(parent);
	}

	private final void createProjectNameGroup(Composite parent) {
		// project specification group
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// new project label
		Label projectLabel = new Label(projectGroup, SWT.NONE);
		projectLabel.setText(Messages.DiagramNameWizardPage_Label);
		projectLabel.setFont(parent.getFont());

		// new project name entry field
		textField = new Text(projectGroup, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		textField.setLayoutData(data);
		textField.setFont(parent.getFont());

		// Set the initial value first before listener
		// to avoid handling an event during the creation.
		if (getInitialTextFieldValue() != null) {
			textField.setText(getInitialTextFieldValue());
		}
		textField.addListener(SWT.Modify, nameModifyListener);
	}

	private String getTextFieldValue() {
		if (textField == null) {
			return ""; //$NON-NLS-1$
		}

		return textField.getText().trim();
	}

	private String getInitialTextFieldValue() {
		return "newWorkflow"; //$NON-NLS-1$
	}

	private IStatus doWorkspaceValidation(IWorkspace workspace, String text) {
		IStatus ret = workspace.validateName(text, IResource.FILE);
		return ret;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			textField.setFocus();
			textField.selectAll();
		}
	}
//	@Override
//	public boolean isPageComplete() {
//		
//		// TODO Auto-generated method stub
//		final String diagramTypeId = "workflow";
//
//		ITextProvider namePage = this;
//		final String diagramName = namePage.getText();
//
//		IProject project = null;
//		IFolder diagramFolder = null;
//		
//		Object element = getWizard().getContainer();
//		if (element instanceof IProject) {
//			project = (IProject) element;
//		} else if (element instanceof AbstractInstancesOfTypeContainerNode) {
//			AbstractInstancesOfTypeContainerNode aiocn = (AbstractInstancesOfTypeContainerNode) element;
//			project = aiocn.getProject();
//		} else if (element instanceof IFolder) {
//			diagramFolder = (IFolder) element;
//			project = diagramFolder.getProject();
//		}
//
//		if (project == null || !project.isAccessible()) {
//			String error = Messages.CreateDiagramWizard_NoProjectFoundError;
//			IStatus status = new Status(IStatus.ERROR, ExamplesCommonPlugin.getID(), error);
//			ErrorDialog.openError(getShell(), Messages.CreateDiagramWizard_NoProjectFoundErrorTitle, null, status);
//			return false;
//		}
//
//		Diagram diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId, diagramName, true);
//		diagram.setGridUnit(0);
//		if (diagramFolder == null) {
//			diagramFolder = project.getFolder("src/"); //$NON-NLS-1$
//		}
//
//		String editorID = DiagramEditor.DIAGRAM_EDITOR_ID;
//		String editorExtension = "twf"; //$NON-NLS-1$
//		String diagramTypeProviderId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagramTypeId);
//		String namingConventionID = diagramTypeProviderId + ".editor"; //$NON-NLS-1$
//		IEditorDescriptor specificEditor = PlatformUI.getWorkbench().getEditorRegistry().findEditor(namingConventionID);
//
//		// If there is a specific editor get the file extension
//		if (specificEditor != null) {
//			editorID = namingConventionID;
//			IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
//			IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint("org.eclipse.ui.editors"); //$NON-NLS-1$
//			IExtension[] extensions = extensionPoint.getExtensions();
//			for (IExtension ext : extensions) {
//				IConfigurationElement[] configurationElements = ext.getConfigurationElements();
//				for (IConfigurationElement ce : configurationElements) {
//					String id = ce.getAttribute("id"); //$NON-NLS-1$
//					if (editorID.equals(id)) {
//						String fileExt = ce.getAttribute("extensions"); //$NON-NLS-1$
//						if (fileExt != null) {
//							editorExtension = fileExt;
//							break;
//						}
//					}
//
//				}
//			}
//		}
//
//		IFile diagramFile = diagramFolder.getFile(diagramName + "." + editorExtension); //$NON-NLS-1$
//		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
//
//		FileService.createEmfFileForRootDiagram(uri, diagram);
//		String providerId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagram.getDiagramTypeId());
//		DiagramEditorInput editorInput = new DiagramEditorInput(EcoreUtil.getURI(diagram), providerId);
//		
//		try {
//			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput, editorID);
//		} catch (PartInitException e) {
//			String error = Messages.CreateDiagramWizard_OpeningEditorError;
//			IStatus status = new Status(IStatus.ERROR, ExamplesCommonPlugin.getID(), error, e);
//			ErrorDialog.openError(getShell(), Messages.CreateDiagramWizard_ErrorOccuredTitle, null, status);
//			return false;
//		}
//
//		return true;
//}

}
