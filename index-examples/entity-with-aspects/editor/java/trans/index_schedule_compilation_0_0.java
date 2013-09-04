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
    Fail1937:
    { 
      IStrategoTerm term1197 = term;
      Success1176:
      { 
        Fail1938:
        { 
          IStrategoTerm i_2085 = null;
          IStrategoTerm k_2085 = null;
          IStrategoTerm l_2085 = null;
          k_2085 = term;
          i_2085 = trans.const395;
          l_2085 = k_2085;
          term = queue_strategy_0_2.instance.invoke(context, l_2085, i_2085, trans.const396);
          if(term == null)
            break Fail1938;
          if(true)
            break Success1176;
        }
        term = term1197;
        IStrategoTerm f_2085 = null;
        IStrategoTerm g_2085 = null;
        IStrategoTerm n_2085 = null;
        f_2085 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1937;
        g_2085 = term;
        n_2085 = f_2085;
        term = report_with_failure_0_2.instance.invoke(context, n_2085, trans.const397, g_2085);
        if(term == null)
          break Fail1937;
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