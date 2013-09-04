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

@SuppressWarnings("all") public class commit_and_compile_0_0 extends Strategy 
{ 
  public static commit_and_compile_0_0 instance = new commit_and_compile_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("commit_and_compile_0_0");
    Fail4857:
    { 
      IStrategoTerm n_11952 = null;
      n_11952 = term;
      IStrategoTerm term2765 = term;
      Success2743:
      { 
        Fail4858:
        { 
          term = index_commit_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4858;
          if(true)
            break Success2743;
        }
        term = term2765;
        IStrategoTerm j_11952 = null;
        IStrategoTerm k_11952 = null;
        IStrategoTerm p_11952 = null;
        j_11952 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4857;
        k_11952 = term;
        p_11952 = j_11952;
        term = report_with_failure_0_2.instance.invoke(context, p_11952, trans.const925, k_11952);
        if(term == null)
          break Fail4857;
      }
      term = n_11952;
      IStrategoTerm term2766 = term;
      Success2744:
      { 
        Fail4859:
        { 
          term = index_schedule_compilation_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4859;
          if(true)
            break Success2744;
        }
        term = term2766;
        IStrategoTerm l_11952 = null;
        IStrategoTerm m_11952 = null;
        IStrategoTerm s_11952 = null;
        l_11952 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4857;
        m_11952 = term;
        s_11952 = l_11952;
        term = report_with_failure_0_2.instance.invoke(context, s_11952, trans.const925, m_11952);
        if(term == null)
          break Fail4857;
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