package cn.edu.nju.cs.workflow.dialog;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Variables;
import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;

import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;

import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.provider.VariableProvider;

public class OrderEditSupport extends EditingSupport {
	Assign assign;
	Variables variables;
	VariableProvider variableProvider;
	ExpressionUtil expressionUtil;
	BPELComponentGenerator bpelGen;
	private ComboBoxViewerCellEditor cellEditor = null;
	@SuppressWarnings("deprecation")
	public OrderEditSupport(TreeViewer  viewer,BPELComponentGenerator bpelGen,Assign assign) {
		super(viewer);
		
        this.variableProvider=(VariableProvider) viewer.getContentProvider();
        this.assign=assign;
        this.bpelGen=bpelGen;
        this.expressionUtil=new ExpressionUtil(variableProvider);
        cellEditor = new ComboBoxViewerCellEditor(viewer.getTree(),SWT.OPEN);
		
        cellEditor.setLabelProvider( new LabelProvider() );
        cellEditor.setContenProvider( new ArrayContentProvider() );
        ((CCombo)cellEditor.getControl()).setListVisible(true);
	}

	private Object getInput() {
		// TODO Auto-generated method stub
		int len=assign.getCopy().size();
		String []candidateInput=new String[len];
		for(int i=0;i<len;i++){
			candidateInput[i]=i+"";
		}
		return candidateInput;
	}
	
	
	@Override
	protected CellEditor getCellEditor(Object element) {
		// TODO Auto-generated method stub
		((CCombo)cellEditor.getControl()).setText(getValue(element).toString());
		cellEditor.setInput(getInput());
		
		return cellEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		// TODO Auto-generated method stub
		if(!(element instanceof ITreeNode)) return false;
		return !getValue(element).equals("-1");
	}

	@Override
	protected Object getValue(Object element) {
		// TODO Auto-generated method stub
		if (!(element instanceof ITreeNode)) return "-1";		
		return expressionUtil.getCopyOrder(assign, element)+"";
	}

	@Override
	protected void setValue(Object element, Object value) {
		// TODO Auto-generated method stub
		if (value == null){
			try{
				value =((CCombo)cellEditor.getControl()).getText();
			}
			catch(Exception e){
					return;
			}
		}
	
		if(value instanceof Integer){

			bpelGen.reorderCopyNode(assign, Integer.valueOf((String)getValue(element)), Integer.valueOf((String)value));
		}
		getViewer().refresh();
		
	}

}
