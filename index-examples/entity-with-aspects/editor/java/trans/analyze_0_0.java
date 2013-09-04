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

@SuppressWarnings("all") public class analyze_0_0 extends Strategy 
{ 
  public static analyze_0_0 instance = new analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_0_0");
    Fail5265:
    { 
      IStrategoTerm m_12017 = null;
      IStrategoTerm o_12017 = null;
      IStrategoTerm p_12017 = null;
      TermReference q_12017 = new TermReference();
      TermReference r_12017 = new TermReference();
      TermReference s_12017 = new TermReference();
      TermReference t_12017 = new TermReference();
      IStrategoTerm u_12017 = null;
      IStrategoTerm v_12017 = null;
      IStrategoTerm y_12017 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5265;
      m_12017 = term.getSubterm(0);
      o_12017 = term.getSubterm(1);
      p_12017 = term.getSubterm(2);
      y_12017 = term;
      IStrategoTerm term2984 = term;
      Success2936:
      { 
        Fail5266:
        { 
          IStrategoTerm a_12018 = null;
          IStrategoTerm b_12018 = null;
          term = termFactory.makeTuple(m_12017, o_12017, p_12017);
          a_12018 = term;
          b_12018 = trans.const998;
          term = analyze_top_0_1.instance.invoke(context, a_12018, b_12018);
          if(term == null)
            break Fail5266;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail5266;
          if(s_12017.value == null)
            s_12017.value = term.getSubterm(0);
          else
            if(s_12017.value != term.getSubterm(0) && !s_12017.value.match(term.getSubterm(0)))
              break Fail5266;
          u_12017 = term.getSubterm(1);
          lifted1140 lifted11400 = new lifted1140();
          lifted11400.q_12017 = q_12017;
          lifted11400.r_12017 = r_12017;
          lifted11400.s_12017 = s_12017;
          lifted11400.t_12017 = t_12017;
          term = index_transaction_1_0.instance.invoke(context, term, lifted11400);
          if(term == null)
            break Fail5266;
          term = index_filepairs_to_files_0_0.instance.invoke(context, u_12017);
          if(term == null)
            break Fail5266;
          v_12017 = term;
          if(true)
            break Success2936;
        }
        term = term2984;
        IStrategoTerm w_12017 = null;
        IStrategoTerm x_12017 = null;
        IStrategoTerm e_12018 = null;
        w_12017 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5265;
        x_12017 = term;
        e_12018 = w_12017;
        term = report_with_failure_0_2.instance.invoke(context, e_12018, trans.const1012, x_12017);
        if(term == null)
          break Fail5265;
      }
      term = y_12017;
      if(s_12017.value == null || (q_12017.value == null || (r_12017.value == null || (t_12017.value == null || v_12017 == null))))
        break Fail5265;
      term = termFactory.makeTuple(s_12017.value, q_12017.value, r_12017.value, t_12017.value, v_12017);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}