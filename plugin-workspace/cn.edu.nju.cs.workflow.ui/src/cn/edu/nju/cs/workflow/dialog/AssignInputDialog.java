package cn.edu.nju.cs.workflow.dialog;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;


import cn.edu.nju.cs.workflow.bpel.BPELComponentGenerator;
import cn.edu.nju.cs.workflow.provider.VariableProvider;
public class AssignInputDialog extends Dialog{
	TreeViewer fVariableViewer;
	VariableProvider variableContentProvider;
	ExpressionUtil expressionUtil;
	Shell shell;
	Variable input;
	Map<String,ArrayList<String>> candidateMap;
	Assign assign;
	
	BPELComponentGenerator bpelGen;
	
	
    private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
    private final static int SIZING_SELECTION_WIDGET_WIDTH = 500;
    public AssignInputDialog(Shell parentShell, Variable input,Map<String,ArrayList<String>> map, BPELComponentGenerator bpelGen,Assign assign) {
        super(parentShell);
        this.input=input;
        this.candidateMap=map;
        this.assign=assign;
        this.bpelGen=bpelGen;
        
        
        
        
    }
    @SuppressWarnings("unused")
	private void checkInitialSelections() {
   //
    }

   
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
     
    }
  
    protected Control createDialogArea(Composite parent) {
    	 Composite composite = (Composite)super.createDialogArea(parent);
         initializeDialogUnits(composite);
		 fVariableViewer = new TreeViewer(composite, SWT.BORDER|SWT.FULL_SELECTION);
	
		 GridData data = new GridData(GridData.FILL_VERTICAL);
		 data.heightHint = SIZING_SELECTION_WIDGET_HEIGHT;
		 data.widthHint = SIZING_SELECTION_WIDGET_WIDTH;
		 
		 fVariableViewer.getTree().setLayoutData(data);
		 fVariableViewer.getTree().setLinesVisible(true);
		 fVariableViewer.getTree().setHeaderVisible(true);
		 
		 
		 TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(fVariableViewer,new FocusCellOwnerDrawHighlighter(fVariableViewer));
		 ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(fVariableViewer) {
				protected boolean isEditorActivationEvent(
						ColumnViewerEditorActivationEvent event) {
					return event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
							|| event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION
							|| (event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && event.keyCode == SWT.CR)
							|| event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC;
				}
			};
		 TreeViewerEditor.create(fVariableViewer, focusCellManager, actSupport, ColumnViewerEditor.TABBING_HORIZONTAL
					| ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR
					| ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
		variableContentProvider = new VariableProvider(true,new Variable[]{input});
		fVariableViewer.setContentProvider(variableContentProvider);
		fVariableViewer.expandAll();
		expressionUtil=new ExpressionUtil(variableContentProvider);
			
		TreeViewerColumn column = new TreeViewerColumn(fVariableViewer, SWT.NONE);
		column.getColumn().setWidth( SIZING_SELECTION_WIDGET_WIDTH/2);
		column.getColumn().setMoveable(false);
		column.getColumn().setText("Input");
		column.setLabelProvider(new ColumnLabelProvider() {

				public String getText(Object node) {
					if (!(node instanceof ITreeNode)) return null;
					ITreeNode treeElement = (ITreeNode)node;
					String s1 = treeElement.getLabel();
					String s2 = treeElement.getLabelSuffix();
					if (s2 != null){
						return NLS.bind(Messages.ModelTreeLabelProvider_s1_s2, (new String[] {s1, s2})); 
					}
					return s1;
				}

			});
			
		column = new TreeViewerColumn(fVariableViewer, SWT.NONE);
		column.getColumn().setWidth(SIZING_SELECTION_WIDGET_WIDTH/2);
		column.getColumn().setMoveable(false);
		column.getColumn().setText("Value");
			
		column.setLabelProvider(new ColumnLabelProvider() {
				public String getText(Object node) {
					if (!(node instanceof ITreeNode)) return null;	
					return expressionUtil.getOldExpression(assign, node);

				}

			});
		column.setEditingSupport(new ComboEditingSupport(fVariableViewer,bpelGen,assign,candidateMap));
//		column= new TreeViewerColumn(fVariableViewer, SWT.NONE);
//		column.getColumn().setWidth(SIZING_SELECTION_WIDGET_WIDTH/3);
//		column.getColumn().setMoveable(false);
//		column.getColumn().setText("order");
//		column.setLabelProvider(new ColumnLabelProvider(){
//			@Override
//			public String getText(Object node) {
//				// TODO Auto-generated method stub
//				if(!(node instanceof ITreeNode)) return null;
//				return expressionUtil.getCopyOrder(assign, node)+"";
//			}
//			
//		});
//		
//		column.setEditingSupport(new OrderEditSupport(fVariableViewer,bpelGen,assign));
//		
		fVariableViewer.setInput(input);
		fVariableViewer.expandAll();
		Dialog.applyDialogFont(composite);
	    return composite;
    }
   
    protected void okPressed() {
      super.okPressed();
    }
    

}
