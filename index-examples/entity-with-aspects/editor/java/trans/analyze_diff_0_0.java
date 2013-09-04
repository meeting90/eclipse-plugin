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
    Fail4954:
    { 
      IStrategoTerm z_11972 = null;
      IStrategoTerm a_11973 = null;
      IStrategoTerm b_11973 = null;
      IStrategoTerm c_11973 = null;
      IStrategoTerm f_11973 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4954;
      a_11973 = term.getSubterm(0);
      b_11973 = term.getSubterm(1);
      f_11973 = term;
      IStrategoTerm term2833 = term;
      Success2806:
      { 
        Fail4955:
        { 
          term = termFactory.makeTuple(b_11973, a_11973);
          term = diff_1_0.instance.invoke(context, term, index_diff_compare_0_0.instance);
          if(term == null)
            break Fail4955;
          z_11972 = term;
          term = termFactory.makeTuple(a_11973, b_11973);
          term = diff_1_0.instance.invoke(context, term, index_diff_compare_0_0.instance);
          if(term == null)
            break Fail4955;
          c_11973 = term;
          if(true)
            break Success2806;
        }
        term = term2833;
        IStrategoTerm d_11973 = null;
        IStrategoTerm e_11973 = null;
        IStrategoTerm h_11973 = null;
        d_11973 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4954;
        e_11973 = term;
        h_11973 = d_11973;
        term = report_with_failure_0_2.instance.invoke(context, h_11973, trans.const952, e_11973);
        if(term == null)
          break Fail4954;
      }
      term = f_11973;
      if(z_11972 == null || c_11973 == null)
        break Fail4954;
      term = termFactory.makeTuple(z_11972, c_11973);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}