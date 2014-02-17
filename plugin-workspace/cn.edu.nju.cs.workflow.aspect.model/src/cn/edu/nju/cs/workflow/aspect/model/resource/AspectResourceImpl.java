package cn.edu.nju.cs.workflow.aspect.model.resource;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.resource.BPELResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;

import cn.edu.nju.cs.workflow.aspect.model.Aspect;
import cn.edu.nju.cs.workflow.aspect.model.Aspects;






public class AspectResourceImpl extends BPELResourceImpl implements AspectResource{
	
	public AspectResourceImpl(){
		super();
	}
	public AspectResourceImpl(URI uri) {
		super(uri);
	}
	@Override
	public void doSave(OutputStream out, Map<?, ?> args) throws IOException {
		// TODO Auto-generated method stub
		super.doSave(out, args);
	}
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		AspectXMLParser parser = null;
        Document document = null;
        
        if (options != null 
        		&& (document = (org.w3c.dom.Document)options.get("DOMDocument")) != null) {
        	parser = new AspectXMLParser();
        	parser.read(this, document);
     	
        } else {
        	try {
        		parser = new AspectXMLParser( getDOMParser() );
        	} catch (IOException ioe) {
        		throw ioe;
        	} catch (Exception ex) {
        		throw new IOException("Problem create parser");
        	}
        	parser.read(this, inputStream);
        }
	}
	@Override
	public Process getProcess() {
		
		return getCurAspect().getAdvice();
	}
	@Override
	public Aspects getAspects(){
		 return getContents().size() == 1 && getContents().get(0) instanceof Aspects ? (Aspects) getContents().get(0) : null;
	}
	@Override
	public Aspect getCurAspect() {
		//TODO 
		return getAspects().getChildren().get(0);
	}
	
	



}
