package cn.edu.nju.cs.workflow.analyzer;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;


import org.eclipse.bpel.common.wsdl.parsers.WsdlParser;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypeFactory;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypePackage;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.model.resource.BPELResourceFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Import;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.WSDLFactory;

public class WsdlHelper {
	private IFile diagramFile;
	private Definition artifactsDefinition;
	private Definition businessDefinition;
	//private Process bpelProcess;
	private Collection<PartnerLinkType> plTypes;
	private EList<PortType> toImplPortTypes;
	private EList<PortType> implementedPortTypes;
	private URI wsdlUri;
	public WsdlHelper(IFile diagramFile, URI wsdlUri){
		this.wsdlUri=wsdlUri;
		this.diagramFile=diagramFile;
		
	}
	public void setToImplPortTypes(EList<PortType> toImplPortTypes) {
		this.toImplPortTypes = toImplPortTypes;
	}
	public void setImplementedPortTypes(EList<PortType> implementedPortTypes) {
		this.implementedPortTypes = implementedPortTypes;
	}
	public Definition getArtifactsDefinition() {
		return artifactsDefinition;
	}
	public Definition getBusinessDefinition() {
		return businessDefinition;
	}
	
	
	public  void createWsdlFile(final IProgressMonitor monitor){
		monitor.beginTask( "Creating the artifacts definition...", IProgressMonitor.UNKNOWN );
		generateWsdlArtifacts();
		ResourceSet resourceSet = WsdlParser.createBasicResourceSetForWsdl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "bpel", new BPELResourceFactoryImpl());
		resourceSet.getPackageRegistry().put( PartnerlinktypePackage.eNS_URI, PartnerlinktypePackage.eINSTANCE );
		resourceSet.getPackageRegistry().put( BPELPackage.eNS_URI, BPELPackage.eINSTANCE );
		IFile wsdlFile = diagramFile.getParent().getFile( new Path( computeWsdlArtifactsName()));
		URI wsdlEmfUri = URI.createPlatformResourceURI( wsdlFile.getFullPath().toString(), true );
		Resource wsdlResource = resourceSet.createResource( wsdlEmfUri );
		wsdlResource.setTrackingModification(true);
		wsdlResource.getContents().add( this.artifactsDefinition );
		try {
			wsdlResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	
	@SuppressWarnings("unchecked")
	public  void generateWsdlArtifacts() {
		//create artifactsDefinition
		this.businessDefinition=WsdlParser.loadWsdlDefinition(wsdlUri, WsdlParser.createBasicResourceSetForWsdl());
		this.artifactsDefinition=WSDLFactory.eINSTANCE.createDefinition();
		
		this.artifactsDefinition.setTargetNamespace( businessDefinition.getTargetNamespace() + "Artifacts" );

		// Hack for the role: we need to define manually the name space prefix for the TNS of the business WSDL
		this.artifactsDefinition.getNamespaces().put( "tns", businessDefinition.getTargetNamespace());
		// WSDL import
		Import wsdlImport = WSDLFactory.eINSTANCE.createImport();
		wsdlImport.setLocationURI( businessDefinition.getLocation() );
		wsdlImport.setNamespaceURI( businessDefinition.getTargetNamespace());
		
		this.artifactsDefinition.getEImports().add(wsdlImport);
	
//		for(Object imp: businessDefinition.getImports().values()){
//			this.artifactsDefinition.getEImports().add(imp);
//		}
		setPartnerLinkType(implementedPortTypes, this.artifactsDefinition);
		setPartnerLinkType(toImplPortTypes, this.artifactsDefinition);
		

	}
	@SuppressWarnings("unchecked")
	private void setPartnerLinkType(EList<PortType>portTypes,Definition definition){
//		plTypes=getPlTypes();
		for(PortType portType: portTypes){
//			if(hasPartenerLinkType(portType, plTypes))
//				continue;
			PartnerLinkType plType = PartnerlinktypeFactory.eINSTANCE.createPartnerLinkType();
			QName qname=QName.valueOf(portType.getQName().toString());
			
			plType.setName(qname.getLocalPart()+"PLT");
			Role plRole = PartnerlinktypeFactory.eINSTANCE.createRole();
			plRole.setName( portType.getQName().getLocalPart() + "Role" );
			plRole.setPortType( portType );
			plType.getRole().add( plRole );
			definition.getEExtensibilityElements().add( plType );
			plType.setEnclosingDefinition( definition );
			
		}
		
	}
	
	public Collection<PartnerLinkType> getPlTypes() {
		if(plTypes==null){
			plTypes=getPartnerLinkType(businessDefinition);
		}
		return plTypes;
	}
	private Collection<PartnerLinkType> getPartnerLinkType(Definition definition){
		Set<PartnerLinkType> ptls=new HashSet<PartnerLinkType>();
		for( Object elt : businessDefinition.getEExtensibilityElements()) {
			if( ! ( elt instanceof PartnerLinkType ))
				continue;
			ptls.add((PartnerLinkType) elt);
			
		}
		return ptls;
	}
	@SuppressWarnings("unused")
	private boolean hasPartenerLinkType(PortType portType,Collection<PartnerLinkType> ptls){
		for(PartnerLinkType ptl: ptls){
			if(((PortType)ptl.getRole().get(0).getPortType()).getQName().toString().equals(portType.getQName().toString()))
				return true;
				
		}
		
		return false;
	}
	
	private  String computeWsdlArtifactsName() {
		IPath path = new Path( this.diagramFile.getName());
		return path.removeFileExtension().toString() + "Artifacts.wsdl";
	}

}
