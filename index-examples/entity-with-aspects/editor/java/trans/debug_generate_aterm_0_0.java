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

@SuppressWarnings("all") public class debug_generate_aterm_0_0 extends Strategy 
{ 
  public static debug_generate_aterm_0_0 instance = new debug_generate_aterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_generate_aterm_0_0");
    Fail5289:
    { 
      IStrategoTerm l_12022 = null;
      IStrategoTerm m_12022 = null;
      IStrategoTerm n_12022 = null;
      IStrategoTerm o_12022 = null;
      IStrategoTerm r_12022 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5289;
      n_12022 = term.getSubterm(0);
      l_12022 = term.getSubterm(3);
      r_12022 = term;
      IStrategoTerm term3004 = term;
      Success2954:
      { 
        Fail5290:
        { 
          IStrategoTerm t_12022 = null;
          t_12022 = l_12022;
          term = guarantee_extension_0_1.instance.invoke(context, t_12022, trans.const1016);
          if(term == null)
            break Fail5290;
          m_12022 = term;
          term = n_12022;
          o_12022 = n_12022;
          if(true)
            break Success2954;
        }
        term = term3004;
        IStrategoTerm p_12022 = null;
        IStrategoTerm q_12022 = null;
        IStrategoTerm v_12022 = null;
        p_12022 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5289;
        q_12022 = term;
        v_12022 = p_12022;
        term = report_with_failure_0_2.instance.invoke(context, v_12022, trans.const1017, q_12022);
        if(term == null)
          break Fail5289;
      }
      term = r_12022;
      if(m_12022 == null || o_12022 == null)
        break Fail5289;
      term = termFactory.makeTuple(m_12022, o_12022);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}