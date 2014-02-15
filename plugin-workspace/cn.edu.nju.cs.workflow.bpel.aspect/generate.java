else if(model instanceof Assign) {
	adapter=new AssignAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Catch) {
	adapter=new CatchAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CatchAll) {
	adapter=new CatchAllAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Compensate) {
	adapter=new CompensateAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CompensateScope) {
	adapter=new CompensateScopeAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CompensationHandler) {
	adapter=new CompensationHandlerAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CompletionCondition) {
	adapter=new CompletionConditionAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Condition) {
	adapter=new ConditionAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Copy) {
	adapter=new CopyAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Correlation) {
	adapter=new CorrelationAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CorrelationPattern) {
	adapter=new CorrelationPatternAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Correlations) {
	adapter=new CorrelationsAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CorrelationSet) {
	adapter=new CorrelationSetAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof CorrelationSets) {
	adapter=new CorrelationSetsAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Documentation) {
	adapter=new DocumentationAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Else) {
	adapter=new ElseAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof ElseIf) {
	adapter=new ElseIfAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Empty) {
	adapter=new EmptyAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof EventHandler) {
	adapter=new EventHandlerAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Exit) {
	adapter=new ExitAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Expression) {
	adapter=new ExpressionAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Extension) {
	adapter=new ExtensionAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof ExtensionActivity) {
	adapter=new ExtensionActivityAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Extensions) {
	adapter=new ExtensionsAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof FaultHandler) {
	adapter=new FaultHandlerAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Flow) {
	adapter=new FlowAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof ForEach) {
	adapter=new ForEachAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof From) {
	adapter=new FromAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof FromPart) {
	adapter=new FromPartAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof FromParts) {
	adapter=new FromPartsAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof If) {
	adapter=new IfAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Import) {
	adapter=new ImportAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Invoke) {
	adapter=new InvokeAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Link) {
	adapter=new LinkAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Links) {
	adapter=new LinksAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof MessageExchange) {
	adapter=new MessageExchangeAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof MessageExchanges) {
	adapter=new MessageExchangesAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof OnAlarm) {
	adapter=new OnAlarmAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof OnEvent) {
	adapter=new OnEventAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof OnMessage) {
	adapter=new OnMessageAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof PartnerActivity) {
	adapter=new PartnerActivityAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof PartnerLink) {
	adapter=new PartnerLinkAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof PartnerLinks) {
	adapter=new PartnerLinksAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Pick) {
	adapter=new PickAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Receive) {
	adapter=new ReceiveAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof RepeatUntil) {
	adapter=new RepeatUntilAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Reply) {
	adapter=new ReplyAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof resource) {
	adapter=new resourceAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Rethrow) {
	adapter=new RethrowAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Scope) {
	adapter=new ScopeAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Sequence) {
	adapter=new SequenceAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof TerminationHandler) {
	adapter=new TerminationHandlerAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Throw) {
	adapter=new ThrowAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Variable) {
	adapter=new VariableAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Variables) {
	adapter=new VariablesAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof Wait) {
	adapter=new WaitAdapter();
	return adapter.createEditPart(context, model);
}else if(model instanceof While) {
	adapter=new WhileAdapter();
	return adapter.createEditPart(context, model);
}