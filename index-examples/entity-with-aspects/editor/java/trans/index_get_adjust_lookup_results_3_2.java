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

@SuppressWarnings("all") public class index_get_adjust_lookup_results_3_2 extends Strategy 
{ 
  public static index_get_adjust_lookup_results_3_2 instance = new index_get_adjust_lookup_results_3_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_2116, Strategy k_2116, Strategy l_2116, IStrategoTerm x_2115, IStrategoTerm ref_y_2115)
  { 
    TermReference y_2115 = new TermReference(ref_y_2115);
    context.push("index_get_adjust_lookup_results_3_2");
    Fail2084:
    { 
      TermReference z_2115 = new TermReference();
      IStrategoTerm b_2116 = null;
      IStrategoTerm m_2116 = null;
      if(z_2115.value == null)
        z_2115.value = term;
      else
        if(z_2115.value != term && !z_2115.value.match(term))
          break Fail2084;
      m_2116 = term;
      IStrategoTerm term1295 = term;
      Success1267:
      { 
        Fail2085:
        { 
          Success1268:
          { 
            Fail2086:
            { 
              IStrategoTerm c_2116 = null;
              c_2116 = term;
              term = x_2115;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consStopLookup_0 != ((IStrategoAppl)term).getConstructor())
                break Fail2086;
              term = c_2116;
              { 
                term = trans.constStopLookup0;
                b_2116 = trans.constStopLookup0;
                if(true)
                  break Success1268;
              }
            }
            term = x_2115;
            lifted444 lifted4440 = new lifted444();
            lifted4440.j_2116 = j_2116;
            lifted4440.k_2116 = k_2116;
            lifted4440.l_2116 = l_2116;
            lifted4440.z_2115 = z_2115;
            lifted4440.y_2115 = y_2115;
            term = mapconcat_1_0.instance.invoke(context, term, lifted4440);
            if(term == null)
              break Fail2085;
            term = filter_1_0.instance.invoke(context, term, l_2116);
            if(term == null)
              break Fail2085;
            b_2116 = term;
          }
          if(true)
            break Success1267;
        }
        term = term1295;
        IStrategoTerm h_2116 = null;
        IStrategoTerm i_2116 = null;
        IStrategoTerm q_2116 = null;
        h_2116 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2084;
        i_2116 = term;
        q_2116 = h_2116;
        term = report_with_failure_0_2.instance.invoke(context, q_2116, trans.const441, i_2116);
        if(term == null)
          break Fail2084;
      }
      term = m_2116;
      if(b_2116 == null)
        break Fail2084;
      term = b_2116;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}