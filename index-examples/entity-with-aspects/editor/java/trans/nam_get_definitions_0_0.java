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

@SuppressWarnings("all") public class nam_get_definitions_0_0 extends Strategy 
{ 
  public static nam_get_definitions_0_0 instance = new nam_get_definitions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail4371:
    { 
      IStrategoTerm term2350 = term;
      IStrategoConstructor cons121 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2350:
      { 
        if(cons121 == Main._consModule_3)
        { 
          Fail4372:
          { 
            IStrategoTerm d_11885 = null;
            d_11885 = term.getSubterm(0);
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constModule0, (IStrategoTerm)termFactory.makeListCons(d_11885, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
            if(true)
              break Success2350;
          }
          term = term2350;
        }
        Success2351:
        { 
          if(cons121 == Main._consWildcardImport_1)
          { 
            Fail4373:
            { 
              IStrategoTerm c_11885 = null;
              c_11885 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constImport0, (IStrategoTerm)termFactory.makeListCons(c_11885, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
              if(true)
                break Success2351;
            }
            term = term2350;
          }
          Success2352:
          { 
            if(cons121 == Main._consAspect_2)
            { 
              Fail4374:
              { 
                IStrategoTerm b_11885 = null;
                b_11885 = term.getSubterm(0);
                term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constAspect0, (IStrategoTerm)termFactory.makeListCons(b_11885, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                if(true)
                  break Success2352;
              }
              term = term2350;
            }
            Success2353:
            { 
              if(cons121 == Main._consPointcut_3)
              { 
                Fail4375:
                { 
                  IStrategoTerm a_11885 = null;
                  a_11885 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constPointcut0, (IStrategoTerm)termFactory.makeListCons(a_11885, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                  if(true)
                    break Success2353;
                }
                term = term2350;
              }
              Success2354:
              { 
                if(cons121 == Main._consAdvice_6)
                { 
                  Fail4376:
                  { 
                    IStrategoTerm z_11884 = null;
                    z_11884 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constAdvice0, (IStrategoTerm)termFactory.makeListCons(z_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                    if(true)
                      break Success2354;
                  }
                  term = term2350;
                }
                Success2355:
                { 
                  if(cons121 == Main._consEntity_2)
                  { 
                    Fail4377:
                    { 
                      IStrategoTerm x_11884 = null;
                      x_11884 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constEntity0, (IStrategoTerm)termFactory.makeListCons(x_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                      if(true)
                        break Success2355;
                    }
                    term = term2350;
                  }
                  Success2356:
                  { 
                    if(cons121 == Main._consProperty_2)
                    { 
                      Fail4378:
                      { 
                        IStrategoTerm w_11884 = null;
                        w_11884 = term.getSubterm(0);
                        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constProperty0, (IStrategoTerm)termFactory.makeListCons(w_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                        if(true)
                          break Success2356;
                      }
                      term = term2350;
                    }
                    Success2357:
                    { 
                      if(cons121 == Main._consFunction_3)
                      { 
                        Fail4379:
                        { 
                          IStrategoTerm u_11884 = null;
                          u_11884 = term.getSubterm(0);
                          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constFunction0, (IStrategoTerm)termFactory.makeListCons(u_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                          if(true)
                            break Success2357;
                        }
                        term = term2350;
                      }
                      Success2358:
                      { 
                        if(cons121 == Main._consVarDecl_2)
                        { 
                          Fail4380:
                          { 
                            IStrategoTerm t_11884 = null;
                            t_11884 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(t_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                            if(true)
                              break Success2358;
                          }
                          term = term2350;
                        }
                        Success2359:
                        { 
                          if(cons121 == Main._consVarDeclInit_3)
                          { 
                            Fail4381:
                            { 
                              IStrategoTerm r_11884 = null;
                              r_11884 = term.getSubterm(0);
                              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(r_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                              if(true)
                                break Success2359;
                            }
                            term = term2350;
                          }
                          if(cons121 == Main._consParam_2)
                          { 
                            IStrategoTerm p_11884 = null;
                            p_11884 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(p_11884, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                          }
                          else
                          { 
                            break Fail4371;
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
    context.push("nam_get_definitions_0_0");
    context.popOnFailure();
    return null;
  }
}