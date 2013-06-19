package cn.edu.nju.cs.workflow.dialog;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Variables;

import org.eclipse.bpel.ui.details.tree.ITreeNode;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.custom.CCombo;

import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class ComboEditingSupport extends EditingSupport{
	private ComboBoxViewerCellEditor cellEditor = null;
	Variables variables;
	VariableProvider variableProvider;
	Assign assign;
	ExpressionUtil expressionUtil;
	BPELComponentGenerator bpelGen;
	Map<String,ArrayList<String>> candidateMap;
	
	@SuppressWarnings("deprecation")
	public ComboEditingSupport(TreeViewer viewer,BPELComponentGenerator bpelGen,Assign assign, Map<String, ArrayList<String>> map) {
		super(viewer);
        cellEditor = new ComboBoxViewerCellEditor(viewer.getTree());
        cellEditor.setLabelProvider( new LabelProvider());
        cellEditor.setContenProvider( new ArrayContentProvider() );
        this.variableProvider=(VariableProvider) viewer.getContentProvider();
        this.assign=assign;
        this.bpelGen=bpelGen;
        this.candidateMap=map;
        expressionUtil=new ExpressionUtil(variableProvider);
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		// TODO Auto-generated method stub
		((CCombo)cellEditor.getControl()).setText(getValue(element).toString());
		 ArrayList<String> expr=candidateMap.get(expressionUtil.element2XpathExpression(element));
		 
		 if(expr!=null &&!expr.isEmpty()){
		
			 cellEditor.setInput(expr.toArray(new String[expr.size()]));
		 }else{
			 cellEditor.setInput(null);
		 }
		 
		 return cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		if (!(element instanceof ITreeNode)) return "";
		return expressionUtil.getOldExpression(assign, element);
	}

	@Override
	protected void setValue(Object element, Object value) {
	
		if (value == null){	
			value = ((CCombo)cellEditor.getControl()).getText();
		}
		if(value.equals(""))
			return;
	
		List<Copy> copys=expressionUtil.getRelatedCopyExpressions(assign, element);
		if(copys.isEmpty())
			bpelGen.createCopyNode(assign, value.toString(), expressionUtil.element2XpathExpression(element));
		else
			bpelGen.replaceCopyNode(copys, value.toString(), expressionUtil.element2XpathExpression(element));	
		
		getViewer().update(element, null);  
		getViewer().refresh();
		
	}

	

	
	
	

	
}
