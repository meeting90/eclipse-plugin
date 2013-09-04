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

@SuppressWarnings("all") public class index_get_all_in_file_0_0 extends Strategy 
{ 
  public static index_get_all_in_file_0_0 instance = new index_get_all_in_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_get_all_in_file_0_0");
    Fail2226:
    { 
      IStrategoTerm n_2135 = null;
      IStrategoTerm o_2135 = null;
      IStrategoTerm r_2135 = null;
      n_2135 = term;
      r_2135 = term;
      IStrategoTerm term1358 = term;
      Success1324:
      { 
        Fail2227:
        { 
          term = context.invokePrimitive("LANG_index_get_all_in_file", term, NO_STRATEGIES, new IStrategoTerm[]{n_2135});
          if(term == null)
            break Fail2227;
          o_2135 = term;
          if(true)
            break Success1324;
        }
        term = term1358;
        IStrategoTerm p_2135 = null;
        IStrategoTerm q_2135 = null;
        IStrategoTerm v_2135 = null;
        p_2135 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2226;
        q_2135 = term;
        v_2135 = p_2135;
        term = report_with_failure_0_2.instance.invoke(context, v_2135, trans.const459, q_2135);
        if(term == null)
          break Fail2226;
      }
      term = r_2135;
      if(o_2135 == null)
        break Fail2226;
      term = o_2135;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}