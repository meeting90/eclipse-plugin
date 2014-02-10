package cn.edu.nju.cs.workflow.model.aspect.util;

import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.bpel.common.extension.model.ExtensionMap;
import org.eclipse.bpel.common.extension.model.ExtensionmodelFactory;
import org.eclipse.bpel.common.ui.editmodel.EditModel;
import org.eclipse.bpel.common.ui.editmodel.EditModelClient;
import org.eclipse.bpel.common.ui.editmodel.EditModelCommandStack;
import org.eclipse.bpel.common.ui.editmodel.IEditModelListener;
import org.eclipse.bpel.common.ui.editmodel.ResourceInfo;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.util.CommandStackChangeBatcher;


import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.WSDLFactory;

public class AspectEditModelClient extends EditModelClient {
	private ResourceInfo extensionsResourceInfo;
	private ResourceInfo artifactsResourceInfo;
	AspectEditModel aspectEditModel;
	
	public AspectEditModelClient(IEditorPart editor,
			IEditModelListener modelListener) {
		super(editor, modelListener);
		// TODO Auto-generated constructor stub
	}
	public AspectEditModelClient(IEditorPart editor)
	{
		super(editor, (IEditModelListener)editor);
	}
	@Override
	protected EditModel getSharedResourceSet(IFile file) {
		return AspectEditModel.getEditModel(file);
	}
	@Override
	public void loadPrimaryResource(IFile file, Map loadOptions) throws RuntimeException {
		super.loadPrimaryResource(file, loadOptions);
		aspectEditModel = (AspectEditModel)getEditModel();
		getPrimaryResourceInfo().getResource();
	}
	@Override
	protected EditModelCommandStack createCommandStack() {
		EditModelCommandStack commandStack = super.createCommandStack();
		commandStack.setUndoLimit(50);
		commandStack.addCommandStackListener(new CommandStackChangeBatcher());
		return commandStack;
	}
	@Override
	public void dispose() {
		if (artifactsResourceInfo != null) {
			aspectEditModel.releaseReference(artifactsResourceInfo);
		}
		if (extensionsResourceInfo != null) {
			aspectEditModel.releaseReference(extensionsResourceInfo);
		}
		super.dispose();
	}
	
	public ResourceInfo getArtifactsResourceInfo() { return artifactsResourceInfo; }
	public ResourceInfo getExtensionsResourceInfo() { return extensionsResourceInfo; }
	
	public IFile getExtensionsFile() { return aspectEditModel.getExtensionsFile(); } 
	public IFile getArtifactsFile() { return aspectEditModel.getArtifactsFile(); } 

	public void loadExtensionsResource() throws RuntimeException {

		if (aspectEditModel==null || getPrimaryResourceInfo()==null)
			throw new RuntimeException("Primary resource must be loaded before Extensions");
		
		IFile extensionsFile = aspectEditModel.getExtensionsFile();
		if (extensionsFile.exists()) {
			extensionsResourceInfo = aspectEditModel.getResourceInfo(extensionsFile);
		} else {
			Resource bpelexResource = aspectEditModel.getResourceSet().createResource(
				URI.createPlatformResourceURI(extensionsFile.getFullPath().toString()));
			extensionsResourceInfo = aspectEditModel.getResourceInfo(extensionsFile);
			// create an empty extension map.
			ExtensionMap extensionMap = ExtensionmodelFactory.eINSTANCE.createExtensionMap(
				IBPELUIConstants.MODEL_EXTENSIONS_NAMESPACE);
			bpelexResource.getContents().add(extensionMap);
		}
	}

	
	public void loadArtifactsResource() throws RuntimeException {

		if (aspectEditModel==null || getPrimaryResourceInfo()==null)
			throw new RuntimeException("Primary resource must be loaded before Artifacts");
		
		IFile artifactsFile = aspectEditModel.getArtifactsFile();
		if (artifactsFile.exists()) {
			artifactsResourceInfo = aspectEditModel.getResourceInfo(artifactsFile);
		} else {
			Resource artifactsResource = aspectEditModel.getResourceSet().createResource(
					URI.createPlatformResourceURI(artifactsFile.getFullPath().toString()));
			// create an empty definition too.
			Definition artifactsDefn = WSDLFactory.eINSTANCE.createDefinition();
			artifactsDefn.setLocation(artifactsResource.getURI().toString());

			// set the target namespace based on the target namespace of the process.
			EList bpelContents = getPrimaryResourceInfo().getResource().getContents();
			if (!bpelContents.isEmpty() && bpelContents.get(0) instanceof Process) {
				Process process = (Process)bpelContents.get(0);
				// TODO: is this correct?  can we make a helper to share this with the wizard?
				artifactsDefn.setTargetNamespace(process.getTargetNamespace()+"Artifacts"); //$NON-NLS-1$
				artifactsDefn.setQName(new QName(artifactsDefn.getTargetNamespace(),
					artifactsFile.getFullPath().removeFileExtension().lastSegment()));
			}
			artifactsResource.getContents().add(artifactsDefn);
			artifactsResourceInfo = aspectEditModel.getResourceInfo(artifactsFile);
		}
	}
}
