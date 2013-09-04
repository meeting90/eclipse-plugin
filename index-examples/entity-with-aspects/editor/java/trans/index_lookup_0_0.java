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

@SuppressWarnings("all") public class index_lookup_0_0 extends Strategy 
{ 
  public static index_lookup_0_0 instance = new index_lookup_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_lookup_0_0");
    Fail2188:
    { 
      IStrategoTerm l_2130 = null;
      IStrategoTerm m_2130 = null;
      IStrategoTerm n_2130 = null;
      IStrategoTerm o_2130 = null;
      TermReference p_2130 = new TermReference();
      IStrategoTerm j_2292 = null;
      IStrategoTerm k_2292 = null;
      IStrategoTerm l_2292 = null;
      IStrategoTerm o_2292 = null;
      IStrategoTerm p_2292 = null;
      IStrategoTerm q_2292 = null;
      o_2130 = term;
      IStrategoList annos80 = term.getAnnotations();
      if(annos80.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos80).isEmpty())
        break Fail2188;
      IStrategoTerm arg733 = ((IStrategoList)annos80).head();
      if(arg733.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg733).isEmpty())
        break Fail2188;
      m_2130 = ((IStrategoList)arg733).head();
      l_2130 = ((IStrategoList)arg733).tail();
      IStrategoTerm arg734 = ((IStrategoList)annos80).tail();
      if(arg734.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg734).isEmpty())
        break Fail2188;
      term = index_namespace_unwrap_0_0.instance.invoke(context, m_2130);
      if(term == null)
        break Fail2188;
      n_2130 = term;
      term = strip_annos_0_0.instance.invoke(context, o_2130);
      if(term == null)
        break Fail2188;
      if(p_2130.value == null)
        p_2130.value = term;
      else
        if(p_2130.value != term && !p_2130.value.match(term))
          break Fail2188;
      o_2292 = o_2130;
      j_2292 = n_2130;
      p_2292 = o_2292;
      k_2292 = l_2130;
      term = p_2292;
      q_2292 = p_2292;
      if(p_2130.value == null)
        break Fail2188;
      l_2292 = p_2130.value;
      term = q_2292;
      lifted481 lifted4810 = new lifted481();
      lifted4810.p_2130 = p_2130;
      term = index_lookup_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, index_get_defs_1_2.instance, lifted4810, j_2292, k_2292, l_2292);
      if(term == null)
        break Fail2188;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}