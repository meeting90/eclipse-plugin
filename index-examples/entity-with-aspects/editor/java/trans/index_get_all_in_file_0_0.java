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
    Fail5128:
    { 
      IStrategoTerm i_11998 = null;
      IStrategoTerm j_11998 = null;
      IStrategoTerm m_11998 = null;
      i_11998 = term;
      m_11998 = term;
      IStrategoTerm term2914 = term;
      Success2880:
      { 
        Fail5129:
        { 
          term = context.invokePrimitive("LANG_index_get_all_in_file", term, NO_STRATEGIES, new IStrategoTerm[]{i_11998});
          if(term == null)
            break Fail5129;
          j_11998 = term;
          if(true)
            break Success2880;
        }
        term = term2914;
        IStrategoTerm k_11998 = null;
        IStrategoTerm l_11998 = null;
        IStrategoTerm q_11998 = null;
        k_11998 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5128;
        l_11998 = term;
        q_11998 = k_11998;
        term = report_with_failure_0_2.instance.invoke(context, q_11998, trans.const979, l_11998);
        if(term == null)
          break Fail5128;
      }
      term = m_11998;
      if(j_11998 == null)
        break Fail5128;
      term = j_11998;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}