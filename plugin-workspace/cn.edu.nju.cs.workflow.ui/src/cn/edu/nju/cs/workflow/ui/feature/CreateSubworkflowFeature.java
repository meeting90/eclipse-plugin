package cn.edu.nju.cs.workflow.ui.feature;


import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.ui.diagram.WorkflowFeatureProvider;
import cn.edu.nju.cs.workflow.ui.wizard.FileService;


public class CreateSubworkflowFeature extends AbstractCustomFeature {

	public CreateSubworkflowFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String getName() {
        return "Create Subworkflow";
    }
 
    @Override
    public String getDescription() {
        return "Create Subworkflow";
    }
	@Override
	public void execute(ICustomContext context) {
		// TODO Auto-generated method stub
		
		 PictogramElement[] pes = context.getPictogramElements();
	        if (pes != null && pes.length == 1) {
	            Object bo = getBusinessObjectForPictogramElement(pes[0]);
	            if (bo instanceof Workflow) {
	            	Workflow workflow=(Workflow)bo;
	            	
	            	List<PictogramElement> list=Graphiti.getLinkService().getPictogramElements(getDiagram(), workflow);
	            	Diagram diagram=null;
	            	if(list.size()==1){
	            	//create 	
	            		String subworkflowName=workflow.getName();
	            		final String extension=".twf";
	            		Resource resource = getDiagram().eResource();
	            		URI uriOrigal = resource.getURI();
	            		
	            		String fileName=uriOrigal.toPlatformString(true).replace(uriOrigal.lastSegment(), subworkflowName+extension);
	        		
	            		final String diagramTypeId="workflow";
	            		diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeId,subworkflowName, true);
	            		diagram.setActive(true);
	            		diagram.setSnapToGrid(false);
	            		URI uri = URI.createPlatformResourceURI(fileName, true);
	            		WorkflowFeatureProvider provider=(WorkflowFeatureProvider) getFeatureProvider();
	            		FileService.createEmfFileForSubDiagram(uri, diagram, workflow,provider.getWorkflowProcess());
	            	}else{
	            	  diagram=(Diagram) list.get(1);
	            	}
	            	//open
	            	
	        		String providerId = GraphitiUi.getExtensionManager().getDiagramTypeProviderId(diagram.getDiagramTypeId());
	        		DiagramEditorInput editorInput =new DiagramEditorInput(EcoreUtil.getURI(diagram), providerId);
	            	
	        		link(diagram,workflow);
	        		
	        		try {
	        			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput, DiagramEditor.DIAGRAM_EDITOR_ID);
	        		} catch (PartInitException e) {
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}
	            }
	        }
		
		
		
		

		
	}
	@Override
	public boolean canExecute(ICustomContext context) {
		// TODO Auto-generated method stub
		 PictogramElement[] pes = context.getPictogramElements();
	        if (pes != null && pes.length == 1) {
	            Object bo = getBusinessObjectForPictogramElement(pes[0]);
	            if (bo instanceof Workflow) {
	            	return true;	              
	               
	            }
	        }
	        return false;
	}

}
