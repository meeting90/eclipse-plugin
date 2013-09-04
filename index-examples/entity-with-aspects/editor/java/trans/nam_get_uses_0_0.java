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
    Fail1503:
    { 
      IStrategoTerm term825 = term;
      IStrategoConstructor cons52 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success825:
      { 
        if(cons52 == Main._consEntityImport_2)
        { 
          Fail1504:
          { 
            IStrategoTerm e_2027 = null;
            IStrategoTerm f_2027 = null;
            e_2027 = term.getSubterm(0);
            f_2027 = term.getSubterm(1);
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constModule0, (IStrategoTerm)termFactory.makeListCons(e_2027, (IStrategoList)trans.constNil1)), termFactory.makeListCons(termFactory.makeTuple(trans.constEntity0, (IStrategoTerm)termFactory.makeListCons(f_2027, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1));
            if(true)
              break Success825;
          }
          term = term825;
        }
        Success826:
        { 
          if(cons52 == Main._consWildcardImport_1)
          { 
            Fail1505:
            { 
              IStrategoTerm d_2027 = null;
              d_2027 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constModule0, (IStrategoTerm)termFactory.makeListCons(d_2027, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
              if(true)
                break Success826;
            }
            term = term825;
          }
          Success827:
          { 
            if(cons52 == Main._consAdvice_6)
            { 
              Fail1506:
              { 
                IStrategoTerm c_2027 = null;
                c_2027 = term.getSubterm(3);
                term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constPointcut0, (IStrategoTerm)termFactory.makeListCons(c_2027, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                if(true)
                  break Success827;
              }
              term = term825;
            }
            Success828:
            { 
              if(cons52 == Main._consType_1)
              { 
                Fail1507:
                { 
                  IStrategoTerm a_2027 = null;
                  a_2027 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constEntity0, (IStrategoTerm)termFactory.makeListCons(a_2027, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constCons79);
                  if(true)
                    break Success828;
                }
                term = term825;
              }
              Success829:
              { 
                if(cons52 == Main._consPropAccess_2)
                { 
                  Fail1508:
                  { 
                    IStrategoTerm w_2026 = null;
                    IStrategoTerm x_2026 = null;
                    x_2026 = term.getSubterm(0);
                    w_2026 = term.getSubterm(1);
                    term = type_of_0_0.instance.invoke(context, x_2026);
                    if(term == null)
                      break Fail1508;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail1508;
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constProperty0, (IStrategoTerm)termFactory.makeListCons(w_2026, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                    if(true)
                      break Success829;
                  }
                  term = term825;
                }
                Success830:
                { 
                  if(cons52 == Main._consCall_2)
                  { 
                    Fail1509:
                    { 
                      IStrategoTerm v_2026 = null;
                      v_2026 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constFunction0, (IStrategoTerm)termFactory.makeListCons(v_2026, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1);
                      if(true)
                        break Success830;
                    }
                    term = term825;
                  }
                  if(cons52 == Main._consVar_1)
                  { 
                    IStrategoTerm u_2026 = null;
                    u_2026 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(trans.constVariable0, (IStrategoTerm)termFactory.makeListCons(u_2026, (IStrategoList)trans.constNil1)), termFactory.makeListCons(termFactory.makeTuple(trans.constProperty0, (IStrategoTerm)termFactory.makeListCons(u_2026, (IStrategoList)trans.constNil1)), (IStrategoList)trans.constNil1));
                  }
                  else
                  { 
                    break Fail1503;
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