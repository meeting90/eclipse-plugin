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

@SuppressWarnings("all") public class index_filepairs_to_files_0_0 extends Strategy 
{ 
  public static index_filepairs_to_files_0_0 instance = new index_filepairs_to_files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_filepairs_to_files_0_0");
    Fail5110:
    { 
      IStrategoTerm f_11996 = null;
      IStrategoTerm g_11996 = null;
      IStrategoTerm j_11996 = null;
      f_11996 = term;
      j_11996 = term;
      IStrategoTerm term2911 = term;
      Success2879:
      { 
        Fail5111:
        { 
          term = map_1_0.instance.invoke(context, f_11996, lifted1106.instance);
          if(term == null)
            break Fail5111;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5111;
          g_11996 = term;
          if(true)
            break Success2879;
        }
        term = term2911;
        IStrategoTerm h_11996 = null;
        IStrategoTerm i_11996 = null;
        IStrategoTerm r_11996 = null;
        h_11996 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5110;
        i_11996 = term;
        r_11996 = h_11996;
        term = report_with_failure_0_2.instance.invoke(context, r_11996, trans.const975, i_11996);
        if(term == null)
          break Fail5110;
      }
      term = j_11996;
      if(g_11996 == null)
        break Fail5110;
      term = g_11996;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}