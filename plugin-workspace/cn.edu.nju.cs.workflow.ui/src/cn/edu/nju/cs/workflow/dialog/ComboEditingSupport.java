package cn.edu.nju.cs.workflow.dialog;


import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.Expression;
import org.eclipse.bpel.model.From;
import org.eclipse.bpel.model.Query;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.model.Variables;

import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.bpel.ui.util.BPELUtil;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.wst.wsdl.Definition;
import org.eclipse.wst.wsdl.Message;

import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class ComboEditingSupport extends EditingSupport{
	private ComboBoxViewerCellEditor cellEditor = null;
	Variables variables;
	VariableProvider variableProvider;
	Assign assign;
	ExpressionUtil expressionUtil;
	
	@SuppressWarnings("deprecation")
	public ComboEditingSupport(TreeViewer viewer,Assign assign) {
		super(viewer);
        cellEditor = new ComboBoxViewerCellEditor(viewer.getTree());
        cellEditor.setLabelProvider( new LabelProvider() );
        cellEditor.setContenProvider( new ArrayContentProvider() );
        this.variableProvider=(VariableProvider) viewer.getContentProvider();
        this.assign=assign;
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

		From from=BPELFactory.eINSTANCE.createFrom();
		Expression expression=BPELFactory.eINSTANCE.createExpression();
		
		expression.setBody(value.toString());
		from.setExpression(expression);

		String xpathExpression=expressionUtil.element2XpathExpression(element);
		expression=BPELFactory.eINSTANCE.createExpression();
		expression.setBody(xpathExpression);
		To to=BPELFactory.eINSTANCE.createTo();
		to.setExpression(expression);

		
		Copy copy=BPELFactory.eINSTANCE.createCopy();
		copy.setFrom(from);
		copy.setTo(to);
		assign.getCopy().add(copy);
		getViewer().update(element, null);  
		
	}

	

	
	
	

	
}
