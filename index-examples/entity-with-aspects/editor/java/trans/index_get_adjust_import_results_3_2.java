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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_11977, Strategy k_11977, Strategy l_11977, IStrategoTerm b_11977, IStrategoTerm ref_c_11977)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_11977 = new TermReference(ref_c_11977);
    context.push("index_get_adjust_import_results_3_2");
    Fail4977:
    { 
      TermReference d_11977 = new TermReference();
      IStrategoTerm e_11977 = null;
      IStrategoTerm f_11977 = null;
      IStrategoTerm m_11977 = null;
      if(d_11977.value == null)
        d_11977.value = term;
      else
        if(d_11977.value != term && !d_11977.value.match(term))
          break Fail4977;
      m_11977 = term;
      IStrategoTerm term2844 = term;
      Success2817:
      { 
        Fail4978:
        { 
          term = b_11977;
          lifted1039 lifted10390 = new lifted1039();
          lifted10390.j_11977 = j_11977;
          lifted10390.k_11977 = k_11977;
          lifted10390.l_11977 = l_11977;
          lifted10390.d_11977 = d_11977;
          lifted10390.c_11977 = c_11977;
          term = mapconcat_1_0.instance.invoke(context, term, lifted10390);
          if(term == null)
            break Fail4978;
          e_11977 = term;
          Success2818:
          { 
            Fail4979:
            { 
              IStrategoTerm g_11977 = null;
              g_11977 = term;
              IStrategoTerm term2847 = term;
              Success2819:
              { 
                Fail4980:
                { 
                  term = termFactory.makeTuple(trans.constStopLookup0, e_11977);
                  term = elem_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail4980;
                  { 
                    if(true)
                      break Fail4979;
                    if(true)
                      break Success2819;
                  }
                }
                term = term2847;
              }
              term = g_11977;
              { 
                term = filter_1_0.instance.invoke(context, e_11977, l_11977);
                if(term == null)
                  break Fail4978;
                f_11977 = term;
                if(true)
                  break Success2818;
              }
            }
            term = trans.constStopLookup0;
            f_11977 = trans.constStopLookup0;
          }
          if(true)
            break Success2817;
        }
        term = term2844;
        IStrategoTerm h_11977 = null;
        IStrategoTerm i_11977 = null;
        IStrategoTerm q_11977 = null;
        h_11977 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4977;
        i_11977 = term;
        q_11977 = h_11977;
        term = report_with_failure_0_2.instance.invoke(context, q_11977, trans.const958, i_11977);
        if(term == null)
          break Fail4977;
      }
      term = m_11977;
      if(f_11977 == null)
        break Fail4977;
      term = f_11977;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}