package cn.edu.nju.cs.workflow.ui.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;

import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;

import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;

import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;


import cn.edu.nju.cs.workflow.model.WorkflowElement;
import cn.edu.nju.cs.workflow.ui.feature.AssignInputFeature;
import cn.edu.nju.cs.workflow.ui.feature.CreateSubworkflowFeature;
import cn.edu.nju.cs.workflow.ui.feature.SelectOperationFeature;
import cn.edu.nju.cs.workflow.ui.feature.create.SimpleTaskCreateFeature;

public class WorkflowBehaviorProvider extends  DefaultToolBehaviorProvider {

	public WorkflowBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}
	//contextButton
	@Override
	public IContextButtonPadData getContextButtonPad(
	                                   IPictogramElementContext context) {
	    IContextButtonPadData data = super.getContextButtonPad(context);
	    PictogramElement pe = context.getPictogramElement();
	 
	    setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE );
	        
	    CreateConnectionContext ccc = new CreateConnectionContext();
	    ccc.setSourcePictogramElement(pe);
	    Anchor anchor = null;
	    if (pe instanceof Anchor) {
	        anchor = (Anchor) pe;
	    } else if (pe instanceof AnchorContainer) {
	        // assume, that our shapes always have chopbox anchors
	        anchor = Graphiti.getPeService()
	                 .getChopboxAnchor((AnchorContainer) pe);
	    }
	    ccc.setSourceAnchor(anchor);
	        
	   
	    ContextButtonEntry button = new ContextButtonEntry(null, context);
	    button.setText("Create Edge");
	    //button.setIconId(GEImageProvider.IMG_EREFERENCE);
	    ICreateConnectionFeature[] features =
	        getFeatureProvider().getCreateConnectionFeatures();
	    for (ICreateConnectionFeature feature : features) {
	        if (feature.isAvailable(ccc) && feature.canStartConnection(ccc))
	            button.addDragAndDropFeature(feature);
	    }
	 
	    
	    if (button.getDragAndDropFeatures().size() > 0) {
	       data.getDomainSpecificContextButtons().add(button);
	    }
	    
	    return data;
	}
/*
//	//menu
//	@Override
//	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
//	    // create a sub-menu for all custom features
//	    ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
//	    subMenu.setText("Custom");
//	    subMenu.setDescription("Custom features submenu");
//	    // display sub-menu hierarchical or flat
//	    subMenu.setSubmenu(true);
//
//	    // create a menu-entry in the sub-menu for each custom feature
//	    ICustomFeature[] customFeatures = getFeatureProvider().getCustomFeatures(context);
//	    for (int i = 0; i < customFeatures.length; i++) {
//	         ICustomFeature customFeature = customFeatures[i];
//	         if (customFeature.isAvailable(context)) {
//	             ContextMenuEntry menuEntry = new ContextMenuEntry(customFeature, context);
//	             subMenu.add(menuEntry);
//	         }
//	     }
//
//	     IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
//	     return ret;
//	} 
	*/
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
	    ICustomFeature customFeature =
	        new CreateSubworkflowFeature(getFeatureProvider());
	    // canExecute() tests especially if the context contains a EClass
	    if (customFeature.canExecute(context)) {
	        return customFeature;
	    }
	    ICustomFeature selectFeature=new SelectOperationFeature(getFeatureProvider());
	    if(selectFeature.canExecute(context)){
	    	return selectFeature;
	    }
	    ICustomFeature assignFeature=new AssignInputFeature(getFeatureProvider());
	    if(assignFeature.canExecute(context)){
	    	return assignFeature;
	    }
	 
	    return super.getDoubleClickFeature(context);
	 }
	@Override
	public Object getToolTip(GraphicsAlgorithm ga) {
		 PictogramElement pe = ga.getPictogramElement();
		    Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
		    if (bo instanceof WorkflowElement) {
		        String name = ((WorkflowElement)bo).getName();
		        if (name != null && !name.isEmpty()) {
		            return name;         
		        }
		    }
		    return super.getToolTip(ga);
	}
	
	@Override
	public IPaletteCompartmentEntry[] getPalette() {
		// TODO Auto-generated method stub
		List<IPaletteCompartmentEntry> ret =
		        new ArrayList<IPaletteCompartmentEntry>();
		// add new compartment at the end of the existing compartments
	    PaletteCompartmentEntry compartmentEntry1 =
	        new PaletteCompartmentEntry("Control Edge", null);
	    ret.add(compartmentEntry1);
	 
	  
	    IFeatureProvider featureProvider = getFeatureProvider();
		ICreateConnectionFeature[] createConnectionFeatures = featureProvider.getCreateConnectionFeatures();
		if (createConnectionFeatures.length > 0) {
			for (ICreateConnectionFeature createConnectionFeature : createConnectionFeatures) {
				ConnectionCreationToolEntry ccTool = new ConnectionCreationToolEntry(
						createConnectionFeature.getCreateName(), createConnectionFeature.getCreateDescription(),
						createConnectionFeature.getCreateImageId(), createConnectionFeature.getCreateLargeImageId());
				ccTool.addCreateConnectionFeature(createConnectionFeature);
				compartmentEntry1.addToolEntry(ccTool);
			}

		}
		PaletteCompartmentEntry compartmentEntry2 = new PaletteCompartmentEntry("Control Task", null);
		ret.add(compartmentEntry2);
		PaletteCompartmentEntry compartmentEntry3=new PaletteCompartmentEntry("Atomic Task",null);
		ret.add(compartmentEntry3);
		ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
		

		for (ICreateFeature createFeature : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(
					createFeature.getCreateName(), createFeature.getCreateDescription(),
					createFeature.getCreateImageId(), createFeature.getCreateLargeImageId(), createFeature);
			if(!(createFeature instanceof SimpleTaskCreateFeature)){
				compartmentEntry2.addToolEntry(objectCreationToolEntry);
				
			}else{
				compartmentEntry3.addToolEntry(objectCreationToolEntry);
			}
		}

		IPaletteCompartmentEntry[] res = ret.toArray(new IPaletteCompartmentEntry[ret.size()]);
		return res;
	   
	}


}
