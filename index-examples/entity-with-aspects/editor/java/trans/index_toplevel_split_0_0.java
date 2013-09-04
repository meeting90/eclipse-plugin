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

@SuppressWarnings("all") public class index_toplevel_split_0_0 extends Strategy 
{ 
  public static index_toplevel_split_0_0 instance = new index_toplevel_split_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_toplevel_split_0_0");
    Fail2043:
    { 
      IStrategoTerm r_2108 = null;
      IStrategoTerm s_2108 = null;
      IStrategoTerm u_2108 = null;
      IStrategoTerm x_2108 = null;
      r_2108 = term;
      x_2108 = term;
      IStrategoTerm term1271 = term;
      Success1244:
      { 
        Fail2044:
        { 
          term = analyze_defs_0_0.instance.invoke(context, r_2108);
          if(term == null)
            break Fail2044;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2044;
          s_2108 = term.getSubterm(0);
          term = index_toplevel_split_internal_0_0.instance.invoke(context, s_2108);
          if(term == null)
            break Fail2044;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2044;
          u_2108 = term;
          if(true)
            break Success1244;
        }
        term = term1271;
        IStrategoTerm v_2108 = null;
        IStrategoTerm w_2108 = null;
        IStrategoTerm z_2108 = null;
        v_2108 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2043;
        w_2108 = term;
        z_2108 = v_2108;
        term = report_with_failure_0_2.instance.invoke(context, z_2108, trans.const428, w_2108);
        if(term == null)
          break Fail2043;
      }
      term = x_2108;
      if(u_2108 == null)
        break Fail2043;
      term = u_2108;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}