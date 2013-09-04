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

@SuppressWarnings("all") public class analyze_diff_0_0 extends Strategy 
{ 
  public static analyze_diff_0_0 instance = new analyze_diff_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_diff_0_0");
    Fail2052:
    { 
      IStrategoTerm e_2110 = null;
      IStrategoTerm f_2110 = null;
      IStrategoTerm g_2110 = null;
      IStrategoTerm h_2110 = null;
      IStrategoTerm k_2110 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2052;
      f_2110 = term.getSubterm(0);
      g_2110 = term.getSubterm(1);
      k_2110 = term;
      IStrategoTerm term1277 = term;
      Success1250:
      { 
        Fail2053:
        { 
          term = termFactory.makeTuple(g_2110, f_2110);
          term = diff_1_0.instance.invoke(context, term, index_diff_compare_0_0.instance);
          if(term == null)
            break Fail2053;
          e_2110 = term;
          term = termFactory.makeTuple(f_2110, g_2110);
          term = diff_1_0.instance.invoke(context, term, index_diff_compare_0_0.instance);
          if(term == null)
            break Fail2053;
          h_2110 = term;
          if(true)
            break Success1250;
        }
        term = term1277;
        IStrategoTerm i_2110 = null;
        IStrategoTerm j_2110 = null;
        IStrategoTerm m_2110 = null;
        i_2110 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2052;
        j_2110 = term;
        m_2110 = i_2110;
        term = report_with_failure_0_2.instance.invoke(context, m_2110, trans.const432, j_2110);
        if(term == null)
          break Fail2052;
      }
      term = k_2110;
      if(e_2110 == null || h_2110 == null)
        break Fail2052;
      term = termFactory.makeTuple(e_2110, h_2110);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}