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

@SuppressWarnings("all") public class index_analyze_files_1_0 extends Strategy 
{ 
  public static index_analyze_files_1_0 instance = new index_analyze_files_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_11987)
  { 
    context.push("index_analyze_files_1_0");
    Fail5063:
    { 
      IStrategoTerm t_11987 = null;
      t_11987 = term;
      IStrategoTerm term2892 = term;
      Success2862:
      { 
        Fail5064:
        { 
          term = length_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5064;
          term = set_total_work_units_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5064;
          if(true)
            break Success2862;
        }
        term = term2892;
        IStrategoTerm o_11987 = null;
        IStrategoTerm p_11987 = null;
        IStrategoTerm v_11987 = null;
        o_11987 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5063;
        p_11987 = term;
        v_11987 = o_11987;
        term = report_with_failure_0_2.instance.invoke(context, v_11987, trans.const970, p_11987);
        if(term == null)
          break Fail5063;
      }
      term = t_11987;
      IStrategoTerm term2893 = term;
      Success2863:
      { 
        Fail5065:
        { 
          term = s_11987.invoke(context, term);
          if(term == null)
            break Fail5065;
          term = filter_1_0.instance.invoke(context, term, lifted1061.instance);
          if(term == null)
            break Fail5065;
          if(true)
            break Success2863;
        }
        term = term2893;
        IStrategoTerm q_11987 = null;
        IStrategoTerm r_11987 = null;
        IStrategoTerm y_11987 = null;
        q_11987 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5063;
        r_11987 = term;
        y_11987 = q_11987;
        term = report_with_failure_0_2.instance.invoke(context, y_11987, trans.const970, r_11987);
        if(term == null)
          break Fail5063;
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