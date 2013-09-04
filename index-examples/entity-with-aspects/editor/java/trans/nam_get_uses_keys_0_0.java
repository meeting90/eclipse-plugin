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

@SuppressWarnings("all") public class nam_get_uses_keys_0_0 extends Strategy 
{ 
  public static nam_get_uses_keys_0_0 instance = new nam_get_uses_keys_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nam_get_uses_keys_0_0");
    Fail1496:
    { 
      IStrategoTerm term819 = term;
      IStrategoConstructor cons51 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success819:
      { 
        if(cons51 == Main._consEntityImport_2)
        { 
          Fail1497:
          { 
            IStrategoTerm s_2026 = null;
            IStrategoTerm t_2026 = null;
            s_2026 = term.getSubterm(0);
            t_2026 = term.getSubterm(1);
            term = (IStrategoTerm)termFactory.makeListCons(s_2026, termFactory.makeListCons(t_2026, (IStrategoList)trans.constNil1));
            if(true)
              break Success819;
          }
          term = term819;
        }
        Success820:
        { 
          if(cons51 == Main._consWildcardImport_1)
          { 
            Fail1498:
            { 
              IStrategoTerm r_2026 = null;
              r_2026 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(r_2026, (IStrategoList)trans.constNil1);
              if(true)
                break Success820;
            }
            term = term819;
          }
          Success821:
          { 
            if(cons51 == Main._consAdvice_6)
            { 
              Fail1499:
              { 
                IStrategoTerm q_2026 = null;
                q_2026 = term.getSubterm(3);
                term = (IStrategoTerm)termFactory.makeListCons(q_2026, (IStrategoList)trans.constNil1);
                if(true)
                  break Success821;
              }
              term = term819;
            }
            Success822:
            { 
              if(cons51 == Main._consType_1)
              { 
                Fail1500:
                { 
                  IStrategoTerm o_2026 = null;
                  o_2026 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(o_2026, (IStrategoList)trans.constCons76);
                  if(true)
                    break Success822;
                }
                term = term819;
              }
              Success823:
              { 
                if(cons51 == Main._consPropAccess_2)
                { 
                  Fail1501:
                  { 
                    IStrategoTerm k_2026 = null;
                    IStrategoTerm l_2026 = null;
                    l_2026 = term.getSubterm(0);
                    k_2026 = term.getSubterm(1);
                    term = type_of_0_0.instance.invoke(context, l_2026);
                    if(term == null)
                      break Fail1501;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail1501;
                    term = (IStrategoTerm)termFactory.makeListCons(k_2026, (IStrategoList)trans.constNil1);
                    if(true)
                      break Success823;
                  }
                  term = term819;
                }
                Success824:
                { 
                  if(cons51 == Main._consCall_2)
                  { 
                    Fail1502:
                    { 
                      IStrategoTerm j_2026 = null;
                      j_2026 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(j_2026, (IStrategoList)trans.constNil1);
                      if(true)
                        break Success824;
                    }
                    term = term819;
                  }
                  if(cons51 == Main._consVar_1)
                  { 
                    IStrategoTerm i_2026 = null;
                    i_2026 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(i_2026, (IStrategoList)trans.constNil1);
                  }
                  else
                  { 
                    break Fail1496;
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