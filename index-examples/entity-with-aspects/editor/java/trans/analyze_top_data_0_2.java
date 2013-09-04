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

@SuppressWarnings("all") public class analyze_top_data_0_2 extends Strategy 
{ 
  public static analyze_top_data_0_2 instance = new analyze_top_data_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_2097, IStrategoTerm ref_b_2097)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_2097 = new TermReference(ref_a_2097);
    TermReference b_2097 = new TermReference(ref_b_2097);
    context.push("analyze_top_data_0_2");
    Fail1994:
    { 
      TermReference c_2097 = new TermReference();
      TermReference d_2097 = new TermReference();
      TermReference e_2097 = new TermReference();
      TermReference f_2097 = new TermReference();
      TermReference g_2097 = new TermReference();
      TermReference h_2097 = new TermReference();
      IStrategoTerm m_2097 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1994;
      if(c_2097.value == null)
        c_2097.value = term.getSubterm(0);
      else
        if(c_2097.value != term.getSubterm(0) && !c_2097.value.match(term.getSubterm(0)))
          break Fail1994;
      if(h_2097.value == null)
        h_2097.value = term.getSubterm(1);
      else
        if(h_2097.value != term.getSubterm(1) && !h_2097.value.match(term.getSubterm(1)))
          break Fail1994;
      m_2097 = term;
      IStrategoTerm term1238 = term;
      Success1215:
      { 
        Fail1995:
        { 
          IStrategoTerm n_2097 = null;
          IStrategoTerm o_2097 = null;
          if(h_2097.value == null)
            break Fail1995;
          term = index_set_current_file_0_0.instance.invoke(context, h_2097.value);
          if(term == null)
            break Fail1995;
          o_2097 = term;
          n_2097 = trans.const402;
          term = o_2097;
          lifted404 lifted4040 = new lifted404();
          lifted4040.c_2097 = c_2097;
          lifted4040.d_2097 = d_2097;
          lifted4040.e_2097 = e_2097;
          lifted4040.f_2097 = f_2097;
          lifted4040.a_2097 = a_2097;
          lifted4040.b_2097 = b_2097;
          lifted4040.g_2097 = g_2097;
          lifted4040.h_2097 = h_2097;
          term = dr_scope_1_1.instance.invoke(context, term, lifted4040, n_2097);
          if(term == null)
            break Fail1995;
          if(true)
            break Success1215;
        }
        term = term1238;
        IStrategoTerm k_2097 = null;
        IStrategoTerm l_2097 = null;
        IStrategoTerm c_2098 = null;
        k_2097 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1994;
        l_2097 = term;
        c_2098 = k_2097;
        term = report_with_failure_0_2.instance.invoke(context, c_2098, trans.const419, l_2097);
        if(term == null)
          break Fail1994;
      }
      term = m_2097;
      if(d_2097.value == null || (h_2097.value == null || f_2097.value == null))
        break Fail1994;
      term = termFactory.makeTuple(termFactory.makeTuple(d_2097.value, h_2097.value), f_2097.value);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}