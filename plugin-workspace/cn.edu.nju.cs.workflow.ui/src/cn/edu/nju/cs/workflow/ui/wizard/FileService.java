package cn.edu.nju.cs.workflow.ui.wizard;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.bpel.common.wsdl.helpers.UriAndUrlHelper;
import org.eclipse.bpel.common.wsdl.importhelpers.WsdlImportHelper;
import org.eclipse.bpel.common.wsdl.parsers.WsdlParser;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.BPELPackage;
import org.eclipse.bpel.model.OnMessage;
import org.eclipse.bpel.model.PartnerLink;
import org.eclipse.bpel.model.Pick;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Reply;
import org.eclipse.bpel.model.Sequence;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.partnerlinktype.PartnerLinkType;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypeFactory;
import org.eclipse.bpel.model.partnerlinktype.PartnerlinktypePackage;
import org.eclipse.bpel.model.partnerlinktype.Role;
import org.eclipse.bpel.model.resource.BPELResourceFactoryImpl;
import org.eclipse.bpel.model.resource.BPELWriter;
import org.eclipse.bpel.model.util.ElementFactory;
import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.util.BPELUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;

import org.eclipse.core.runtime.IProgressMonitor;


import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.graphiti.examples.common.Messages;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Fault;
import org.eclipse.wst.wsdl.Message;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.Part;
import org.eclipse.wst.wsdl.WSDLFactory;
import org.eclipse.wst.wsdl.WSDLPackage;
import org.eclipse.wst.wsdl.Import;
import org.eclipse.wst.wsdl.PortType;
import org.eclipse.wst.wsdl.internal.util.WSDLResourceFactoryImpl;
import org.eclipse.wst.wsdl.util.WSDLConstants;
import org.eclipse.wst.wsdl.util.WSDLParser;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;



import cn.edu.nju.cs.workflow.model.ModelFactory;
import cn.edu.nju.cs.workflow.model.Workflow;
import cn.edu.nju.cs.workflow.model.WorkflowProcess;



public class FileService {
	private static  class BPELInfo{
		Definition busnessDefinition;
		Definition artifactsDefinition;
		
		Process bpelProcess;
		public BPELInfo(Definition busness,Definition artifact,Process process){
			
			this.busnessDefinition=busness;
			this.artifactsDefinition=artifact;
			this.bpelProcess=process;
		}
	}
	
