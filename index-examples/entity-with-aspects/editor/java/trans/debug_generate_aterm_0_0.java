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
    Fail2387:
    { 
      IStrategoTerm q_2159 = null;
      IStrategoTerm r_2159 = null;
      IStrategoTerm s_2159 = null;
      IStrategoTerm t_2159 = null;
      IStrategoTerm w_2159 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2387;
      s_2159 = term.getSubterm(0);
      q_2159 = term.getSubterm(3);
      w_2159 = term;
      IStrategoTerm term1448 = term;
      Success1398:
      { 
        Fail2388:
        { 
          IStrategoTerm y_2159 = null;
          y_2159 = q_2159;
          term = guarantee_extension_0_1.instance.invoke(context, y_2159, trans.const496);
          if(term == null)
            break Fail2388;
          r_2159 = term;
          term = s_2159;
          t_2159 = s_2159;
          if(true)
            break Success1398;
        }
        term = term1448;
        IStrategoTerm u_2159 = null;
        IStrategoTerm v_2159 = null;
        IStrategoTerm a_2160 = null;
        u_2159 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2387;
        v_2159 = term;
        a_2160 = u_2159;
        term = report_with_failure_0_2.instance.invoke(context, a_2160, trans.const497, v_2159);
        if(term == null)
          break Fail2387;
      }
      term = w_2159;
      if(r_2159 == null || t_2159 == null)
        break Fail2387;
      term = termFactory.makeTuple(r_2159, t_2159);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}