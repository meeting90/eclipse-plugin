package graphitiexample.diagram;

import graphitiexample.feature.GECustomEclassFeature;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.impl.CreateConnectionContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.tb.ContextButtonEntry;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextButtonPadData;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;

public class GEToolBehaviorProvider extends  DefaultToolBehaviorProvider {

	public GEToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}
	//contextButton
	@Override
	public IContextButtonPadData getContextButtonPad(
	                                   IPictogramElementContext context) {
	    IContextButtonPadData data = super.getContextButtonPad(context);
	    PictogramElement pe = context.getPictogramElement();
	 
	    setGenericContextButtons(data, pe, CONTEXT_BUTTON_DELETE | 
	                                               CONTEXT_BUTTON_UPDATE);
	        
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
	        
	    // 3.b. create context button and add all applicable features
	    ContextButtonEntry button = new ContextButtonEntry(null, context);
	    button.setText("Create connection");
	    button.setIconId(GEImageProvider.IMG_EREFERENCE);
	    ICreateConnectionFeature[] features =
	        getFeatureProvider().getCreateConnectionFeatures();
	    for (ICreateConnectionFeature feature : features) {
	        if (feature.isAvailable(ccc) && feature.canStartConnection(ccc))
	            button.addDragAndDropFeature(feature);
	    }
	 
	    // 3.c. add context button, if it contains at least one feature
	    if (button.getDragAndDropFeatures().size() > 0) {
	       data.getDomainSpecificContextButtons().add(button);
	    }
	    
	    return data;
	}
	//menu
	@Override
	public IContextMenuEntry[] getContextMenu(ICustomContext context) {
	    // create a sub-menu for all custom features
	    ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
	    subMenu.setText("Custom");
	    subMenu.setDescription("Custom features submenu");
	    // display sub-menu hierarchical or flat
	    subMenu.setSubmenu(true);

	    // create a menu-entry in the sub-menu for each custom feature
	    ICustomFeature[] customFeatures = getFeatureProvider().getCustomFeatures(context);
	    for (int i = 0; i < customFeatures.length; i++) {
	         ICustomFeature customFeature = customFeatures[i];
	         if (customFeature.isAvailable(context)) {
	             ContextMenuEntry menuEntry = new ContextMenuEntry(customFeature, context);
	             subMenu.add(menuEntry);
	         }
	     }

	     IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
	     return ret;
	} 
	//doubleclick
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
	    ICustomFeature customFeature =
	        new GECustomEclassFeature(getFeatureProvider());
	    // canExecute() tests especially if the context contains a EClass
	    if (customFeature.canExecute(context)) {
	        return customFeature;
	    }
	 
	    return super.getDoubleClickFeature(context);
	 }
	
	//warning 
	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
	    IFeatureProvider featureProvider = getFeatureProvider();
	    Object bo = featureProvider.getBusinessObjectForPictogramElement(pe);
	    if (bo instanceof EClass) {
	        EClass eClass = (EClass) bo;
	        String name = eClass.getName();
	        if (name != null && name.length() > 0
	            && !(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
	            IDecorator imageRenderingDecorator =
	                new ImageDecorator(
	                    IPlatformImageConstants.IMG_ECLIPSE_WARNING_TSK);
	            imageRenderingDecorator
	                .setMessage("Name should start with upper case letter");
	            return new IDecorator[] { imageRenderingDecorator };
	        }
	    }
	 
	    return super.getDecorators(pe);
	 }
	//tip 
	@Override
	public String getToolTip(GraphicsAlgorithm ga) {
	    PictogramElement pe = ga.getPictogramElement();
	    Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pe);
	    if (bo instanceof EClass) {
	        String name = ((EClass)bo).getName();
	        if (name != null && !name.isEmpty()) {
	            return name;         
	        }
	    }
	    return super.getToolTip(ga);
	}
	@Override
	public String getContributorId() {
		// TODO Auto-generated method stub
		return "mytutorial.PropertyContributor";
	}



}
