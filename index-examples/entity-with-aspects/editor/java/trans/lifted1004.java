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

@SuppressWarnings("all") final class lifted1004 extends Strategy 
{ 
  TermReference x_11959;

  TermReference y_11959;

  TermReference z_11959;

  TermReference a_11960;

  TermReference v_11959;

  TermReference w_11959;

  TermReference b_11960;

  TermReference c_11960;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5718:
    { 
      IStrategoTerm d_11960 = null;
      IStrategoTerm m_11960 = null;
      IStrategoTerm n_11960 = null;
      IStrategoTerm p_11960 = null;
      IStrategoTerm q_11960 = null;
      IStrategoTerm r_11960 = null;
      IStrategoTerm t_11960 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5718;
      if(b_11960.value == null)
        b_11960.value = term;
      else
        if(b_11960.value != term && !b_11960.value.match(term))
          break Fail5718;
      d_11960 = term;
      p_11960 = term;
      m_11960 = trans.const922;
      q_11960 = p_11960;
      n_11960 = trans.constCons250;
      term = q_11960;
      r_11960 = q_11960;
      if(b_11960.value == null)
        break Fail5718;
      term = termFactory.makeTuple(trans.const923, b_11960.value);
      term = dr_set_rule_0_3.instance.invoke(context, r_11960, m_11960, n_11960, term);
      if(term == null)
        break Fail5718;
      term = d_11960;
      if(x_11959.value == null)
        break Fail5718;
      term = x_11959.value;
      t_11960 = x_11959.value;
      term = context.invokePrimitive("SSL_EXT_clone_and_set_parents", t_11960, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5718;
      if(y_11959.value == null)
        y_11959.value = term;
      else
        if(y_11959.value != term && !y_11959.value.match(term))
          break Fail5718;
      if(y_11959.value == null)
        break Fail5718;
      term = origin_track_forced_1_0.instance.invoke(context, y_11959.value, analyze_tree_data_0_0.instance);
      if(term == null)
        break Fail5718;
      if(z_11959.value == null)
        z_11959.value = term;
      else
        if(z_11959.value != term && !z_11959.value.match(term))
          break Fail5718;
      if(z_11959.value == null)
        break Fail5718;
      term = analyze_uses_0_0.instance.invoke(context, z_11959.value);
      if(term == null)
        break Fail5718;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5718;
      if(a_11960.value == null)
        a_11960.value = term.getSubterm(0);
      else
        if(a_11960.value != term.getSubterm(0) && !a_11960.value.match(term.getSubterm(0)))
          break Fail5718;
      if(a_11960.value == null)
        break Fail5718;
      term = index_add_all_0_1.instance.invoke(context, a_11960.value, c_11960.value);
      if(term == null)
        break Fail5718;
      IStrategoTerm term2795 = term;
      Success3087:
      { 
        Fail5719:
        { 
          IStrategoTerm e_11960 = null;
          e_11960 = term;
          IStrategoTerm term2796 = term;
          Success3088:
          { 
            Fail5720:
            { 
              term = is_test_input_0_2.instance.invoke(context, term, v_11959.value, w_11959.value);
              if(term == null)
                break Fail5720;
              { 
                if(true)
                  break Fail5719;
                if(true)
                  break Success3088;
              }
            }
            term = term2796;
          }
          term = e_11960;
          { 
            if(b_11960.value == null)
              break Fail5718;
            term = iset_elements_0_0.instance.invoke(context, b_11960.value);
            if(term == null)
              break Fail5718;
            term = index_add_all_0_1.instance.invoke(context, term, c_11960.value);
            if(term == null)
              break Fail5718;
            if(true)
              break Success3087;
          }
        }
        term = term2795;
      }
      if(true)
        return term;
    }
    return null;
  }
}