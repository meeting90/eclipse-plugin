package cn.edu.nju.cs.workflow.dialog;


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
	
	@SuppressWarnings("deprecation")
	public ComboEditingSupport(TreeViewer viewer,BPELComponentGenerator bpelGen,Assign assign) {
		super(viewer);
        cellEditor = new ComboBoxViewerCellEditor(viewer.getTree());
        cellEditor.setLabelProvider( new LabelProvider() );
        cellEditor.setContenProvider( new ArrayContentProvider() );
        this.variableProvider=(VariableProvider) viewer.getContentProvider();
        this.assign=assign;
        this.bpelGen=bpelGen;
        expressionUtil=new ExpressionUtil(variableProvider);
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
			return expressionUtil.getOldExpression(assign, element);
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (value == null)
			value = ((CCombo)cellEditor.getControl()).getText();
		Copy copy=expressionUtil.getOldCopyExpression(assign, element);
		if(copy==null)
			bpelGen.createCopyNode(assign, value.toString(), expressionUtil.element2XpathExpression(element));
		else
			bpelGen.replaceCopyNode(copy, value.toString(), expressionUtil.element2XpathExpression(element));		
		getViewer().update(element, null);  
		
	}

	

	
	
	

	
}
