package cn.edu.nju.cs.workflow.bpel.aspect.resource;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.xerces.parsers.DOMParser;
import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.XMLAttributes;
import org.apache.xerces.xni.XMLLocator;
import org.apache.xerces.xni.XMLString;
import org.apache.xerces.xni.XNIException;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.resource.BPELReader;
import org.eclipse.bpel.model.util.BPELConstants;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;

import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.Aspects;

public class AspectResourceImpl extends XMLResourceImpl implements AspectResource{
	
	public AspectResourceImpl(){
		super();
	}
	public AspectResourceImpl(URI uri) {
		super(uri);
	}
	@SuppressWarnings({ "nls", "boxing" })
	protected DOMParser getDOMParser() throws Exception {

		// This is per 
		// http://src.opensolaris.org/source/xref/sfw/usr/src/cmd/tomcat/xerces-2_8_0/samples/dom/DOMAddLines.java
		// 
		DOMParser domParser = new DOMParser () {

			protected XMLLocator mLocator;
			
			protected int fLineNo = 0;
			protected int fColumnNo = 0;
			protected int fOffset = 0;
			
			void lastSource () {
				
				fLineNo = mLocator.getLineNumber();
				fColumnNo = mLocator.getColumnNumber();
				fOffset = mLocator.getCharacterOffset() ;
				
				// p("  - lastSource.mark : r={0},c={1},o={2}",fLineNo, fColumnNo,fOffset );
			}
					
			/**
			 * @see org.apache.xerces.parsers.AbstractDOMParser#startDocument(org.apache.xerces.xni.XMLLocator, java.lang.String, org.apache.xerces.xni.NamespaceContext, org.apache.xerces.xni.Augmentations)
			 */
			@Override
			public void startDocument(XMLLocator arg0, String arg1, NamespaceContext arg2, Augmentations arg3) throws XNIException {
				mLocator = arg0;							
				super.startDocument(arg0, arg1, arg2, arg3);
				lastSource();					
			}
			

			

			/**
			 * @see org.apache.xerces.parsers.AbstractDOMParser#characters(org.apache.xerces.xni.XMLString, org.apache.xerces.xni.Augmentations)
			 */
			@Override
			public void characters(XMLString arg0, Augmentations arg1) throws XNIException {
				super.characters(arg0, arg1);
				lastSource();
			}




			/**
			 * @see org.apache.xerces.parsers.AbstractDOMParser#comment(org.apache.xerces.xni.XMLString, org.apache.xerces.xni.Augmentations)
			 */
			@Override
			public void comment(XMLString arg0, Augmentations arg1) throws XNIException {
				super.comment(arg0, arg1);
				lastSource();
				
			}



			/* (non-Javadoc)
			 * @see org.apache.xerces.parsers.AbstractDOMParser#textDecl(java.lang.String, java.lang.String, org.apache.xerces.xni.Augmentations)
			 */
			@Override
			public void textDecl(String arg0, String arg1, Augmentations arg2) throws XNIException {
				super.textDecl(arg0, arg1, arg2);
				lastSource();												
			}



			/**
			 * @see org.apache.xerces.parsers.AbstractDOMParser#startElement(org.apache.xerces.xni.QName, org.apache.xerces.xni.XMLAttributes, org.apache.xerces.xni.Augmentations)
			 */
			@Override
			public void startElement (org.apache.xerces.xni.QName arg0, XMLAttributes arg1, Augmentations arg2) throws XNIException {				
				super.startElement(arg0, arg1, arg2);
				// p("startElement: {0} {1}", arg0,arg1);
				
				if (fCurrentNode != null) {
					// p("  - start.mark: r={0},c={1},o={2}",fLineNo,fColumnNo,fOffset+1);					
					// start of element
					fCurrentNode.setUserData("location.line", fLineNo, null);
					fCurrentNode.setUserData("location.column", fColumnNo, null);									
					fCurrentNode.setUserData("location.charStart", fOffset+1, null);
					fCurrentNode.setUserData("location.charEnd", fOffset + arg0.rawname.length()+1 , null);
					
					// p("  - end.mark: r={0},c={1},o={2}",mLocator.getLineNumber(), mLocator.getColumnNumber(),mLocator.getCharacterOffset() );
					// end of element
					fCurrentNode.setUserData("location2.line", mLocator.getLineNumber(), null);
					fCurrentNode.setUserData("location2.column", mLocator.getColumnNumber(), null);
					fCurrentNode.setUserData("location2.charStart", mLocator.getCharacterOffset(), null);
					fCurrentNode.setUserData("location2.charEnd", mLocator.getCharacterOffset(), null);					
				}				
				lastSource();
			}
			
			
			@Override
			public void startCDATA( Augmentations aug ) {				
				super.startCDATA(aug);
				lastSource();
				
			}
			
			@Override
			public void endCDATA( Augmentations aug ) {				
				super.endCDATA(aug);
				lastSource();				
			}
			
			@Override
			public void endElement ( org.apache.xerces.xni.QName element, Augmentations aug ) {							
				super.endElement(element, aug);	
				// p("endElement: {0}", element);
				lastSource();	
			}			
			
//			void p ( String fmt, Object ... args) {				
//				System.out.println(java.text.MessageFormat.format(fmt,args));
//			}
			
		};
				

		domParser.setFeature( "http://apache.org/xml/features/dom/defer-node-expansion", false );
		domParser.setFeature( "http://apache.org/xml/features/xinclude", false);
		
		
		return domParser;
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
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		super.doSave(outputStream, options);
	}
	public Aspects getAspects(){
		 return getContents().size() == 1 && getContents().get(0) instanceof Aspects ? (Aspects) getContents().get(0) : null;
	}
	@Override
	public Aspect getCurAspect() {
		//TODO 
		return getAspects().getChildren().get(0);
	}
	




}
