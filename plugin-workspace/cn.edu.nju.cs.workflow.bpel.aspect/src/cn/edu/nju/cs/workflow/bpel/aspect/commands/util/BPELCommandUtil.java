package cn.edu.nju.cs.workflow.bpel.aspect.commands.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.bpel.ui.commands.util.AutoUndoCommand;
import org.eclipse.wst.wsdl.WSDLElement;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;

import cn.edu.nju.cs.workflow.bpel.aspect.resource.AspectResource;
import cn.edu.nju.cs.workflow.model.aspect.Advice;

@SuppressWarnings("restriction")
public class BPELCommandUtil {
	AutoUndoCommand command;
	public BPELCommandUtil(AutoUndoCommand command){
		this.command=command;
	}
	
	private   void beginRecording(Object element) {
		if (element instanceof IDOMNode) {			
			IDOMModel model = ((IDOMNode) element).getModel();
			model.aboutToChangeModel();
			model.beginRecording(command,
					command.getLabel());
		}
	}

	private   void endRecording(Object element) {
		if (element instanceof IDOMNode) {
			IDOMModel model = ((IDOMNode) element).getModel();
			model.changedModel();
			model.endRecording(command);
		}
	}
	
	private Object calculateLeastCommonAncestor() {
		Object[] roots = command.getModelRoots().toArray();
		if (roots.length == 0) {
			return null;
		}
		if (roots.length == 1) {
			return ((WSDLElement)roots[0]).getElement();
		}
		Integer worms = roots.length;
		HashMap<Object, Integer> wormed = new HashMap<Object, Integer>();
		Set<WSDLElement> old = new HashSet<WSDLElement>();
		Set<WSDLElement> current = new HashSet<WSDLElement>();
		for (Object node : roots) {
			wormed.put(node, 1);
			current.add((WSDLElement)node);
		}
		while (true) {
			Set<WSDLElement> temp = old;
			old = current;
			current = temp;
			current.clear();
			for (WSDLElement node : old) {
				if (node.getContainer() == null) {
					if (node instanceof Advice) {
						return ((Advice)node).getActivity();
					} else {
						continue;
					}
				}
				Integer count = wormed.get(node);
				if (count == null) {
					wormed.put(node, 1);
				} else if (worms.equals(count + 1)) {
					return node.getElement();
				} else if (count != null) {
					wormed.put(node, count + 1);
				}
				current.add(node.getContainer());
			}
			if (current.isEmpty()) {
				return ((AspectResource)((WSDLElement)roots[0]).eResource()).getAspects().getElement();
			}
		}		
	}

	public void autoUndoExecute() {
		if (command.canDoExecute()) {
			Object element = calculateLeastCommonAncestor();
			try {
				beginRecording(element);
				command.doExecute();
			} finally {
				endRecording(element);
			}
		}
	}

}
