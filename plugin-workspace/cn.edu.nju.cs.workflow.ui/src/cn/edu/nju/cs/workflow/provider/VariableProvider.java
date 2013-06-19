package cn.edu.nju.cs.workflow.provider;

import java.util.ArrayList;

import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.details.providers.ModelTreeContentProvider;
import org.eclipse.bpel.ui.details.tree.BPELVariableTreeNode;


public class VariableProvider extends ModelTreeContentProvider{
    Variable [] vars;
	public VariableProvider(boolean isCondensed,Variable[] vars) {
		super(isCondensed);
		this.vars=vars;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object[] primGetElements(Object node) {
		// TODO Auto-generated method stub
	
		// TODO: can this code be moved to a filter?
		ArrayList<Object> result = new ArrayList<Object>( vars.length );
		for (Variable v : vars) {
			result.add(new BPELVariableTreeNode(v, isCondensed, false, false));
		}				
		return result.toArray();
	}
	
	
	

}
