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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_2125)
  { 
    context.push("index_merge_ast_0_1");
    Fail2164:
    { 
      IStrategoTerm h_2125 = null;
      IStrategoTerm i_2125 = null;
      IStrategoTerm j_2125 = null;
      IStrategoTerm k_2125 = null;
      IStrategoTerm p_2125 = null;
      i_2125 = term;
      p_2125 = term;
      IStrategoTerm term1340 = term;
      Success1308:
      { 
        Fail2165:
        { 
          IStrategoTerm term1341 = term;
          Success1309:
          { 
            Fail2166:
            { 
              IStrategoTerm l_2125 = null;
              l_2125 = term;
              term = is_list_0_0.instance.invoke(context, i_2125);
              if(term == null)
                break Fail2166;
              term = l_2125;
              { 
                term = i_2125;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail2165;
                h_2125 = ((IStrategoList)term).head();
                term = this.invoke(context, h_2125, g_2125);
                if(term == null)
                  break Fail2165;
                k_2125 = term;
                if(true)
                  break Success1309;
              }
            }
            term = term1341;
            Success1310:
            { 
              Fail2167:
              { 
                IStrategoTerm m_2125 = null;
                m_2125 = term;
                term = i_2125;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail2167;
                term = m_2125;
                { 
                  IStrategoTerm i_2292 = null;
                  term = i_2125;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
                    break Fail2165;
                  i_2292 = term.getSubterm(2);
                  term = i_2292;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail2165;
                  j_2125 = ((IStrategoList)term).head();
                  term = this.invoke(context, j_2125, g_2125);
                  if(term == null)
                    break Fail2165;
                  term = index_create_qualifier_0_1.instance.invoke(context, term, i_2125);
                  if(term == null)
                    break Fail2165;
                  k_2125 = term;
                  if(true)
                    break Success1310;
                }
              }
              term = g_2125;
              k_2125 = g_2125;
            }
          }
          if(true)
            break Success1308;
        }
        term = term1340;
        IStrategoTerm n_2125 = null;
        IStrategoTerm o_2125 = null;
        IStrategoTerm r_2125 = null;
        n_2125 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2164;
        o_2125 = term;
        r_2125 = n_2125;
        term = report_with_failure_0_2.instance.invoke(context, r_2125, trans.const451, o_2125);
        if(term == null)
          break Fail2164;
      }
      term = p_2125;
      if(k_2125 == null)
        break Fail2164;
      term = k_2125;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}