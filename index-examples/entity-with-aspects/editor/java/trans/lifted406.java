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

@SuppressWarnings("all") final class lifted406 extends Strategy 
{ 
  TermReference i_2098;

  TermReference j_2098;

  TermReference k_2098;

  TermReference l_2098;

  TermReference g_2098;

  TermReference h_2098;

  TermReference m_2098;

  TermReference n_2098;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2813:
    { 
      IStrategoTerm o_2098 = null;
      IStrategoTerm x_2098 = null;
      IStrategoTerm y_2098 = null;
      IStrategoTerm a_2099 = null;
      IStrategoTerm b_2099 = null;
      IStrategoTerm c_2099 = null;
      IStrategoTerm e_2099 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2813;
      if(m_2098.value == null)
        m_2098.value = term;
      else
        if(m_2098.value != term && !m_2098.value.match(term))
          break Fail2813;
      o_2098 = term;
      a_2099 = term;
      x_2098 = trans.const402;
      b_2099 = a_2099;
      y_2098 = trans.constCons118;
      term = b_2099;
      c_2099 = b_2099;
      if(m_2098.value == null)
        break Fail2813;
      term = termFactory.makeTuple(trans.const403, m_2098.value);
      term = dr_set_rule_0_3.instance.invoke(context, c_2099, x_2098, y_2098, term);
      if(term == null)
        break Fail2813;
      term = o_2098;
      if(i_2098.value == null)
        break Fail2813;
      term = analyze_uses_0_0.instance.invoke(context, i_2098.value);
      if(term == null)
        break Fail2813;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2813;
      if(k_2098.value == null)
        k_2098.value = term.getSubterm(0);
      else
        if(k_2098.value != term.getSubterm(0) && !k_2098.value.match(term.getSubterm(0)))
          break Fail2813;
      if(j_2098.value == null)
        j_2098.value = term.getSubterm(1);
      else
        if(j_2098.value != term.getSubterm(1) && !j_2098.value.match(term.getSubterm(1)))
          break Fail2813;
      if(j_2098.value == null)
        break Fail2813;
      term = index_add_all_0_1.instance.invoke(context, j_2098.value, n_2098.value);
      if(term == null)
        break Fail2813;
      if(k_2098.value == null)
        break Fail2813;
      term = k_2098.value;
      e_2099 = k_2098.value;
      term = context.invokePrimitive("SSL_EXT_clone_and_set_parents", e_2099, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2813;
      if(l_2098.value == null)
        l_2098.value = term;
      else
        if(l_2098.value != term && !l_2098.value.match(term))
          break Fail2813;
      IStrategoTerm term1242 = term;
      Success1529:
      { 
        Fail2814:
        { 
          IStrategoTerm p_2098 = null;
          p_2098 = term;
          IStrategoTerm term1243 = term;
          Success1530:
          { 
            Fail2815:
            { 
              term = is_test_input_0_2.instance.invoke(context, term, g_2098.value, h_2098.value);
              if(term == null)
                break Fail2815;
              { 
                if(true)
                  break Fail2814;
                if(true)
                  break Success1530;
              }
            }
            term = term1243;
          }
          term = p_2098;
          { 
            if(m_2098.value == null)
              break Fail2813;
            term = iset_elements_0_0.instance.invoke(context, m_2098.value);
            if(term == null)
              break Fail2813;
            term = index_add_all_0_1.instance.invoke(context, term, n_2098.value);
            if(term == null)
              break Fail2813;
            if(true)
              break Success1529;
          }
        }
        term = term1242;
      }
      if(true)
        return term;
    }
    return null;
  }
}