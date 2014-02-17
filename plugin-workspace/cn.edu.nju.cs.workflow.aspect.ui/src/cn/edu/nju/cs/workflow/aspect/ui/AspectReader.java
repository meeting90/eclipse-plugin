package cn.edu.nju.cs.workflow.aspect.ui;



import java.util.Collections;

import org.eclipse.bpel.common.extension.model.ExtensionMap;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import cn.edu.nju.cs.workflow.aspect.model.AspectFactory;
import cn.edu.nju.cs.workflow.aspect.model.Aspects;




public class AspectReader  {



	protected Resource aspectsResource;
	protected Resource extensionsResource;
	protected Aspects aspects;
	protected ExtensionMap extensionMap;

	/**
	 * Another public method for those who want to get the process resource
	 * by their own means (such as the editor).
	 */
	public void read(Resource aspectsResource, IFile modelFile, ResourceSet resourceSet) {
		// TODO: These two lines are a workaround for https://bugs.eclipse.org/bugs/show_bug.cgi?id=72565
		EcorePackage instance = EcorePackage.eINSTANCE;
		instance.eAdapters();

		this.aspectsResource = aspectsResource;

		IPath extensionsPath = modelFile.getFullPath().removeFileExtension().addFileExtension(IBPELUIConstants.EXTENSION_MODEL_EXTENSIONS);
		URI extensionsUri = URI.createPlatformResourceURI(extensionsPath.toString());
		IFile extensionsFile = ResourcesPlugin.getWorkspace().getRoot().getFile(extensionsPath);

		try {
			aspectsResource.load(Collections.EMPTY_MAP);
			EList<EObject> contents = aspectsResource.getContents();
			if (!contents.isEmpty())
				this.aspects=(Aspects) contents.get(0);
		} catch (Exception e) {
			AspectUIPlugin.log(e);
		}
		

		if (this.aspects == null) {
			this.aspects = AspectFactory.eINSTANCE.createAspects();
			aspectsResource.getContents().add(this.aspects);
		}
		
	
	}



	public Aspects getAspects() {
		return this.aspects;
	}
}

