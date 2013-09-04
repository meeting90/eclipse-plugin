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
    Fail4360:
    { 
      IStrategoTerm term2340 = term;
      IStrategoConstructor cons120 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2340:
      { 
        if(cons120 == Main._consModule_3)
        { 
          Fail4361:
          { 
            IStrategoTerm n_11884 = null;
            n_11884 = term.getSubterm(0);
            term = (IStrategoTerm)termFactory.makeListCons(n_11884, (IStrategoList)trans.constNil3);
            if(true)
              break Success2340;
          }
          term = term2340;
        }
        Success2341:
        { 
          if(cons120 == Main._consWildcardImport_1)
          { 
            Fail4362:
            { 
              IStrategoTerm m_11884 = null;
              m_11884 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(m_11884, (IStrategoList)trans.constNil3);
              if(true)
                break Success2341;
            }
            term = term2340;
          }
          Success2342:
          { 
            if(cons120 == Main._consAspect_2)
            { 
              Fail4363:
              { 
                IStrategoTerm l_11884 = null;
                l_11884 = term.getSubterm(0);
                term = (IStrategoTerm)termFactory.makeListCons(l_11884, (IStrategoList)trans.constNil3);
                if(true)
                  break Success2342;
              }
              term = term2340;
            }
            Success2343:
            { 
              if(cons120 == Main._consPointcut_3)
              { 
                Fail4364:
                { 
                  IStrategoTerm k_11884 = null;
                  k_11884 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(k_11884, (IStrategoList)trans.constNil3);
                  if(true)
                    break Success2343;
                }
                term = term2340;
              }
              Success2344:
              { 
                if(cons120 == Main._consAdvice_6)
                { 
                  Fail4365:
                  { 
                    IStrategoTerm j_11884 = null;
                    j_11884 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(j_11884, (IStrategoList)trans.constNil3);
                    if(true)
                      break Success2344;
                  }
                  term = term2340;
                }
                Success2345:
                { 
                  if(cons120 == Main._consEntity_2)
                  { 
                    Fail4366:
                    { 
                      IStrategoTerm h_11884 = null;
                      h_11884 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(h_11884, (IStrategoList)trans.constNil3);
                      if(true)
                        break Success2345;
                    }
                    term = term2340;
                  }
                  Success2346:
                  { 
                    if(cons120 == Main._consProperty_2)
                    { 
                      Fail4367:
                      { 
                        IStrategoTerm g_11884 = null;
                        g_11884 = term.getSubterm(0);
                        term = (IStrategoTerm)termFactory.makeListCons(g_11884, (IStrategoList)trans.constNil3);
                        if(true)
                          break Success2346;
                      }
                      term = term2340;
                    }
                    Success2347:
                    { 
                      if(cons120 == Main._consFunction_3)
                      { 
                        Fail4368:
                        { 
                          IStrategoTerm e_11884 = null;
                          e_11884 = term.getSubterm(0);
                          term = (IStrategoTerm)termFactory.makeListCons(e_11884, (IStrategoList)trans.constNil3);
                          if(true)
                            break Success2347;
                        }
                        term = term2340;
                      }
                      Success2348:
                      { 
                        if(cons120 == Main._consVarDecl_2)
                        { 
                          Fail4369:
                          { 
                            IStrategoTerm d_11884 = null;
                            d_11884 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(d_11884, (IStrategoList)trans.constNil3);
                            if(true)
                              break Success2348;
                          }
                          term = term2340;
                        }
                        Success2349:
                        { 
                          if(cons120 == Main._consVarDeclInit_3)
                          { 
                            Fail4370:
                            { 
                              IStrategoTerm b_11884 = null;
                              b_11884 = term.getSubterm(0);
                              term = (IStrategoTerm)termFactory.makeListCons(b_11884, (IStrategoList)trans.constNil3);
                              if(true)
                                break Success2349;
                            }
                            term = term2340;
                          }
                          if(cons120 == Main._consParam_2)
                          { 
                            IStrategoTerm z_11883 = null;
                            z_11883 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(z_11883, (IStrategoList)trans.constNil3);
                          }
                          else
                          { 
                            break Fail4360;
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