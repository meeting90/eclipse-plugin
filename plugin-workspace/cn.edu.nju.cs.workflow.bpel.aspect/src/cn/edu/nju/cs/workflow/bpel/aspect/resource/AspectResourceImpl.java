package cn.edu.nju.cs.workflow.bpel.aspect.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.adapters.INamespaceMap;
import org.eclipse.bpel.model.resource.BPELResourceImpl;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.bpel.model.util.BPELUtils;

import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.util.AspectConstants;

public class AspectResourceImpl extends BPELResourceImpl implements AspectResource{
	private String aspectNamespaceURI=AspectConstants.NAMESPACE;
	private boolean aspectUseNSPrefix=true;
	public AspectResourceImpl(){
		super();
	}
	public AspectResourceImpl(URI uri) {
		super(uri);
	}
	
	public AspectResourceImpl(URI uri, EntityResolver fEntityResolver,
			ErrorHandler fErrorHandler) throws IOException {
		super(uri,fEntityResolver,fErrorHandler);
	}

	@Override
	public Aspect getAspect() {
		  return getContents().size() == 1 && getContents().get(0) instanceof Aspect ? (Aspect) getContents().get(0) : null;
	}
	@Override
	public Process getProcess() {
		// TODO Auto-generated method stub
		return getAspect()!=null?getAspect().getAdvice():null;
	}
	@Override
	public void doSave(OutputStream out, Map<?, ?> args) throws IOException {
		INamespaceMap<String, String> nsMap = BPELUtils.getNamespaceMap(this.getProcess());
        if (getOptionUseNSPrefix()) {
        	nsMap.remove("");
            List<String> prefix = nsMap.getReverse(getNamespaceURI());
            if (prefix.isEmpty()){
            	nsMap.put(BPELConstants.PREFIX, getNamespaceURI());
            }
        } else {
            nsMap.put("", getNamespaceURI());
        }
        nsMap = BPELUtils.getNamespaceMap(this.getAspect());
        if (getOptionUseNSPrefix()) {
        	nsMap.remove("");
            List<String> prefix = nsMap.getReverse(getNamespaceURI());
            if (prefix.isEmpty()){
            	nsMap.put(AspectConstants.PREFIX, getNamespaceURI());
            }
        } else {
            nsMap.put("", getNamespaceURI());
        }
        AspectWriter writer = new AspectWriter();
		writer.write(this, out, args);
	}
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		AspectReader reader=null;
		Document document=null;
		  if (options != null 
	        		&& (document = (org.w3c.dom.Document)options.get("DOMDocument")) != null) {
	        	reader = new AspectReader();
	        	reader.read(this, document);
	     	
	        } else {
	        	try {
	        		reader = new AspectReader( getDOMParser() );
	        	} catch (IOException ioe) {
	        		throw ioe;
	        	} catch (Exception ex) {
	        		throw new IOException("Problem create parser");
	        	}
	    		reader.read(this, inputStream);
	        }
	        setNamespaceURI(BPELConstants.NAMESPACE);
	    	setAspectNamespaceURI(AspectConstants.NAMESPACE);
//	    	boolean usePrefix =
//	    		checkUseNSPrefix(BPELConstants.NAMESPACE_2004) ||
//	    		checkUseNSPrefix(BPELConstants.NAMESPACE_2007) ||
//	    		checkUseNSPrefix(BPELConstants.NAMESPACE_ABSTRACT_2007);
//	    	this.setOptionUseNSPrefix(usePrefix);
	    	
//	    	boolean aspectPrefix=checkAspectUseNSPrefix(AspectConstants.NAMESPACE);
//	    	this.setAspectUseNSPrefix(aspectPrefix);
	}
	public void setAspectNamespaceURI(String namespace) {
		aspectNamespaceURI=namespace;
	}
	public String getAspectNamespaceURI(){
		return aspectNamespaceURI;
	}
	public boolean getAspectUseNSPrefix() {
        return aspectUseNSPrefix;
	}
    
	public void setAspectUseNSPrefix(boolean useNSPrefix) {
        aspectUseNSPrefix = useNSPrefix;
	}
	private boolean checkAspectUseNSPrefix(String aspectNamespace){
		 INamespaceMap<String, String> nsMap = BPELUtils.getNamespaceMap(getAspect());
	        List<String> prefixes;
	        prefixes = nsMap.getReverse(aspectNamespace);
	        for (int i=0; i<prefixes.size(); ++i) {
	        	String ns = prefixes.get(i);
	        	if (ns!=null && !ns.equals("")) {
	        		return true;
	        	}
	        }
	        return false;
	}
	private boolean checkUseNSPrefix(String bpelNamespace) {
        INamespaceMap<String, String> nsMap = BPELUtils.getNamespaceMap(getProcess());
        List<String> prefixes;
        prefixes = nsMap.getReverse(bpelNamespace);
        for (int i=0; i<prefixes.size(); ++i) {
        	String ns = prefixes.get(i);
        	if (ns!=null && !ns.equals("")) {
        		return true;
        	}
        }
        return false;
	}



}
