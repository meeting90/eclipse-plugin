package cn.edu.nju.cs.workflow.bpel.aspect.resource;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.xml.sax.SAXParseException;

public class MySAXParseDiagnostic implements Diagnostic{


	protected SAXParseException exception;
	protected int severity;
	
	public static final int WARNING = 1;
	public static final int ERROR = 2;
	public static final int FATAL_ERROR = 3;
	public MySAXParseDiagnostic(){
		
	}
	public MySAXParseDiagnostic(SAXParseException exception, int severity)
	{
		this.exception = exception;
		this.severity = severity;
	}

	public int getColumn() {
		return exception.getColumnNumber();
	}

	public int getLine() {
		return exception.getLineNumber();
	}

	public String getLocation() {
		return exception.getPublicId();
	}

	public String getMessage() {
		return exception.getLocalizedMessage();
	}
	
	public int getSeverity() {
		return severity;
	}

	
}
