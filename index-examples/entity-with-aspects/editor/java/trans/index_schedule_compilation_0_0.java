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

@SuppressWarnings("all") public class index_schedule_compilation_0_0 extends Strategy 
{ 
  public static index_schedule_compilation_0_0 instance = new index_schedule_compilation_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_schedule_compilation_0_0");
    Fail4839:
    { 
      IStrategoTerm term2753 = term;
      Success2732:
      { 
        Fail4840:
        { 
          IStrategoTerm d_11948 = null;
          IStrategoTerm f_11948 = null;
          IStrategoTerm g_11948 = null;
          f_11948 = term;
          d_11948 = trans.const915;
          g_11948 = f_11948;
          term = queue_strategy_0_2.instance.invoke(context, g_11948, d_11948, trans.const916);
          if(term == null)
            break Fail4840;
          if(true)
            break Success2732;
        }
        term = term2753;
        IStrategoTerm a_11948 = null;
        IStrategoTerm b_11948 = null;
        IStrategoTerm i_11948 = null;
        a_11948 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4839;
        b_11948 = term;
        i_11948 = a_11948;
        term = report_with_failure_0_2.instance.invoke(context, i_11948, trans.const917, b_11948);
        if(term == null)
          break Fail4839;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}