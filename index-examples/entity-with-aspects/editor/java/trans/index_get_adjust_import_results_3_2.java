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

@SuppressWarnings("all") public class index_get_adjust_import_results_3_2 extends Strategy 
{ 
  public static index_get_adjust_import_results_3_2 instance = new index_get_adjust_import_results_3_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_2114, Strategy p_2114, Strategy q_2114, IStrategoTerm g_2114, IStrategoTerm ref_h_2114)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_2114 = new TermReference(ref_h_2114);
    context.push("index_get_adjust_import_results_3_2");
    Fail2075:
    { 
      TermReference i_2114 = new TermReference();
      IStrategoTerm j_2114 = null;
      IStrategoTerm k_2114 = null;
      IStrategoTerm r_2114 = null;
      if(i_2114.value == null)
        i_2114.value = term;
      else
        if(i_2114.value != term && !i_2114.value.match(term))
          break Fail2075;
      r_2114 = term;
      IStrategoTerm term1288 = term;
      Success1261:
      { 
        Fail2076:
        { 
          term = g_2114;
          lifted439 lifted4390 = new lifted439();
          lifted4390.o_2114 = o_2114;
          lifted4390.p_2114 = p_2114;
          lifted4390.q_2114 = q_2114;
          lifted4390.i_2114 = i_2114;
          lifted4390.h_2114 = h_2114;
          term = mapconcat_1_0.instance.invoke(context, term, lifted4390);
          if(term == null)
            break Fail2076;
          j_2114 = term;
          Success1262:
          { 
            Fail2077:
            { 
              IStrategoTerm l_2114 = null;
              l_2114 = term;
              IStrategoTerm term1291 = term;
              Success1263:
              { 
                Fail2078:
                { 
                  term = termFactory.makeTuple(trans.constStopLookup0, j_2114);
                  term = elem_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail2078;
                  { 
                    if(true)
                      break Fail2077;
                    if(true)
                      break Success1263;
                  }
                }
                term = term1291;
              }
              term = l_2114;
              { 
                term = filter_1_0.instance.invoke(context, j_2114, q_2114);
                if(term == null)
                  break Fail2076;
                k_2114 = term;
                if(true)
                  break Success1262;
              }
            }
            term = trans.constStopLookup0;
            k_2114 = trans.constStopLookup0;
          }
          if(true)
            break Success1261;
        }
        term = term1288;
        IStrategoTerm m_2114 = null;
        IStrategoTerm n_2114 = null;
        IStrategoTerm v_2114 = null;
        m_2114 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2075;
        n_2114 = term;
        v_2114 = m_2114;
        term = report_with_failure_0_2.instance.invoke(context, v_2114, trans.const438, n_2114);
        if(term == null)
          break Fail2075;
      }
      term = r_2114;
      if(k_2114 == null)
        break Fail2075;
      term = k_2114;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}