package cn.edu.nju.cs.workflow.dialog;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.From;
import org.eclipse.bpel.model.Query;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.Variables;
import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.custom.CCombo;
import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class ComboEditingSupport extends EditingSupport{
	private ComboBoxViewerCellEditor cellEditor = null;
	Variables variables;
	VariableProvider variableProvider;
	Assign assign;
	
	@SuppressWarnings("deprecation")
	public ComboEditingSupport(TreeViewer  viewer,Assign assign) {
		super(viewer);
        cellEditor = new ComboBoxViewerCellEditor(viewer.getTree());
        cellEditor.setLabelProvider( new LabelProvider() );
        cellEditor.setContenProvider( new ArrayContentProvider() );
        this.variableProvider=(VariableProvider) viewer.getContentProvider();
        this.assign=assign;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		// TODO Auto-generated method stub
		 return cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if (!(element instanceof ITreeNode)) return null;		
		Object[] nodes=variableProvider.getPathToRoot(element);
		String queryPath="";
		for(int i=0;i<nodes.length;i++){
			ITreeNode treeNode = (ITreeNode)nodes[i];
			if(i==0)
				queryPath+="$";
			else
				queryPath+=".";
			queryPath+=treeNode.getLabel();
		}
		EList<Copy> copys=assign.getCopy();
		
		for(int i=0;i<copys.size();i++){
			System.out.println(copys.get(i).toString());
			if(queryPath.equals(copys.get(i).getTo().getQuery().getValue())){
				
				return copys.get(i).getFrom().getQuery().getValue();
			}
		}
		
		return "";
	}

	@Override
	protected void setValue(Object element, Object value) {
		Object[] nodes=variableProvider.getPathToRoot(element);
		String queryPath="";
		for(int i=0;i<nodes.length;i++){
			ITreeNode treeNode = (ITreeNode)nodes[i];
			if(i==0)
				queryPath+="$";
			else
				queryPath+=".";
			queryPath+=treeNode.getLabel();
		}
		
		Query fromQuery=BPELFactory.eINSTANCE.createQuery();
		if (value == null)
			value = ((CCombo)cellEditor.getControl()).getText();
		fromQuery.setValue(value.toString());
		From from=BPELFactory.eINSTANCE.createFrom();
		from.setQuery(fromQuery);
		
		Query toQuery=BPELFactory.eINSTANCE.createQuery();
		toQuery.setValue(queryPath);
		To to=BPELFactory.eINSTANCE.createTo();
		to.setQuery(toQuery);
		
		Copy copy=BPELFactory.eINSTANCE.createCopy();
		copy.setFrom(from);
		copy.setTo(to);
		assign.getCopy().add(copy);
		getViewer().update(element, null);  
		
	}

}
