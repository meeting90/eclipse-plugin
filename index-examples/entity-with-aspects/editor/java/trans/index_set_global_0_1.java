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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_12001)
  { 
    context.push("index_set_global_0_1");
    Fail5147:
    { 
      IStrategoTerm m_12001 = null;
      IStrategoTerm p_12001 = null;
      m_12001 = term;
      p_12001 = term;
      IStrategoTerm term2920 = term;
      Success2886:
      { 
        Fail5148:
        { 
          term = index_clear_global_0_1.instance.invoke(context, term, l_12001);
          if(term == null)
            break Fail5148;
          term = index_add_global_0_1.instance.invoke(context, m_12001, l_12001);
          if(term == null)
            break Fail5148;
          if(true)
            break Success2886;
        }
        term = term2920;
        IStrategoTerm n_12001 = null;
        IStrategoTerm o_12001 = null;
        IStrategoTerm r_12001 = null;
        n_12001 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5147;
        o_12001 = term;
        r_12001 = n_12001;
        term = report_with_failure_0_2.instance.invoke(context, r_12001, trans.const987, o_12001);
        if(term == null)
          break Fail5147;
      }
      term = p_12001;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}