package cn.edu.nju.cs.workflow.ui.diagram;



import java.util.ArrayList;
import java.util.Collection;



import org.eclipse.graphiti.dt.IDiagramTypeProvider;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;

import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.wst.wsdl.PortType;

import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.model.AdviceEdge;
import cn.edu.nju.cs.workflow.model.AdviceTask;
import cn.edu.nju.cs.workflow.model.Choice;
import cn.edu.nju.cs.workflow.model.CompoundTask;
import cn.edu.nju.cs.workflow.model.Edge;
import cn.edu.nju.cs.workflow.model.InputPort;
import cn.edu.nju.cs.workflow.model.OutputPort;

import cn.edu.nju.cs.workflow.model.LoopTask;

import cn.edu.nju.cs.workflow.model.Port;
import cn.edu.nju.cs.workflow.model.SimpleTask;

import cn.edu.nju.cs.workflow.model.WhileCondition;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowElement;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;

import cn.edu.nju.cs.workflow.ui.feature.CreateSubworkflowFeature;
import cn.edu.nju.cs.workflow.ui.feature.DirectEditFeature;
import cn.edu.nju.cs.workflow.ui.feature.LayoutFeature;
import cn.edu.nju.cs.workflow.ui.feature.RemoveFeature;
import cn.edu.nju.cs.workflow.ui.feature.UpdateFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.AdviceEdgeAddConnectionFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.AdviceTaskAddFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.ChoiceTaskAddFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.CompoundTaskAddFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.EdgeAddConnectionFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.LoopTaskAddFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.SimpleTaskAddFeature;
import cn.edu.nju.cs.workflow.ui.feature.add.SpecificNodeAddFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.AdviceEdgeCreateConnectionFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.AdviceTaskCreateFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.ChoiceTaskCreateFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.CompoundTaskCreateFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.EdgeCreateConnectionFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.LoopTaskCreateFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.SimpleTaskCreateFeature;

