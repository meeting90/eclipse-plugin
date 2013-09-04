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
    Fail4945:
    { 
      IStrategoTerm m_11971 = null;
      IStrategoTerm n_11971 = null;
      IStrategoTerm p_11971 = null;
      IStrategoTerm s_11971 = null;
      m_11971 = term;
      s_11971 = term;
      IStrategoTerm term2827 = term;
      Success2800:
      { 
        Fail4946:
        { 
          term = analyze_defs_0_0.instance.invoke(context, m_11971);
          if(term == null)
            break Fail4946;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail4946;
          n_11971 = term.getSubterm(0);
          term = index_toplevel_split_internal_0_0.instance.invoke(context, n_11971);
          if(term == null)
            break Fail4946;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4946;
          p_11971 = term;
          if(true)
            break Success2800;
        }
        term = term2827;
        IStrategoTerm q_11971 = null;
        IStrategoTerm r_11971 = null;
        IStrategoTerm u_11971 = null;
        q_11971 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4945;
        r_11971 = term;
        u_11971 = q_11971;
        term = report_with_failure_0_2.instance.invoke(context, u_11971, trans.const948, r_11971);
        if(term == null)
          break Fail4945;
      }
      term = s_11971;
      if(p_11971 == null)
        break Fail4945;
      term = p_11971;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}