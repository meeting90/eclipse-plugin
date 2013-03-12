package cn.edu.nju.cs.workflow.ui.wizard;

/*******************************************************************************
 * Copyright (c) 2006, 2012 Oracle Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle Corporation
 *******************************************************************************/



import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.eclipse.bpel.model.util.BPELConstants;

import org.eclipse.bpel.ui.BPELUIPlugin;
import org.eclipse.bpel.ui.IBPELUIConstants;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IStatus;

import org.eclipse.graphiti.examples.common.Messages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.plugin.AbstractUIPlugin;


/**
 * The first page of the wizard to create a new BPEL process.
 * <p>
 * This page deals with the creation mode and the general properties of the BPEL to create.
 * </p>
 *
 * @author Michal Chmielewski - Oracle
 * @author Vincent Zurczak - EBM WebSourcing
 */
public class CreateWorkflowFirstPage extends WizardPage {



	/**
	 * The page's name, so that it can be referenced from other pages.
	 */
	public static final String PAGE_NAME = "workflow-first-page";

	/**
	 * The creation mode.
	 */
	private WorkflowCreationMode creationMode;

	/**
	 * The process name and name space.
	 */
	private String processName, processNamespace;

	/**
	 * True to create an abstract process, false otherwise.
	 */
	private boolean abstractProcess;

	/**
	 * The properties to pass to the template.
	 */
	private final Map<String,Object> processTemplateProperties;

	/**
	 * Images used in the wizard.
	 */
	private Image wsdlImg, arrowImg, bpelImg, tplImg;


	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	Text textField;

	
	/**
	 * Constructor.
	 */
	public CreateWorkflowFirstPage() {
		super( PAGE_NAME );

		setTitle( "Create Trust Workflow");
		setDescription("Create Trust Workflow " );
		//setImageDescriptor( BPELUIPlugin.INSTANCE.getImageDescriptor( IBPELUIConstants.ICON_WIZARD_BANNER ));

		this.processTemplateProperties = new HashMap<String,Object> ();
		try {
			ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin( BPELUIPlugin.PLUGIN_ID, "icons/misc/wsdl.png" );
			this.wsdlImg = desc.createImage();

		} catch( Exception e ) {
			BPELUIPlugin.log( e, IStatus.WARNING );
		}

		try {
			ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin( BPELUIPlugin.PLUGIN_ID, "icons/misc/bpel-skeleton-2.png" );
			this.bpelImg = desc.createImage();

		} catch( Exception e ) {
			BPELUIPlugin.log( e, IStatus.WARNING );
		}

		try {
			ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin( BPELUIPlugin.PLUGIN_ID, "icons/misc/arrow.png" );
			this.arrowImg = desc.createImage();

		} catch( Exception e ) {
			BPELUIPlugin.log( e, IStatus.WARNING );
		}

		try {
			ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin( BPELUIPlugin.PLUGIN_ID, "icons/misc/templates.png" );
			this.tplImg = desc.createImage();

		} catch( Exception e ) {
			BPELUIPlugin.log( e, IStatus.WARNING );
		}
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage
	 * #dispose()
	 */
	@Override
	public void dispose() {

		if( this.wsdlImg != null && ! this.wsdlImg.isDisposed())
			this.wsdlImg.dispose();

		if( this.arrowImg != null && ! this.arrowImg.isDisposed())
			this.arrowImg.dispose();

		if( this.bpelImg != null && ! this.bpelImg.isDisposed())
			this.bpelImg.dispose();

		if( this.tplImg != null && ! this.tplImg.isDisposed())
			this.tplImg.dispose();

		super.dispose();
	}
	private final void createProjectNameGroup(Composite parent) {
		// project specification group
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// new project label
		Label projectLabel = new Label(projectGroup, SWT.NONE);
		projectLabel.setText(Messages.DiagramNameWizardPage_Label);
		projectLabel.setFont(parent.getFont());

		// new project name entry field
		textField = new Text(projectGroup, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		textField.setLayoutData(data);
		textField.setFont(parent.getFont());

		
	}



	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.WizardPage
	 * #getNextPage()
	 */
	@Override
	public IWizardPage getNextPage() {

		IWizardPage nextPage;
		if( this.creationMode == WorkflowCreationMode.GENERATE_WORKFLOW_FROM_WSDL ){
			nextPage = getWizard().getPage( CreateWorkflowFromWSDLWizardPage.PAGE_NAME );
			nextPage.setPreviousPage( this );
			return nextPage;
		}
		else
			return null;
			

		
	}


	/**
	 * @return the abstractProcess
	 */
	public boolean isAbstractProcess() {
		return this.abstractProcess;
	}


	/**
	 * @return the properties for the templates
	 */
	public Map<String,Object> getProcessTemplateProperties() {
		return this.processTemplateProperties;
	}


	/**
	 * @return the creationMode
	 */
	public WorkflowCreationMode getCreationMode() {
		return this.creationMode;
	}

    private void createContent(Composite parent){
        Composite projectGroup = new Composite(parent, SWT.NONE);
		
		projectGroup.setLayout( new GridLayout(2,false));
		projectGroup.setLayoutData( new GridData( GridData.FILL_BOTH));

//		// new project label
//		Label projectLabel = new Label(projectGroup, SWT.NONE);
//		projectLabel.setText(Messages.DiagramNameWizardPage_Label);
//		projectLabel.setFont(parent.getFont());
//	

		// Add a combo to select the creation mode
		Label label = new Label( projectGroup, SWT.NONE );
		label.setText( "Creation Mode:" );
		label.setToolTipText( "Select the way to create a new workflow process" );

		final ComboViewer creationViewer = new ComboViewer( projectGroup, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY );
		creationViewer.setContentProvider( new ArrayContentProvider());
		creationViewer.setLabelProvider( new LabelProvider());
		creationViewer.setInput( WorkflowCreationMode.values());


		// Add the other common widgets
		Label l = new Label( projectGroup, SWT.NONE );
		l.setText( "Workflow name" );
		l.setToolTipText( "The name of the workflow process" );

		Text processNameText = new Text( projectGroup, SWT.BORDER | SWT.SINGLE );
		processNameText.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		if( this.processName != null )
			processNameText.setText( this.processName );

		processNameText.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				CreateWorkflowFirstPage.this.processName = ((Text) e.widget).getText();
				updateStatus();
			}
		});


