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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_11961, IStrategoTerm ref_c_11961)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_11961 = new TermReference(ref_b_11961);
    TermReference c_11961 = new TermReference(ref_c_11961);
    context.push("analyze_top_uses_0_2");
    Fail4898:
    { 
      TermReference d_11961 = new TermReference();
      TermReference e_11961 = new TermReference();
      TermReference f_11961 = new TermReference();
      TermReference g_11961 = new TermReference();
      TermReference h_11961 = new TermReference();
      TermReference i_11961 = new TermReference();
      IStrategoTerm n_11961 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4898;
      if(d_11961.value == null)
        d_11961.value = term.getSubterm(0);
      else
        if(d_11961.value != term.getSubterm(0) && !d_11961.value.match(term.getSubterm(0)))
          break Fail4898;
      if(i_11961.value == null)
        i_11961.value = term.getSubterm(1);
      else
        if(i_11961.value != term.getSubterm(1) && !i_11961.value.match(term.getSubterm(1)))
          break Fail4898;
      n_11961 = term;
      IStrategoTerm term2797 = term;
      Success2772:
      { 
        Fail4899:
        { 
          IStrategoTerm o_11961 = null;
          IStrategoTerm p_11961 = null;
          if(i_11961.value == null)
            break Fail4899;
          term = index_set_current_file_0_0.instance.invoke(context, i_11961.value);
          if(term == null)
            break Fail4899;
          p_11961 = term;
          o_11961 = trans.const922;
          term = p_11961;
          lifted1006 lifted10060 = new lifted1006();
          lifted10060.d_11961 = d_11961;
          lifted10060.e_11961 = e_11961;
          lifted10060.f_11961 = f_11961;
          lifted10060.g_11961 = g_11961;
          lifted10060.b_11961 = b_11961;
          lifted10060.c_11961 = c_11961;
          lifted10060.h_11961 = h_11961;
          lifted10060.i_11961 = i_11961;
          term = dr_scope_1_1.instance.invoke(context, term, lifted10060, o_11961);
          if(term == null)
            break Fail4899;
          if(true)
            break Success2772;
        }
        term = term2797;
        IStrategoTerm l_11961 = null;
        IStrategoTerm m_11961 = null;
        IStrategoTerm d_11962 = null;
        l_11961 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4898;
        m_11961 = term;
        d_11962 = l_11961;
        term = report_with_failure_0_2.instance.invoke(context, d_11962, trans.const940, m_11961);
        if(term == null)
          break Fail4898;
      }
      term = n_11961;
      if(g_11961.value == null || (i_11961.value == null || e_11961.value == null))
        break Fail4898;
      term = termFactory.makeTuple(termFactory.makeTuple(g_11961.value, i_11961.value), e_11961.value);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}