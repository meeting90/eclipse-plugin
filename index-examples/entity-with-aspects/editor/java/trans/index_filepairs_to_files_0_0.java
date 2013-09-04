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
    Fail2208:
    { 
      IStrategoTerm k_2133 = null;
      IStrategoTerm l_2133 = null;
      IStrategoTerm o_2133 = null;
      k_2133 = term;
      o_2133 = term;
      IStrategoTerm term1355 = term;
      Success1323:
      { 
        Fail2209:
        { 
          term = map_1_0.instance.invoke(context, k_2133, lifted506.instance);
          if(term == null)
            break Fail2209;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2209;
          l_2133 = term;
          if(true)
            break Success1323;
        }
        term = term1355;
        IStrategoTerm m_2133 = null;
        IStrategoTerm n_2133 = null;
        IStrategoTerm w_2133 = null;
        m_2133 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2208;
        n_2133 = term;
        w_2133 = m_2133;
        term = report_with_failure_0_2.instance.invoke(context, w_2133, trans.const455, n_2133);
        if(term == null)
          break Fail2208;
      }
      term = o_2133;
      if(l_2133 == null)
        break Fail2208;
      term = l_2133;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}