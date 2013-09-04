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

@SuppressWarnings("all") public class analyze_top_uses_0_2 extends Strategy 
{ 
  public static analyze_top_uses_0_2 instance = new analyze_top_uses_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_2098, IStrategoTerm ref_h_2098)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference g_2098 = new TermReference(ref_g_2098);
    TermReference h_2098 = new TermReference(ref_h_2098);
    context.push("analyze_top_uses_0_2");
    Fail1996:
    { 
      TermReference i_2098 = new TermReference();
      TermReference j_2098 = new TermReference();
      TermReference k_2098 = new TermReference();
      TermReference l_2098 = new TermReference();
      TermReference m_2098 = new TermReference();
      TermReference n_2098 = new TermReference();
      IStrategoTerm s_2098 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1996;
      if(i_2098.value == null)
        i_2098.value = term.getSubterm(0);
      else
        if(i_2098.value != term.getSubterm(0) && !i_2098.value.match(term.getSubterm(0)))
          break Fail1996;
      if(n_2098.value == null)
        n_2098.value = term.getSubterm(1);
      else
        if(n_2098.value != term.getSubterm(1) && !n_2098.value.match(term.getSubterm(1)))
          break Fail1996;
      s_2098 = term;
      IStrategoTerm term1241 = term;
      Success1216:
      { 
        Fail1997:
        { 
          IStrategoTerm t_2098 = null;
          IStrategoTerm u_2098 = null;
          if(n_2098.value == null)
            break Fail1997;
          term = index_set_current_file_0_0.instance.invoke(context, n_2098.value);
          if(term == null)
            break Fail1997;
          u_2098 = term;
          t_2098 = trans.const402;
          term = u_2098;
          lifted406 lifted4060 = new lifted406();
          lifted4060.i_2098 = i_2098;
          lifted4060.j_2098 = j_2098;
          lifted4060.k_2098 = k_2098;
          lifted4060.l_2098 = l_2098;
          lifted4060.g_2098 = g_2098;
          lifted4060.h_2098 = h_2098;
          lifted4060.m_2098 = m_2098;
          lifted4060.n_2098 = n_2098;
          term = dr_scope_1_1.instance.invoke(context, term, lifted4060, t_2098);
          if(term == null)
            break Fail1997;
          if(true)
            break Success1216;
        }
        term = term1241;
        IStrategoTerm q_2098 = null;
        IStrategoTerm r_2098 = null;
        IStrategoTerm i_2099 = null;
        q_2098 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1996;
        r_2098 = term;
        i_2099 = q_2098;
        term = report_with_failure_0_2.instance.invoke(context, i_2099, trans.const420, r_2098);
        if(term == null)
          break Fail1996;
      }
      term = s_2098;
      if(l_2098.value == null || (n_2098.value == null || j_2098.value == null))
        break Fail1996;
      term = termFactory.makeTuple(termFactory.makeTuple(l_2098.value, n_2098.value), j_2098.value);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}