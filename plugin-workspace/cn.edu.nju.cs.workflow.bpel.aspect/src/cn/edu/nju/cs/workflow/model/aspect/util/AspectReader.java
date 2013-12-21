package cn.edu.nju.cs.workflow.model.aspect.util;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.bpel.common.extension.model.ExtensionMap;
import org.eclipse.bpel.common.extension.model.ExtensionmodelFactory;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Process;
import org.eclipse.bpel.model.Scope;
import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.util.ModelHelper;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.AspectFactory;

public class AspectReader {
	
	protected Resource aspectResource;
	protected Resource extensionsResource;
	protected Aspect aspect;
	protected Advice advice;
	protected ExtensionMap extensionMap;

	/**
	 * Another public method for those who want to get the process resource
	 * by their own means (such as the editor).
	 */
	public void read(Resource aspectResource, IFile modelFile, ResourceSet resourceSet) {
		// TODO: These two lines are a workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=72565
		EcorePackage instance = EcorePackage.eINSTANCE;
		instance.eAdapters();

		this.aspectResource = aspectResource;

		IPath extensionsPath = modelFile.getFullPath().removeFileExtension().addFileExtension(IBPELUIConstants.EXTENSION_MODEL_EXTENSIONS);
		URI extensionsUri = URI.createPlatformResourceURI(extensionsPath.toString());
		IFile extensionsFile = ResourcesPlugin.getWorkspace().getRoot().getFile(extensionsPath);

		try {
			aspectResource.load(Collections.EMPTY_MAP);
			EList<EObject> contents = aspectResource.getContents();
			if (!contents.isEmpty()){
				this.aspect = (Aspect) contents.get(0);
				this.advice=this.aspect.getAdvice();
			}
		} catch (Exception e) {
			
			BPELUIPlugin.log(e);
		}
		try {
			this.extensionsResource = resourceSet.getResource(extensionsUri, extensionsFile.exists());
			if (this.extensionsResource != null) {
				this.extensionMap = ExtensionmodelFactory.eINSTANCE.findExtensionMap(
					IBPELUIConstants.MODEL_EXTENSIONS_NAMESPACE, this.extensionsResource.getContents());
			}
			// Bugzilla 330513
			if (this.extensionMap != null)
				this.extensionMap.initializeAdapter();
		} catch (Exception e) {
			BPELUIPlugin.log(e);
		}
		if(this.aspect==null){
			this.aspect=AspectFactory.eINSTANCE.createAspect();
			aspectResource.getContents().add(this.aspect);
		}
		if (this.advice == null) {
			this.advice = AspectFactory.eINSTANCE.createAdvice();
			this.aspect.setAdvice(this.advice);
		}
		if (this.extensionMap == null) {
			this.extensionMap = ExtensionmodelFactory.eINSTANCE.createExtensionMap(IBPELUIConstants.MODEL_EXTENSIONS_NAMESPACE);
			if (this.extensionsResource == null) {
				this.extensionsResource = resourceSet.createResource(extensionsUri);
			}
			this.extensionsResource.getContents().clear();
			this.extensionsResource.getContents().add(this.extensionMap);
		}

		// Make sure the Process has Variables, PartnerLinks, CorrelationSets and MessageExchanges objects.
		// They aren't strictly necessary according to the spec but make we need those in
		// order for the editor tray to work.
		if (this.advice.getVariables() == null) {
			this.advice.setVariables(BPELFactory.eINSTANCE.createVariables());
		}
		if (this.advice.getPartnerLinks() == null) {
			this.advice.setPartnerLinks(BPELFactory.eINSTANCE.createPartnerLinks());
		}
		if (this.advice.getCorrelationSets() == null) {
			this.advice.setCorrelationSets(BPELFactory.eINSTANCE.createCorrelationSets());
		}
		if (this.advice.getMessageExchanges() == null) {
			this.advice.setMessageExchanges(BPELFactory.eINSTANCE.createMessageExchanges());
		}

		// Make sure scopes have Variables.
		// They aren't strictly necessary according to the spec but make we need those in
		// order for the editor tray to work.
		for (Iterator<EObject> iter = this.advice.eAllContents(); iter.hasNext();) {
			EObject object = iter.next();
			if (object instanceof Scope) {
				Scope scope = (Scope)object;
				if (scope.getVariables() == null) {
					scope.setVariables(BPELFactory.eINSTANCE.createVariables());
				}
				if (scope.getPartnerLinks() == null) {
					scope.setPartnerLinks(BPELFactory.eINSTANCE.createPartnerLinks());
				}
				if (scope.getCorrelationSets() == null) {
					scope.setCorrelationSets(BPELFactory.eINSTANCE.createCorrelationSets());
				}
				if (scope.getMessageExchanges() == null) {
					scope.setMessageExchanges(BPELFactory.eINSTANCE.createMessageExchanges());
				}
			}
		}

		// Make sure each model object has the necessary extensions!
		TreeIterator<EObject> it = this.advice.eAllContents();
		while (it.hasNext()) {
			ModelHelper.createExtensionIfNecessary(this.extensionMap, it.next());
		}

		if (this.extensionMap.get(this.advice) == null) {
			ModelHelper.createExtensionIfNecessary(this.extensionMap, this.advice);
		}
	}

	public ExtensionMap getExtensionMap() {
		return this.extensionMap;
	}

	public Resource getExtensionsResource() {
		return this.extensionsResource;
	}
	public Aspect getAspect(){
		return this.aspect;
	}
	public Process getProcess() {
		return (Process)this.advice;
	}

}
