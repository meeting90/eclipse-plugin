package cn.edu.nju.cs.workflow.ui.feature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractDrillDownFeature;

import cn.edu.nju.cs.workflow.model.CompoundTask;
public class DrillDownFeature extends AbstractDrillDownFeature{

	public DrillDownFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}
    @Override
    public String getName() {
        return "Open subworkflow";
    }
 
    @Override
    public String getDescription() {
        return "Open the subworkflow of this Task";
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        // first check, if one EClass is selected
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof CompoundTask) {
                // then forward to super-implementation, which checks if
                // this EClass is associated with other diagrams
                return super.canExecute(context);
            }
        }
        return false;
    }
	@Override
	protected Collection<Diagram> getDiagrams() {
		// TODO Auto-generated method stub
		 Collection<Diagram> result = Collections.emptyList();
	       Resource resource = getDiagram().eResource();
	       URI uri = resource.getURI();
	       URI uriTrimmed = uri.trimFragment();
	       if (uriTrimmed.isPlatformResource()){
	           String platformString = uriTrimmed.toPlatformString(true);
	           IResource fileResource = ResourcesPlugin.getWorkspace()
	             .getRoot().findMember(platformString);
	           if (fileResource != null){
	               IProject project = fileResource.getProject();
	               final List<IFile> files = getDiagramFiles(project);
	               final List<Diagram> diagramList = new ArrayList<Diagram>();
	               final ResourceSet rSet = new ResourceSetImpl();
	               for (final IFile file : files) {
	                    final Diagram diagram = getDiagramFromFile(file, rSet);
	                    if (diagram != null) {
	                        diagramList.add(diagram);
	                    }
	               }
	               result = diagramList;
	           }
	       }
	       return result;  
	}
   
     
   private  Diagram getDiagramFromFile(IFile file, 
                                               ResourceSet resourceSet) {
        // Get the URI of the model file.
        final URI resourceURI = getFileURI(file, resourceSet);
        // Demand load the resource for this file.
        Resource resource;
        try {
             resource = resourceSet.getResource(resourceURI, true);
             if (resource != null) {
             // does resource contain a diagram as root object?
             final EList<EObject> contents = resource.getContents();
             for (final EObject object : contents) {
                  if (object instanceof Diagram) {
                      return (Diagram) object;
                  }
              }
        }
        } catch (final WrappedException e) {
                 e.printStackTrace();
        }
        return null;
     }
   private  List<IFile> getDiagramFiles(IContainer folder) {
         final List<IFile> ret = new ArrayList<IFile>();
        try {
             final IResource[] members = folder.members();
             for (final IResource resource : members) {
                  if (resource instanceof IContainer) {
                      ret.addAll(getDiagramFiles((IContainer) resource));
                  } else if (resource instanceof IFile) {
                      final IFile file = (IFile) resource;
                      if (file.getName().endsWith(".diagram")) {
                           ret.add(file);
                      }
                  }
             }
        } catch (final CoreException e) {
                 e.printStackTrace();
        }
        return ret;
     }

   private static URI getFileURI(IFile file, ResourceSet resourceSet) {
        final String pathName = file.getFullPath().toString();
        URI resourceURI = URI.createFileURI(pathName);
        resourceURI = resourceSet.getURIConverter().normalize(resourceURI);
        return resourceURI;
     }
	

}
