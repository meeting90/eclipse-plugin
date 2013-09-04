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

@SuppressWarnings("all") public class index_set_global_0_1 extends Strategy 
{ 
  public static index_set_global_0_1 instance = new index_set_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_2138)
  { 
    context.push("index_set_global_0_1");
    Fail2245:
    { 
      IStrategoTerm r_2138 = null;
      IStrategoTerm u_2138 = null;
      r_2138 = term;
      u_2138 = term;
      IStrategoTerm term1364 = term;
      Success1330:
      { 
        Fail2246:
        { 
          term = index_clear_global_0_1.instance.invoke(context, term, q_2138);
          if(term == null)
            break Fail2246;
          term = index_add_global_0_1.instance.invoke(context, r_2138, q_2138);
          if(term == null)
            break Fail2246;
          if(true)
            break Success1330;
        }
        term = term1364;
        IStrategoTerm s_2138 = null;
        IStrategoTerm t_2138 = null;
        IStrategoTerm w_2138 = null;
        s_2138 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2245;
        t_2138 = term;
        w_2138 = s_2138;
        term = report_with_failure_0_2.instance.invoke(context, w_2138, trans.const467, t_2138);
        if(term == null)
          break Fail2245;
      }
      term = u_2138;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}