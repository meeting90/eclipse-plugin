package cn.edu.nju.cs.workflow.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.wst.wsdl.Operation;

public class OperationLabelProvider extends LabelProvider{
	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		Operation operation=(Operation)element;
		return super.getText(operation.getName());
	}

}