		l = new Label( projectGroup, SWT.NONE );
		l.setText( "namespace" );
		l.setToolTipText( "The target namespace of the worklfow" );

		Combo processNamespaceCombo = new Combo( projectGroup, SWT.DROP_DOWN | SWT.SIMPLE );
		processNamespaceCombo.setLayoutData( new GridData( GridData.FILL_HORIZONTAL ));
		processNamespaceCombo.setItems( BPELUIPlugin.INSTANCE.getTemplates().getNamespaceNames());
		if( this.processNamespace != null )
			processNamespaceCombo.setText( this.processNamespace );

		processNamespaceCombo.addModifyListener( new ModifyListener() {
			@Override
			public void modifyText( ModifyEvent e ) {
				CreateWorkflowFirstPage.this.processNamespace = ((Combo) e.widget).getText();
				updateStatus();
			}
		});


//		new Label( container, SWT.NONE );
//		final Button abstractProcessButton = new Button( container, SWT.CHECK );
//		abstractProcessButton.setText( "Abstract Process" );
//		abstractProcessButton.setToolTipText( "Make the created process abstract" );
//		abstractProcessButton.addSelectionListener( new SelectionListener() {
//			@Override
//			public void widgetSelected( SelectionEvent e ) {
//				widgetDefaultSelected( e );
//			}
//
//			@Override
//			public void widgetDefaultSelected( SelectionEvent e ) {
//				CreateWorkflowFirstPage.this.abstractProcess = ((Button) e.widget).getSelection();
//				updateStatus();
//			}
//		});


