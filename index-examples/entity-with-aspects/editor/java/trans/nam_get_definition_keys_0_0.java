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

@SuppressWarnings("all") public class nam_get_definition_keys_0_0 extends Strategy 
{ 
  public static nam_get_definition_keys_0_0 instance = new nam_get_definition_keys_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail1458:
    { 
      IStrategoTerm term784 = term;
      IStrategoConstructor cons48 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success784:
      { 
        if(cons48 == Main._consModule_3)
        { 
          Fail1459:
          { 
            IStrategoTerm s_2021 = null;
            s_2021 = term.getSubterm(0);
            term = (IStrategoTerm)termFactory.makeListCons(s_2021, (IStrategoList)trans.constNil1);
            if(true)
              break Success784;
          }
          term = term784;
        }
        Success785:
        { 
          if(cons48 == Main._consWildcardImport_1)
          { 
            Fail1460:
            { 
              IStrategoTerm r_2021 = null;
              r_2021 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(r_2021, (IStrategoList)trans.constNil1);
              if(true)
                break Success785;
            }
            term = term784;
          }
          Success786:
          { 
            if(cons48 == Main._consAspect_2)
            { 
              Fail1461:
              { 
                IStrategoTerm q_2021 = null;
                q_2021 = term.getSubterm(0);
                term = (IStrategoTerm)termFactory.makeListCons(q_2021, (IStrategoList)trans.constNil1);
                if(true)
                  break Success786;
              }
              term = term784;
            }
            Success787:
            { 
              if(cons48 == Main._consPointcut_3)
              { 
                Fail1462:
                { 
                  IStrategoTerm p_2021 = null;
                  p_2021 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(p_2021, (IStrategoList)trans.constNil1);
                  if(true)
                    break Success787;
                }
                term = term784;
              }
              Success788:
              { 
                if(cons48 == Main._consAdvice_6)
                { 
                  Fail1463:
                  { 
                    IStrategoTerm o_2021 = null;
                    o_2021 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(o_2021, (IStrategoList)trans.constNil1);
                    if(true)
                      break Success788;
                  }
                  term = term784;
                }
                Success789:
                { 
                  if(cons48 == Main._consEntity_2)
                  { 
                    Fail1464:
                    { 
                      IStrategoTerm m_2021 = null;
                      m_2021 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(m_2021, (IStrategoList)trans.constNil1);
                      if(true)
                        break Success789;
                    }
                    term = term784;
                  }
                  Success790:
                  { 
                    if(cons48 == Main._consProperty_2)
                    { 
                      Fail1465:
                      { 
                        IStrategoTerm l_2021 = null;
                        l_2021 = term.getSubterm(0);
                        term = (IStrategoTerm)termFactory.makeListCons(l_2021, (IStrategoList)trans.constNil1);
                        if(true)
                          break Success790;
                      }
                      term = term784;
                    }
                    Success791:
                    { 
                      if(cons48 == Main._consFunction_3)
                      { 
                        Fail1466:
                        { 
                          IStrategoTerm j_2021 = null;
                          j_2021 = term.getSubterm(0);
                          term = (IStrategoTerm)termFactory.makeListCons(j_2021, (IStrategoList)trans.constNil1);
                          if(true)
                            break Success791;
                        }
                        term = term784;
                      }
                      Success792:
                      { 
                        if(cons48 == Main._consVarDecl_2)
                        { 
                          Fail1467:
                          { 
                            IStrategoTerm i_2021 = null;
                            i_2021 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(i_2021, (IStrategoList)trans.constNil1);
                            if(true)
                              break Success792;
                          }
                          term = term784;
                        }
                        Success793:
                        { 
                          if(cons48 == Main._consVarDeclInit_3)
                          { 
                            Fail1468:
                            { 
                              IStrategoTerm g_2021 = null;
                              g_2021 = term.getSubterm(0);
                              term = (IStrategoTerm)termFactory.makeListCons(g_2021, (IStrategoList)trans.constNil1);
                              if(true)
                                break Success793;
                            }
                            term = term784;
                          }
                          if(cons48 == Main._consParam_2)
                          { 
                            IStrategoTerm e_2021 = null;
                            e_2021 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(e_2021, (IStrategoList)trans.constNil1);
                          }
                          else
                          { 
                            break Fail1458;
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
      if(true)
        return term;
    }
    context.push("nam_get_definition_keys_0_0");
    context.popOnFailure();
    return null;
  }
}