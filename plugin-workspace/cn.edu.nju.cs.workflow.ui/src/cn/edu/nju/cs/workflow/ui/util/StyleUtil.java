package cn.edu.nju.cs.workflow.ui.util;




import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.graphiti.util.PredefinedColoredAreas;

/**
 * Styles are created here with "plain"-methods, i.e. all values have to be set
 * explicitly.
 * 
 * See chapters "Using Styles" and "Color Schemas" in tutorial for deatails.
 */
public class StyleUtil {

	private static final IColorConstant ELEMENT_TEXT_FOREGROUND = new ColorConstant(0, 0, 0);
	private static final IColorConstant ELEMENT_FOREGROUND = new ColorConstant(98, 131, 167);
	private static final IColorConstant PORT_FORGROUND=IColorConstant.LIGHT_GRAY;
	private static final IColorConstant INPUT_ANGLE_FORGROUND=IColorConstant.LIGHT_GREEN;
	private static final IColorConstant START_NODE_MARK_FORGROUND=IColorConstant.GREEN;
	private static final IColorConstant END_NODE_MARK_FORGROUND=IColorConstant.RED;
	private static final IColorConstant OUTPUT_ANGLE_FORGROUND=IColorConstant.GREEN;
	private static final IColorConstant FAULT_ANGLE_FORGROUND=IColorConstant.RED;
	private static final IColorConstant MESSAGE_FORGROUND=IColorConstant.HANDLE_FG;
	
	
	public static Style getStyleForCommonValues(Diagram diagram) {
		final String styleId = "COMMON-VALUES"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// Is style already persisted?
		Style style = gaService.findStyle(diagram, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(diagram, styleId);
			setCommonValues(style);
		}
		return style;
	}
    public static Style getStyleForPort(Diagram diagram){
    	final String styleId="PORT";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, PORT_FORGROUND));
			style.setBackground(gaService.manageColor(diagram, PORT_FORGROUND));
			
		}
       return style;
    	
    }
    public static Style getStyleForInputAngle(Diagram diagram){
    	final String styleId="INPUT-ANGLE";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, INPUT_ANGLE_FORGROUND));
			style.setBackground(gaService.manageColor(diagram, INPUT_ANGLE_FORGROUND));
			//gaService.setRenderingStyle(style, PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
		}
       return style;
    } 
    public static Style getStyleForStartNodeMark(Diagram diagram){
    	final String styleId="START-NODE-MARK";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, START_NODE_MARK_FORGROUND));
			style.setBackground(gaService.manageColor(diagram, START_NODE_MARK_FORGROUND));
			//gaService.setRenderingStyle(style, PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
		}
       return style;
    }
    public static Style getStyleForEndNodeMark(Diagram diagram){
    	final String styleId="END-NODE-MARK";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, END_NODE_MARK_FORGROUND));
			style.setBackground(gaService.manageColor(diagram, END_NODE_MARK_FORGROUND));
			//gaService.setRenderingStyle(style, PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
		}
       return style;
    }
    public static Style getStyleForOutputAngle(Diagram diagram){
    	final String styleId="OUTPUT-ANGLE";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, OUTPUT_ANGLE_FORGROUND));
			style.setBackground(gaService.manageColor(diagram, OUTPUT_ANGLE_FORGROUND));
			//gaService.setRenderingStyle(style, PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
		}
       return style;
    }
    public static Style getStyleForFaultAngle(Diagram diagram){
    	final String styleId="FAULT-ANGLE";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, FAULT_ANGLE_FORGROUND));
			style.setBackground(gaService.manageColor(diagram, FAULT_ANGLE_FORGROUND));
			//gaService.setRenderingStyle(style, PredefinedColoredAreas.getLightYellowAdaptions());
		}
       return style;
    }
	public static Style getStyleForElement(Diagram diagram) {
		final String styleId = "Element"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, ELEMENT_FOREGROUND));
			gaService.setRenderingStyle(style, PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
		}
		return style;
	}

	public static Style getStyleForElementText(Diagram diagram) {
		final String styleId = "Element-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, false, true));
		}
		return style;
	}

	public static Style getStyleForTextDecorator(Diagram diagram) {
		final String styleId = "TEXT-DECORATOR-TEXT"; //$NON-NLS-1$
		IGaService gaService = Graphiti.getGaService();

		// this is a child style of the common-values-style
		Style parentStyle = getStyleForCommonValues(diagram);
		Style style = gaService.findStyle(parentStyle, styleId);

		if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			setCommonTextValues(diagram, gaService, style);
			style.setFont(gaService.manageDefaultFont(diagram, true, false));
		}
		return style;
	}

	private static void setCommonTextValues(Diagram diagram, IGaService gaService, Style style) {
		style.setFilled(false);
		style.setAngle(0);
		style.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		style.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		style.setForeground(gaService.manageColor(diagram, ELEMENT_TEXT_FOREGROUND));
	}

	private static void setCommonValues(Style style) {
		style.setLineStyle(LineStyle.SOLID);
		style.setLineVisible(true);
		style.setLineWidth(2);
		style.setTransparency(0.0);
	}
	public static Style getStyleForMessage(Diagram diagram) {
		// TODO Auto-generated method stub
		final String styleId="MESSAGE";
    	IGaService gaService = Graphiti.getGaService();

    	// this is a child style of the common-values-style
       Style parentStyle = getStyleForCommonValues(diagram);
       Style style = gaService.findStyle(parentStyle, styleId);
       if (style == null) { // style not found - create new style
			style = gaService.createPlainStyle(parentStyle, styleId);
			style.setFilled(true);
			style.setForeground(gaService.manageColor(diagram, MESSAGE_FORGROUND));
			gaService.setRenderingStyle(style, PredefinedColoredAreas.getLightYellowAdaptions());
			//gaService.setRenderingStyle(style, PredefinedColoredAreas.getLightYellowAdaptions());
		}
       return style;
	}
}
