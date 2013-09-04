package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.parallel.stratego_parallel.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import entitywithaspects.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class Main  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const519;

  protected static IStrategoTerm const518;

  protected static IStrategoTerm const517;

  protected static IStrategoTerm const516;

  protected static IStrategoTerm const515;

  protected static IStrategoTerm const514;

  protected static IStrategoTerm const513;

  protected static IStrategoTerm const512;

  protected static IStrategoTerm const511;

  protected static IStrategoTerm const510;

  protected static IStrategoTerm const509;

  protected static IStrategoTerm const508;

  protected static IStrategoTerm const507;

  protected static IStrategoTerm const506;

  protected static IStrategoTerm const505;

  protected static IStrategoTerm const504;

  protected static IStrategoTerm const503;

  protected static IStrategoTerm const502;

  protected static IStrategoTerm const501;

  protected static IStrategoTerm const500;

  protected static IStrategoTerm const499;

  protected static IStrategoTerm const498;

  protected static IStrategoTerm const497;

  protected static IStrategoTerm const496;

  protected static IStrategoTerm const495;

  protected static IStrategoTerm const494;

  protected static IStrategoTerm const493;

  protected static IStrategoTerm const492;

  protected static IStrategoTerm const491;

  protected static IStrategoTerm const490;

  protected static IStrategoTerm constCons131;

  protected static IStrategoTerm constMARKER0;

  protected static IStrategoTerm const489;

  protected static IStrategoTerm constCons130;

  protected static IStrategoTerm const488;

  protected static IStrategoTerm const487;

  protected static IStrategoTerm const486;

  protected static IStrategoTerm constCons129;

  protected static IStrategoTerm const485;

  protected static IStrategoTerm const484;

  protected static IStrategoTerm const483;

  protected static IStrategoTerm const482;

  protected static IStrategoTerm const481;

  protected static IStrategoTerm const480;

  protected static IStrategoTerm const479;

  protected static IStrategoTerm const478;

  public static IStrategoTerm getEntityWithAspectsPpAf()
  { 
    return constEntityWithAspectsPpAf;
  }

  protected static ImportTerm constEntityWithAspectsPpAf;

  public static IStrategoTerm getEntityWithAspectsGeneratedPpAf()
  { 
    return constEntityWithAspectsGeneratedPpAf;
  }

  protected static ImportTerm constEntityWithAspectsGeneratedPpAf;

  public static IStrategoTerm getEntityWithAspectsTbl1()
  { 
    return constEntityWithAspectsTbl1;
  }

  protected static ImportTerm constEntityWithAspectsTbl1;

  public static IStrategoTerm getEntityWithAspectsTbl0()
  { 
    return constEntityWithAspectsTbl0;
  }

  protected static ImportTerm constEntityWithAspectsTbl0;

  public static IStrategoTerm getEntityWithAspectsTbl()
  { 
    return constEntityWithAspectsTbl;
  }

  protected static ImportTerm constEntityWithAspectsTbl;

  protected static IStrategoTerm const477;

  protected static IStrategoTerm const476;

  protected static IStrategoTerm const475;

  protected static IStrategoTerm const474;

  protected static IStrategoTerm const473;

  protected static IStrategoTerm const472;

  protected static IStrategoTerm const471;

  protected static IStrategoTerm const470;

  protected static IStrategoTerm constCons128;

  protected static IStrategoTerm constCons127;

  protected static IStrategoTerm constCons126;

  protected static IStrategoTerm const469;

  protected static IStrategoTerm const468;

  protected static IStrategoTerm const467;

  protected static IStrategoTerm const466;

  protected static IStrategoTerm const465;

  protected static IStrategoTerm const464;

  protected static IStrategoTerm constCons125;

  protected static IStrategoTerm const463;

  protected static IStrategoTerm constCons124;

  protected static IStrategoTerm constGlobal0;

  protected static IStrategoTerm constCons123;

  protected static IStrategoTerm constCons122;

  protected static IStrategoTerm const462;

  protected static IStrategoTerm constCons121;

  protected static IStrategoTerm const461;

  protected static IStrategoTerm const460;

  protected static IStrategoTerm const459;

  protected static IStrategoTerm const458;

  protected static IStrategoTerm const457;

  protected static IStrategoTerm constCritical0;

  protected static IStrategoTerm const456;

  protected static IStrategoTerm const455;

  protected static IStrategoTerm const454;

  protected static IStrategoTerm const453;

  protected static IStrategoTerm const452;

  protected static IStrategoTerm const451;

  protected static IStrategoTerm const450;

  protected static IStrategoTerm const449;

  protected static IStrategoTerm const448;

  protected static IStrategoTerm const447;

  protected static IStrategoTerm constEditor0;

  protected static IStrategoTerm const446;

  protected static IStrategoTerm const445;

  protected static IStrategoTerm const444;

  protected static IStrategoTerm const443;

  protected static IStrategoTerm const442;

  protected static IStrategoTerm const441;

  protected static IStrategoTerm const440;

  protected static IStrategoTerm const439;

  protected static IStrategoTerm const438;

  protected static IStrategoTerm constStopLookup0;

  protected static IStrategoTerm const437;

  protected static IStrategoTerm const436;

  protected static IStrategoTerm const435;

  protected static IStrategoTerm constCons120;

  protected static IStrategoTerm const434;

  protected static IStrategoTerm const433;

  protected static IStrategoTerm const432;

  protected static IStrategoTerm const431;

  protected static IStrategoTerm const430;

  protected static IStrategoTerm constCons119;

  protected static IStrategoTerm const429;

  protected static IStrategoTerm const428;

  protected static IStrategoTerm const427;

  protected static IStrategoTerm const426;

  protected static IStrategoTerm const425;

  protected static IStrategoTerm const424;

  protected static IStrategoTerm const423;

  protected static IStrategoTerm const422;

  protected static IStrategoTerm const421;

  protected static IStrategoTerm constINTERNAL_ERROR0;

  protected static IStrategoTerm constAnon0;

  protected static IStrategoTerm const420;

  protected static IStrategoTerm const419;

  protected static IStrategoTerm const418;

  protected static IStrategoTerm const417;

  protected static IStrategoTerm const416;

  protected static IStrategoTerm const415;

  protected static IStrategoTerm const414;

  protected static IStrategoTerm const413;

  protected static IStrategoTerm const412;

  protected static IStrategoTerm const411;

  protected static IStrategoTerm const410;

  protected static IStrategoTerm const409;

  protected static IStrategoTerm const408;

  protected static IStrategoTerm const407;

  protected static IStrategoTerm const406;

  protected static IStrategoTerm const405;

  protected static IStrategoTerm const404;

  protected static IStrategoTerm const403;

  protected static IStrategoTerm constCons118;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const402;

  protected static IStrategoTerm const401;

  protected static IStrategoTerm const400;

  protected static IStrategoTerm const399;

  protected static IStrategoTerm const398;

  protected static IStrategoTerm const397;

  protected static IStrategoTerm const396;

  protected static IStrategoTerm const395;

  protected static IStrategoTerm const394;

  protected static IStrategoTerm const393;

  protected static IStrategoTerm constCons117;

  protected static IStrategoTerm const392;

  protected static IStrategoTerm constCons116;

  protected static IStrategoTerm const391;

  protected static IStrategoTerm const390;

  protected static IStrategoTerm const389;

  protected static IStrategoTerm constCons115;

  protected static IStrategoTerm const388;

  protected static IStrategoTerm const387;

  protected static IStrategoTerm constCons114;

  protected static IStrategoTerm constCons113;

  protected static IStrategoTerm const386;

  protected static IStrategoTerm const385;

  protected static IStrategoTerm const384;

  protected static IStrategoTerm const383;

  protected static IStrategoTerm const382;

  protected static IStrategoTerm const381;

  protected static IStrategoTerm const380;

  protected static IStrategoTerm const379;

  protected static IStrategoTerm const378;

  protected static IStrategoTerm const377;

  protected static IStrategoTerm constCons112;

  protected static IStrategoTerm const376;

  protected static IStrategoTerm constCons111;

  protected static IStrategoTerm const375;

  protected static IStrategoTerm const374;

  protected static IStrategoTerm const373;

  protected static IStrategoTerm const372;

  protected static IStrategoTerm const371;

  protected static IStrategoTerm constCons110;

  protected static IStrategoTerm const370;

  protected static IStrategoTerm const369;

  protected static IStrategoTerm const368;

  protected static IStrategoTerm constCons109;

  protected static IStrategoTerm const367;

  protected static IStrategoTerm constCons108;

  protected static IStrategoTerm const366;

  protected static IStrategoTerm const365;

  protected static IStrategoTerm const364;

  protected static IStrategoTerm const363;

  protected static IStrategoTerm const362;

  protected static IStrategoTerm const361;

  protected static IStrategoTerm constCons107;

  protected static IStrategoTerm const360;

  protected static IStrategoTerm const359;

  protected static IStrategoTerm const358;

  protected static IStrategoTerm const357;

  protected static IStrategoTerm const356;

  protected static IStrategoTerm constCons106;

  protected static IStrategoTerm const355;

  protected static IStrategoTerm const354;

  protected static IStrategoTerm const353;

  protected static IStrategoTerm const352;

  protected static IStrategoTerm const351;

  protected static IStrategoTerm const350;

  protected static IStrategoTerm const349;

  protected static IStrategoTerm const348;

  protected static IStrategoTerm const347;

  protected static IStrategoTerm const346;

  protected static IStrategoTerm const345;

  protected static IStrategoTerm constCons105;

  protected static IStrategoTerm const344;

  protected static IStrategoTerm const343;

  protected static IStrategoTerm const342;

  protected static IStrategoTerm const341;

  protected static IStrategoTerm const340;

  protected static IStrategoTerm const339;

  protected static IStrategoTerm const338;

  protected static IStrategoTerm const337;

  protected static IStrategoTerm const336;

  protected static IStrategoTerm const335;

  protected static IStrategoTerm const334;

  protected static IStrategoTerm const333;

  protected static IStrategoTerm const332;

  protected static IStrategoTerm constCons104;

  protected static IStrategoTerm const331;

  protected static IStrategoTerm const330;

  protected static IStrategoTerm const329;

  protected static IStrategoTerm const328;

  protected static IStrategoTerm constCons103;

  protected static IStrategoTerm constBefore0;

  protected static IStrategoTerm constCons102;

  protected static IStrategoTerm constAfter0;

  protected static IStrategoTerm const327;

  protected static IStrategoTerm const326;

  protected static IStrategoTerm const325;

  protected static IStrategoTerm const324;

  protected static IStrategoTerm const323;

  protected static IStrategoTerm const322;

  protected static IStrategoTerm const321;

  protected static IStrategoTerm const320;

  protected static IStrategoTerm const319;

  protected static IStrategoTerm constCons101;

  protected static IStrategoTerm const318;

  protected static IStrategoTerm const317;

  protected static IStrategoTerm const316;

  protected static IStrategoTerm const315;

  protected static IStrategoTerm const314;

  protected static IStrategoTerm const313;

  protected static IStrategoTerm const312;

  protected static IStrategoTerm const311;

  protected static IStrategoTerm const310;

  protected static IStrategoTerm const309;

  protected static IStrategoTerm const308;

  protected static IStrategoTerm const307;

  protected static IStrategoTerm const306;

  protected static IStrategoTerm const305;

  protected static IStrategoTerm const304;

  protected static IStrategoTerm const303;

  protected static IStrategoTerm const302;

  protected static IStrategoTerm const301;

  protected static IStrategoTerm const300;

  protected static IStrategoTerm const299;

  protected static IStrategoTerm const298;

  protected static IStrategoTerm const297;

  protected static IStrategoTerm const296;

  protected static IStrategoTerm const295;

  protected static IStrategoTerm constCons100;

  protected static IStrategoTerm const294;

  protected static IStrategoTerm const293;

  protected static IStrategoTerm const292;

  protected static IStrategoTerm constCons99;

  protected static IStrategoTerm const291;

  protected static IStrategoTerm const290;

  protected static IStrategoTerm const289;

  protected static IStrategoTerm constCons98;

  protected static IStrategoTerm const288;

  protected static IStrategoTerm const287;

  protected static IStrategoTerm const286;

  protected static IStrategoTerm constCons97;

  protected static IStrategoTerm const285;

  protected static IStrategoTerm const284;

  protected static IStrategoTerm const283;

  protected static IStrategoTerm constCons96;

  protected static IStrategoTerm const282;

  protected static IStrategoTerm const281;

  protected static IStrategoTerm const280;

  protected static IStrategoTerm constCons95;

  protected static IStrategoTerm const279;

  protected static IStrategoTerm const278;

  protected static IStrategoTerm const277;

  protected static IStrategoTerm constCons94;

  protected static IStrategoTerm const276;

  protected static IStrategoTerm const275;

  protected static IStrategoTerm const274;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const273;

  protected static IStrategoTerm constCons93;

  protected static IStrategoTerm const272;

  protected static IStrategoTerm constCons92;

  protected static IStrategoTerm const271;

  protected static IStrategoTerm constCons91;

  protected static IStrategoTerm const270;

  protected static IStrategoTerm constCons90;

  protected static IStrategoTerm const269;

  protected static IStrategoTerm constCons89;

  protected static IStrategoTerm const268;

  protected static IStrategoTerm constCons88;

  protected static IStrategoTerm const267;

  protected static IStrategoTerm constCons87;

  protected static IStrategoTerm const266;

  protected static IStrategoTerm const265;

  protected static IStrategoTerm const264;

  protected static IStrategoTerm constIntType0;

  protected static IStrategoTerm constStringType0;

  protected static IStrategoTerm constType2;

  protected static IStrategoTerm constType1;

  protected static IStrategoTerm constType0;

  protected static IStrategoTerm constCons86;

  protected static IStrategoTerm constCurrentFile0;

  protected static IStrategoTerm constCons85;

  protected static IStrategoTerm constCons84;

  protected static IStrategoTerm constDef1;

  protected static IStrategoTerm constCons83;

  protected static IStrategoTerm constCons82;

  protected static IStrategoTerm constCons81;

  protected static IStrategoTerm constDef0;

  protected static IStrategoTerm constCons80;

  protected static IStrategoTerm constCons79;

  protected static IStrategoTerm const263;

  protected static IStrategoTerm constCons78;

  protected static IStrategoTerm constCons77;

  protected static IStrategoTerm const262;

  protected static IStrategoTerm constCons76;

  protected static IStrategoTerm const261;

  protected static IStrategoTerm constCons75;

  protected static IStrategoTerm const260;

  protected static IStrategoTerm constImport0;

  protected static IStrategoTerm constModule0;

  protected static IStrategoTerm constCons74;

  protected static IStrategoTerm constCons73;

  protected static IStrategoTerm constCons72;

  protected static IStrategoTerm constProperty0;

  protected static IStrategoTerm constCons71;

  protected static IStrategoTerm constFunction0;

  protected static IStrategoTerm constCons70;

  protected static IStrategoTerm constVariable0;

  protected static IStrategoTerm constCons69;

  protected static IStrategoTerm constPointcut0;

  protected static IStrategoTerm constCons68;

  protected static IStrategoTerm constAdvice0;

  protected static IStrategoTerm constCons67;

  protected static IStrategoTerm constEntity0;

  protected static IStrategoTerm constCons66;

  protected static IStrategoTerm constAspect0;

  protected static IStrategoTerm constNil1;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consCritical_0;

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consModule_3;

  public static IStrategoConstructor _consAspect_2;

  public static IStrategoConstructor _consImport_1;

  public static IStrategoConstructor _consWildcardImport_1;

  public static IStrategoConstructor _consEntityImport_2;

  public static IStrategoConstructor _consPointcut_3;

  public static IStrategoConstructor _consAdvice_6;

  public static IStrategoConstructor _consBefore_0;

  public static IStrategoConstructor _consAfter_0;

  public static IStrategoConstructor _consAssigned_1;

  public static IStrategoConstructor _consFunction_3;

  public static IStrategoConstructor _consParam_2;

  public static IStrategoConstructor _consVarDecl_2;

  public static IStrategoConstructor _consVarDeclInit_3;

  public static IStrategoConstructor _consAssign_2;

  public static IStrategoConstructor _consBlock_1;

  public static IStrategoConstructor _consPrint_1;

  public static IStrategoConstructor _consCall_2;

  public static IStrategoConstructor _consVar_1;

  public static IStrategoConstructor _consPropAccess_2;

  public static IStrategoConstructor _consStringLit_1;

  public static IStrategoConstructor _consIntLit_1;

  public static IStrategoConstructor _consStringType_0;

  public static IStrategoConstructor _consIntType_0;

  public static IStrategoConstructor _consProperty_2;

  public static IStrategoConstructor _consEntity_2;

  public static IStrategoConstructor _consModule_2;

  public static IStrategoConstructor _consTrue_0;

  public static IStrategoConstructor _consMARKER_0;

  public static IStrategoConstructor _consNOCONTEXT_1;

  public static IStrategoConstructor _consCOMPLETION_1;

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static IStrategoConstructor _consDR_UNDEFINE_1;

  public static IStrategoConstructor _consGlobal_2;

  public static IStrategoConstructor _consGlobal_1;

  public static IStrategoConstructor _consGlobal_0;

  public static IStrategoConstructor _consFileEntries_2;

  public static IStrategoConstructor _consAnon_0;

  public static IStrategoConstructor _consAnon_1;

  public static IStrategoConstructor _consString_0;

  public static IStrategoConstructor _consTimestamp_0;

  public static IStrategoConstructor _consINTERNAL_ERROR_0;

  public static IStrategoConstructor _consUnresolved_1;

  public static IStrategoConstructor _consNamespace_0;

  public static IStrategoConstructor _consDefData_3;

  public static IStrategoConstructor _consStopLookup_0;

  public static IStrategoConstructor _consDiff_2;

  public static IStrategoConstructor _consReadWildcard_2;

  public static IStrategoConstructor _consRead_1;

  public static IStrategoConstructor _consBadUse_1;

  public static IStrategoConstructor _consUse_1;

  public static IStrategoConstructor _consDef_1;

  public static IStrategoConstructor _consCompile_0;

  public static IStrategoConstructor _consEditor_0;

  public static IStrategoConstructor _consScope_1;

  public static IStrategoConstructor _consAST_2;

  public static IStrategoConstructor _consAST_0;

  public static IStrategoConstructor _consASTDiff_0;

  public static IStrategoConstructor _consDiff_0;

  public static IStrategoConstructor _consParallelResults_6;

  public static IStrategoConstructor _consResults_7;

  public static IStrategoConstructor _consType_1;

  public static IStrategoConstructor _consAdvice_2;

  public static IStrategoConstructor _consADVICE_4;

  public static IStrategoConstructor _consPointcut_2;

  public static IStrategoConstructor _consVariable_0;

  public static IStrategoConstructor _consFunction_0;

  public static IStrategoConstructor _consProperty_0;

  public static IStrategoConstructor _consEntity_0;

  public static IStrategoConstructor _consAdvice_0;

  public static IStrategoConstructor _consPointcut_0;

  public static IStrategoConstructor _consAspect_0;

  public static IStrategoConstructor _consModule_0;

  public static IStrategoConstructor _consCurrentFile_0;

  public static IStrategoConstructor _consTransitive_0;

  public static IStrategoConstructor _consImport_0;

  public static IStrategoConstructor _consType_0;

  public static Context init(Context context)
  { 
    synchronized(Main.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.lang.parallel.stratego_parallel.Main.init(context);
          org.strategoxt.stratego_sglr.Main.init(context);
          org.strategoxt.stratego_gpp.Main.init(context);
          org.strategoxt.stratego_xtc.Main.init(context);
          org.strategoxt.stratego_aterm.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          entitywithaspects.strategies.Main.init(context);
          context.registerComponent("trans");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static Strategy getMainStrategy()
  { 
    return null;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consCritical_0 = termFactory.makeConstructor("Critical", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consModule_3 = termFactory.makeConstructor("Module", 3);
    _consAspect_2 = termFactory.makeConstructor("Aspect", 2);
    _consImport_1 = termFactory.makeConstructor("Import", 1);
    _consWildcardImport_1 = termFactory.makeConstructor("WildcardImport", 1);
    _consEntityImport_2 = termFactory.makeConstructor("EntityImport", 2);
    _consPointcut_3 = termFactory.makeConstructor("Pointcut", 3);
    _consAdvice_6 = termFactory.makeConstructor("Advice", 6);
    _consBefore_0 = termFactory.makeConstructor("Before", 0);
    _consAfter_0 = termFactory.makeConstructor("After", 0);
    _consAssigned_1 = termFactory.makeConstructor("Assigned", 1);
    _consFunction_3 = termFactory.makeConstructor("Function", 3);
    _consParam_2 = termFactory.makeConstructor("Param", 2);
    _consVarDecl_2 = termFactory.makeConstructor("VarDecl", 2);
    _consVarDeclInit_3 = termFactory.makeConstructor("VarDeclInit", 3);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consPrint_1 = termFactory.makeConstructor("Print", 1);
    _consCall_2 = termFactory.makeConstructor("Call", 2);
    _consVar_1 = termFactory.makeConstructor("Var", 1);
    _consPropAccess_2 = termFactory.makeConstructor("PropAccess", 2);
    _consStringLit_1 = termFactory.makeConstructor("StringLit", 1);
    _consIntLit_1 = termFactory.makeConstructor("IntLit", 1);
    _consStringType_0 = termFactory.makeConstructor("StringType", 0);
    _consIntType_0 = termFactory.makeConstructor("IntType", 0);
    _consProperty_2 = termFactory.makeConstructor("Property", 2);
    _consEntity_2 = termFactory.makeConstructor("Entity", 2);
    _consModule_2 = termFactory.makeConstructor("Module", 2);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consMARKER_0 = termFactory.makeConstructor("MARKER", 0);
    _consNOCONTEXT_1 = termFactory.makeConstructor("NOCONTEXT", 1);
    _consCOMPLETION_1 = termFactory.makeConstructor("COMPLETION", 1);
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
    _consDR_UNDEFINE_1 = termFactory.makeConstructor("DR_UNDEFINE", 1);
    _consGlobal_2 = termFactory.makeConstructor("Global", 2);
    _consGlobal_1 = termFactory.makeConstructor("Global", 1);
    _consGlobal_0 = termFactory.makeConstructor("Global", 0);
    _consFileEntries_2 = termFactory.makeConstructor("FileEntries", 2);
    _consAnon_0 = termFactory.makeConstructor("Anon", 0);
    _consAnon_1 = termFactory.makeConstructor("Anon", 1);
    _consString_0 = termFactory.makeConstructor("String", 0);
    _consTimestamp_0 = termFactory.makeConstructor("Timestamp", 0);
    _consINTERNAL_ERROR_0 = termFactory.makeConstructor("INTERNAL_ERROR", 0);
    _consUnresolved_1 = termFactory.makeConstructor("Unresolved", 1);
    _consNamespace_0 = termFactory.makeConstructor("Namespace", 0);
    _consDefData_3 = termFactory.makeConstructor("DefData", 3);
    _consStopLookup_0 = termFactory.makeConstructor("StopLookup", 0);
    _consDiff_2 = termFactory.makeConstructor("Diff", 2);
    _consReadWildcard_2 = termFactory.makeConstructor("ReadWildcard", 2);
    _consRead_1 = termFactory.makeConstructor("Read", 1);
    _consBadUse_1 = termFactory.makeConstructor("BadUse", 1);
    _consUse_1 = termFactory.makeConstructor("Use", 1);
    _consDef_1 = termFactory.makeConstructor("Def", 1);
    _consCompile_0 = termFactory.makeConstructor("Compile", 0);
    _consEditor_0 = termFactory.makeConstructor("Editor", 0);
    _consScope_1 = termFactory.makeConstructor("Scope", 1);
    _consAST_2 = termFactory.makeConstructor("AST", 2);
    _consAST_0 = termFactory.makeConstructor("AST", 0);
    _consASTDiff_0 = termFactory.makeConstructor("ASTDiff", 0);
    _consDiff_0 = termFactory.makeConstructor("Diff", 0);
    _consParallelResults_6 = termFactory.makeConstructor("ParallelResults", 6);
    _consResults_7 = termFactory.makeConstructor("Results", 7);
    _consType_1 = termFactory.makeConstructor("Type", 1);
    _consAdvice_2 = termFactory.makeConstructor("Advice", 2);
    _consADVICE_4 = termFactory.makeConstructor("ADVICE", 4);
    _consPointcut_2 = termFactory.makeConstructor("Pointcut", 2);
    _consVariable_0 = termFactory.makeConstructor("Variable", 0);
    _consFunction_0 = termFactory.makeConstructor("Function", 0);
    _consProperty_0 = termFactory.makeConstructor("Property", 0);
    _consEntity_0 = termFactory.makeConstructor("Entity", 0);
    _consAdvice_0 = termFactory.makeConstructor("Advice", 0);
    _consPointcut_0 = termFactory.makeConstructor("Pointcut", 0);
    _consAspect_0 = termFactory.makeConstructor("Aspect", 0);
    _consModule_0 = termFactory.makeConstructor("Module", 0);
    _consCurrentFile_0 = termFactory.makeConstructor("CurrentFile", 0);
    _consTransitive_0 = termFactory.makeConstructor("Transitive", 0);
    _consImport_0 = termFactory.makeConstructor("Import", 0);
    _consType_0 = termFactory.makeConstructor("Type", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil1 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constAspect0 = termFactory.makeAppl(Main._consAspect_0, NO_TERMS);
    constCons66 = (IStrategoTerm)termFactory.makeListCons(trans.constAspect0, (IStrategoList)trans.constNil1);
    constEntity0 = termFactory.makeAppl(Main._consEntity_0, NO_TERMS);
    constCons67 = (IStrategoTerm)termFactory.makeListCons(trans.constEntity0, (IStrategoList)trans.constCons66);
    constAdvice0 = termFactory.makeAppl(Main._consAdvice_0, NO_TERMS);
    constCons68 = (IStrategoTerm)termFactory.makeListCons(trans.constAdvice0, (IStrategoList)trans.constNil1);
    constPointcut0 = termFactory.makeAppl(Main._consPointcut_0, NO_TERMS);
    constCons69 = (IStrategoTerm)termFactory.makeListCons(trans.constPointcut0, (IStrategoList)trans.constCons68);
    constVariable0 = termFactory.makeAppl(Main._consVariable_0, NO_TERMS);
    constCons70 = (IStrategoTerm)termFactory.makeListCons(trans.constVariable0, (IStrategoList)trans.constNil1);
    constFunction0 = termFactory.makeAppl(Main._consFunction_0, NO_TERMS);
    constCons71 = (IStrategoTerm)termFactory.makeListCons(trans.constFunction0, (IStrategoList)trans.constNil1);
    constProperty0 = termFactory.makeAppl(Main._consProperty_0, NO_TERMS);
    constCons72 = (IStrategoTerm)termFactory.makeListCons(trans.constProperty0, (IStrategoList)trans.constCons71);
    constCons73 = (IStrategoTerm)termFactory.makeListCons(trans.constProperty0, (IStrategoList)trans.constNil1);
    constCons74 = (IStrategoTerm)termFactory.makeListCons(trans.constVariable0, (IStrategoList)trans.constCons73);
    constModule0 = termFactory.makeAppl(Main._consModule_0, NO_TERMS);
    constImport0 = termFactory.makeAppl(Main._consImport_0, NO_TERMS);
    const260 = termFactory.makeString("String");
    constCons75 = (IStrategoTerm)termFactory.makeListCons(trans.const260, (IStrategoList)trans.constNil1);
    const261 = termFactory.makeString("Int");
    constCons76 = (IStrategoTerm)termFactory.makeListCons(trans.const261, (IStrategoList)trans.constCons75);
    const262 = termFactory.makeTuple(trans.constEntity0, trans.constCons75);
    constCons77 = (IStrategoTerm)termFactory.makeListCons(trans.const262, (IStrategoList)trans.constNil1);
    constCons78 = (IStrategoTerm)termFactory.makeListCons(trans.const261, (IStrategoList)trans.constNil1);
    const263 = termFactory.makeTuple(trans.constEntity0, trans.constCons78);
    constCons79 = (IStrategoTerm)termFactory.makeListCons(trans.const263, (IStrategoList)trans.constCons77);
    constCons80 = (IStrategoTerm)termFactory.makeListCons(trans.constEntity0, (IStrategoList)trans.constCons75);
    constDef0 = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{trans.constCons80});
    constCons81 = (IStrategoTerm)termFactory.makeListCons(trans.constDef0, (IStrategoList)trans.constNil1);
    constCons82 = (IStrategoTerm)termFactory.makeListCons(trans.constCons81, (IStrategoList)trans.constNil1);
    constCons83 = (IStrategoTerm)termFactory.makeListCons(trans.constEntity0, (IStrategoList)trans.constCons78);
    constDef1 = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{trans.constCons83});
    constCons84 = (IStrategoTerm)termFactory.makeListCons(trans.constDef1, (IStrategoList)trans.constNil1);
    constCons85 = (IStrategoTerm)termFactory.makeListCons(trans.constCons84, (IStrategoList)trans.constCons82);
    constCurrentFile0 = termFactory.makeAppl(Main._consCurrentFile_0, NO_TERMS);
    constCons86 = (IStrategoTerm)termFactory.makeListCons(trans.constCurrentFile0, (IStrategoList)trans.constNil1);
    constType0 = termFactory.makeAppl(Main._consType_0, NO_TERMS);
    constType1 = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{trans.const260});
    constType2 = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{trans.const261});
    constStringType0 = termFactory.makeAppl(Main._consStringType_0, NO_TERMS);
    constIntType0 = termFactory.makeAppl(Main._consIntType_0, NO_TERMS);
    const264 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'create-quoted-libraries'");
    const265 = termFactory.makeString("\n");
    const266 = termFactory.makeString(".generated.str2");
    constCons87 = (IStrategoTerm)termFactory.makeListCons(trans.const266, (IStrategoList)trans.constNil1);
    const267 = termFactory.makeString("/lib/index-library");
    constCons88 = (IStrategoTerm)termFactory.makeListCons(trans.const267, (IStrategoList)trans.constNil1);
    const268 = termFactory.makeString("/lib/analysis-library");
    constCons89 = (IStrategoTerm)termFactory.makeListCons(trans.const268, (IStrategoList)trans.constNil1);
    const269 = termFactory.makeString("/lib/analysis-library-internal");
    constCons90 = (IStrategoTerm)termFactory.makeListCons(trans.const269, (IStrategoList)trans.constNil1);
    const270 = termFactory.makeString("/lib/compilation-library");
    constCons91 = (IStrategoTerm)termFactory.makeListCons(trans.const270, (IStrategoList)trans.constNil1);
    const271 = termFactory.makeString("/lib/nbl-library");
    constCons92 = (IStrategoTerm)termFactory.makeListCons(trans.const271, (IStrategoList)trans.constNil1);
    const272 = termFactory.makeString(".str");
    constCons93 = (IStrategoTerm)termFactory.makeListCons(trans.const272, (IStrategoList)trans.constNil1);
    const273 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'create-quoted-libraries'");
    constNone0 = termFactory.makeAppl(Main._consNone_0, NO_TERMS);
    const274 = termFactory.makeString("lib/nbl-library");
    const275 = termFactory.makeString("lib/nbl-library.generated");
    const276 = termFactory.makeTuple(trans.const274, trans.const275);
    constCons94 = (IStrategoTerm)termFactory.makeListCons(trans.const276, (IStrategoList)trans.constNil1);
    const277 = termFactory.makeString("lib/compilation-library");
    const278 = termFactory.makeString("lib/compilation-library.generated");
    const279 = termFactory.makeTuple(trans.const277, trans.const278);
    constCons95 = (IStrategoTerm)termFactory.makeListCons(trans.const279, (IStrategoList)trans.constCons94);
    const280 = termFactory.makeString("lib/analysis-library.generated-internal");
    const281 = termFactory.makeString("lib/analysis-library-internal.generated");
    const282 = termFactory.makeTuple(trans.const280, trans.const281);
    constCons96 = (IStrategoTerm)termFactory.makeListCons(trans.const282, (IStrategoList)trans.constCons95);
    const283 = termFactory.makeString("lib/analysis-library");
    const284 = termFactory.makeString("lib/analysis-library.generated");
    const285 = termFactory.makeTuple(trans.const283, trans.const284);
    constCons97 = (IStrategoTerm)termFactory.makeListCons(trans.const285, (IStrategoList)trans.constCons96);
    const286 = termFactory.makeString("lib/index-library");
    const287 = termFactory.makeString("lib/index-library.generated");
    const288 = termFactory.makeTuple(trans.const286, trans.const287);
    constCons98 = (IStrategoTerm)termFactory.makeListCons(trans.const288, (IStrategoList)trans.constCons97);
    const289 = termFactory.makeString("\"");
    const290 = termFactory.makeString("\\\"");
    const291 = termFactory.makeTuple(trans.const289, trans.const290);
    constCons99 = (IStrategoTerm)termFactory.makeListCons(trans.const291, (IStrategoList)trans.constCons98);
    const292 = termFactory.makeString("\\");
    const293 = termFactory.makeString("\\\\");
    const294 = termFactory.makeTuple(trans.const292, trans.const293);
    constCons100 = (IStrategoTerm)termFactory.makeListCons(trans.const294, (IStrategoList)trans.constCons99);
    const295 = termFactory.makeString("w");
    const296 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'write-lib'");
    const297 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'list-string-replace'");
    const298 = termFactory.makeString("/.internal/testgen");
    const299 = termFactory.makeString("TestGen");
    const300 = termFactory.makeInt(10);
    const301 = termFactory.makeInt(1);
    const302 = termFactory.makeInt(3);
    const303 = termFactory.makeInt(5);
    const304 = termFactory.makeInt(30);
    const305 = termFactory.makeInt(100);
    const306 = termFactory.makeInt(1073741823);
    const307 = termFactory.makeReal(0.5);
    const308 = termFactory.makeString("_");
    const309 = termFactory.makeString("");
    const310 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'random-type'");
    const311 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-add-ast'");
    const312 = termFactory.makeString("Writing ");
    const313 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-write-file'");
    const314 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen'");
    const315 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'testgen-group'");
    const316 = termFactory.makeString("\n                            ");
    const317 = termFactory.makeString("\n                                    ");
    const318 = termFactory.makeString(".ewa");
    constCons101 = (IStrategoTerm)termFactory.makeListCons(trans.const318, (IStrategoList)trans.constNil1);
    const319 = termFactory.makeString("/testgen/test_");
    const320 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-group'");
    const321 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-file'");
    const322 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-module'");
    const323 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-entity'");
    const324 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-property'");
    const325 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-function'");
    const326 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-statement'");
    const327 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-aspect'");
    constAfter0 = termFactory.makeAppl(Main._consAfter_0, NO_TERMS);
    constCons102 = (IStrategoTerm)termFactory.makeListCons(trans.constAfter0, (IStrategoList)trans.constNil1);
    constBefore0 = termFactory.makeAppl(Main._consBefore_0, NO_TERMS);
    constCons103 = (IStrategoTerm)termFactory.makeListCons(trans.constBefore0, (IStrategoList)trans.constCons102);
    const328 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-pointcutadvice'");
    const329 = termFactory.makeString("java");
    const330 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'index-compile-ast'");
    const331 = termFactory.makeString("/java/");
    constCons104 = (IStrategoTerm)termFactory.makeListCons(trans.const331, (IStrategoList)trans.constNil1);
    const332 = termFactory.makeString("\n           ");
    const333 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compile-ast'");
    const334 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'to-java'");
    const335 = termFactory.makeString("\n        ");
    const336 = termFactory.makeString("\n                   ");
    const337 = termFactory.makeString("\n       ");
    const338 = termFactory.makeString("\n                      ");
    const339 = termFactory.makeString("\n                ");
    const340 = termFactory.makeString("\n                       ");
    const341 = termFactory.makeString("\n                                  ");
    const342 = termFactory.makeString("\n         ");
    const343 = termFactory.makeString("\n                  ");
    const344 = termFactory.makeString(";    \n}\n\n");
    constCons105 = (IStrategoTerm)termFactory.makeListCons(trans.const344, (IStrategoList)trans.constNil1);
    const345 = termFactory.makeString(" = ");
    const346 = termFactory.makeString(") \n{\n    this.");
    const347 = termFactory.makeString(" ");
    const348 = termFactory.makeString("(");
    const349 = termFactory.makeString(";\n}\n\npublic void set_");
    const350 = termFactory.makeString(" \n{\n    return ");
    const351 = termFactory.makeString(" get_");
    const352 = termFactory.makeString(";\n\npublic ");
    const353 = termFactory.makeString("private ");
    const354 = termFactory.makeString("\n            ");
    const355 = termFactory.makeString("    \n");
    constCons106 = (IStrategoTerm)termFactory.makeListCons(trans.const355, (IStrategoList)trans.constNil1);
    const356 = termFactory.makeString(")\n");
    const357 = termFactory.makeString("public void ");
    const358 = termFactory.makeString("\n                 ");
    const359 = termFactory.makeString("\n    ");
    const360 = termFactory.makeString("\n}\n");
    constCons107 = (IStrategoTerm)termFactory.makeListCons(trans.const360, (IStrategoList)trans.constNil1);
    const361 = termFactory.makeString("{\n    ");
    const362 = termFactory.makeTuple();
    const363 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'to-java'");
    const364 = termFactory.makeString(";\n\n");
    const365 = termFactory.makeString("\n                          ");
    const366 = termFactory.makeString(";\n");
    constCons108 = (IStrategoTerm)termFactory.makeListCons(trans.const366, (IStrategoList)trans.constNil1);
    const367 = termFactory.makeString(");\n");
    constCons109 = (IStrategoTerm)termFactory.makeListCons(trans.const367, (IStrategoList)trans.constNil1);
    const368 = termFactory.makeString("System.out.println(");
    const369 = termFactory.makeString(".");
    const370 = termFactory.makeString(")");
    constCons110 = (IStrategoTerm)termFactory.makeListCons(trans.const370, (IStrategoList)trans.constNil1);
    const371 = termFactory.makeString("int");
    const372 = termFactory.makeString("package ");
    const373 = termFactory.makeString("import ");
    const374 = termFactory.makeString("\n      ");
    const375 = termFactory.makeString(".*");
    constCons111 = (IStrategoTerm)termFactory.makeListCons(trans.const375, (IStrategoList)trans.constNil1);
    const376 = termFactory.makeString("\n}\n\n");
    constCons112 = (IStrategoTerm)termFactory.makeListCons(trans.const376, (IStrategoList)trans.constNil1);
    const377 = termFactory.makeString(" \n{\n    ");
    const378 = termFactory.makeString("class ");
    const379 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'params-to-java'");
    const380 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'params-to-java2'");
    const381 = termFactory.makeString("\n  ");
    const382 = termFactory.makeString("\n                         ");
    const383 = termFactory.makeString(", ");
    const384 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'to-java-fixadvice'");
    const385 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'print-type'");
    const386 = termFactory.makeString("\n                     ");
    constCons113 = (IStrategoTerm)termFactory.makeListCons(trans.constStringType0, (IStrategoList)trans.constNil1);
    constCons114 = (IStrategoTerm)termFactory.makeListCons(trans.constIntType0, (IStrategoList)trans.constCons113);
    const387 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'constraint-error'");
    const388 = termFactory.makeString("\n                                        ");
    constCons115 = (IStrategoTerm)termFactory.makeListCons(trans.const369, (IStrategoList)trans.constNil1);
    const389 = termFactory.makeString(" but found ");
    const390 = termFactory.makeString("Expected ");
    const391 = termFactory.makeString("Unable to resolve.");
    constCons116 = (IStrategoTerm)termFactory.makeListCons(trans.const391, (IStrategoList)trans.constNil1);
    const392 = termFactory.makeString("Duplicate definition");
    constCons117 = (IStrategoTerm)termFactory.makeListCons(trans.const392, (IStrategoList)trans.constNil1);
    const393 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'adjust-index-import'");
    const394 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-defs'");
    const395 = termFactory.makeString("index-compilation");
    const396 = termFactory.makeString("Compiling files");
    const397 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-schedule-compilation'");
    const398 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation'");
    const399 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-split-partial-files'");
    const400 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation-file'");
    const401 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation-partial-file'");
    const402 = termFactory.makeString("Index-ReadSet");
    constDR_DUMMY0 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons118 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY0, (IStrategoList)trans.constNil1);
    const403 = termFactory.makeString("-744537");
    const404 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation-ast'");
    const405 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'commit-and-compile'");
    const406 = termFactory.makeString("delay-compile");
    const407 = termFactory.makeString("trigger-compile");
    const408 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'trigger-commit-and-compile'");
    const409 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'enable-commit-and-compile'");
    const410 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'index-compilation-file-tuple'");
    const411 = termFactory.makeString("\n                                ");
    const412 = termFactory.makeString("/");
    const413 = termFactory.makeString("/.internal/reads/compile");
    const414 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-internal'");
    const415 = termFactory.makeString("Index-UnresolvedSet");
    const416 = termFactory.makeString("120068");
    const417 = termFactory.makeTuple(trans.constNil1, trans.constNil1);
    const418 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-defs'");
    const419 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-data'");
    const420 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-uses'");
    constAnon0 = termFactory.makeAppl(Main._consAnon_0, NO_TERMS);
    constINTERNAL_ERROR0 = termFactory.makeAppl(Main._consINTERNAL_ERROR_0, NO_TERMS);
    const421 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-defs'");
    const422 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-uses'");
    const423 = termFactory.makeString("Unexpected result from adjust-index-def-data; should call <store-results>");
    const424 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-analyze'");
    const425 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-parse-file'");
    const426 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-set-markers'");
    const427 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-do-analysis'");
    const428 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-toplevel-split'");
    const429 = termFactory.makeTuple(trans.const362, trans.constNil1);
    constCons119 = (IStrategoTerm)termFactory.makeListCons(trans.const429, (IStrategoList)trans.constNil1);
    const430 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-toplevel-split-internal'");
    const431 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-transform-qualifier'");
    const432 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-diff'");
    const433 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-store-diff'");
    const434 = termFactory.makeString("ast-checksum");
    constCons120 = (IStrategoTerm)termFactory.makeListCons(trans.const434, (IStrategoList)trans.constNil1);
    const435 = termFactory.makeString("compile-diff");
    const436 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-lookup-all-scoped-internal'");
    const437 = termFactory.makeString("Unexpected result from adjust-index-import, should be a list of [namespace | path].");
    constStopLookup0 = termFactory.makeAppl(Main._consStopLookup_0, NO_TERMS);
    const438 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-adjust-import-results'");
    const439 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-adjust-import-recurse'");
    const440 = termFactory.makeString("Unexpected result from adjust-index-lookup, should be a list of Def(uri) or [namespace | path], or StopLookup() to stop the lookup.");
    const441 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-adjust-lookup-results'");
    const442 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'unzip-analyzed'");
    const443 = termFactory.makeString(".spt");
    const444 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'store-wildcard-read'");
    const445 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-file-dependent-construct'");
    const446 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'nam-annotate-def'");
    constEditor0 = termFactory.makeAppl(Main._consEditor_0, NO_TERMS);
    const447 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'analyze-top'");
    const448 = termFactory.makeString("\n               ");
    const449 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top'");
    const450 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-analyze-files'");
    const451 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-merge-ast'");
    const452 = termFactory.makeString("Def, key or URI expected");
    const453 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-all'");
    const454 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-children'");
    const455 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-filepairs-to-files'");
    const456 = termFactory.makeString("index-setup(|language, project-paths); use index-setup(|language, project-paths, current-file)");
    constCritical0 = termFactory.makeAppl(Main._consCritical_0, NO_TERMS);
    const457 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'index-add-all'");
    const458 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'index-remove-all'");
    const459 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-all-in-file'");
    const460 = termFactory.makeString("/.internal/globals");
    const461 = termFactory.makeString(".internal");
    constCons121 = (IStrategoTerm)termFactory.makeListCons(trans.const461, (IStrategoList)trans.constNil1);
    const462 = termFactory.makeString("globals");
    constCons122 = (IStrategoTerm)termFactory.makeListCons(trans.const462, (IStrategoList)trans.constCons121);
    constCons123 = (IStrategoTerm)termFactory.makeListCons(trans.constCons122, (IStrategoList)trans.constNil1);
    constGlobal0 = termFactory.makeAppl(Main._consGlobal_0, NO_TERMS);
    constCons124 = (IStrategoTerm)termFactory.makeListCons(trans.constGlobal0, (IStrategoList)trans.constNil1);
    const463 = termFactory.makeString("global");
    constCons125 = (IStrategoTerm)termFactory.makeListCons(trans.const463, (IStrategoList)trans.constCons121);
    const464 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-globals-uri'");
    const465 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-all-globals'");
    const466 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-add-global'");
    const467 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-set-global'");
    const468 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-clear-global'");
    const469 = termFactory.makeString("boolean");
    constCons126 = (IStrategoTerm)termFactory.makeListCons(trans.const469, (IStrategoList)trans.constCons122);
    constCons127 = (IStrategoTerm)termFactory.makeListCons(trans.constCons126, (IStrategoList)trans.constNil1);
    constCons128 = (IStrategoTerm)termFactory.makeListCons(trans.const469, (IStrategoList)trans.constCons125);
    const470 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-boolean-globals-uri'");
    const471 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-enable-global'");
    const472 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-disable-global'");
    const473 = termFactory.makeString("/.internal");
    const474 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-path-to-string'");
    const475 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-uri-to-string'");
    const476 = termFactory.makeString("://");
    const477 = termFactory.makeString("@");
    constEntityWithAspectsTbl = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.tbl");
    constEntityWithAspectsTbl0 = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.tbl");
    constEntityWithAspectsTbl1 = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.tbl");
    constEntityWithAspectsGeneratedPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.generated.pp.af");
    constEntityWithAspectsPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.pp.af");
    const478 = termFactory.makeString("EntityWithAspects");
    const479 = termFactory.makeString("CurrentFile");
    const480 = termFactory.makeString("99705");
    const481 = termFactory.makeString("IsImported");
    const482 = termFactory.makeString("-597601");
    const483 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const484 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const485 = termFactory.makeString("/.cache");
    constCons129 = (IStrategoTerm)termFactory.makeListCons(trans.const485, (IStrategoList)trans.constNil1);
    const486 = termFactory.makeString("+");
    const487 = termFactory.makeString(":");
    const488 = termFactory.makeString(".sig");
    constCons130 = (IStrategoTerm)termFactory.makeListCons(trans.const488, (IStrategoList)trans.constNil1);
    const489 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    constMARKER0 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons131 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER0, (IStrategoList)trans.constNil1);
    const490 = termFactory.makeInt(0);
    const491 = termFactory.makeString("BACKGROUNDED");
    const492 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze'");
    const493 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const494 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-resolve'");
    const495 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-hover'");
    const496 = termFactory.makeString("aterm");
    const497 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-generate-aterm'");
    const498 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-generate-deffed'");
    const499 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-generate-deffed'");
    const500 = termFactory.makeString("analyzed.aterm");
    const501 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-generate-analyzed'");
    const502 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-show-current-file'");
    const503 = termFactory.makeString("index.currentfile.aterm");
    const504 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-show-current-file'");
    const505 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-show-all-files'");
    const506 = termFactory.makeString("index.allfiles.aterm");
    const507 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-show-all-files'");
    const508 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-clear-current'");
    const509 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-clear-current'");
    const510 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-clear'");
    const511 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-clear'");
    const512 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-reload'");
    const513 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-reload'");
    const514 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'generate-test-files'");
    const515 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-test-files'");
    const516 = termFactory.makeString("editor-parallel-analyze");
    const517 = termFactory.makeString("Analyzing files");
    const518 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-parallel-analyze'");
    const519 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-sequential-analyze'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}