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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_2124)
  { 
    context.push("index_analyze_files_1_0");
    Fail2161:
    { 
      IStrategoTerm y_2124 = null;
      y_2124 = term;
      IStrategoTerm term1336 = term;
      Success1306:
      { 
        Fail2162:
        { 
          term = length_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2162;
          term = set_total_work_units_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2162;
          if(true)
            break Success1306;
        }
        term = term1336;
        IStrategoTerm t_2124 = null;
        IStrategoTerm u_2124 = null;
        IStrategoTerm a_2125 = null;
        t_2124 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2161;
        u_2124 = term;
        a_2125 = t_2124;
        term = report_with_failure_0_2.instance.invoke(context, a_2125, trans.const450, u_2124);
        if(term == null)
          break Fail2161;
      }
      term = y_2124;
      IStrategoTerm term1337 = term;
      Success1307:
      { 
        Fail2163:
        { 
          term = x_2124.invoke(context, term);
          if(term == null)
            break Fail2163;
          term = filter_1_0.instance.invoke(context, term, lifted461.instance);
          if(term == null)
            break Fail2163;
          if(true)
            break Success1307;
        }
        term = term1337;
        IStrategoTerm v_2124 = null;
        IStrategoTerm w_2124 = null;
        IStrategoTerm d_2125 = null;
        v_2124 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2161;
        w_2124 = term;
        d_2125 = v_2124;
        term = report_with_failure_0_2.instance.invoke(context, d_2125, trans.const450, w_2124);
        if(term == null)
          break Fail2161;
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