package cn.edu.nju.cs.workflow.bpel.aspect;



import org.eclipse.bpel.model.*;
import org.eclipse.bpel.ui.adapters.*;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;


import cn.edu.nju.cs.workflow.model.aspect.Advice;
import cn.edu.nju.cs.workflow.model.aspect.Aspect;
import cn.edu.nju.cs.workflow.model.aspect.Transition;
import cn.edu.nju.cs.workflow.model.aspect.Transitions;



public class AspectEditPartFactory implements EditPartFactory{
	
	public EditPart createEditPart(EditPart context, Object model) {
		EditPartFactory adapter=null;
		if(model instanceof Aspect){
			EditPart result=new AspectEditPart();
			result.setModel(model);		
			return result;
		}else if(model instanceof Transitions){
			return null;
		
		}else if(model instanceof Transition){
			return null;
		}else if(model instanceof Advice){
			return null;
		}else if(model instanceof Assign) {
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
		}else if(model instanceof CorrelationSet) {
			adapter=new CorrelationSetAdapter();
			return adapter.createEditPart(context, model);
		}else if(model instanceof CorrelationSets) {
			adapter=new CorrelationSetsAdapter();
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
		}else if(model instanceof ExtensionActivity) {
			adapter=new ExtensionActivityAdapter();
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
		}else if(model instanceof If) {
			adapter=new IfAdapter();
			return adapter.createEditPart(context, model);
		}else if(model instanceof Invoke) {
			adapter=new InvokeAdapter();
			return adapter.createEditPart(context, model);
		}else if(model instanceof Link) {
			adapter=new LinkAdapter();
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
		return null;
	  
		
		

	}

}