		// Add an image to illustrate the creation mode
		Composite imageContainer = new Composite( projectGroup, SWT.BORDER );
		imageContainer.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_WHITE ));
		GridLayout layout = new GridLayout( 3, false );
		layout.horizontalSpacing = 0;
		layout.marginTop = 12;
		imageContainer.setLayout( layout );

		GridData layoutData = new GridData( GridData.FILL_HORIZONTAL );
		layoutData.horizontalSpan = 2;
		layoutData.verticalIndent = 21;
		imageContainer.setLayoutData( layoutData );

		final Label imgLeftLabel = new Label( imageContainer, SWT.NONE );
		imgLeftLabel.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_WHITE ));

		Label imgCenterLabel = new Label( imageContainer, SWT.NONE );
		imgCenterLabel.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_WHITE ));
		imgCenterLabel.setLayoutData( new GridData( SWT.CENTER, SWT.CENTER, true, true ));
		imgCenterLabel.setImage( this.arrowImg );

		Label imgRightLabel = new Label( imageContainer, SWT.NONE );
		imgRightLabel.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_WHITE ));
		imgRightLabel.setImage( this.bpelImg );

		final Text explainationText = new Text( imageContainer, SWT.MULTI | SWT.READ_ONLY | SWT.WRAP );
		explainationText.setBackground( getShell().getDisplay().getSystemColor( SWT.COLOR_WHITE ));
		layoutData = new GridData( GridData.FILL_HORIZONTAL  );
		layoutData.horizontalSpan = 3;
		layoutData.verticalIndent = 21;
		explainationText.setLayoutData( layoutData );


		// Detect when the creation mode changes
		creationViewer.addSelectionChangedListener( new ISelectionChangedListener() {
			@Override
			public void selectionChanged( SelectionChangedEvent event ) {
				CreateWorkflowFirstPage.this.creationMode = (WorkflowCreationMode) ((IStructuredSelection) creationViewer.getSelection()).getFirstElement();
				explainationText.setText( CreateWorkflowFirstPage.this.creationMode.getDescription());
				if( CreateWorkflowFirstPage.this.creationMode == WorkflowCreationMode.GENERATE_WORKFLOW_FROM_WSDL )
					imgLeftLabel.setImage( CreateWorkflowFirstPage.this.wsdlImg );
				else
					imgLeftLabel.setImage( CreateWorkflowFirstPage.this.tplImg );

				imgLeftLabel.getParent().layout();
				imgLeftLabel.getParent().getParent().layout();
				updateStatus();
			}
		});


		// Initialize all the stuff
		creationViewer.setSelection( new StructuredSelection( WorkflowCreationMode.CREATE_NEW_WORKFLOW ));
		creationViewer.getCombo().notifyListeners( SWT.Selection, new Event());
		if( getErrorMessage() != null ) {
			setPageComplete( false );
			setErrorMessage( null );
		}
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
		if( this.processName == null || this.processName.trim().length() == 0 )
			errorMsg = "You have to specify the process name.";

		else if( this.processName.matches( "\\s" ))
			errorMsg = "The process name cannot contain spaces or white characters.";

//		else if( ! ( nameStatus = ResourcesPlugin.getWorkspace().validateName( this.processName, IResource.FILE )).isOK())
//			errorMsg = nameStatus.getMessage();
//
//		else if( this.processNamespace == null || this.processNamespace.trim().length() == 0 )
//			errorMsg = "You have to specify the process namespace.";


		//  No error => store properties for the templates
		if( errorMsg == null ) {
			String bpelNamespace = this.abstractProcess ? BPELConstants.NAMESPACE_ABSTRACT_2007 : BPELConstants.NAMESPACE;
			this.processTemplateProperties.put( "processName", this.processName ); //$NON-NLS-1$
			this.processTemplateProperties.put( "namespace", this.processNamespace ); //$NON-NLS-1$
			this.processTemplateProperties.put( "bpelNamespace", bpelNamespace ); //$NON-NLS-1$
			this.processTemplateProperties.put( "date", new Date()); //$NON-NLS-1$
		}

//
//		// Save some fields for further use
//		IDialogSettings settings = getWizard().getDialogSettings();
//		if( settings != null )
//			settings.put( NewBpelFileWizard.DIALOG_SETTINGS_PROCESS_NAME, this.processName );

		return errorMsg;
	}


	/**
	 * The different modes to create a new BPEL to edit.
	 */
	public static enum WorkflowCreationMode {
		CREATE_NEW_WORKFLOW, GENERATE_WORKFLOW_FROM_WSDL;

		/*
		 * (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {

			String result;
			switch( this ) {
			case CREATE_NEW_WORKFLOW:
				result = "Create a workflow directly";
				break;
			case GENERATE_WORKFLOW_FROM_WSDL:
				result = "Create a workflow  from a service description";
				break;
			default:
				result = "";
			}

			return result;
		};


		/**
		 * @return a more detailed description
		 */
		public String getDescription() {

			String result;
			switch( this ) {
			case CREATE_NEW_WORKFLOW:
				result = "This will generate a skeleton of workflow .\nThis skeleton is based on pre-defined templates.";
				break;

			case GENERATE_WORKFLOW_FROM_WSDL:
				result = "This will generate a skeleton of workflow  to implement a given WSDL contract.\n"
				+ "\t \u2666 \tThe resulting process starts with a pick activity.\n"
				+ "\t \u2666 \tMessage dispatching depends on the invoked operation.";
				break;
			default:
				result = "";
			}

			return result;
		}
	}
	private IStatus doWorkspaceValidation(IWorkspace workspace, String text) {
		IStatus ret = workspace.validateName(text, IResource.FILE);
		return ret;
	}


}