public class WorkflowFeatureProvider extends DefaultFeatureProvider {
	private BPELComponentGenerator bpelGenerator=null;
	public WorkflowFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
    private Collection<PortType> getImplementedPortTypes(){
    	return getWorkflowProcess().getImplPortTypes();
    	
    }
    public Collection<PortType> getNewPortTypes(){
    	return getWorkflowProcess().getToImplPortTypes();
    	
    }
    public BPELComponentGenerator getBpelGenerator(){
    	
    	bpelGenerator =new BPELComponentGenerator(getWorkflowProcess().getBpelProcess());
    	return bpelGenerator;
    }
    public  WorkflowProcess getWorkflowProcess(){
    	return (WorkflowProcess) getDiagramTypeProvider().getDiagram().getLink().getBusinessObjects().get(0);
		
	}
	public  Workflow getRootWorkflow(){
		return getWorkflowProcess().getRootWorkflow();
		
	}
	public Workflow getWorkflow(){
		return (Workflow) getDiagramTypeProvider().getDiagram().getLink().getBusinessObjects().get(1);
	}
	@Override
	public ICreateFeature[] getCreateFeatures() {
	
	ArrayList<ICreateFeature> features=new ArrayList<ICreateFeature>();
	Collection<PortType> porttypes=getImplementedPortTypes();
	for(PortType porttype: porttypes){
		features.add(new SimpleTaskCreateFeature(this, porttype));	
	}
		features.add(new ChoiceTaskCreateFeature(this));
		features.add(new CompoundTaskCreateFeature(this));
		features.add(new LoopTaskCreateFeature(this));
		features.add(new AdviceTaskCreateFeature(this));
		return features.toArray(new ICreateFeature[features.size()]);
	}
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new EdgeCreateConnectionFeature(this),new AdviceEdgeCreateConnectionFeature(this)};
	}	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// TODO: check for right domain object instances below
		if (context instanceof IAddConnectionContext  && context.getNewObject() instanceof Edge ) {
			return new EdgeAddConnectionFeature(this);
		}else if(context instanceof IAddConnectionContext && context.getNewObject() instanceof AdviceEdge ){
			return new AdviceEdgeAddConnectionFeature(this);
		}
		else if(context instanceof IAddContext && context.getNewObject() instanceof LoopTask){ 
			return new LoopTaskAddFeature(this);
		}else if(context instanceof IAddContext && context.getNewObject() instanceof AdviceTask){
			return new AdviceTaskAddFeature(this);
		}else if(context instanceof IAddContext && context.getNewObject() instanceof CompoundTask){
			return new CompoundTaskAddFeature(this);
		}else if (context instanceof IAddContext  && context.getNewObject() instanceof  SimpleTask) {
			SimpleTask task=(SimpleTask) context.getNewObject();
			if(task.isIsFinishNode()||task.isIsStartNode())
				return new SpecificNodeAddFeature(this);
			else
				return new SimpleTaskAddFeature(this);
		}else if(context instanceof IAddContext  && context.getNewObject() instanceof  Choice){
			return new ChoiceTaskAddFeature(this);
		}//start node end node
		
		return super.getAddFeature(context);
	}	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		// TODO: check for right domain object instances below
		if (context.getPictogramElement() instanceof ContainerShape /* && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof <DomainObject> */) {
			return  new LayoutFeature(this);
		}
	
		return super.getLayoutFeature(context);
	}
	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof WorkflowElement) {
			return new DirectEditFeature(this);
		}
		return super.getDirectEditingFeature(context);
	}
	@Override
    public IUpdateFeature getUpdateFeature(IUpdateContext context) {
       PictogramElement pictogramElement = context.getPictogramElement();
       if (pictogramElement  instanceof ContainerShape) {
           Object bo = getBusinessObjectForPictogramElement(pictogramElement);
           if (bo instanceof WorkflowElement) {
               return new UpdateFeature(this);
           }
       }
       return super.getUpdateFeature(context);
     }
	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if(bo==null)
			return null;
		if (bo instanceof Port) {
			// No deletion allowed for the board
			return null;
		}
		else if (bo instanceof WhileCondition) {
			// No deletion allowed for squares
			return null;
		}
		else if(bo instanceof Workflow){
			return null;
		}else if(bo instanceof AdviceEdge)
			return null;
		
		

		return new RemoveFeature(this);
	}
	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if(bo==null)
			return null;
		if (bo instanceof Port) {
			// No deletion allowed for the board
			return null;
		}
		else if (bo instanceof WhileCondition) {
			// No deletion allowed for squares
			return null;
		}
		else if(bo instanceof Workflow){
			return null;
		}
		else if(bo instanceof AdviceEdge)
			return null;
		
		

		return super.getDeleteFeature(context);
	}
	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (bo instanceof Port) {
			// No resize allowed for the board
			return null;
		}
		if (bo instanceof WhileCondition) {
			// No resize allowed for squares
			return null;
		}
		else if(bo instanceof AdviceEdge){
			return null;
		}
		return super.getResizeShapeFeature(context);
	}
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		if(bo==null)
			return null;
		if (bo instanceof Port) {
		    if(bo instanceof OutputPort){
		    	if( ((OutputPort)bo).getNode().isIsStartNode())
		    		return super.getMoveShapeFeature(context);
		    	else
		    		return null;
		    }else if(bo instanceof InputPort){
		    	if(((InputPort)bo).getNode().isIsFinishNode())
		    		return super.getMoveShapeFeature(context);
		    	else 
		    		return null;
		    }
		} else if (bo instanceof WhileCondition) {
			return null;
		}
		else if(bo instanceof Workflow){
			return null;
		}else if(bo instanceof AdviceEdge){
			return null;
		}

		return super.getMoveShapeFeature(context);
	}
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		// TODO Auto-generated method stub
		return  new ICustomFeature[] 
	            { new CreateSubworkflowFeature(this)};
	}
	@Override
	public PictogramElement addIfPossible(IAddContext context) {
		// TODO Auto-generated method stub
		return super.addIfPossible(context);
	}


}

