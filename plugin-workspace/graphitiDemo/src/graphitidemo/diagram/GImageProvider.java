package graphitidemo.diagram;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class GImageProvider extends AbstractImageProvider {

	// The prefix for all identifiers of this image provider
		protected static final String PREFIX = "graphitidemo.diagram."; //$NON-NLS-1$

		// The image identifier for an EReference.
		public static final String IMG_ASSIGN = PREFIX + "assign";
        public static final String IMG_RECEIVE= PREFIX + "receive";
        public static final String IMG_INVOKE= PREFIX + "invoke";
        public static final String IMG_REPLY= PREFIX + "reply";
		@Override
		protected void addAvailableImages() {
			// register the path for each image identifier
			addImageFilePath(IMG_ASSIGN, "icons/assign.gif");
			addImageFilePath(IMG_RECEIVE,"icons/receive.png");
			addImageFilePath(IMG_INVOKE,"icons/invoke.png");
			addImageFilePath(IMG_REPLY,"icons/reply.png");
		
		}
}




