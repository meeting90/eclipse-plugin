package cn.edu.nju.cs.workflow.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.List;

import org.eclipse.bpel.common.wsdl.helpers.UriAndUrlHelper;

import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;



public class NewWorkflowFromWSDLWizardPage extends WizardPage{

	public static final String PAGE_NAME = "workflow-wsdl-page";
	private String processName;
	private String wsdlUrl;
	protected NewWorkflowFromWSDLWizardPage() {
		super(PAGE_NAME);
		setTitle( "Create Trust Workflow");
		setDescription("Create Trust Workflow from WSDL" );
	}
	private void createContent(Composite parent){
        Composite projectGroup = new Composite(parent, SWT.NONE);
		
		projectGroup.setLayout( new GridLayout(2,false));
		projectGroup.setLayoutData( new GridData( GridData.FILL_BOTH));

		
		Label label = new Label( projectGroup, SWT.NONE );
		label.setText( "WSDL URL:" );
		label.setToolTipText( "Select the Web Service Discription File." );
		
		Composite wsdlLayout=new Composite(projectGroup,SWT.NONE);
		wsdlLayout.setLayout(new GridLayout(2,false));
		wsdlLayout.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final Text wsdlUrlText=new Text(wsdlLayout, SWT.BORDER | SWT.SINGLE);
		wsdlUrlText.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		if(this.wsdlUrl!=null)
			wsdlUrlText.setText(this.wsdlUrl);
		wsdlUrlText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				// TODO Auto-generated method stub
				NewWorkflowFromWSDLWizardPage.this.wsdlUrl= ((Text) e.widget).getText();
				updateStatus();
				
			}
		});
		Button button =new Button(wsdlLayout,SWT.NONE);
		button.setText("select...");
		button.setLayoutData(new GridData(GridData.END));
		button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				widgetDefaultSelected( e );
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				IFile currentWsdl = null;
				if( NewWorkflowFromWSDLWizardPage.this.wsdlUrl != null ) {
					try {
						java.net.URI uri = UriAndUrlHelper.urlToUri( NewWorkflowFromWSDLWizardPage.this.wsdlUrl );
						File f = new File( uri );
						IPath path = new Path( f.getAbsolutePath());
						currentWsdl = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation( path );

					} catch( Exception e1 ) {
						BPELUIPlugin.log( e1, IStatus.WARNING );
					}
				}

				// Open a dialog that only shows the WSDL files in the workspace - and their ancestors/containers
				final List<IFile> workspaceWsdlFiles = getFiles( "wsdl", Arrays.asList( ResourcesPlugin.getWorkspace().getRoot()));
				ElementTreeSelectionDialog dlg = new ElementTreeSelectionDialog(
						getShell(),
						new WorkbenchLabelProvider(),
						new WorkbenchContentProvider() {

							@Override
							public Object[] getChildren( Object element ) {

								Object[] result = super.getChildren( element );
								if( result == null )
									result = new Object[ 0 ];

								List<Object> filteredResult = new ArrayList<Object>();
								for( Object o : result ) {
									if( o instanceof IFile
											&& workspaceWsdlFiles.contains( o ))
										filteredResult.add( o );

									else if( o instanceof IContainer ) {
										IPath containerPath = ((IContainer) o).getFullPath();
										for( IFile wsdlFile : workspaceWsdlFiles ) {
											if( containerPath.isPrefixOf( wsdlFile.getFullPath())) {
												filteredResult.add( o );
												break;
											}
										}
									}
								}

								return filteredResult.toArray();
							}
				});

				dlg.setInput( ResourcesPlugin.getWorkspace().getRoot());
				dlg.setTitle( "WSDL Selection" );
				dlg.setMessage( "Select a WSDL file located in the workspace." );
				if( currentWsdl != null )
					dlg.setInitialElementSelections( Arrays.asList( currentWsdl ));

				// Open it and update the text widget if necessary
				if( dlg.open() == Window.OK ) {
					IFile selectedFile = (IFile) dlg.getResult()[ 0 ];
					wsdlUrlText.setText( selectedFile.getLocation().toFile().toURI().toString());
					wsdlUrlText.notifyListeners( SWT.Traverse, new Event());
				}
			}
				
			
		});
		

	
		// Add the other common widgets
		Label l = new Label( projectGroup, SWT.NONE );
		l.setText( "Workflow name" );
		l.setToolTipText( "The name of the workflow" );

		Text processNameText = new Text( projectGroup, SWT.BORDER | SWT.SINGLE );
		processNameText.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		if( this.processName != null )
			processNameText.setText( this.processName );

		processNameText.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				NewWorkflowFromWSDLWizardPage.this.processName = ((Text) e.widget).getText();
				updateStatus();
			}
		});

    }
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage
	 * #createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl( Composite parent ) {
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setFont(parent.getFont());

		initializeDialogUnits(parent);

		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		createContent(composite);
		setControl(composite);
		
	}


	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public String getWsdlUrl() {
		return wsdlUrl;
	}
	public void setWsdlUrl(String wsdlUrl) {
		this.wsdlUrl = wsdlUrl;
	}
	/**
	 * Validates the page data and updates the page state in consequence.
	 */
	private void updateStatus() {
		String errorMsg = validatePage();
		setPageComplete( errorMsg == null );
		setErrorMessage( errorMsg );
	}


	/**
	 * Validates the page data and stores valid values for further use.
	 * @return an error message or null if everything is right
	 */
	private String validatePage() {

		String errorMsg = null;

		// Validate the page fields
		IStatus nameStatus;
		if(this.wsdlUrl==null||this.wsdlUrl.trim().length() == 0)
			errorMsg="You have to select the wsdl file.";
		
		else if( this.processName == null || this.processName.trim().length() == 0 )
			errorMsg = "You have to specify the workflow name.";

		else if( this.processName.matches( "\\s" ))
			errorMsg = "The workflow name cannot contain spaces or white characters.";

		else if( ! ( nameStatus = ResourcesPlugin.getWorkspace().validateName( this.processName, IResource.FILE )).isOK())
			errorMsg = nameStatus.getMessage();
		
		


		

//
//		// Save some fields for further use
//		IDialogSettings settings = getWizard().getDialogSettings();
//		if( settings != null )
//			settings.put( NewBpelFileWizard.DIALOG_SETTINGS_PROCESS_NAME, this.processName );

		return errorMsg;
	}
	/**
	 * Gets all the files whose extension is <b>extension</b> and present in <b>containers</b>.
	 * @param extension the file extension. Use "*" for any extension. Not null.
	 * @param containers the containers to explore
	 * @return all the IFile contained into this container (with no limit in the level).
	 */
	private static List<IFile> getFiles( String extension, Collection<? extends IContainer> containers ) {

		List<IFile> result = new ArrayList<IFile> ();
		if( containers == null )
			return result;

		for( IContainer container : containers ) {
			try {
				IResource[] resources = container.members();
				for( IResource resource : resources ) {
					switch( resource.getType()) {

					case IResource.FILE:
						if( "*".equals( extension )
									|| extension.equalsIgnoreCase( resource.getFileExtension()))
							result.add((IFile) resource);
						break;

					case IResource.FOLDER:
						IFolder subFolder = (IFolder) resource;
						result.addAll( getFiles( extension, Arrays.asList( subFolder )));
						break;

					case IResource.PROJECT:
						IProject project = (IProject) resource;
						if( project.isAccessible())
							result.addAll( getFiles( extension, Arrays.asList( project )));
						break;

					default:
						break;
					}
				}

			} catch( CoreException e ) {
				BPELUIPlugin.log( e, IStatus.ERROR );
			}
		}

		return result;
	}
	

	@Override
	public void dispose() {



		super.dispose();
	}



}
