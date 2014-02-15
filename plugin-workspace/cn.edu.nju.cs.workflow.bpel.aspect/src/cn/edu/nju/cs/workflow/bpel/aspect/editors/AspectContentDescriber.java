package cn.edu.nju.cs.workflow.bpel.aspect.editors;


import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;


import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;



public class AspectContentDescriber implements ITextContentDescriber {

	@Override
	public int describe(InputStream arg0, IContentDescription arg1)
			throws IOException {
		// TODO Auto-generated method stub
		return VALID;
	}

	@Override
	public QualifiedName[] getSupportedOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int describe(Reader arg0, IContentDescription arg1)
			throws IOException {
		// TODO Auto-generated method stub
		return VALID;
	}
	
}
