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

@SuppressWarnings("all") public class nam_get_uses_0_0 extends Strategy 
{ 
  public static nam_get_uses_0_0 instance = new nam_get_uses_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_get_uses_0_0");
    Fail4405:
    { 
      IStrategoTerm term2381 = term;
      IStrategoConstructor cons124 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2381:
      { 
        if(cons124 == Main._consEntityImport_2)
        { 
          Fail4406:
          { 
            IStrategoTerm z_11889 = null;
            IStrategoTerm a_11890 = null;
            z_11889 = term.getSubterm(0);
            a_11890 = term.getSubterm(1);
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constModule0, (IStrategoTerm)termFactory.makeListCons(z_11889, (IStrategoList)trans.constNil3)), termFactory.makeListCons(termFactory.makeTuple(trans.constEntity0, (IStrategoTerm)termFactory.makeListCons(a_11890, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3));
            if(true)
              break Success2381;
          }
          term = term2381;
        }
        Success2382:
        { 
          if(cons124 == Main._consWildcardImport_1)
          { 
            Fail4407:
            { 
              IStrategoTerm y_11889 = null;
              y_11889 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constModule0, (IStrategoTerm)termFactory.makeListCons(y_11889, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
              if(true)
                break Success2382;
            }
            term = term2381;
          }
          Success2383:
          { 
            if(cons124 == Main._consAdvice_6)
            { 
              Fail4408:
              { 
                IStrategoTerm x_11889 = null;
                x_11889 = term.getSubterm(3);
                term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constPointcut0, (IStrategoTerm)termFactory.makeListCons(x_11889, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                if(true)
                  break Success2383;
              }
              term = term2381;
            }
            Success2384:
            { 
              if(cons124 == Main._consType_1)
              { 
                Fail4409:
                { 
                  IStrategoTerm v_11889 = null;
                  v_11889 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constEntity0, (IStrategoTerm)termFactory.makeListCons(v_11889, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constCons211);
                  if(true)
                    break Success2384;
                }
                term = term2381;
              }
              Success2385:
              { 
                if(cons124 == Main._consPropAccess_2)
                { 
                  Fail4410:
                  { 
                    IStrategoTerm r_11889 = null;
                    IStrategoTerm s_11889 = null;
                    s_11889 = term.getSubterm(0);
                    r_11889 = term.getSubterm(1);
                    term = type_of_0_0.instance.invoke(context, s_11889);
                    if(term == null)
                      break Fail4410;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail4410;
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constProperty0, (IStrategoTerm)termFactory.makeListCons(r_11889, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                    if(true)
                      break Success2385;
                  }
                  term = term2381;
                }
                Success2386:
                { 
                  if(cons124 == Main._consCall_2)
                  { 
                    Fail4411:
                    { 
                      IStrategoTerm q_11889 = null;
                      q_11889 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constFunction0, (IStrategoTerm)termFactory.makeListCons(q_11889, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3);
                      if(true)
                        break Success2386;
                    }
                    term = term2381;
                  }
                  if(cons124 == Main._consVar_1)
                  { 
                    IStrategoTerm p_11889 = null;
                    p_11889 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(p_11889, (IStrategoList)trans.constNil3)), termFactory.makeListCons(termFactory.makeTuple(trans.constProperty0, (IStrategoTerm)termFactory.makeListCons(p_11889, (IStrategoList)trans.constNil3)), (IStrategoList)trans.constNil3));
                  }
                  else
                  { 
                    break Fail4405;
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