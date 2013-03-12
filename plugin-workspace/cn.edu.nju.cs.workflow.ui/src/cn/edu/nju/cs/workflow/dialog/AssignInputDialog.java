package cn.edu.nju.cs.workflow.dialog;

import org.eclipse.bpel.model.Assign;
import org.eclipse.bpel.model.BPELFactory;
import org.eclipse.bpel.model.Copy;
import org.eclipse.bpel.model.From;
import org.eclipse.bpel.model.Query;
import org.eclipse.bpel.model.To;
import org.eclipse.bpel.model.Variable;
import org.eclipse.bpel.ui.Messages;
import org.eclipse.bpel.ui.details.tree.ITreeNode;
import org.eclipse.bpel.ui.properties.VariablePartAssignCategory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.TextCellEditor;
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


import cn.edu.nju.cs.workflow.provider.VariableProvider;
public class AssignInputDialog extends Dialog{
	TreeViewer fVariableViewer;
	VariableProvider variableContentProvider;
	Shell shell;
	Variable input;
	Variable []candidateInputs;
	Assign assign;
    private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
    private final static int SIZING_SELECTION_WIDGET_WIDTH = 500;
    public AssignInputDialog(Shell parentShell, Variable input,Variable[] candidateInputs, Assign assign) {
        super(parentShell);
        this.input=input;
        this.candidateInputs=candidateInputs;
        this.assign=assign;
    }
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
		final TextCellEditor cellEditor=new TextCellEditor(fVariableViewer.getTree());
		variableContentProvider = new VariableProvider(true,new Variable[]{input});
		fVariableViewer.setContentProvider(variableContentProvider);
			
		TreeViewerColumn column = new TreeViewerColumn(fVariableViewer, SWT.NONE);
		column.getColumn().setWidth( SIZING_SELECTION_WIDGET_WIDTH/2);
		column.getColumn().setMoveable(true);
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
		column.getColumn().setMoveable(true);
		column.getColumn().setText("Value");
			
		column.setLabelProvider(new ColumnLabelProvider() {
				public String getText(Object node) {
					if (!(node instanceof ITreeNode)) return null;	
					Object[] nodes=variableContentProvider.getPathToRoot(node);
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
						if(queryPath.equals(copys.get(i).getTo().getQuery().getValue()))
							return copys.get(i).getFrom().getQuery().getValue();
					}
					
					return "";
				}

			});
//		column.setEditingSupport(new EditingSupport(fVariableViewer) {
//			
//			@Override
//			protected void setValue(Object element, Object value) {
//				// TODO Auto-generated method stub
//				Object[] nodes=variableContentProvider.getPathToRoot(element);
//				String queryPath="";
//				for(int i=0;i<nodes.length;i++){
//					ITreeNode treeNode = (ITreeNode)nodes[i];
//					if(i==0)
//						queryPath+="$";
//					else
//						queryPath+=".";
//					queryPath+=treeNode.getLabel();
//				}
//				Query fromQuery=BPELFactory.eINSTANCE.createQuery();
//				fromQuery.setValue(value.toString());
//				From from=BPELFactory.eINSTANCE.createFrom();
//				from.setQuery(fromQuery);
//				
//				Query toQuery=BPELFactory.eINSTANCE.createQuery();
//				toQuery.setValue(queryPath);
//				To to=BPELFactory.eINSTANCE.createTo();
//				to.setQuery(toQuery);
//				
//				Copy copy=BPELFactory.eINSTANCE.createCopy();
//				copy.setFrom(from);
//				copy.setTo(to);
//				assign.getCopy().add(copy);
//				getViewer().update(element, null);  
//				
//			}
//			
//			@Override
//			protected Object getValue(Object element) {
//				// TODO Auto-generated method stub
//				System.out.println("getValue");
//				//if (!(element instanceof ITreeNode)) return null;		
//				Object[] nodes=variableContentProvider.getPathToRoot(element);
//				String queryPath="";
//				for(int i=0;i<nodes.length;i++){
//					ITreeNode treeNode = (ITreeNode)nodes[i];
//					if(i==0)
//						queryPath+="$";
//					else
//						queryPath+=".";
//					queryPath+=treeNode.getLabel();
//				}
//				EList<Copy> copys=assign.getCopy();
//				
//				for(int i=0;i<copys.size();i++){
//					System.out.println(copys.get(i).toString());
//					if(queryPath.equals(copys.get(i).getTo().getQuery().getValue())){
//						
//						return copys.get(i).getFrom().getQuery().getValue();
//					}
//				}
//				
//				return "";
//			}
//			
//			@Override
//			protected CellEditor getCellEditor(Object element) {
//				// TODO Auto-generated method stub
//				 return cellEditor;
//			}
//			
//			@Override
//			protected boolean canEdit(Object element) {
//				// TODO Auto-generated method stub
//				return true;
//			}
//		});
		column.setEditingSupport(new ComboEditingSupport(fVariableViewer, assign));
		fVariableViewer.setInput(input);
		Dialog.applyDialogFont(composite);
	    return composite;
    }
   
    protected void okPressed() {
      super.okPressed();
    }
}
