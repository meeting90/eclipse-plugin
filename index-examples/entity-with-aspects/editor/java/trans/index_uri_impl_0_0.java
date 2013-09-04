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
    Fail4994:
    { 
      IStrategoTerm term2855 = term;
      IStrategoConstructor cons135 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success2825:
      { 
        if(cons135 == Main._consDef_1)
        { 
          Fail4995:
          { 
            IStrategoTerm b_11981 = null;
            b_11981 = term.getSubterm(0);
            term = b_11981;
            if(true)
              break Success2825;
          }
          term = term2855;
        }
        Success2826:
        { 
          if(cons135 == Main._consUse_1)
          { 
            Fail4996:
            { 
              IStrategoTerm a_11981 = null;
              a_11981 = term.getSubterm(0);
              term = a_11981;
              if(true)
                break Success2826;
            }
            term = term2855;
          }
          Success2827:
          { 
            if(cons135 == Main._consRead_1)
            { 
              Fail4997:
              { 
                IStrategoTerm z_11980 = null;
                z_11980 = term.getSubterm(0);
                term = z_11980;
                if(true)
                  break Success2827;
              }
              term = term2855;
            }
            IStrategoTerm term2858 = term;
            Success2828:
            { 
              Fail4998:
              { 
                IStrategoTerm v_11980 = null;
                IStrategoTerm w_11980 = null;
                IStrategoTerm x_11980 = null;
                IStrategoTerm y_11980 = null;
                IStrategoList annos216 = term.getAnnotations();
                if(annos216.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos216).isEmpty())
                  break Fail4998;
                IStrategoTerm arg1528 = ((IStrategoList)annos216).head();
                if(arg1528.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1528).isEmpty())
                  break Fail4998;
                v_11980 = ((IStrategoList)arg1528).head();
                w_11980 = ((IStrategoList)arg1528).tail();
                IStrategoTerm arg1529 = ((IStrategoList)annos216).tail();
                if(arg1529.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg1529).isEmpty())
                  break Fail4998;
                y_11980 = term;
                term = index_namespace_unwrap_0_0.instance.invoke(context, v_11980);
                if(term == null)
                  break Fail4998;
                x_11980 = term;
                term = y_11980;
                IStrategoList list140;
                list140 = checkListTail(w_11980);
                if(list140 == null)
                  break Fail4998;
                term = (IStrategoTerm)termFactory.makeListCons(x_11980, list140);
                if(true)
                  break Success2828;
              }
              term = term2858;
              IStrategoTerm term2859 = term;
              Success2829:
              { 
                Fail4999:
                { 
                  IStrategoTerm t_11980 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consReadWildcard_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail4999;
                  t_11980 = term.getSubterm(0);
                  term = t_11980;
                  if(true)
                    break Success2829;
                }
                term = term2859;
                IStrategoTerm term2860 = term;
                Success2830:
                { 
                  Fail5000:
                  { 
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail5000;
                    if(true)
                      break Success2830;
                  }
                  term = term2860;
                  IStrategoTerm q_11980 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail4994;
                  q_11980 = term.getSubterm(0);
                  term = q_11980;
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