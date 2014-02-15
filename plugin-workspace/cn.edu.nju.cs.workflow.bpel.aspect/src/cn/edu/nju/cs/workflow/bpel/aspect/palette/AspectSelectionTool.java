package cn.edu.nju.cs.workflow.bpel.aspect.palette;


import org.eclipse.gef.tools.SelectionTool;


public class AspectSelectionTool extends SelectionTool{
	@Override
	protected boolean handleFocusLost() {
		if (isSelectionChangeBeingBroadcasted()) return true;
		return super.handleFocusLost();
	}
	protected boolean isSelectionChangeBeingBroadcasted() {
		return true;
		//TODO 
		//AspectEditor editor = (AspectEditor) ((DefaultEditDomain)getDomain()).getEditorPart();
		//return editor.getAdaptingSelectionProvider().isBroadcastingSelectionChange();
	}
	
	/**
	 * This workaround is similar to the one in handleFocusLost(). In this particular case
	 * there was also a timing issue related to when we received the button up event. 
	 */
	@Override
	protected boolean handleButtonUp(int button) {
		if (isSelectionChangeBeingBroadcasted()) return true;
		return super.handleButtonUp(button);
	}

	/**
	 * This workaround is similar to the one in handleFocusLost(). In this particular case
	 * there was also a timing issue related to when we received the button exit event. 
	 */
	@Override
	protected boolean handleViewerExited() {
		if (isSelectionChangeBeingBroadcasted()) return true;
		return super.handleViewerExited();
	}

}
