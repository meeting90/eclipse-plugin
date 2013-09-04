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

@SuppressWarnings("all") final class lifted393 extends Strategy 
{ 
  TermReference l_2088;

  TermReference m_2088;

  TermReference n_2088;

  TermReference j_2088;

  TermReference k_2088;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2826:
    { 
      IStrategoTerm o_2088 = null;
      IStrategoTerm w_2088 = null;
      IStrategoTerm x_2088 = null;
      IStrategoTerm z_2088 = null;
      IStrategoTerm a_2089 = null;
      IStrategoTerm b_2089 = null;
      IStrategoTerm d_2089 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2826;
      if(m_2088.value == null)
        m_2088.value = term;
      else
        if(m_2088.value != term && !m_2088.value.match(term))
          break Fail2826;
      o_2088 = term;
      z_2088 = term;
      w_2088 = trans.const402;
      a_2089 = z_2088;
      x_2088 = trans.constCons118;
      term = a_2089;
      b_2089 = a_2089;
      if(m_2088.value == null)
        break Fail2826;
      term = termFactory.makeTuple(trans.const403, m_2088.value);
      term = dr_set_rule_0_3.instance.invoke(context, b_2089, w_2088, x_2088, term);
      if(term == null)
        break Fail2826;
      term = o_2088;
      if(l_2088.value == null)
        break Fail2826;
      term = l_2088.value;
      lifted394 lifted3940 = new lifted394();
      lifted3940.j_2088 = j_2088;
      lifted3940.k_2088 = k_2088;
      term = try_1_0.instance.invoke(context, term, lifted3940);
      if(term == null)
        break Fail2826;
      if(m_2088.value == null)
        break Fail2826;
      term = iset_elements_0_0.instance.invoke(context, m_2088.value);
      if(term == null)
        break Fail2826;
      if(n_2088.value == null)
        n_2088.value = term;
      else
        if(n_2088.value != term && !n_2088.value.match(term))
          break Fail2826;
      if(n_2088.value == null)
        break Fail2826;
      term = n_2088.value;
      d_2089 = n_2088.value;
      if(j_2088.value == null || k_2088.value == null)
        break Fail2826;
      term = termFactory.makeTuple(j_2088.value, k_2088.value);
      term = index_compilation_file_tuple_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2826;
      term = index_add_all_0_1.instance.invoke(context, d_2089, term);
      if(term == null)
        break Fail2826;
      if(true)
        return term;
    }
    return null;
  }
}