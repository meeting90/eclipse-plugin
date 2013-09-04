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

  protected static IStrategoTerm const1039;

  protected static IStrategoTerm const1038;

  protected static IStrategoTerm const1037;

  protected static IStrategoTerm const1036;

  protected static IStrategoTerm const1035;

  protected static IStrategoTerm const1034;

  protected static IStrategoTerm const1033;

  protected static IStrategoTerm const1032;

  protected static IStrategoTerm const1031;

  protected static IStrategoTerm const1030;

  protected static IStrategoTerm const1029;

  protected static IStrategoTerm const1028;

  protected static IStrategoTerm const1027;

  protected static IStrategoTerm const1026;

  protected static IStrategoTerm const1025;

  protected static IStrategoTerm const1024;

  protected static IStrategoTerm const1023;

  protected static IStrategoTerm const1022;

  protected static IStrategoTerm const1021;

  protected static IStrategoTerm const1020;

  protected static IStrategoTerm const1019;

  protected static IStrategoTerm const1018;

  protected static IStrategoTerm const1017;

  protected static IStrategoTerm const1016;

  protected static IStrategoTerm const1015;

  protected static IStrategoTerm const1014;

  protected static IStrategoTerm const1013;

  protected static IStrategoTerm const1012;

  protected static IStrategoTerm const1011;

  protected static IStrategoTerm const1010;

  protected static IStrategoTerm constCons263;

  protected static IStrategoTerm constMARKER0;

  protected static IStrategoTerm const1009;

  protected static IStrategoTerm constCons262;

  protected static IStrategoTerm const1008;

  protected static IStrategoTerm const1007;

  protected static IStrategoTerm const1006;

  protected static IStrategoTerm constCons261;

  protected static IStrategoTerm const1005;

  protected static IStrategoTerm const1004;

  protected static IStrategoTerm const1003;

  protected static IStrategoTerm const1002;

  protected static IStrategoTerm const1001;

  protected static IStrategoTerm const1000;

  protected static IStrategoTerm const999;

  protected static IStrategoTerm const998;

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

  protected static IStrategoTerm const997;

  protected static IStrategoTerm const996;

  protected static IStrategoTerm const995;

  protected static IStrategoTerm const994;

  protected static IStrategoTerm const993;

  protected static IStrategoTerm const992;

  protected static IStrategoTerm const991;

  protected static IStrategoTerm const990;

  protected static IStrategoTerm constCons260;

  protected static IStrategoTerm constCons259;

  protected static IStrategoTerm constCons258;

  protected static IStrategoTerm const989;

  protected static IStrategoTerm const988;

  protected static IStrategoTerm const987;

  protected static IStrategoTerm const986;

  protected static IStrategoTerm const985;

  protected static IStrategoTerm const984;

  protected static IStrategoTerm constCons257;

  protected static IStrategoTerm const983;

  protected static IStrategoTerm constCons256;

  protected static IStrategoTerm constGlobal0;

  protected static IStrategoTerm constCons255;

  protected static IStrategoTerm constCons254;

  protected static IStrategoTerm const982;

  protected static IStrategoTerm constCons253;

  protected static IStrategoTerm const981;

  protected static IStrategoTerm const980;

  protected static IStrategoTerm const979;

  protected static IStrategoTerm const978;

  protected static IStrategoTerm const977;

  protected static IStrategoTerm constCritical0;

  protected static IStrategoTerm const976;

  protected static IStrategoTerm const975;

  protected static IStrategoTerm const974;

  protected static IStrategoTerm const973;

  protected static IStrategoTerm const972;

  protected static IStrategoTerm const971;

  protected static IStrategoTerm const970;

  protected static IStrategoTerm const969;

  protected static IStrategoTerm const968;

  protected static IStrategoTerm const967;

  protected static IStrategoTerm constEditor0;

  protected static IStrategoTerm const966;

  protected static IStrategoTerm const965;

  protected static IStrategoTerm const964;

  protected static IStrategoTerm const963;

  protected static IStrategoTerm const962;

  protected static IStrategoTerm const961;

  protected static IStrategoTerm const960;

  protected static IStrategoTerm const959;

  protected static IStrategoTerm const958;

  protected static IStrategoTerm constStopLookup0;

  protected static IStrategoTerm const957;

  protected static IStrategoTerm const956;

  protected static IStrategoTerm const955;

  protected static IStrategoTerm constCons252;

  protected static IStrategoTerm const954;

  protected static IStrategoTerm const953;

  protected static IStrategoTerm const952;

  protected static IStrategoTerm const951;

  protected static IStrategoTerm const950;

  protected static IStrategoTerm constCons251;

  protected static IStrategoTerm const949;

  protected static IStrategoTerm const948;

  protected static IStrategoTerm const947;

  protected static IStrategoTerm const946;

  protected static IStrategoTerm const945;

  protected static IStrategoTerm const944;

  protected static IStrategoTerm const943;

  protected static IStrategoTerm const942;

  protected static IStrategoTerm const941;

  protected static IStrategoTerm constINTERNAL_ERROR0;

  protected static IStrategoTerm constAnon0;

  protected static IStrategoTerm const940;

  protected static IStrategoTerm const939;

  protected static IStrategoTerm const938;

  protected static IStrategoTerm const937;

  protected static IStrategoTerm const936;

  protected static IStrategoTerm const935;

  protected static IStrategoTerm const934;

  protected static IStrategoTerm const933;

  protected static IStrategoTerm const932;

  protected static IStrategoTerm const931;

  protected static IStrategoTerm const930;

  protected static IStrategoTerm const929;

  protected static IStrategoTerm const928;

  protected static IStrategoTerm const927;

  protected static IStrategoTerm const926;

  protected static IStrategoTerm const925;

  protected static IStrategoTerm const924;

  protected static IStrategoTerm const923;

  protected static IStrategoTerm constCons250;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm const922;

  protected static IStrategoTerm const921;

  protected static IStrategoTerm const920;

  protected static IStrategoTerm const919;

  protected static IStrategoTerm const918;

  protected static IStrategoTerm const917;

  protected static IStrategoTerm const916;

  protected static IStrategoTerm const915;

  protected static IStrategoTerm const914;

  protected static IStrategoTerm const913;

  protected static IStrategoTerm constCons249;

  protected static IStrategoTerm const912;

  protected static IStrategoTerm constCons248;

  protected static IStrategoTerm const911;

  protected static IStrategoTerm const910;

  protected static IStrategoTerm const909;

  protected static IStrategoTerm constCons247;

  protected static IStrategoTerm const908;

  protected static IStrategoTerm const907;

  protected static IStrategoTerm constCons246;

  protected static IStrategoTerm constCons245;

  protected static IStrategoTerm const906;

  protected static IStrategoTerm const905;

  protected static IStrategoTerm const904;

  protected static IStrategoTerm const903;

  protected static IStrategoTerm const902;

  protected static IStrategoTerm const901;

  protected static IStrategoTerm const900;

  protected static IStrategoTerm const899;

  protected static IStrategoTerm const898;

  protected static IStrategoTerm const897;

  protected static IStrategoTerm constCons244;

  protected static IStrategoTerm const896;

  protected static IStrategoTerm constCons243;

  protected static IStrategoTerm const895;

  protected static IStrategoTerm const894;

  protected static IStrategoTerm const893;

  protected static IStrategoTerm const892;

  protected static IStrategoTerm const891;

  protected static IStrategoTerm constCons242;

  protected static IStrategoTerm const890;

  protected static IStrategoTerm const889;

  protected static IStrategoTerm const888;

  protected static IStrategoTerm constCons241;

  protected static IStrategoTerm const887;

  protected static IStrategoTerm constCons240;

  protected static IStrategoTerm const886;

  protected static IStrategoTerm const885;

  protected static IStrategoTerm const884;

  protected static IStrategoTerm const883;

  protected static IStrategoTerm const882;

  protected static IStrategoTerm const881;

  protected static IStrategoTerm constCons239;

  protected static IStrategoTerm const880;

  protected static IStrategoTerm const879;

  protected static IStrategoTerm const878;

  protected static IStrategoTerm const877;

  protected static IStrategoTerm const876;

  protected static IStrategoTerm constCons238;

  protected static IStrategoTerm const875;

  protected static IStrategoTerm const874;

  protected static IStrategoTerm const873;

  protected static IStrategoTerm const872;

  protected static IStrategoTerm const871;

  protected static IStrategoTerm const870;

  protected static IStrategoTerm const869;

  protected static IStrategoTerm const868;

  protected static IStrategoTerm const867;

  protected static IStrategoTerm const866;

  protected static IStrategoTerm const865;

  protected static IStrategoTerm constCons237;

  protected static IStrategoTerm const864;

  protected static IStrategoTerm const863;

  protected static IStrategoTerm const862;

  protected static IStrategoTerm const861;

  protected static IStrategoTerm const860;

  protected static IStrategoTerm const859;

  protected static IStrategoTerm const858;

  protected static IStrategoTerm const857;

  protected static IStrategoTerm const856;

  protected static IStrategoTerm const855;

  protected static IStrategoTerm const854;

  protected static IStrategoTerm const853;

  protected static IStrategoTerm const852;

  protected static IStrategoTerm constCons236;

  protected static IStrategoTerm const851;

  protected static IStrategoTerm const850;

  protected static IStrategoTerm const849;

  protected static IStrategoTerm const848;

  protected static IStrategoTerm constCons235;

  protected static IStrategoTerm constBefore0;

  protected static IStrategoTerm constCons234;

  protected static IStrategoTerm constAfter0;

  protected static IStrategoTerm const847;

  protected static IStrategoTerm const846;

  protected static IStrategoTerm const845;

  protected static IStrategoTerm const844;

  protected static IStrategoTerm const843;

  protected static IStrategoTerm const842;

  protected static IStrategoTerm const841;

  protected static IStrategoTerm const840;

  protected static IStrategoTerm const839;

  protected static IStrategoTerm constCons233;

  protected static IStrategoTerm const838;

  protected static IStrategoTerm const837;

  protected static IStrategoTerm const836;

  protected static IStrategoTerm const835;

  protected static IStrategoTerm const834;

  protected static IStrategoTerm const833;

  protected static IStrategoTerm const832;

  protected static IStrategoTerm const831;

  protected static IStrategoTerm const830;

  protected static IStrategoTerm const829;

  protected static IStrategoTerm const828;

  protected static IStrategoTerm const827;

  protected static IStrategoTerm const826;

  protected static IStrategoTerm const825;

  protected static IStrategoTerm const824;

  protected static IStrategoTerm const823;

  protected static IStrategoTerm const822;

  protected static IStrategoTerm const821;

  protected static IStrategoTerm const820;

  protected static IStrategoTerm const819;

  protected static IStrategoTerm const818;

  protected static IStrategoTerm const817;

  protected static IStrategoTerm const816;

  protected static IStrategoTerm const815;

  protected static IStrategoTerm constCons232;

  protected static IStrategoTerm const814;

  protected static IStrategoTerm const813;

  protected static IStrategoTerm const812;

  protected static IStrategoTerm constCons231;

  protected static IStrategoTerm const811;

  protected static IStrategoTerm const810;

  protected static IStrategoTerm const809;

  protected static IStrategoTerm constCons230;

  protected static IStrategoTerm const808;

  protected static IStrategoTerm const807;

  protected static IStrategoTerm const806;

  protected static IStrategoTerm constCons229;

  protected static IStrategoTerm const805;

  protected static IStrategoTerm const804;

  protected static IStrategoTerm const803;

  protected static IStrategoTerm constCons228;

  protected static IStrategoTerm const802;

  protected static IStrategoTerm const801;

  protected static IStrategoTerm const800;

  protected static IStrategoTerm constCons227;

  protected static IStrategoTerm const799;

  protected static IStrategoTerm const798;

  protected static IStrategoTerm const797;

  protected static IStrategoTerm constCons226;

  protected static IStrategoTerm const796;

  protected static IStrategoTerm const795;

  protected static IStrategoTerm const794;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const793;

  protected static IStrategoTerm constCons225;

  protected static IStrategoTerm const792;

  protected static IStrategoTerm constCons224;

  protected static IStrategoTerm const791;

  protected static IStrategoTerm constCons223;

  protected static IStrategoTerm const790;

  protected static IStrategoTerm constCons222;

  protected static IStrategoTerm const789;

  protected static IStrategoTerm constCons221;

  protected static IStrategoTerm const788;

  protected static IStrategoTerm constCons220;

  protected static IStrategoTerm const787;

  protected static IStrategoTerm constCons219;

  protected static IStrategoTerm const786;

  protected static IStrategoTerm const785;

  protected static IStrategoTerm const784;

  protected static IStrategoTerm constIntType0;

  protected static IStrategoTerm constStringType0;

  protected static IStrategoTerm constType2;

  protected static IStrategoTerm constType1;

  protected static IStrategoTerm constType0;

  protected static IStrategoTerm constCons218;

  protected static IStrategoTerm constCurrentFile0;

  protected static IStrategoTerm constCons217;

  protected static IStrategoTerm constCons216;

  protected static IStrategoTerm constDef1;

  protected static IStrategoTerm constCons215;

  protected static IStrategoTerm constCons214;

  protected static IStrategoTerm constCons213;

  protected static IStrategoTerm constDef0;

  protected static IStrategoTerm constCons212;

  protected static IStrategoTerm constCons211;

  protected static IStrategoTerm const783;

  protected static IStrategoTerm constCons210;

  protected static IStrategoTerm constCons209;

  protected static IStrategoTerm const782;

  protected static IStrategoTerm constCons208;

  protected static IStrategoTerm const781;

  protected static IStrategoTerm constCons207;

  protected static IStrategoTerm const780;

  protected static IStrategoTerm constImport0;

  protected static IStrategoTerm constModule0;

  protected static IStrategoTerm constCons206;

  protected static IStrategoTerm constCons205;

  protected static IStrategoTerm constCons204;

  protected static IStrategoTerm constProperty0;

  protected static IStrategoTerm constCons203;

  protected static IStrategoTerm constFunction0;

  protected static IStrategoTerm constCons202;

  protected static IStrategoTerm constVariable0;

  protected static IStrategoTerm constCons201;

  protected static IStrategoTerm constPointcut0;

  protected static IStrategoTerm constCons200;

  protected static IStrategoTerm constAdvice0;

  protected static IStrategoTerm constCons199;

  protected static IStrategoTerm constEntity0;

  protected static IStrategoTerm constCons198;

  protected static IStrategoTerm constAspect0;

  protected static IStrategoTerm constNil3;

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
    constNil3 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    constAspect0 = termFactory.makeAppl(Main._consAspect_0, NO_TERMS);
    constCons198 = (IStrategoTerm)termFactory.makeListCons(trans.constAspect0, (IStrategoList)trans.constNil3);
    constEntity0 = termFactory.makeAppl(Main._consEntity_0, NO_TERMS);
    constCons199 = (IStrategoTerm)termFactory.makeListCons(trans.constEntity0, (IStrategoList)trans.constCons198);
    constAdvice0 = termFactory.makeAppl(Main._consAdvice_0, NO_TERMS);
    constCons200 = (IStrategoTerm)termFactory.makeListCons(trans.constAdvice0, (IStrategoList)trans.constNil3);
    constPointcut0 = termFactory.makeAppl(Main._consPointcut_0, NO_TERMS);
    constCons201 = (IStrategoTerm)termFactory.makeListCons(trans.constPointcut0, (IStrategoList)trans.constCons200);
    constVariable0 = termFactory.makeAppl(Main._consVariable_0, NO_TERMS);
    constCons202 = (IStrategoTerm)termFactory.makeListCons(trans.constVariable0, (IStrategoList)trans.constNil3);
    constFunction0 = termFactory.makeAppl(Main._consFunction_0, NO_TERMS);
    constCons203 = (IStrategoTerm)termFactory.makeListCons(trans.constFunction0, (IStrategoList)trans.constNil3);
    constProperty0 = termFactory.makeAppl(Main._consProperty_0, NO_TERMS);
    constCons204 = (IStrategoTerm)termFactory.makeListCons(trans.constProperty0, (IStrategoList)trans.constCons203);
    constCons205 = (IStrategoTerm)termFactory.makeListCons(trans.constProperty0, (IStrategoList)trans.constNil3);
    constCons206 = (IStrategoTerm)termFactory.makeListCons(trans.constVariable0, (IStrategoList)trans.constCons205);
    constModule0 = termFactory.makeAppl(Main._consModule_0, NO_TERMS);
    constImport0 = termFactory.makeAppl(Main._consImport_0, NO_TERMS);
    const780 = termFactory.makeString("String");
    constCons207 = (IStrategoTerm)termFactory.makeListCons(trans.const780, (IStrategoList)trans.constNil3);
    const781 = termFactory.makeString("Int");
    constCons208 = (IStrategoTerm)termFactory.makeListCons(trans.const781, (IStrategoList)trans.constCons207);
    const782 = termFactory.makeTuple(trans.constEntity0, trans.constCons207);
    constCons209 = (IStrategoTerm)termFactory.makeListCons(trans.const782, (IStrategoList)trans.constNil3);
    constCons210 = (IStrategoTerm)termFactory.makeListCons(trans.const781, (IStrategoList)trans.constNil3);
    const783 = termFactory.makeTuple(trans.constEntity0, trans.constCons210);
    constCons211 = (IStrategoTerm)termFactory.makeListCons(trans.const783, (IStrategoList)trans.constCons209);
    constCons212 = (IStrategoTerm)termFactory.makeListCons(trans.constEntity0, (IStrategoList)trans.constCons207);
    constDef0 = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{trans.constCons212});
    constCons213 = (IStrategoTerm)termFactory.makeListCons(trans.constDef0, (IStrategoList)trans.constNil3);
    constCons214 = (IStrategoTerm)termFactory.makeListCons(trans.constCons213, (IStrategoList)trans.constNil3);
    constCons215 = (IStrategoTerm)termFactory.makeListCons(trans.constEntity0, (IStrategoList)trans.constCons210);
    constDef1 = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{trans.constCons215});
    constCons216 = (IStrategoTerm)termFactory.makeListCons(trans.constDef1, (IStrategoList)trans.constNil3);
    constCons217 = (IStrategoTerm)termFactory.makeListCons(trans.constCons216, (IStrategoList)trans.constCons214);
    constCurrentFile0 = termFactory.makeAppl(Main._consCurrentFile_0, NO_TERMS);
    constCons218 = (IStrategoTerm)termFactory.makeListCons(trans.constCurrentFile0, (IStrategoList)trans.constNil3);
    constType0 = termFactory.makeAppl(Main._consType_0, NO_TERMS);
    constType1 = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{trans.const780});
    constType2 = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{trans.const781});
    constStringType0 = termFactory.makeAppl(Main._consStringType_0, NO_TERMS);
    constIntType0 = termFactory.makeAppl(Main._consIntType_0, NO_TERMS);
    const784 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'create-quoted-libraries'");
    const785 = termFactory.makeString("\n");
    const786 = termFactory.makeString(".generated.str2");
    constCons219 = (IStrategoTerm)termFactory.makeListCons(trans.const786, (IStrategoList)trans.constNil3);
    const787 = termFactory.makeString("/lib/index-library");
    constCons220 = (IStrategoTerm)termFactory.makeListCons(trans.const787, (IStrategoList)trans.constNil3);
    const788 = termFactory.makeString("/lib/analysis-library");
    constCons221 = (IStrategoTerm)termFactory.makeListCons(trans.const788, (IStrategoList)trans.constNil3);
    const789 = termFactory.makeString("/lib/analysis-library-internal");
    constCons222 = (IStrategoTerm)termFactory.makeListCons(trans.const789, (IStrategoList)trans.constNil3);
    const790 = termFactory.makeString("/lib/compilation-library");
    constCons223 = (IStrategoTerm)termFactory.makeListCons(trans.const790, (IStrategoList)trans.constNil3);
    const791 = termFactory.makeString("/lib/nbl-library");
    constCons224 = (IStrategoTerm)termFactory.makeListCons(trans.const791, (IStrategoList)trans.constNil3);
    const792 = termFactory.makeString(".str");
    constCons225 = (IStrategoTerm)termFactory.makeListCons(trans.const792, (IStrategoList)trans.constNil3);
    const793 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'create-quoted-libraries'");
    constNone0 = termFactory.makeAppl(Main._consNone_0, NO_TERMS);
    const794 = termFactory.makeString("lib/nbl-library");
    const795 = termFactory.makeString("lib/nbl-library.generated");
    const796 = termFactory.makeTuple(trans.const794, trans.const795);
    constCons226 = (IStrategoTerm)termFactory.makeListCons(trans.const796, (IStrategoList)trans.constNil3);
    const797 = termFactory.makeString("lib/compilation-library");
    const798 = termFactory.makeString("lib/compilation-library.generated");
    const799 = termFactory.makeTuple(trans.const797, trans.const798);
    constCons227 = (IStrategoTerm)termFactory.makeListCons(trans.const799, (IStrategoList)trans.constCons226);
    const800 = termFactory.makeString("lib/analysis-library.generated-internal");
    const801 = termFactory.makeString("lib/analysis-library-internal.generated");
    const802 = termFactory.makeTuple(trans.const800, trans.const801);
    constCons228 = (IStrategoTerm)termFactory.makeListCons(trans.const802, (IStrategoList)trans.constCons227);
    const803 = termFactory.makeString("lib/analysis-library");
    const804 = termFactory.makeString("lib/analysis-library.generated");
    const805 = termFactory.makeTuple(trans.const803, trans.const804);
    constCons229 = (IStrategoTerm)termFactory.makeListCons(trans.const805, (IStrategoList)trans.constCons228);
    const806 = termFactory.makeString("lib/index-library");
    const807 = termFactory.makeString("lib/index-library.generated");
    const808 = termFactory.makeTuple(trans.const806, trans.const807);
    constCons230 = (IStrategoTerm)termFactory.makeListCons(trans.const808, (IStrategoList)trans.constCons229);
    const809 = termFactory.makeString("\"");
    const810 = termFactory.makeString("\\\"");
    const811 = termFactory.makeTuple(trans.const809, trans.const810);
    constCons231 = (IStrategoTerm)termFactory.makeListCons(trans.const811, (IStrategoList)trans.constCons230);
    const812 = termFactory.makeString("\\");
    const813 = termFactory.makeString("\\\\");
    const814 = termFactory.makeTuple(trans.const812, trans.const813);
    constCons232 = (IStrategoTerm)termFactory.makeListCons(trans.const814, (IStrategoList)trans.constCons231);
    const815 = termFactory.makeString("w");
    const816 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'write-lib'");
    const817 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'list-string-replace'");
    const818 = termFactory.makeString("/.internal/testgen");
    const819 = termFactory.makeString("TestGen");
    const820 = termFactory.makeInt(10);
    const821 = termFactory.makeInt(1);
    const822 = termFactory.makeInt(3);
    const823 = termFactory.makeInt(5);
    const824 = termFactory.makeInt(30);
    const825 = termFactory.makeInt(100);
    const826 = termFactory.makeInt(1073741823);
    const827 = termFactory.makeReal(0.5);
    const828 = termFactory.makeString("_");
    const829 = termFactory.makeString("");
    const830 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'random-type'");
    const831 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-add-ast'");
    const832 = termFactory.makeString("Writing ");
    const833 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-write-file'");
    const834 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen'");
    const835 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'testgen-group'");
    const836 = termFactory.makeString("\n                            ");
    const837 = termFactory.makeString("\n                                    ");
    const838 = termFactory.makeString(".ewa");
    constCons233 = (IStrategoTerm)termFactory.makeListCons(trans.const838, (IStrategoList)trans.constNil3);
    const839 = termFactory.makeString("/testgen/test_");
    const840 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-group'");
    const841 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-file'");
    const842 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-module'");
    const843 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-entity'");
    const844 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-property'");
    const845 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-function'");
    const846 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-statement'");
    const847 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-aspect'");
    constAfter0 = termFactory.makeAppl(Main._consAfter_0, NO_TERMS);
    constCons234 = (IStrategoTerm)termFactory.makeListCons(trans.constAfter0, (IStrategoList)trans.constNil3);
    constBefore0 = termFactory.makeAppl(Main._consBefore_0, NO_TERMS);
    constCons235 = (IStrategoTerm)termFactory.makeListCons(trans.constBefore0, (IStrategoList)trans.constCons234);
    const848 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'testgen-pointcutadvice'");
    const849 = termFactory.makeString("java");
    const850 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'index-compile-ast'");
    const851 = termFactory.makeString("/java/");
    constCons236 = (IStrategoTerm)termFactory.makeListCons(trans.const851, (IStrategoList)trans.constNil3);
    const852 = termFactory.makeString("\n           ");
    const853 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compile-ast'");
    const854 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'to-java'");
    const855 = termFactory.makeString("\n        ");
    const856 = termFactory.makeString("\n                   ");
    const857 = termFactory.makeString("\n       ");
    const858 = termFactory.makeString("\n                      ");
    const859 = termFactory.makeString("\n                ");
    const860 = termFactory.makeString("\n                       ");
    const861 = termFactory.makeString("\n                                  ");
    const862 = termFactory.makeString("\n         ");
    const863 = termFactory.makeString("\n                  ");
    const864 = termFactory.makeString(";    \n}\n\n");
    constCons237 = (IStrategoTerm)termFactory.makeListCons(trans.const864, (IStrategoList)trans.constNil3);
    const865 = termFactory.makeString(" = ");
    const866 = termFactory.makeString(") \n{\n    this.");
    const867 = termFactory.makeString(" ");
    const868 = termFactory.makeString("(");
    const869 = termFactory.makeString(";\n}\n\npublic void set_");
    const870 = termFactory.makeString(" \n{\n    return ");
    const871 = termFactory.makeString(" get_");
    const872 = termFactory.makeString(";\n\npublic ");
    const873 = termFactory.makeString("private ");
    const874 = termFactory.makeString("\n            ");
    const875 = termFactory.makeString("    \n");
    constCons238 = (IStrategoTerm)termFactory.makeListCons(trans.const875, (IStrategoList)trans.constNil3);
    const876 = termFactory.makeString(")\n");
    const877 = termFactory.makeString("public void ");
    const878 = termFactory.makeString("\n                 ");
    const879 = termFactory.makeString("\n    ");
    const880 = termFactory.makeString("\n}\n");
    constCons239 = (IStrategoTerm)termFactory.makeListCons(trans.const880, (IStrategoList)trans.constNil3);
    const881 = termFactory.makeString("{\n    ");
    const882 = termFactory.makeTuple();
    const883 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'to-java'");
    const884 = termFactory.makeString(";\n\n");
    const885 = termFactory.makeString("\n                          ");
    const886 = termFactory.makeString(";\n");
    constCons240 = (IStrategoTerm)termFactory.makeListCons(trans.const886, (IStrategoList)trans.constNil3);
    const887 = termFactory.makeString(");\n");
    constCons241 = (IStrategoTerm)termFactory.makeListCons(trans.const887, (IStrategoList)trans.constNil3);
    const888 = termFactory.makeString("System.out.println(");
    const889 = termFactory.makeString(".");
    const890 = termFactory.makeString(")");
    constCons242 = (IStrategoTerm)termFactory.makeListCons(trans.const890, (IStrategoList)trans.constNil3);
    const891 = termFactory.makeString("int");
    const892 = termFactory.makeString("package ");
    const893 = termFactory.makeString("import ");
    const894 = termFactory.makeString("\n      ");
    const895 = termFactory.makeString(".*");
    constCons243 = (IStrategoTerm)termFactory.makeListCons(trans.const895, (IStrategoList)trans.constNil3);
    const896 = termFactory.makeString("\n}\n\n");
    constCons244 = (IStrategoTerm)termFactory.makeListCons(trans.const896, (IStrategoList)trans.constNil3);
    const897 = termFactory.makeString(" \n{\n    ");
    const898 = termFactory.makeString("class ");
    const899 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'params-to-java'");
    const900 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'params-to-java2'");
    const901 = termFactory.makeString("\n  ");
    const902 = termFactory.makeString("\n                         ");
    const903 = termFactory.makeString(", ");
    const904 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'to-java-fixadvice'");
    const905 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in strategy 'print-type'");
    const906 = termFactory.makeString("\n                     ");
    constCons245 = (IStrategoTerm)termFactory.makeListCons(trans.constStringType0, (IStrategoList)trans.constNil3);
    constCons246 = (IStrategoTerm)termFactory.makeListCons(trans.constIntType0, (IStrategoList)trans.constCons245);
    const907 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'constraint-error'");
    const908 = termFactory.makeString("\n                                        ");
    constCons247 = (IStrategoTerm)termFactory.makeListCons(trans.const889, (IStrategoList)trans.constNil3);
    const909 = termFactory.makeString(" but found ");
    const910 = termFactory.makeString("Expected ");
    const911 = termFactory.makeString("Unable to resolve.");
    constCons248 = (IStrategoTerm)termFactory.makeListCons(trans.const911, (IStrategoList)trans.constNil3);
    const912 = termFactory.makeString("Duplicate definition");
    constCons249 = (IStrategoTerm)termFactory.makeListCons(trans.const912, (IStrategoList)trans.constNil3);
    const913 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'adjust-index-import'");
    const914 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-defs'");
    const915 = termFactory.makeString("index-compilation");
    const916 = termFactory.makeString("Compiling files");
    const917 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-schedule-compilation'");
    const918 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation'");
    const919 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-split-partial-files'");
    const920 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation-file'");
    const921 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation-partial-file'");
    const922 = termFactory.makeString("Index-ReadSet");
    constDR_DUMMY0 = termFactory.makeAppl(Main._consDR_DUMMY_0, NO_TERMS);
    constCons250 = (IStrategoTerm)termFactory.makeListCons(trans.constDR_DUMMY0, (IStrategoList)trans.constNil3);
    const923 = termFactory.makeString("-744537");
    const924 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-compilation-ast'");
    const925 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'commit-and-compile'");
    const926 = termFactory.makeString("delay-compile");
    const927 = termFactory.makeString("trigger-compile");
    const928 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'trigger-commit-and-compile'");
    const929 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'enable-commit-and-compile'");
    const930 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'index-compilation-file-tuple'");
    const931 = termFactory.makeString("\n                                ");
    const932 = termFactory.makeString("/");
    const933 = termFactory.makeString("/.internal/reads/compile");
    const934 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-internal'");
    const935 = termFactory.makeString("Index-UnresolvedSet");
    const936 = termFactory.makeString("120068");
    const937 = termFactory.makeTuple(trans.constNil3, trans.constNil3);
    const938 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-defs'");
    const939 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-data'");
    const940 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top-uses'");
    constAnon0 = termFactory.makeAppl(Main._consAnon_0, NO_TERMS);
    constINTERNAL_ERROR0 = termFactory.makeAppl(Main._consINTERNAL_ERROR_0, NO_TERMS);
    const941 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-defs'");
    const942 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-uses'");
    const943 = termFactory.makeString("Unexpected result from adjust-index-def-data; should call <store-results>");
    const944 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-analyze'");
    const945 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-parse-file'");
    const946 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-set-markers'");
    const947 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-do-analysis'");
    const948 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-toplevel-split'");
    const949 = termFactory.makeTuple(trans.const882, trans.constNil3);
    constCons251 = (IStrategoTerm)termFactory.makeListCons(trans.const949, (IStrategoList)trans.constNil3);
    const950 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-toplevel-split-internal'");
    const951 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-transform-qualifier'");
    const952 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-diff'");
    const953 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-store-diff'");
    const954 = termFactory.makeString("ast-checksum");
    constCons252 = (IStrategoTerm)termFactory.makeListCons(trans.const954, (IStrategoList)trans.constNil3);
    const955 = termFactory.makeString("compile-diff");
    const956 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-lookup-all-scoped-internal'");
    const957 = termFactory.makeString("Unexpected result from adjust-index-import, should be a list of [namespace | path].");
    constStopLookup0 = termFactory.makeAppl(Main._consStopLookup_0, NO_TERMS);
    const958 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-adjust-import-results'");
    const959 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-adjust-import-recurse'");
    const960 = termFactory.makeString("Unexpected result from adjust-index-lookup, should be a list of Def(uri) or [namespace | path], or StopLookup() to stop the lookup.");
    const961 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-adjust-lookup-results'");
    const962 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'unzip-analyzed'");
    const963 = termFactory.makeString(".spt");
    const964 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'store-wildcard-read'");
    const965 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-file-dependent-construct'");
    const966 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'nam-annotate-def'");
    constEditor0 = termFactory.makeAppl(Main._consEditor_0, NO_TERMS);
    const967 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'analyze-top'");
    const968 = termFactory.makeString("\n               ");
    const969 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze-top'");
    const970 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-analyze-files'");
    const971 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-merge-ast'");
    const972 = termFactory.makeString("Def, key or URI expected");
    const973 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-all'");
    const974 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-children'");
    const975 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-filepairs-to-files'");
    const976 = termFactory.makeString("index-setup(|language, project-paths); use index-setup(|language, project-paths, current-file)");
    constCritical0 = termFactory.makeAppl(Main._consCritical_0, NO_TERMS);
    const977 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'index-add-all'");
    const978 = termFactory.makeString("Internal error: with clause failed unexpectedly in strategy 'index-remove-all'");
    const979 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-all-in-file'");
    const980 = termFactory.makeString("/.internal/globals");
    const981 = termFactory.makeString(".internal");
    constCons253 = (IStrategoTerm)termFactory.makeListCons(trans.const981, (IStrategoList)trans.constNil3);
    const982 = termFactory.makeString("globals");
    constCons254 = (IStrategoTerm)termFactory.makeListCons(trans.const982, (IStrategoList)trans.constCons253);
    constCons255 = (IStrategoTerm)termFactory.makeListCons(trans.constCons254, (IStrategoList)trans.constNil3);
    constGlobal0 = termFactory.makeAppl(Main._consGlobal_0, NO_TERMS);
    constCons256 = (IStrategoTerm)termFactory.makeListCons(trans.constGlobal0, (IStrategoList)trans.constNil3);
    const983 = termFactory.makeString("global");
    constCons257 = (IStrategoTerm)termFactory.makeListCons(trans.const983, (IStrategoList)trans.constCons253);
    const984 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-globals-uri'");
    const985 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-get-all-globals'");
    const986 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-add-global'");
    const987 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-set-global'");
    const988 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-clear-global'");
    const989 = termFactory.makeString("boolean");
    constCons258 = (IStrategoTerm)termFactory.makeListCons(trans.const989, (IStrategoList)trans.constCons254);
    constCons259 = (IStrategoTerm)termFactory.makeListCons(trans.constCons258, (IStrategoList)trans.constNil3);
    constCons260 = (IStrategoTerm)termFactory.makeListCons(trans.const989, (IStrategoList)trans.constCons257);
    const990 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-boolean-globals-uri'");
    const991 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-enable-global'");
    const992 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-disable-global'");
    const993 = termFactory.makeString("/.internal");
    const994 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-path-to-string'");
    const995 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'index-uri-to-string'");
    const996 = termFactory.makeString("://");
    const997 = termFactory.makeString("@");
    constEntityWithAspectsTbl = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.tbl");
    constEntityWithAspectsTbl0 = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.tbl");
    constEntityWithAspectsTbl1 = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.tbl");
    constEntityWithAspectsGeneratedPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.generated.pp.af");
    constEntityWithAspectsPpAf = new ImportTerm(termFactory, trans.class, "/trans/", "EntityWithAspects.pp.af");
    const998 = termFactory.makeString("EntityWithAspects");
    const999 = termFactory.makeString("CurrentFile");
    const1000 = termFactory.makeString("99705");
    const1001 = termFactory.makeString("IsImported");
    const1002 = termFactory.makeString("-597601");
    const1003 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'open-wildcard-import'");
    const1004 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'import-cache-path'");
    const1005 = termFactory.makeString("/.cache");
    constCons261 = (IStrategoTerm)termFactory.makeListCons(trans.const1005, (IStrategoList)trans.constNil3);
    const1006 = termFactory.makeString("+");
    const1007 = termFactory.makeString(":");
    const1008 = termFactory.makeString(".sig");
    constCons262 = (IStrategoTerm)termFactory.makeListCons(trans.const1008, (IStrategoList)trans.constNil3);
    const1009 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'import-cache-path'");
    constMARKER0 = termFactory.makeAppl(Main._consMARKER_0, NO_TERMS);
    constCons263 = (IStrategoTerm)termFactory.makeListCons(trans.constMARKER0, (IStrategoList)trans.constNil3);
    const1010 = termFactory.makeInt(0);
    const1011 = termFactory.makeString("BACKGROUNDED");
    const1012 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'analyze'");
    const1013 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-analyze'");
    const1014 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-resolve'");
    const1015 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'editor-hover'");
    const1016 = termFactory.makeString("aterm");
    const1017 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-generate-aterm'");
    const1018 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-generate-deffed'");
    const1019 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-generate-deffed'");
    const1020 = termFactory.makeString("analyzed.aterm");
    const1021 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-generate-analyzed'");
    const1022 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-show-current-file'");
    const1023 = termFactory.makeString("index.currentfile.aterm");
    const1024 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-show-current-file'");
    const1025 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-show-all-files'");
    const1026 = termFactory.makeString("index.allfiles.aterm");
    const1027 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-show-all-files'");
    const1028 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-clear-current'");
    const1029 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-clear-current'");
    const1030 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-clear'");
    const1031 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-clear'");
    const1032 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'debug-index-reload'");
    const1033 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'debug-index-reload'");
    const1034 = termFactory.makeString("Internal error: escaped term in string quotation is not a string in rule 'generate-test-files'");
    const1035 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'generate-test-files'");
    const1036 = termFactory.makeString("editor-parallel-analyze");
    const1037 = termFactory.makeString("Analyzing files");
    const1038 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-parallel-analyze'");
    const1039 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'editor-sequential-analyze'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}