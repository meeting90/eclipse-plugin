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

@SuppressWarnings("all") public class index_merge_ast_0_1 extends Strategy 
{ 
  public static index_merge_ast_0_1 instance = new index_merge_ast_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_11988)
  { 
    context.push("index_merge_ast_0_1");
    Fail5066:
    { 
      IStrategoTerm c_11988 = null;
      IStrategoTerm d_11988 = null;
      IStrategoTerm e_11988 = null;
      IStrategoTerm f_11988 = null;
      IStrategoTerm k_11988 = null;
      d_11988 = term;
      k_11988 = term;
      IStrategoTerm term2896 = term;
      Success2864:
      { 
        Fail5067:
        { 
          IStrategoTerm term2897 = term;
          Success2865:
          { 
            Fail5068:
            { 
              IStrategoTerm g_11988 = null;
              g_11988 = term;
              term = is_list_0_0.instance.invoke(context, d_11988);
              if(term == null)
                break Fail5068;
              term = g_11988;
              { 
                term = d_11988;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail5067;
                c_11988 = ((IStrategoList)term).head();
                term = this.invoke(context, c_11988, b_11988);
                if(term == null)
                  break Fail5067;
                f_11988 = term;
                if(true)
                  break Success2865;
              }
            }
            term = term2897;
            Success2866:
            { 
              Fail5069:
              { 
                IStrategoTerm h_11988 = null;
                h_11988 = term;
                term = d_11988;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail5069;
                term = h_11988;
                { 
                  IStrategoTerm d_12155 = null;
                  term = d_11988;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail5067;
                  d_12155 = term.getSubterm(2);
                  term = d_12155;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail5067;
                  e_11988 = ((IStrategoList)term).head();
                  term = this.invoke(context, e_11988, b_11988);
                  if(term == null)
                    break Fail5067;
                  term = index_create_qualifier_0_1.instance.invoke(context, term, d_11988);
                  if(term == null)
                    break Fail5067;
                  f_11988 = term;
                  if(true)
                    break Success2866;
                }
              }
              term = b_11988;
              f_11988 = b_11988;
            }
          }
          if(true)
            break Success2864;
        }
        term = term2896;
        IStrategoTerm i_11988 = null;
        IStrategoTerm j_11988 = null;
        IStrategoTerm m_11988 = null;
        i_11988 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5066;
        j_11988 = term;
        m_11988 = i_11988;
        term = report_with_failure_0_2.instance.invoke(context, m_11988, trans.const971, j_11988);
        if(term == null)
          break Fail5066;
      }
      term = k_11988;
      if(f_11988 == null)
        break Fail5066;
      term = f_11988;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}