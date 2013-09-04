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

@SuppressWarnings("all") public class editor_sequential_analyze_0_0 extends Strategy 
{ 
  public static editor_sequential_analyze_0_0 instance = new editor_sequential_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_sequential_analyze_0_0");
    Fail5375:
    { 
      IStrategoTerm f_12037 = null;
      IStrategoTerm h_12037 = null;
      f_12037 = term;
      IStrategoTerm term3079 = term;
      Success3029:
      { 
        Fail5376:
        { 
          IStrategoTerm n_12037 = null;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5376;
          h_12037 = term;
          term = debug_0_0.instance.invoke(context, trans.const1006);
          if(term == null)
            break Fail5376;
          term = index_analyze_files_1_0.instance.invoke(context, f_12037, lifted1160.instance);
          if(term == null)
            break Fail5376;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5376;
          n_12037 = term;
          term = termFactory.makeTuple(n_12037, h_12037);
          term = diff_times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5376;
          term = times_to_seconds_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5376;
          term = $Fst_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5376;
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5376;
          if(true)
            break Success3029;
        }
        term = term3079;
        IStrategoTerm i_12037 = null;
        IStrategoTerm j_12037 = null;
        IStrategoTerm q_12037 = null;
        i_12037 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5375;
        j_12037 = term;
        q_12037 = i_12037;
        term = report_with_failure_0_2.instance.invoke(context, q_12037, trans.const1039, j_12037);
        if(term == null)
          break Fail5375;
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