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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_11979, Strategy f_11979, Strategy g_11979, IStrategoTerm s_11978, IStrategoTerm ref_t_11978)
  { 
    TermReference t_11978 = new TermReference(ref_t_11978);
    context.push("index_get_adjust_lookup_results_3_2");
    Fail4986:
    { 
      TermReference u_11978 = new TermReference();
      IStrategoTerm w_11978 = null;
      IStrategoTerm h_11979 = null;
      if(u_11978.value == null)
        u_11978.value = term;
      else
        if(u_11978.value != term && !u_11978.value.match(term))
          break Fail4986;
      h_11979 = term;
      IStrategoTerm term2851 = term;
      Success2823:
      { 
        Fail4987:
        { 
          Success2824:
          { 
            Fail4988:
            { 
              IStrategoTerm x_11978 = null;
              x_11978 = term;
              term = s_11978;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consStopLookup_0 != ((IStrategoAppl)term).getConstructor())
                break Fail4988;
              term = x_11978;
              { 
                term = trans.constStopLookup0;
                w_11978 = trans.constStopLookup0;
                if(true)
                  break Success2824;
              }
            }
            term = s_11978;
            lifted1044 lifted10440 = new lifted1044();
            lifted10440.e_11979 = e_11979;
            lifted10440.f_11979 = f_11979;
            lifted10440.g_11979 = g_11979;
            lifted10440.u_11978 = u_11978;
            lifted10440.t_11978 = t_11978;
            term = mapconcat_1_0.instance.invoke(context, term, lifted10440);
            if(term == null)
              break Fail4987;
            term = filter_1_0.instance.invoke(context, term, g_11979);
            if(term == null)
              break Fail4987;
            w_11978 = term;
          }
          if(true)
            break Success2823;
        }
        term = term2851;
        IStrategoTerm c_11979 = null;
        IStrategoTerm d_11979 = null;
        IStrategoTerm l_11979 = null;
        c_11979 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4986;
        d_11979 = term;
        l_11979 = c_11979;
        term = report_with_failure_0_2.instance.invoke(context, l_11979, trans.const961, d_11979);
        if(term == null)
          break Fail4986;
      }
      term = h_11979;
      if(w_11978 == null)
        break Fail4986;
      term = w_11978;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}