	private static BPELInfo importWsdl(IFile diagramFile, String wsdlUrl) {
	
		
		URI emfUri = URI.createURI( wsdlUrl );
		
		Definition businessDefinition=WsdlParser.loadWsdlDefinition(emfUri,  WsdlParser.createBasicResourceSetForWsdl());
		Set<PortType> allPortTypes = new HashSet<PortType> ();
		Collection<Definition> definitions=WsdlParser.findAllWsdlDefinitions(businessDefinition);
		for(Definition def: definitions){		
		for(Object obj :def.getPortTypes().values())	
			allPortTypes.add((PortType)obj);
		}
		
		
		File targetDirectory = diagramFile.getParent().getLocation().toFile();
		Map<String, File> uriToImportedFile;
		
			try {
				uriToImportedFile = new WsdlImportHelper().importWsdlOrXsdAndDependencies( targetDirectory, wsdlUrl );
				File importedWsdlFile = uriToImportedFile.get( wsdlUrl );
				if( importedWsdlFile == null )
					throw new IOException( "The WSDL file could not be found after import." );

					// The URL to put in the imports is the relative location of the WSDL
					// with respect to the process (and they are both in the same directory)
					wsdlUrl = importedWsdlFile.getName();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
			//load wsdl Definition
			
			Definition artifactsDefinition = generateWsdlArtifacts(businessDefinition,allPortTypes,wsdlUrl );
			Process bpelProcess=generateBpelProcess(businessDefinition,artifactsDefinition,allPortTypes);
			
			return new BPELInfo(businessDefinition, artifactsDefinition, bpelProcess);
		
			
		

	
	}
	private static String computeWsdlArtifactsName(IFile diagramFile) {
		IPath path = new Path( diagramFile.getName());
		return path.removeFileExtension().toString() + "Artifacts.wsdl";
	}
	private static Definition generateWsdlArtifacts(Definition businessDefinition, Set<PortType> allPortTypes,String newWsdlUrl ) {

		
		
		//create artifactsDefinition
		Definition artifactsDefinition = WSDLFactory.eINSTANCE.createDefinition();
		artifactsDefinition.setTargetNamespace( businessDefinition.getTargetNamespace() + "Artifacts" );

		// Hack for the role: we need to define manually the name space prefix for the TNS of the business WSDL
		artifactsDefinition.getNamespaces().put( "tns", businessDefinition.getTargetNamespace());

		// WSDL import
		Import wsdlImport = WSDLFactory.eINSTANCE.createImport();
		wsdlImport.setLocationURI( businessDefinition.getLocation() );
		System.out.println(businessDefinition.getLocation());
		wsdlImport.setNamespaceURI( businessDefinition.getTargetNamespace());
		artifactsDefinition.addImport( wsdlImport );
		
		
		// Partner Link Type for bpel implements
		for(PortType portType: allPortTypes){
			PartnerLinkType plType = PartnerlinktypeFactory.eINSTANCE.createPartnerLinkType();
			plType.setName( portType.getQName().getLocalPart() + "PLT" );

			Role plRole = PartnerlinktypeFactory.eINSTANCE.createRole();
			plRole.setName( portType.getQName().getLocalPart() + "Role" );
			plRole.setPortType( portType );

			plType.getRole().add( plRole );
			artifactsDefinition.getEExtensibilityElements().add( plType );
			plType.setEnclosingDefinition( artifactsDefinition );
		}

		return artifactsDefinition;
	}
  
	private static Process generateBpelProcess(Definition businessDefinition,Definition artifactsDefinition,Set<PortType> allPortTypes){
		
		//Definition businessDefinition = (Definition) portType.eContainer();

		
		Process bpelProcess = BPELFactory.eINSTANCE.createProcess();
		
		bpelProcess.setName( "Process");
		bpelProcess.setTargetNamespace( businessDefinition.getTargetNamespace());
		bpelProcess.setPartnerLinks( BPELFactory.eINSTANCE.createPartnerLinks());
		bpelProcess.setVariables( BPELFactory.eINSTANCE.createVariables());


		// Import the business definition
		org.eclipse.bpel.model.Import bpelImport = BPELFactory.eINSTANCE.createImport();
		System.out.println(businessDefinition.getLocation());
		bpelImport.setLocation( businessDefinition.getLocation() );
		bpelImport.setNamespace( businessDefinition.getTargetNamespace());
		bpelImport.setImportType( WSDLConstants.WSDL_NAMESPACE_URI );
		bpelProcess.getImports().add( bpelImport );


		// Import the artifacts definition
		bpelImport = BPELFactory.eINSTANCE.createImport();
		System.out.println(artifactsDefinition.getLocation());
	
		
		bpelImport.setLocation(artifactsDefinition.getLocation());
		bpelImport.setNamespace( businessDefinition.getTargetNamespace() + "Artifacts" );
		bpelImport.setImportType( WSDLConstants.WSDL_NAMESPACE_URI );
		bpelProcess.getImports().add( bpelImport );


		// Create the main partner link
		PartnerLink pl = BPELFactory.eINSTANCE.createPartnerLink();
		for( Object elt : artifactsDefinition.getEExtensibilityElements()) {
			if( ! ( elt instanceof PartnerLinkType ))
				continue;

			pl.setPartnerLinkType((PartnerLinkType) elt);
			pl.setName( "bpelProcessPartner" );
			pl.setMyRole(((PartnerLinkType) elt).getRole().get( 0 ));
			bpelProcess.getPartnerLinks().getChildren().add( pl );
			break;
		}
		// Prepare the flow itself
		Sequence mainSequence = BPELFactory.eINSTANCE.createSequence();
		mainSequence.setName( "MainSequence" );
		bpelProcess.setActivity( mainSequence );

		Pick mainPick = BPELFactory.eINSTANCE.createPick();
		mainPick.setName( "SwitchInvokedOperation" );
		mainPick.setCreateInstance( true );
		mainSequence.getActivities().add( mainPick );


		// Create the variables: they are deduced from the port type to "implement"
		Collection<Definition> definitions = WsdlParser.findAllWsdlDefinitions( businessDefinition );
		
		for(PortType portType: allPortTypes){
			if(portType.eContainer()==businessDefinition){
				for( Object o : portType.getOperations())
					addOperationDerivedElements((Operation) o, bpelProcess, mainPick, pl, definitions );
			}
		}

		return bpelProcess;		
	}
	
	private static void addOperationDerivedElements( Operation operation, Process bpelProcess, Pick mainPick, PartnerLink partnerLink, Collection<Definition> definitions ) {

		String opName = BPELUtil.lowerCaseFirstLetter( operation.getName());

		// Input: create the variable...
		Variable var = BPELFactory.eINSTANCE.createVariable();
		var.setName( opName + "Request" );
		var.setMessageType(operation.getEInput().getEMessage());
		//findAndSetVariableXmlType( var, operation.getEInput().getEMessage().getQName(), definitions );
		bpelProcess.getVariables().getChildren().add( var );

		// ... and add an OnMessage activity
		OnMessage onMessage = BPELFactory.eINSTANCE.createOnMessage();
		onMessage.setPartnerLink( partnerLink );
		onMessage.setVariable( var );
		onMessage.setOperation( operation );
		mainPick.getMessages().add( onMessage );


		// Output: if it exists...
		if( operation.getOutput() != null ) {

			// Create the variable...
			var = BPELFactory.eINSTANCE.createVariable();
			var.setName( opName + "Response" );
			var.setMessageType(operation.getEOutput().getEMessage());
			//findAndSetVariableXmlType( var, operation.getEOutput().getEMessage().getQName(), definitions );
			bpelProcess.getVariables().getChildren().add( var );

			// And add a Reply activity
			Reply reply = BPELFactory.eINSTANCE.createReply();
			reply.setName( "ReplyTo" + BPELUtil.upperCaseFirstLetter( opName ));
			reply.setVariable( var );
			reply.setOperation( operation );
			reply.setPartnerLink( partnerLink );
			onMessage.setActivity( reply );

		} else {
			onMessage.setActivity( BPELFactory.eINSTANCE.createEmpty());
		}


		// Faults
		if( operation.getFaults() != null ) {
			for( Object oo : operation.getFaults().values()) {
				Fault fault = (Fault) oo;
				var = BPELFactory.eINSTANCE.createVariable();
				var.setName( opName + fault.getName());
				var.setMessageType(fault.getEMessage());
				//findAndSetVariableXmlType( var, fault.getEMessage().getQName(), definitions );
				bpelProcess.getVariables().getChildren().add( var );
			}
		}
	}

	private static void findAndSetVariableXmlType( Variable variable, QName messageName, Collection<Definition> definitions ) {
//
//		// Find and set the variable's type
//		boolean found = false;
//		boolean processed = false;
//		for( Definition def : definitions ) {
//			for( Object o : def.getEMessages()) {
//				Message msg = (Message) o;
//				if( ! ( messageName.equals( msg.getQName())))
//					continue;
//
//				found = true;
//				variable.setMessageType(msg);
////				if( msg.getEParts().size() == 1 ) {
////					processed = true;
////
////					Part part = (Part) msg.getEParts().get( 0 );
////					if( part.getTypeDefinition() != null )
////						variable.setType( part.getTypeDefinition());
////					else if( part.getElementDeclaration() != null )
////						variable.setXSDElement( part.getElementDeclaration());
////				}
//			}
//		}
//
//
//		// Log possible errors
//		if( ! found )
//			BPELUIPlugin.log( new Exception( "The message " + messageName + " could not be found." ), IStatus.ERROR );
//		else if( ! processed )
//			BPELUIPlugin.log( new Exception( "The message " + messageName + " contains more than 1 part. This case is not supported." ), IStatus.ERROR );
//		else if( variable.getXSDElement() == null && variable.getType() == null )
//			BPELUIPlugin.log( new Exception( "The XML type could not be set for the variable " + variable.getName() + ". Please, report a bug." ), IStatus.ERROR );
	}
//	@SuppressWarnings("unchecked")
//	private static void initProcess(String wsdl,Process process){
//		
//		java.net.URI uri = UriAndUrlHelper.urlToUri( wsdl );
//		File f = new File( uri );
//		URI emfUri=URI.createFileURI(f.getAbsolutePath());
//		
//		
//		Definition rootDef=WsdlParser.loadWsdlDefinition(emfUri,  WsdlParser.createBasicResourceSetForWsdl());	
//		
//		process.setName("Process");
//		process.setTargetNamespace(rootDef.getTargetNamespace());
//		process.setSuppressJoinFailure(true);
//		process.setPartnerLinks(BPELFactory.eINSTANCE.createPartnerLinks());
//		process.setVariables(BPELFactory.eINSTANCE.createVariables());
//		
//
//		org.eclipse.bpel.model.Import bpelImport =BPELFactory.eINSTANCE.createImport();
//		bpelImport.setLocation(rootDef.getLocation());
//		bpelImport.setImportType(WSDLConstants.WSDL_NAMESPACE_URI);
//		bpelImport.setNamespace(rootDef.getTargetNamespace());
//		
//		System.out.println("addImports");
//		process.getImports().add(bpelImport);
//		
//		//set PartnerLink
//		
////		PartnerLink pl = BPELFactory.eINSTANCE.createPartnerLink();
////		for( Object elt : rootDef.getEExtensibilityElements()) {
////			if( ! ( elt instanceof PartnerLinkType ))
////				continue;
////
////			pl.setPartnerLinkType((PartnerLinkType) elt);
////			pl.setName( "bpelProcessPartner" );
////			pl.setMyRole(((PartnerLinkType) elt).getRole().get( 0 ));
////			process.getPartnerLinks().getChildren().add( pl );
////			break;
////		}
////		
//		System.out.println("setActivity");
//		Sequence mainSequence = BPELFactory.eINSTANCE.createSequence();
//		mainSequence.setName( "MainSequence" );
//		process.setActivity( mainSequence );
//		
//		
////		Collection<Definition> definitions=WsdlParser.loadAllWsdlDefinitions(emfUri, WsdlParser.createBasicResourceSetForWsdl());
////		for(Definition def: definitions){
////			for(Object obj :def.getPortTypes().values()){
////				PortType porttype=(PortType)obj;
////				PartnerLink partner = BPELFactory.eINSTANCE.createPartnerLink();
////				String newName=porttype.getQName().getLocalPart()+"PL";
////				newName = BPELUtil.generateUniqueModelName(process, newName, partner);
////				partner.setName(newName);
////				
////				PartnerLinkType partnerLinkType=PartnerlinktypeFactory.eINSTANCE.createPartnerLinkType();
////				partnerLinkType.setName(BPELUtil.generateUniqueModelName(def, partner.getName() + "PLT",partnerLinkType));
////				Role providerRole=PartnerlinktypeFactory.eINSTANCE.createRole();
////				providerRole.setPortType(porttype);
////				providerRole.setName(newName+"provider");
////				partnerLinkType.getRole().add(providerRole);
////				
////				Role requesterRole=PartnerlinktypeFactory.eINSTANCE.createRole();
////				requesterRole.setPortType(porttype);
////				requesterRole.setName(newName+"requester");
////				partnerLinkType.getRole().add(requesterRole);
////				
////				def.getEExtensibilityElements().add(partnerLinkType);
////				partnerLinkType.setEnclosingDefinition(def);
////				
////				partner.setPartnerLinkType(partnerLinkType);
////				partner.setMyRole(providerRole);
////				partner.setPartnerRole(requesterRole);
////				process.getPartnerLinks().getChildren().add(partner);
////				
////			}
////		}
//	}
	
	public static void createEmfFileForRootDiagramWithWSDL(final IFile diagramFile, final Diagram diagram,final String wsdl) {

		
		// Create a resource set and EditingDomain
		final TransactionalEditingDomain editingDomain = GraphitiUi.getEmfService()
				.createResourceSetAndEditingDomain();
		final ResourceSet resourceSet = editingDomain.getResourceSet();
		
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "xml", new XMLResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "xsd", new XSDResourceFactoryImpl());
        resourceSet.getPackageRegistry().put( XSDPackage.eNS_URI, XSDPackage.eINSTANCE );
        
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "wsdl", new WSDLResourceFactoryImpl());
        resourceSet.getPackageRegistry().put( WSDLPackage.eNS_URI, WSDLPackage.eINSTANCE );
        
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "bpel", new BPELResourceFactoryImpl());
		resourceSet.getPackageRegistry().put( PartnerlinktypePackage.eNS_URI, PartnerlinktypePackage.eINSTANCE );
		resourceSet.getPackageRegistry().put( BPELPackage.eNS_URI, BPELPackage.eINSTANCE );
		
		final BPELInfo bpelInfo=importWsdl(diagramFile, wsdl);
		final CommandStack commandStack = editingDomain.getCommandStack();
		commandStack.execute(new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				final URI diagramResourceUri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
				Resource createdResource = resourceSet.createResource(diagramResourceUri);
				createdResource.setTrackingModification(true);
				createdResource.getContents().add(diagram);
				
				PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
				diagram.setLink(link);
				
				WorkflowProcess workflowProcess=ModelFactory.eINSTANCE.createWorkflowProcess();
				createdResource.getContents().add(workflowProcess);	
				link.getBusinessObjects().add(workflowProcess);
				
				workflowProcess.setRootWorkflow(ModelFactory.eINSTANCE.createWorkflow());
				
				
				
				workflowProcess.setBpelProcess(bpelInfo.bpelProcess);
				
				
				
				
				createdResource.getContents().add(workflowProcess.getBpelProcess());
			
//				IFile wsdlFile = diagramFile.getParent().getFile( new Path( computeWsdlArtifactsName(diagramFile)));
//				URI wsdlEmfUri = URI.createPlatformResourceURI( wsdlFile.getFullPath().toString(), true );
				
//				Resource wsdlResource = resourceSet.createResource( wsdlEmfUri );
//				wsdlResource.setTrackingModification(true);
//				wsdlResource.getContents().add( bpelInfo.artifactsDefinition );
			 
				//createWsdlFile(diagramFile, bpelInfo.artifactsDefinition);
				
				
				
				
				
				
			}
		});
		Map<Object,Object> saveOptions = new HashMap<Object,Object> ();
		
		save(editingDomain,Collections.EMPTY_MAP);
		createWsdlFile(diagramFile,bpelInfo.artifactsDefinition);
		editingDomain.dispose();
	}

	
	public static void createWsdlFile(final IFile diagramFile,final Definition artifactsDefinition){
		IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
			@Override
			public void run( IProgressMonitor monitor ) 
			 {
				
				monitor.beginTask( "Creating the process...", IProgressMonitor.UNKNOWN );
				ResourceSet resourceSet = WsdlParser.createBasicResourceSetForWsdl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "bpel", new BPELResourceFactoryImpl());
				resourceSet.getPackageRegistry().put( PartnerlinktypePackage.eNS_URI, PartnerlinktypePackage.eINSTANCE );
				resourceSet.getPackageRegistry().put( BPELPackage.eNS_URI, BPELPackage.eINSTANCE );

				
				IFile wsdlFile = diagramFile.getParent().getFile( new Path( computeWsdlArtifactsName(diagramFile)));
				URI wsdlEmfUri = URI.createPlatformResourceURI( wsdlFile.getFullPath().toString(), true );
				
				Resource wsdlResource = resourceSet.createResource( wsdlEmfUri );
				wsdlResource.setTrackingModification(true);
				wsdlResource.getContents().add( artifactsDefinition );
				try {
					wsdlResource.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						diagramFile.getProject().refreshLocal( IResource.DEPTH_INFINITE, null );
					} catch( CoreException e ) {
						BPELUIPlugin.log( e );
					}
				}
				
			

			}
		};

		
			try {
				ResourcesPlugin.getWorkspace().run(runnable, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public static void createEmfFileForSubDiagram(URI diagramResourceUri, final Diagram diagram,final Workflow subworkflow){
		// Create a resource set and EditingDomain
				final TransactionalEditingDomain editingDomain = GraphitiUi.getEmfService()
						.createResourceSetAndEditingDomain();
				final ResourceSet resourceSet = editingDomain.getResourceSet();
				// Create a resource for this file.
				final Resource resource = resourceSet.createResource(diagramResourceUri);
				final CommandStack commandStack = editingDomain.getCommandStack();
				commandStack.execute(new RecordingCommand(editingDomain) {
					@Override
					protected void doExecute() {
						resource.setTrackingModification(true);
						resource.getContents().add(diagram);
						resource.getContents().add(subworkflow);
					}
				});
				save(editingDomain, Collections.<Resource, Map<?, ?>> emptyMap());
				editingDomain.dispose();
	}
	private static void save(TransactionalEditingDomain editingDomain,Map<?, ?> options) {
		saveInWorkspaceRunnable(editingDomain, options);
	}
	private static void saveInWorkspaceRunnable(final TransactionalEditingDomain editingDomain, final  Map<?, ?> options) {

		final Map<URI, Throwable> failedSaves = new HashMap<URI, Throwable>();
		final IWorkspaceRunnable wsRunnable = new IWorkspaceRunnable() {
			public void run(final IProgressMonitor monitor) throws CoreException {

				final Runnable runnable = new Runnable() {
					public void run() {
						Transaction parentTx;
						if (editingDomain != null
								&& (parentTx = ((TransactionalEditingDomainImpl) editingDomain).getActiveTransaction()) != null) {
							do {
								if (!parentTx.isReadOnly()) {
									throw new IllegalStateException(
											"FileService.save() called from within a command (likely produces a deadlock)"); //$NON-NLS-1$
								}
							} while ((parentTx = ((TransactionalEditingDomainImpl) editingDomain).getActiveTransaction().getParent()) != null);
						}

						final EList<Resource> resources = editingDomain.getResourceSet().getResources();
						// Copy list to an array to prevent
						// ConcurrentModificationExceptions
						// during the saving of the dirty resources
						Resource[] resourcesArray = new Resource[resources.size()];
						resourcesArray = resources.toArray(resourcesArray);
						final Set<Resource> savedResources = new HashSet<Resource>();
						for (int i = 0; i < resourcesArray.length; i++) {
							// In case resource modification tracking is
							// switched on, we can check if a resource
							// has been modified, so that we only need to same
							// really changed resources; otherwise
							// we need to save all resources in the set
							final Resource resource = resourcesArray[i];
							if (resource.isModified()) {
								try {
									resource.save(options);
									savedResources.add(resource);
								} catch (final Throwable t) {
									failedSaves.put(resource.getURI(), t);
								}
							}
						}
					}
				};

				try {
					
					editingDomain.runExclusive(runnable);
				} catch (final InterruptedException e) {
					throw new RuntimeException(e);
				}
				editingDomain.getCommandStack().flush();
			}
		};
		try {
			ResourcesPlugin.getWorkspace().run(wsRunnable, null);
			if (!failedSaves.isEmpty()) {
				throw new WrappedException(createMessage(failedSaves), new RuntimeException());
			}
		} catch (final CoreException e) {
			final Throwable cause = e.getStatus().getException();
			if (cause instanceof RuntimeException) {
				throw (RuntimeException) cause;
			}
			throw new RuntimeException(e);
		}
	}

	private static String createMessage(Map<URI, Throwable> failedSaves) {
		final StringBuilder buf = new StringBuilder(Messages.FileService_ErrorMessageStart);
		for (final Entry<URI, Throwable> entry : failedSaves.entrySet()) {
			buf.append(Messages.FileService_ErrorMessageUri).append(entry.getKey().toString()).append(Messages.FileService_ErrorMessageCause).append(getExceptionAsString(entry.getValue()));
		}
		return buf.toString();
	}

	private static String getExceptionAsString(Throwable t) {
		final StringWriter stringWriter = new StringWriter();
		final PrintWriter printWriter = new PrintWriter(stringWriter);
		t.printStackTrace(printWriter);
		final String result = stringWriter.toString();
		try {
			stringWriter.close();
		} catch (final IOException e) {
			// $JL-EXC$ ignore
		}
		printWriter.close();
		return result;
	}
}