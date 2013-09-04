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

@SuppressWarnings("all") public class index_uri_impl_0_0 extends Strategy 
{ 
  public static index_uri_impl_0_0 instance = new index_uri_impl_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_uri_impl_0_0");
    Fail2092:
    { 
      IStrategoTerm term1299 = term;
      IStrategoConstructor cons63 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success1269:
      { 
        if(cons63 == Main._consDef_1)
        { 
          Fail2093:
          { 
            IStrategoTerm g_2118 = null;
            g_2118 = term.getSubterm(0);
            term = g_2118;
            if(true)
              break Success1269;
          }
          term = term1299;
        }
        Success1270:
        { 
          if(cons63 == Main._consUse_1)
          { 
            Fail2094:
            { 
              IStrategoTerm f_2118 = null;
              f_2118 = term.getSubterm(0);
              term = f_2118;
              if(true)
                break Success1270;
            }
            term = term1299;
          }
          Success1271:
          { 
            if(cons63 == Main._consRead_1)
            { 
              Fail2095:
              { 
                IStrategoTerm e_2118 = null;
                e_2118 = term.getSubterm(0);
                term = e_2118;
                if(true)
                  break Success1271;
              }
              term = term1299;
            }
            IStrategoTerm term1302 = term;
            Success1272:
            { 
              Fail2096:
              { 
                IStrategoTerm a_2118 = null;
                IStrategoTerm b_2118 = null;
                IStrategoTerm c_2118 = null;
                IStrategoTerm d_2118 = null;
                IStrategoList annos78 = term.getAnnotations();
                if(annos78.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos78).isEmpty())
                  break Fail2096;
                IStrategoTerm arg674 = ((IStrategoList)annos78).head();
                if(arg674.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg674).isEmpty())
                  break Fail2096;
                a_2118 = ((IStrategoList)arg674).head();
                b_2118 = ((IStrategoList)arg674).tail();
                IStrategoTerm arg675 = ((IStrategoList)annos78).tail();
                if(arg675.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg675).isEmpty())
                  break Fail2096;
                d_2118 = term;
                term = index_namespace_unwrap_0_0.instance.invoke(context, a_2118);
                if(term == null)
                  break Fail2096;
                c_2118 = term;
                term = d_2118;
                IStrategoList list64;
                list64 = checkListTail(b_2118);
                if(list64 == null)
                  break Fail2096;
                term = (IStrategoTerm)termFactory.makeListCons(c_2118, list64);
                if(true)
                  break Success1272;
              }
              term = term1302;
              IStrategoTerm term1303 = term;
              Success1273:
              { 
                Fail2097:
                { 
                  IStrategoTerm y_2117 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consReadWildcard_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail2097;
                  y_2117 = term.getSubterm(0);
                  term = y_2117;
                  if(true)
                    break Success1273;
                }
                term = term1303;
                IStrategoTerm term1304 = term;
                Success1274:
                { 
                  Fail2098:
                  { 
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail2098;
                    if(true)
                      break Success1274;
                  }
                  term = term1304;
                  IStrategoTerm v_2117 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail2092;
                  v_2117 = term.getSubterm(0);
                  term = v_2117;
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