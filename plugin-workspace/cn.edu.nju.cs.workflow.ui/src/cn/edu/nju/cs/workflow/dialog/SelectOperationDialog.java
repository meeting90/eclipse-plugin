package cn.edu.nju.cs.workflow.dialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.wst.wsdl.Operation;
import cn.edu.nju.cs.workflow.provider.OperationLabelProvider;

public class SelectOperationDialog extends SelectionDialog{

	
	
	TableViewer operationViewer;
	OperationLabelProvider operationProvider;
	Shell shell;
	Operation []operations;
	Operation result=null;
    private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
    private final static int SIZING_SELECTION_WIDGET_WIDTH = 500;
    public SelectOperationDialog(Shell parentShell, Operation[] input,
    		OperationLabelProvider labelProvider) {
        super(parentShell);
        operations=input;
        operationProvider=labelProvider;
        setTitle(" Opeartion selection");
		setMessage("Select an Opeartion Of this Service");
    }
    @SuppressWarnings("unused")
	private void checkInitialSelections() {
   
    }

   
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
     
    }
    protected Control createDialogArea(Composite parent) {
    	 Composite composite = (Composite)super.createDialogArea(parent);
         initializeDialogUnits(composite);
         operationViewer=new TableViewer(composite, SWT.BORDER|SWT.SINGLE); 
		 GridData data = new GridData(GridData.FILL_BOTH);
		 data.heightHint = SIZING_SELECTION_WIDGET_HEIGHT;
		 data.widthHint = SIZING_SELECTION_WIDGET_WIDTH;
		 operationViewer.getTable().setLayoutData(data);
		 operationViewer.setLabelProvider(operationProvider);
		 operationViewer.setContentProvider(new ArrayContentProvider());
		 operationViewer.setInput(operations);
		
		 Dialog.applyDialogFont(composite);
	    return composite;
    }
  
    protected void okPressed() {    	 
    	TableItem [] tableItem=operationViewer.getTable().getSelection();
    	if(tableItem!=null){
    		result=(Operation) tableItem[0].getData();
    	}
    	super.okPressed();
    }
    public Operation getOperation(){
    	return result;
    }
		

}
