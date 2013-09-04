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
    Fail1469:
    { 
      IStrategoTerm term794 = term;
      IStrategoConstructor cons49 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success794:
      { 
        if(cons49 == Main._consModule_3)
        { 
          Fail1470:
          { 
            IStrategoTerm i_2022 = null;
            i_2022 = term.getSubterm(0);
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constModule0, (IStrategoTerm)termFactory.makeListCons(i_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
            if(true)
              break Success794;
          }
          term = term794;
        }
        Success795:
        { 
          if(cons49 == Main._consWildcardImport_1)
          { 
            Fail1471:
            { 
              IStrategoTerm h_2022 = null;
              h_2022 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constImport0, (IStrategoTerm)termFactory.makeListCons(h_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
              if(true)
                break Success795;
            }
            term = term794;
          }
          Success796:
          { 
            if(cons49 == Main._consAspect_2)
            { 
              Fail1472:
              { 
                IStrategoTerm g_2022 = null;
                g_2022 = term.getSubterm(0);
                term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constAspect0, (IStrategoTerm)termFactory.makeListCons(g_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                if(true)
                  break Success796;
              }
              term = term794;
            }
            Success797:
            { 
              if(cons49 == Main._consPointcut_3)
              { 
                Fail1473:
                { 
                  IStrategoTerm f_2022 = null;
                  f_2022 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constPointcut0, (IStrategoTerm)termFactory.makeListCons(f_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                  if(true)
                    break Success797;
                }
                term = term794;
              }
              Success798:
              { 
                if(cons49 == Main._consAdvice_6)
                { 
                  Fail1474:
                  { 
                    IStrategoTerm e_2022 = null;
                    e_2022 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constAdvice0, (IStrategoTerm)termFactory.makeListCons(e_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                    if(true)
                      break Success798;
                  }
                  term = term794;
                }
                Success799:
                { 
                  if(cons49 == Main._consEntity_2)
                  { 
                    Fail1475:
                    { 
                      IStrategoTerm c_2022 = null;
                      c_2022 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constEntity0, (IStrategoTerm)termFactory.makeListCons(c_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                      if(true)
                        break Success799;
                    }
                    term = term794;
                  }
                  Success800:
                  { 
                    if(cons49 == Main._consProperty_2)
                    { 
                      Fail1476:
                      { 
                        IStrategoTerm b_2022 = null;
                        b_2022 = term.getSubterm(0);
                        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constProperty0, (IStrategoTerm)termFactory.makeListCons(b_2022, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                        if(true)
                          break Success800;
                      }
                      term = term794;
                    }
                    Success801:
                    { 
                      if(cons49 == Main._consFunction_3)
                      { 
                        Fail1477:
                        { 
                          IStrategoTerm z_2021 = null;
                          z_2021 = term.getSubterm(0);
                          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constFunction0, (IStrategoTerm)termFactory.makeListCons(z_2021, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                          if(true)
                            break Success801;
                        }
                        term = term794;
                      }
                      Success802:
                      { 
                        if(cons49 == Main._consVarDecl_2)
                        { 
                          Fail1478:
                          { 
                            IStrategoTerm y_2021 = null;
                            y_2021 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(y_2021, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                            if(true)
                              break Success802;
                          }
                          term = term794;
                        }
                        Success803:
                        { 
                          if(cons49 == Main._consVarDeclInit_3)
                          { 
                            Fail1479:
                            { 
                              IStrategoTerm w_2021 = null;
                              w_2021 = term.getSubterm(0);
                              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(w_2021, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                              if(true)
                                break Success803;
                            }
                            term = term794;
                          }
                          if(cons49 == Main._consParam_2)
                          { 
                            IStrategoTerm u_2021 = null;
                            u_2021 = term.getSubterm(0);
                            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(u_2021, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                          }
                          else
                          { 
                            break Fail1469;
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