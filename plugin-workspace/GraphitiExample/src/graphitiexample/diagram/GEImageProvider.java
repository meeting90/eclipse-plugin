package graphitiexample.diagram;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class GEImageProvider extends AbstractImageProvider{

	
protected static final String PREFIX = 
            "graphitiexample.diagram.";

  // The image identifier for an EReference.
  public static final String IMG_EREFERENCE= PREFIX + "reference";
  public static final String IMG_ECLASS= PREFIX + "class";
	@Override
	protected void addAvailableImages() {
		// TODO Auto-generated method stub
		 addImageFilePath(IMG_EREFERENCE, "icons/reference.gif");
		 addImageFilePath(IMG_ECLASS, "icons/workflow.gif");
	}
	
}
