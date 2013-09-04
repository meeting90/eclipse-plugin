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

@SuppressWarnings("all") public class nam_annotate_names_0_2 extends Strategy 
{ 
  public static nam_annotate_names_0_2 instance = new nam_annotate_names_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_12058, IStrategoTerm ref_l_12058)
  { 
    TermReference k_12058 = new TermReference(ref_k_12058);
    TermReference l_12058 = new TermReference(ref_l_12058);
    context.push("nam_annotate_names_0_2");
    Fail4382:
    { 
      IStrategoTerm term2360 = term;
      IStrategoConstructor cons122 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2360:
      { 
        if(cons122 == Main._consModule_3)
        { 
          Fail4383:
          { 
            lifted900 lifted9000 = new lifted900();
            lifted9000.l_12058 = l_12058;
            term = $Module_3_0.instance.invoke(context, term, lifted9000, _Id.instance, _Id.instance);
            if(term == null)
              break Fail4383;
            if(true)
              break Success2360;
          }
          term = term2360;
        }
        Success2361:
        { 
          if(cons122 == Main._consEntityImport_2)
          { 
            Fail4384:
            { 
              lifted904 lifted9040 = new lifted904();
              lifted903 lifted9030 = new lifted903();
              lifted9040.k_12058 = k_12058;
              lifted9030.k_12058 = k_12058;
              term = $Entity$Import_2_0.instance.invoke(context, term, lifted9030, lifted9040);
              if(term == null)
                break Fail4384;
              if(true)
                break Success2361;
            }
            term = term2360;
          }
          Success2362:
          { 
            if(cons122 == Main._consWildcardImport_1)
            { 
              Fail4385:
              { 
                lifted905 lifted9050 = new lifted905();
                lifted9050.l_12058 = l_12058;
                term = $Wildcard$Import_1_0.instance.invoke(context, term, lifted9050);
                if(term == null)
                  break Fail4385;
                if(true)
                  break Success2362;
              }
              term = term2360;
            }
            Success2363:
            { 
              if(cons122 == Main._consAspect_2)
              { 
                Fail4386:
                { 
                  lifted906 lifted9060 = new lifted906();
                  lifted9060.l_12058 = l_12058;
                  term = $Aspect_2_0.instance.invoke(context, term, lifted9060, _Id.instance);
                  if(term == null)
                    break Fail4386;
                  if(true)
                    break Success2363;
                }
                term = term2360;
              }
              Success2364:
              { 
                if(cons122 == Main._consPointcut_3)
                { 
                  Fail4387:
                  { 
                    lifted908 lifted9080 = new lifted908();
                    lifted9080.l_12058 = l_12058;
                    term = $Pointcut_3_0.instance.invoke(context, term, lifted9080, _Id.instance, _Id.instance);
                    if(term == null)
                      break Fail4387;
                    if(true)
                      break Success2364;
                  }
                  term = term2360;
                }
                Success2365:
                { 
                  if(cons122 == Main._consAdvice_6)
                  { 
                    Fail4388:
                    { 
                      lifted914 lifted9140 = new lifted914();
                      lifted911 lifted9110 = new lifted911();
                      lifted9140.k_12058 = k_12058;
                      lifted9110.l_12058 = l_12058;
                      term = $Advice_6_0.instance.invokeDynamic(context, term, new Strategy[]{lifted9110, _Id.instance, _Id.instance, lifted9140, _Id.instance, _Id.instance}, NO_TERMS);
                      if(term == null)
                        break Fail4388;
                      if(true)
                        break Success2365;
                    }
                    term = term2360;
                  }
                  Success2366:
                  { 
                    if(cons122 == Main._consEntity_2)
                    { 
                      Fail4389:
                      { 
                        lifted917 lifted9170 = new lifted917();
                        lifted9170.l_12058 = l_12058;
                        term = $Entity_2_0.instance.invoke(context, term, lifted9170, _Id.instance);
                        if(term == null)
                          break Fail4389;
                        if(true)
                          break Success2366;
                      }
                      term = term2360;
                    }
                    Success2367:
                    { 
                      if(cons122 == Main._consType_1)
                      { 
                        Fail4390:
                        { 
                          lifted919 lifted9190 = new lifted919();
                          lifted9190.k_12058 = k_12058;
                          term = $Type_1_0.instance.invoke(context, term, lifted9190);
                          if(term == null)
                            break Fail4390;
                          if(true)
                            break Success2367;
                        }
                        term = term2360;
                      }
                      Success2368:
                      { 
                        if(cons122 == Main._consProperty_2)
                        { 
                          Fail4391:
                          { 
                            lifted920 lifted9200 = new lifted920();
                            lifted9200.l_12058 = l_12058;
                            term = $Property_2_0.instance.invoke(context, term, lifted9200, _Id.instance);
                            if(term == null)
                              break Fail4391;
                            if(true)
                              break Success2368;
                          }
                          term = term2360;
                        }
                        Success2369:
                        { 
                          if(cons122 == Main._consPropAccess_2)
                          { 
                            Fail4392:
                            { 
                              lifted923 lifted9230 = new lifted923();
                              lifted9230.k_12058 = k_12058;
                              term = $Prop$Access_2_0.instance.invoke(context, term, _Id.instance, lifted9230);
                              if(term == null)
                                break Fail4392;
                              if(true)
                                break Success2369;
                            }
                            term = term2360;
                          }
                          Success2370:
                          { 
                            if(cons122 == Main._consFunction_3)
                            { 
                              Fail4393:
                              { 
                                lifted924 lifted9240 = new lifted924();
                                lifted9240.l_12058 = l_12058;
                                term = $Function_3_0.instance.invoke(context, term, lifted9240, _Id.instance, _Id.instance);
                                if(term == null)
                                  break Fail4393;
                                if(true)
                                  break Success2370;
                              }
                              term = term2360;
                            }
                            Success2371:
                            { 
                              if(cons122 == Main._consCall_2)
                              { 
                                Fail4394:
                                { 
                                  lifted927 lifted9270 = new lifted927();
                                  lifted9270.k_12058 = k_12058;
                                  term = $Call_2_0.instance.invoke(context, term, lifted9270, _Id.instance);
                                  if(term == null)
                                    break Fail4394;
                                  if(true)
                                    break Success2371;
                                }
                                term = term2360;
                              }
                              Success2372:
                              { 
                                if(cons122 == Main._consVarDecl_2)
                                { 
                                  Fail4395:
                                  { 
                                    lifted929 lifted9290 = new lifted929();
                                    lifted9290.l_12058 = l_12058;
                                    term = $Var$Decl_2_0.instance.invoke(context, term, lifted9290, _Id.instance);
                                    if(term == null)
                                      break Fail4395;
                                    if(true)
                                      break Success2372;
                                  }
                                  term = term2360;
                                }
                                Success2373:
                                { 
                                  if(cons122 == Main._consVarDeclInit_3)
                                  { 
                                    Fail4396:
                                    { 
                                      lifted931 lifted9310 = new lifted931();
                                      lifted9310.l_12058 = l_12058;
                                      term = $Var$Decl$Init_3_0.instance.invoke(context, term, lifted9310, _Id.instance, _Id.instance);
                                      if(term == null)
                                        break Fail4396;
                                      if(true)
                                        break Success2373;
                                    }
                                    term = term2360;
                                  }
                                  Success2374:
                                  { 
                                    if(cons122 == Main._consParam_2)
                                    { 
                                      Fail4397:
                                      { 
                                        lifted934 lifted9340 = new lifted934();
                                        lifted9340.l_12058 = l_12058;
                                        term = $Param_2_0.instance.invoke(context, term, lifted9340, _Id.instance);
                                        if(term == null)
                                          break Fail4397;
                                        if(true)
                                          break Success2374;
                                      }
                                      term = term2360;
                                    }
                                    if(cons122 == Main._consVar_1)
                                    { 
                                      lifted936 lifted9360 = new lifted936();
                                      lifted9360.k_12058 = k_12058;
                                      term = $Var_1_0.instance.invoke(context, term, lifted9360);
                                      if(term == null)
                                        break Fail4382;
                                    }
                                    else
                                    { 
                                      break Fail4382;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}