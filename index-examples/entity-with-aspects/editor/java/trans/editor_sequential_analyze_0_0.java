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

@SuppressWarnings("all") public class editor_sequential_analyze_0_0 extends Strategy 
{ 
  public static editor_sequential_analyze_0_0 instance = new editor_sequential_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_sequential_analyze_0_0");
    Fail2473:
    { 
      IStrategoTerm k_2174 = null;
      IStrategoTerm m_2174 = null;
      k_2174 = term;
      IStrategoTerm term1523 = term;
      Success1473:
      { 
        Fail2474:
        { 
          IStrategoTerm s_2174 = null;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2474;
          m_2174 = term;
          term = debug_0_0.instance.invoke(context, trans.const486);
          if(term == null)
            break Fail2474;
          term = index_analyze_files_1_0.instance.invoke(context, k_2174, lifted560.instance);
          if(term == null)
            break Fail2474;
          term = times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2474;
          s_2174 = term;
          term = termFactory.makeTuple(s_2174, m_2174);
          term = diff_times_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2474;
          term = times_to_seconds_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2474;
          term = $Fst_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2474;
          term = debug_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2474;
          if(true)
            break Success1473;
        }
        term = term1523;
        IStrategoTerm n_2174 = null;
        IStrategoTerm o_2174 = null;
        IStrategoTerm v_2174 = null;
        n_2174 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2473;
        o_2174 = term;
        v_2174 = n_2174;
        term = report_with_failure_0_2.instance.invoke(context, v_2174, trans.const519, o_2174);
        if(term == null)
          break Fail2473;
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