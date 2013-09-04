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
    Fail2363:
    { 
      IStrategoTerm r_2154 = null;
      IStrategoTerm t_2154 = null;
      IStrategoTerm u_2154 = null;
      TermReference v_2154 = new TermReference();
      TermReference w_2154 = new TermReference();
      TermReference x_2154 = new TermReference();
      TermReference y_2154 = new TermReference();
      IStrategoTerm z_2154 = null;
      IStrategoTerm a_2155 = null;
      IStrategoTerm d_2155 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2363;
      r_2154 = term.getSubterm(0);
      t_2154 = term.getSubterm(1);
      u_2154 = term.getSubterm(2);
      d_2155 = term;
      IStrategoTerm term1428 = term;
      Success1380:
      { 
        Fail2364:
        { 
          IStrategoTerm f_2155 = null;
          IStrategoTerm g_2155 = null;
          term = termFactory.makeTuple(r_2154, t_2154, u_2154);
          f_2155 = term;
          g_2155 = trans.const478;
          term = analyze_top_0_1.instance.invoke(context, f_2155, g_2155);
          if(term == null)
            break Fail2364;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail2364;
          if(x_2154.value == null)
            x_2154.value = term.getSubterm(0);
          else
            if(x_2154.value != term.getSubterm(0) && !x_2154.value.match(term.getSubterm(0)))
              break Fail2364;
          z_2154 = term.getSubterm(1);
          lifted540 lifted5400 = new lifted540();
          lifted5400.v_2154 = v_2154;
          lifted5400.w_2154 = w_2154;
          lifted5400.x_2154 = x_2154;
          lifted5400.y_2154 = y_2154;
          term = index_transaction_1_0.instance.invoke(context, term, lifted5400);
          if(term == null)
            break Fail2364;
          term = index_filepairs_to_files_0_0.instance.invoke(context, z_2154);
          if(term == null)
            break Fail2364;
          a_2155 = term;
          if(true)
            break Success1380;
        }
        term = term1428;
        IStrategoTerm b_2155 = null;
        IStrategoTerm c_2155 = null;
        IStrategoTerm j_2155 = null;
        b_2155 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2363;
        c_2155 = term;
        j_2155 = b_2155;
        term = report_with_failure_0_2.instance.invoke(context, j_2155, trans.const492, c_2155);
        if(term == null)
          break Fail2363;
      }
      term = d_2155;
      if(x_2154.value == null || (v_2154.value == null || (w_2154.value == null || (y_2154.value == null || a_2155 == null))))
        break Fail2363;
      term = termFactory.makeTuple(x_2154.value, v_2154.value, w_2154.value, y_2154.value, a_2155);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}