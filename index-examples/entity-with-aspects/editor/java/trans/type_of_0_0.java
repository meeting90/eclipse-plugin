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

@SuppressWarnings("all") public class type_of_0_0 extends Strategy 
{ 
  public static type_of_0_0 instance = new type_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("type_of_0_0");
    Fail4428:
    { 
      IStrategoTerm term2400 = term;
      IStrategoConstructor cons128 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2400:
      { 
        if(cons128 == Main._consEntity_2)
        { 
          Fail4429:
          { 
            IStrategoTerm j_11894 = null;
            j_11894 = term.getSubterm(0);
            term = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{j_11894});
            if(true)
              break Success2400;
          }
          term = term2400;
        }
        Success2401:
        { 
          if(cons128 == Main._consProperty_2)
          { 
            Fail4430:
            { 
              IStrategoTerm i_11894 = null;
              i_11894 = term.getSubterm(1);
              term = i_11894;
              if(true)
                break Success2401;
            }
            term = term2400;
          }
          Success2402:
          { 
            if(cons128 == Main._consVarDecl_2)
            { 
              Fail4431:
              { 
                IStrategoTerm g_11894 = null;
                g_11894 = term.getSubterm(1);
                term = g_11894;
                if(true)
                  break Success2402;
              }
              term = term2400;
            }
            Success2403:
            { 
              if(cons128 == Main._consVarDeclInit_3)
              { 
                Fail4432:
                { 
                  IStrategoTerm e_11894 = null;
                  e_11894 = term.getSubterm(1);
                  term = e_11894;
                  if(true)
                    break Success2403;
                }
                term = term2400;
              }
              Success2404:
              { 
                if(cons128 == Main._consParam_2)
                { 
                  Fail4433:
                  { 
                    IStrategoTerm c_11894 = null;
                    c_11894 = term.getSubterm(1);
                    term = c_11894;
                    if(true)
                      break Success2404;
                  }
                  term = term2400;
                }
                Success2405:
                { 
                  if(cons128 == Main._consType_1)
                  { 
                    Fail4434:
                    { 
                      IStrategoTerm a_11894 = null;
                      a_11894 = term.getSubterm(0);
                      term = termFactory.makeAppl(Main._consType_1, new IStrategoTerm[]{a_11894});
                      if(true)
                        break Success2405;
                    }
                    term = term2400;
                  }
                  Success2406:
                  { 
                    if(cons128 == Main._consStringType_0)
                    { 
                      Fail4435:
                      { 
                        term = trans.constType1;
                        if(true)
                          break Success2406;
                      }
                      term = term2400;
                    }
                    Success2407:
                    { 
                      if(cons128 == Main._consIntType_0)
                      { 
                        Fail4436:
                        { 
                          term = trans.constType2;
                          if(true)
                            break Success2407;
                        }
                        term = term2400;
                      }
                      Success2408:
                      { 
                        if(cons128 == Main._consStringLit_1)
                        { 
                          Fail4437:
                          { 
                            term = this.invoke(context, trans.constStringType0);
                            if(term == null)
                              break Fail4437;
                            if(true)
                              break Success2408;
                          }
                          term = term2400;
                        }
                        Success2409:
                        { 
                          if(cons128 == Main._consIntLit_1)
                          { 
                            Fail4438:
                            { 
                              term = this.invoke(context, trans.constIntType0);
                              if(term == null)
                                break Fail4438;
                              if(true)
                                break Success2409;
                            }
                            term = term2400;
                          }
                          Success2410:
                          { 
                            if(cons128 == Main._consVar_1)
                            { 
                              Fail4439:
                              { 
                                IStrategoTerm z_11893 = null;
                                z_11893 = term.getSubterm(0);
                                term = index_lookup_0_0.instance.invoke(context, z_11893);
                                if(term == null)
                                  break Fail4439;
                                term = this.invoke(context, term);
                                if(term == null)
                                  break Fail4439;
                                if(true)
                                  break Success2410;
                              }
                              term = term2400;
                            }
                            Success2411:
                            { 
                              if(cons128 == Main._consPropAccess_2)
                              { 
                                Fail4440:
                                { 
                                  IStrategoTerm y_11893 = null;
                                  y_11893 = term.getSubterm(1);
                                  term = index_lookup_0_0.instance.invoke(context, y_11893);
                                  if(term == null)
                                    break Fail4440;
                                  term = this.invoke(context, term);
                                  if(term == null)
                                    break Fail4440;
                                  if(true)
                                    break Success2411;
                                }
                                term = term2400;
                              }
                              if(cons128 == Main._consDef_1)
                              { 
                                IStrategoTerm u_11893 = null;
                                IStrategoTerm w_11893 = null;
                                u_11893 = term.getSubterm(0);
                                term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{u_11893});
                                w_11893 = term;
                                term = index_get_data_0_1.instance.invoke(context, w_11893, trans.constType0);
                                if(term == null)
                                  break Fail4428;
                                term = this.invoke(context, term);
                                if(term == null)
                                  break Fail4428;
                              }
                              else
                              { 
                                break Fail4428;
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