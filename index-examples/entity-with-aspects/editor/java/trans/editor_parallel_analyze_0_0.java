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
    Fail2471:
    { 
      IStrategoTerm w_2173 = null;
      IStrategoTerm y_2173 = null;
      w_2173 = term;
      IStrategoTerm term1522 = term;
      Success1472:
      { 
        Fail2472:
        { 
          IStrategoTerm e_2174 = null;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2472;
          y_2173 = term;
          term = debug_0_0.instance.invoke(context, trans.const486);
          if(term == null)
            break Fail2472;
          term = index_analyze_files_1_0.instance.invoke(context, w_2173, lifted555.instance);
          if(term == null)
            break Fail2472;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2472;
          e_2174 = term;
          term = termFactory.makeTuple(e_2174, y_2173);
          term = diff_times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2472;
          term = times_to_seconds_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2472;
          term = $Fst_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2472;
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2472;
          if(true)
            break Success1472;
        }
        term = term1522;
        IStrategoTerm z_2173 = null;
        IStrategoTerm a_2174 = null;
        IStrategoTerm h_2174 = null;
        z_2173 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2471;
        a_2174 = term;
        h_2174 = z_2173;
        term = report_with_failure_0_2.instance.invoke(context, h_2174, trans.const518, a_2174);
        if(term == null)
          break Fail2471;
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