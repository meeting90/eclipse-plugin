package cn.edu.nju.cs.workflow.bpel;

import java.io.File;
import java.io.IOException;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;


import org.eclipse.bpel.common.wsdl.importhelpers.WsdlImportHelper;
import org.eclipse.bpel.common.wsdl.parsers.WsdlParser;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Sequence;

import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypeFactory;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypePackage;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.model.resource.BPELResourceFactoryImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.wst.wsdl.Definition;

import org.eclipse.wst.wsdl.Import;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.WSDLFactory;
import org.eclipse.wst.wsdl.util.WSDLConstants;

public class BPELSkeletonGenerator {
	private IFile diagramFile;
	private String wsdlUrl;
	private Definition artifactsDefinition;
	private Definition businessDefinition;
	private Process bpelProcess;
	private Set<PortType> toImplPortTypes;
	private Set<PortType> implementedPortTypes;
	
	public BPELSkeletonGenerator(IFile diagramFile, String wsdlUrl){
		this.diagramFile=diagramFile;
		this.wsdlUrl=wsdlUrl;
	}
	

public  void loadDependencies() {
	
		
		URI emfUri = URI.createURI( this.wsdlUrl );
		System.out.println(emfUri.toString());
		
		this.businessDefinition=WsdlParser.loadWsdlDefinition(emfUri,  WsdlParser.createBasicResourceSetForWsdl());
		System.out.println(this.businessDefinition);
		this.implementedPortTypes=new HashSet<PortType>();
		this.toImplPortTypes=new HashSet<PortType>();
		this.bpelProcess = BPELFactory.eINSTANCE.createProcess();
		this.artifactsDefinition=WSDLFactory.eINSTANCE.createDefinition();
		File targetDirectory = diagramFile.getParent().getLocation().toFile();
		Map<String, File> uriToImportedFile;
		try {
			uriToImportedFile = new WsdlImportHelper().importWsdlOrXsdAndDependencies( targetDirectory, wsdlUrl );
			File importedWsdlFile = uriToImportedFile.get( wsdlUrl );
			if( importedWsdlFile == null )
				throw new IOException( "The WSDL file could not be found after import." );
			wsdlUrl = importedWsdlFile.getName();
			for(File f: uriToImportedFile.values()){
				if(!f.getName().endsWith("wsdl"))
					continue;
				URI uri=URI.createFileURI(f.getAbsolutePath());
				Definition def=WsdlParser.loadWsdlDefinition(uri, WsdlParser.createBasicResourceSetForWsdl());
				this.bpelProcess.getImports().add( createBpelImport(f.getName(),def) );
				
				
				for(Object obj :def.getPortTypes().values()){
					PortType portType=(PortType)obj;
					if(f==importedWsdlFile){	
						this.artifactsDefinition.addImport(createWsdlImport(f.getName(),"tns", def));
						this.toImplPortTypes.add(portType);
					}else{
						this.artifactsDefinition.addImport(createWsdlImport(f.getName(),"ns", def));
						this.implementedPortTypes.add(portType);
						
					}
				}	
					
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

public  void createWsdlFile(){
	final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
		

		public void run(final IProgressMonitor monitor) throws CoreException {
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
			wsdlResource.getContents().add( BPELSkeletonGenerator.this.artifactsDefinition );
			try {
				wsdlResource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
	};
	try {
		ResourcesPlugin.getWorkspace().run(wsRunnable, null);
	} catch (final CoreException e) {
		final Throwable cause = e.getStatus().getException();
		if (cause instanceof RuntimeException) {
			throw (RuntimeException) cause;
		}
		throw new RuntimeException(e);
	}finally{
		try {
			diagramFile.getProject().refreshLocal( IResource.DEPTH_INFINITE, null );
		} catch( CoreException e ) {
			e.printStackTrace();
		}
	}
	
}
	

public void createBpelSkeleton(){	
	this.bpelProcess.setName( "Process");
	this.bpelProcess.setTargetNamespace( businessDefinition.getTargetNamespace());
	this.bpelProcess.setPartnerLinks( BPELFactory.eINSTANCE.createPartnerLinks());
	this.bpelProcess.setVariables( BPELFactory.eINSTANCE.createVariables());

	
	//import artifacts definition
	this.bpelProcess.getImports().add( createBpelImport(computeWsdlArtifactsName(), this.artifactsDefinition) );

	Sequence mainSequence = BPELFactory.eINSTANCE.createSequence();
	mainSequence.setName( "MainSequence" );
	this.bpelProcess.setActivity( mainSequence );

	Pick mainPick = BPELFactory.eINSTANCE.createPick();
	mainPick.setName( "SwitchInvokedOperation" );
	mainPick.setCreateInstance( true );
	mainSequence.getActivities().add( mainPick );


}
public Definition getBusinessDefinition() {
	return businessDefinition;
}


public Process getBpelProcess() {
	return bpelProcess;
}



public Definition getArtifactsDefinition() {
	return artifactsDefinition;
}


public Set<PortType> getToImplPortTypes() {
	return toImplPortTypes;
}
public Set<PortType> getImplementedPortTypes() {
	return implementedPortTypes;
}
private  String computeWsdlArtifactsName() {
	IPath path = new Path( this.diagramFile.getName());
	return path.removeFileExtension().toString() + "Artifacts.wsdl";
}
@SuppressWarnings("unchecked")
private  void generateWsdlArtifacts() {
	//create artifactsDefinition
	this.artifactsDefinition.setTargetNamespace( businessDefinition.getTargetNamespace() + "Artifacts" );

	// Hack for the role: we need to define manually the name space prefix for the TNS of the business WSDL
	this.artifactsDefinition.getNamespaces().put( "tns", businessDefinition.getTargetNamespace());

	setPartnerLinkType(implementedPortTypes, this.artifactsDefinition);
	setPartnerLinkType(toImplPortTypes, this.artifactsDefinition);
	

}

@SuppressWarnings("unchecked")
private void setPartnerLinkType(Set<PortType> portTypes,Definition definition){
//	plTypes=getPlTypes();
	for(PortType portType: portTypes){
//		if(hasPartenerLinkType(portType, plTypes))
//			continue;
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

private org.eclipse.bpel.model.Import createBpelImport(String location, Definition def){
	org.eclipse.bpel.model.Import bpelImport = BPELFactory.eINSTANCE.createImport();
	bpelImport = BPELFactory.eINSTANCE.createImport();
	bpelImport.setLocation( location);
	bpelImport.setNamespace( def.getTargetNamespace());
	bpelImport.setImportType( WSDLConstants.WSDL_NAMESPACE_URI );
	bpelImport.setEnclosingDefinition(def);
	return bpelImport;

}
private Import createWsdlImport(String location,String prefix,Definition def){
	addNamespace(this.artifactsDefinition, def.getTargetNamespace(), prefix);
	Import wsdlImport=WSDLFactory.eINSTANCE.createImport();
	wsdlImport.setLocationURI(location);
	wsdlImport.setNamespaceURI( def.getTargetNamespace());
	
	return wsdlImport;
	
}
private  void addNamespace ( Definition definition, String namespace, String pfxRoot  ) {

	String prefix = definition.getPrefix(namespace);
	if (prefix != null) {
		return;
	}
	// Find a suitable prefix
	int idx = 0;
	prefix = pfxRoot+idx;
	
	do {
		if (definition.getNamespace(prefix) == null) {
			definition.addNamespace(prefix, namespace);
			break;
		}
		prefix = pfxRoot + idx;
		idx += 1;
	} while (true);
}





}
