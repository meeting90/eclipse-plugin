package cn.edu.nju.workflow.ui.diagram;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;
import org.eclipse.graphiti.ui.platform.IImageProvider;

public class WorkflowImageProvider extends AbstractImageProvider implements
		IImageProvider {


	protected static final String PREFIX = "cn.edu.nju.workflow.diagram.";
	public static final String IMG_TASK=PREFIX+"task";
	public static final String IMG_COMPOUND_TASK=PREFIX+"compoundtask";
	public static final String IMG_LOOP_TASK=PREFIX+"looptask";
	public static final String IMG_CHOICE_TASK=PREFIX+"choicetask";
	public static final String IMG_EDGE=PREFIX+"edge";
	public static final String IMG_ASPECT=PREFIX+"ASPECT";
	
	@Override
	protected void addAvailableImages() {
		// TODO Auto-generated method stub
		addImageFilePath(IMG_TASK,"icons/task.gif");
		addImageFilePath(IMG_COMPOUND_TASK,"icons/compound_task.gif");
		addImageFilePath(IMG_LOOP_TASK,"icons/loop_task.gif");
		addImageFilePath(IMG_CHOICE_TASK,"icons/choise_task.gif");
		addImageFilePath(IMG_EDGE,"icons/edge.gif");
		addImageFilePath(IMG_ASPECT, "icons/cutpoint.gif");

	}

}
