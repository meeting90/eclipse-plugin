package cn.edu.nju.cs.workflow.dialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
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
	CCombo combo;
	OperationLabelProvider operationProvider;
	Shell shell;
	Operation []operations;
	Operation result=null;
	Boolean isInvoke=true;
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
		 
		 combo=createCombo(composite);
		 
		 Dialog.applyDialogFont(composite);
	    return composite;
    }
    protected CCombo createCombo(Composite parent) {
       CCombo combo = new CCombo(parent, SWT.FLAT | SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
       combo.add("Receive");
       combo.add("Invoke");
      
        combo.addSelectionListener(new SelectionListener() {
                public void widgetSelected(SelectionEvent e) {
                    
                }
                public void widgetDefaultSelected(SelectionEvent e) {
                    widgetSelected(e);
                }
        });
        return combo;
    }
    protected static void configureLayout(Control c, FormAttachment left, FormAttachment top, FormAttachment right, FormAttachment bottom) {
        FormData fd = new FormData();
        if (left != null) {
            fd.left = left;
        }
        if (top != null) {
            fd.top = top;
        }
        if (right != null) {
            fd.right = right;
        }
        if (bottom != null) {
            fd.bottom = bottom;
        }
        c.setLayoutData(fd);
    }
    protected void okPressed() {    	 
    	TableItem [] tableItem=operationViewer.getTable().getSelection();
    	if(tableItem!=null){
    		result=(Operation) tableItem[0].getData();
    	}
    	if(combo.getText().equals("Receive"))
    		isInvoke=false;
    	super.okPressed();
    }
    public Operation getOperation(){
    	return result;
    }
    public boolean getIsInvoke(){
    	return isInvoke;
    }
		

}
