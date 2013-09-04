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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_2195, IStrategoTerm ref_q_2195)
  { 
    TermReference p_2195 = new TermReference(ref_p_2195);
    TermReference q_2195 = new TermReference(ref_q_2195);
    context.push("nam_annotate_names_0_2");
    Fail1480:
    { 
      IStrategoTerm term804 = term;
      IStrategoConstructor cons50 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success804:
      { 
        if(cons50 == Main._consModule_3)
        { 
          Fail1481:
          { 
            lifted300 lifted3000 = new lifted300();
            lifted3000.q_2195 = q_2195;
            term = $Module_3_0.instance.invoke(context, term, lifted3000, _Id.instance, _Id.instance);
            if(term == null)
              break Fail1481;
            if(true)
              break Success804;
          }
          term = term804;
        }
        Success805:
        { 
          if(cons50 == Main._consEntityImport_2)
          { 
            Fail1482:
            { 
              lifted304 lifted3040 = new lifted304();
              lifted303 lifted3030 = new lifted303();
              lifted3040.p_2195 = p_2195;
              lifted3030.p_2195 = p_2195;
              term = $Entity$Import_2_0.instance.invoke(context, term, lifted3030, lifted3040);
              if(term == null)
                break Fail1482;
              if(true)
                break Success805;
            }
            term = term804;
          }
          Success806:
          { 
            if(cons50 == Main._consWildcardImport_1)
            { 
              Fail1483:
              { 
                lifted305 lifted3050 = new lifted305();
                lifted3050.q_2195 = q_2195;
                term = $Wildcard$Import_1_0.instance.invoke(context, term, lifted3050);
                if(term == null)
                  break Fail1483;
                if(true)
                  break Success806;
              }
              term = term804;
            }
            Success807:
            { 
              if(cons50 == Main._consAspect_2)
              { 
                Fail1484:
                { 
                  lifted306 lifted3060 = new lifted306();
                  lifted3060.q_2195 = q_2195;
                  term = $Aspect_2_0.instance.invoke(context, term, lifted3060, _Id.instance);
                  if(term == null)
                    break Fail1484;
                  if(true)
                    break Success807;
                }
                term = term804;
              }
              Success808:
              { 
                if(cons50 == Main._consPointcut_3)
                { 
                  Fail1485:
                  { 
                    lifted308 lifted3080 = new lifted308();
                    lifted3080.q_2195 = q_2195;
                    term = $Pointcut_3_0.instance.invoke(context, term, lifted3080, _Id.instance, _Id.instance);
                    if(term == null)
                      break Fail1485;
                    if(true)
                      break Success808;
                  }
                  term = term804;
                }
                Success809:
                { 
                  if(cons50 == Main._consAdvice_6)
                  { 
                    Fail1486:
                    { 
                      lifted314 lifted3140 = new lifted314();
                      lifted311 lifted3110 = new lifted311();
                      lifted3140.p_2195 = p_2195;
                      lifted3110.q_2195 = q_2195;
                      term = $Advice_6_0.instance.invokeDynamic(context, term, new Strategy[]{lifted3110, _Id.instance, _Id.instance, lifted3140, _Id.instance, _Id.instance}, NO_TERMS);
                      if(term == null)
                        break Fail1486;
                      if(true)
                        break Success809;
                    }
                    term = term804;
                  }
                  Success810:
                  { 
                    if(cons50 == Main._consEntity_2)
                    { 
                      Fail1487:
                      { 
                        lifted317 lifted3170 = new lifted317();
                        lifted3170.q_2195 = q_2195;
                        term = $Entity_2_0.instance.invoke(context, term, lifted3170, _Id.instance);
                        if(term == null)
                          break Fail1487;
                        if(true)
                          break Success810;
                      }
                      term = term804;
                    }
                    Success811:
                    { 
                      if(cons50 == Main._consType_1)
                      { 
                        Fail1488:
                        { 
                          lifted319 lifted3190 = new lifted319();
                          lifted3190.p_2195 = p_2195;
                          term = $Type_1_0.instance.invoke(context, term, lifted3190);
                          if(term == null)
                            break Fail1488;
                          if(true)
                            break Success811;
                        }
                        term = term804;
                      }
                      Success812:
                      { 
                        if(cons50 == Main._consProperty_2)
                        { 
                          Fail1489:
                          { 
                            lifted320 lifted3200 = new lifted320();
                            lifted3200.q_2195 = q_2195;
                            term = $Property_2_0.instance.invoke(context, term, lifted3200, _Id.instance);
                            if(term == null)
                              break Fail1489;
                            if(true)
                              break Success812;
                          }
                          term = term804;
                        }
                        Success813:
                        { 
                          if(cons50 == Main._consPropAccess_2)
                          { 
                            Fail1490:
                            { 
                              lifted323 lifted3230 = new lifted323();
                              lifted3230.p_2195 = p_2195;
                              term = $Prop$Access_2_0.instance.invoke(context, term, _Id.instance, lifted3230);
                              if(term == null)
                                break Fail1490;
                              if(true)
                                break Success813;
                            }
                            term = term804;
                          }
                          Success814:
                          { 
                            if(cons50 == Main._consFunction_3)
                            { 
                              Fail1491:
                              { 
                                lifted324 lifted3240 = new lifted324();
                                lifted3240.q_2195 = q_2195;
                                term = $Function_3_0.instance.invoke(context, term, lifted3240, _Id.instance, _Id.instance);
                                if(term == null)
                                  break Fail1491;
                                if(true)
                                  break Success814;
                              }
                              term = term804;
                            }
                            Success815:
                            { 
                              if(cons50 == Main._consCall_2)
                              { 
                                Fail1492:
                                { 
                                  lifted327 lifted3270 = new lifted327();
                                  lifted3270.p_2195 = p_2195;
                                  term = $Call_2_0.instance.invoke(context, term, lifted3270, _Id.instance);
                                  if(term == null)
                                    break Fail1492;
                                  if(true)
                                    break Success815;
                                }
                                term = term804;
                              }
                              Success816:
                              { 
                                if(cons50 == Main._consVarDecl_2)
                                { 
                                  Fail1493:
                                  { 
                                    lifted329 lifted3290 = new lifted329();
                                    lifted3290.q_2195 = q_2195;
                                    term = $Var$Decl_2_0.instance.invoke(context, term, lifted3290, _Id.instance);
                                    if(term == null)
                                      break Fail1493;
                                    if(true)
                                      break Success816;
                                  }
                                  term = term804;
                                }
                                Success817:
                                { 
                                  if(cons50 == Main._consVarDeclInit_3)
                                  { 
                                    Fail1494:
                                    { 
                                      lifted331 lifted3310 = new lifted331();
                                      lifted3310.q_2195 = q_2195;
                                      term = $Var$Decl$Init_3_0.instance.invoke(context, term, lifted3310, _Id.instance, _Id.instance);
                                      if(term == null)
                                        break Fail1494;
                                      if(true)
                                        break Success817;
                                    }
                                    term = term804;
                                  }
                                  Success818:
                                  { 
                                    if(cons50 == Main._consParam_2)
                                    { 
                                      Fail1495:
                                      { 
                                        lifted334 lifted3340 = new lifted334();
                                        lifted3340.q_2195 = q_2195;
                                        term = $Param_2_0.instance.invoke(context, term, lifted3340, _Id.instance);
                                        if(term == null)
                                          break Fail1495;
                                        if(true)
                                          break Success818;
                                      }
                                      term = term804;
                                    }
                                    if(cons50 == Main._consVar_1)
                                    { 
                                      lifted336 lifted3360 = new lifted336();
                                      lifted3360.p_2195 = p_2195;
                                      term = $Var_1_0.instance.invoke(context, term, lifted3360);
                                      if(term == null)
                                        break Fail1480;
                                    }
                                    else
                                    { 
                                      break Fail1480;
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