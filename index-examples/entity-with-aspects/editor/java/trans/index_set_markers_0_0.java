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

@SuppressWarnings("all") public class index_set_markers_0_0 extends Strategy 
{ 
  public static index_set_markers_0_0 instance = new index_set_markers_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_set_markers_0_0");
    Fail2038:
    { 
      IStrategoTerm k_2107 = null;
      IStrategoTerm l_2107 = null;
      IStrategoTerm m_2107 = null;
      IStrategoTerm n_2107 = null;
      IStrategoTerm o_2107 = null;
      IStrategoTerm r_2107 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParallelResults_6 != ((IStrategoAppl)term).getConstructor())
        break Fail2038;
      o_2107 = term.getSubterm(0);
      k_2107 = term.getSubterm(1);
      l_2107 = term.getSubterm(2);
      m_2107 = term.getSubterm(3);
      n_2107 = term.getSubterm(4);
      r_2107 = term;
      IStrategoTerm term1268 = term;
      Success1241:
      { 
        Fail2039:
        { 
          term = termFactory.makeTuple(k_2107, l_2107, m_2107, n_2107);
          term = set_markers_0_1.instance.invoke(context, term, o_2107);
          if(term == null)
            break Fail2039;
          if(true)
            break Success1241;
        }
        term = term1268;
        IStrategoTerm p_2107 = null;
        IStrategoTerm q_2107 = null;
        IStrategoTerm t_2107 = null;
        p_2107 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2038;
        q_2107 = term;
        t_2107 = p_2107;
        term = report_with_failure_0_2.instance.invoke(context, t_2107, trans.const426, q_2107);
        if(term == null)
          break Fail2038;
      }
      term = r_2107;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}