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
    Fail4398:
    { 
      IStrategoTerm term2375 = term;
      IStrategoConstructor cons123 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2375:
      { 
        if(cons123 == Main._consEntityImport_2)
        { 
          Fail4399:
          { 
            IStrategoTerm n_11889 = null;
            IStrategoTerm o_11889 = null;
            n_11889 = term.getSubterm(0);
            o_11889 = term.getSubterm(1);
            term = (IStrategoTerm)termFactory.makeListCons(n_11889, termFactory.makeListCons(o_11889, (IStrategoList)trans.constNil3));
            if(true)
              break Success2375;
          }
          term = term2375;
        }
        Success2376:
        { 
          if(cons123 == Main._consWildcardImport_1)
          { 
            Fail4400:
            { 
              IStrategoTerm m_11889 = null;
              m_11889 = term.getSubterm(0);
              term = (IStrategoTerm)termFactory.makeListCons(m_11889, (IStrategoList)trans.constNil3);
              if(true)
                break Success2376;
            }
            term = term2375;
          }
          Success2377:
          { 
            if(cons123 == Main._consAdvice_6)
            { 
              Fail4401:
              { 
                IStrategoTerm l_11889 = null;
                l_11889 = term.getSubterm(3);
                term = (IStrategoTerm)termFactory.makeListCons(l_11889, (IStrategoList)trans.constNil3);
                if(true)
                  break Success2377;
              }
              term = term2375;
            }
            Success2378:
            { 
              if(cons123 == Main._consType_1)
              { 
                Fail4402:
                { 
                  IStrategoTerm j_11889 = null;
                  j_11889 = term.getSubterm(0);
                  term = (IStrategoTerm)termFactory.makeListCons(j_11889, (IStrategoList)trans.constCons208);
                  if(true)
                    break Success2378;
                }
                term = term2375;
              }
              Success2379:
              { 
                if(cons123 == Main._consPropAccess_2)
                { 
                  Fail4403:
                  { 
                    IStrategoTerm f_11889 = null;
                    IStrategoTerm g_11889 = null;
                    g_11889 = term.getSubterm(0);
                    f_11889 = term.getSubterm(1);
                    term = type_of_0_0.instance.invoke(context, g_11889);
                    if(term == null)
                      break Fail4403;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consType_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail4403;
                    term = (IStrategoTerm)termFactory.makeListCons(f_11889, (IStrategoList)trans.constNil3);
                    if(true)
                      break Success2379;
                  }
                  term = term2375;
                }
                Success2380:
                { 
                  if(cons123 == Main._consCall_2)
                  { 
                    Fail4404:
                    { 
                      IStrategoTerm e_11889 = null;
                      e_11889 = term.getSubterm(0);
                      term = (IStrategoTerm)termFactory.makeListCons(e_11889, (IStrategoList)trans.constNil3);
                      if(true)
                        break Success2380;
                    }
                    term = term2375;
                  }
                  if(cons123 == Main._consVar_1)
                  { 
                    IStrategoTerm d_11889 = null;
                    d_11889 = term.getSubterm(0);
                    term = (IStrategoTerm)termFactory.makeListCons(d_11889, (IStrategoList)trans.constNil3);
                  }
                  else
                  { 
                    break Fail4398;
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