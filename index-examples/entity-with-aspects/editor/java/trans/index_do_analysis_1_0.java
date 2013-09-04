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

@SuppressWarnings("all") public class index_do_analysis_1_0 extends Strategy 
{ 
  public static index_do_analysis_1_0 instance = new index_do_analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_2108)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_do_analysis_1_0");
    Fail2040:
    { 
      IStrategoTerm a_2108 = null;
      IStrategoTerm b_2108 = null;
      IStrategoTerm c_2108 = null;
      IStrategoTerm d_2108 = null;
      IStrategoTerm e_2108 = null;
      IStrategoTerm f_2108 = null;
      IStrategoTerm k_2108 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2040;
      a_2108 = term.getSubterm(0);
      k_2108 = term;
      IStrategoTerm term1269 = term;
      Success1242:
      { 
        Fail2041:
        { 
          term = j_2108.invoke(context, term);
          if(term == null)
            break Fail2041;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail2041;
          b_2108 = term.getSubterm(0);
          c_2108 = term.getSubterm(1);
          d_2108 = term.getSubterm(2);
          e_2108 = term.getSubterm(3);
          f_2108 = term.getSubterm(4);
          IStrategoTerm term1270 = term;
          Success1243:
          { 
            Fail2042:
            { 
              IStrategoTerm g_2108 = null;
              g_2108 = term;
              term = f_2108;
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail2042;
              term = g_2108;
              { 
                term = complete_work_unit_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail2041;
                if(true)
                  break Success1243;
              }
            }
            term = term1270;
          }
          if(true)
            break Success1242;
        }
        term = term1269;
        IStrategoTerm h_2108 = null;
        IStrategoTerm i_2108 = null;
        IStrategoTerm o_2108 = null;
        h_2108 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2040;
        i_2108 = term;
        o_2108 = h_2108;
        term = report_with_failure_0_2.instance.invoke(context, o_2108, trans.const427, i_2108);
        if(term == null)
          break Fail2040;
      }
      term = k_2108;
      if(b_2108 == null || (c_2108 == null || (d_2108 == null || (e_2108 == null || f_2108 == null))))
        break Fail2040;
      term = termFactory.makeAppl(Main._consParallelResults_6, new IStrategoTerm[]{a_2108, b_2108, c_2108, d_2108, e_2108, f_2108});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}