package cn.edu.nju.cs.workflow.ui.util;

import java.util.HashMap;
import java.util.Map;

public class ConfigureUtil {
	private static int idCount=0;
	
	private static int compoundTaskCount=0;
	private static int loopTaskCount=0;
	private static int choiceTaskCount=0;
	private static int adviceTaskCount=0;
	private static int edgeCount=0;
	private static int conditionCount=0;
	private static int whileConditionCount=0;
	private static Map<String,Integer>simpleTaskMapCount=new HashMap<String,Integer>(); 
	public static String getId(){
		idCount++;
		return idCount+"";
	}
	public static String getSimpleTaskName(String simpleTaskName){
		int count=0;
		if(simpleTaskMapCount.containsKey(simpleTaskName))
			count=simpleTaskMapCount.get(simpleTaskName);
		count++;
		simpleTaskMapCount.put(simpleTaskName, count);
		return simpleTaskName+count;
	}
	public static String getCompoundTaskName(){
		compoundTaskCount++;
		return "compoundTask"+compoundTaskCount;
	}
	public static String getLoopTaskName(){
		loopTaskCount++;
		return "loopTask"+loopTaskCount;
	}
	public static String getChoiceTaskName(){
		choiceTaskCount++;
		return "choiceTask"+choiceTaskCount;
	}
	public static String getAdviceTaskName(){
		adviceTaskCount++;
		return "adviceTask"+adviceTaskCount;
	}
	public static String getEdgeName(){
		edgeCount++;
		return "edge"+edgeCount;	
	}
	
	public static String getConditionName(){
		conditionCount++;
		return "condition"+conditionCount;
	}
	public static String getWhileConditionName(){
		whileConditionCount++;
		return "While condition"+whileConditionCount;
	}
	
	

	
	

}
