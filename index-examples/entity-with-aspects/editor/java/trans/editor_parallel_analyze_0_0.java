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

@SuppressWarnings("all") public class editor_parallel_analyze_0_0 extends Strategy 
{ 
  public static editor_parallel_analyze_0_0 instance = new editor_parallel_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_parallel_analyze_0_0");
    Fail5373:
    { 
      IStrategoTerm r_12036 = null;
      IStrategoTerm t_12036 = null;
      r_12036 = term;
      IStrategoTerm term3078 = term;
      Success3028:
      { 
        Fail5374:
        { 
          IStrategoTerm z_12036 = null;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5374;
          t_12036 = term;
          term = debug_0_0.instance.invoke(context, trans.const1006);
          if(term == null)
            break Fail5374;
          term = index_analyze_files_1_0.instance.invoke(context, r_12036, lifted1155.instance);
          if(term == null)
            break Fail5374;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5374;
          z_12036 = term;
          term = termFactory.makeTuple(z_12036, t_12036);
          term = diff_times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5374;
          term = times_to_seconds_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5374;
          term = $Fst_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5374;
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5374;
          if(true)
            break Success3028;
        }
        term = term3078;
        IStrategoTerm u_12036 = null;
        IStrategoTerm v_12036 = null;
        IStrategoTerm c_12037 = null;
        u_12036 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5373;
        v_12036 = term;
        c_12037 = u_12036;
        term = report_with_failure_0_2.instance.invoke(context, c_12037, trans.const1038, v_12036);
        if(term == null)
          break Fail5373;
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