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

@SuppressWarnings("all") final class lifted404 extends Strategy 
{ 
  TermReference c_2097;

  TermReference d_2097;

  TermReference e_2097;

  TermReference f_2097;

  TermReference a_2097;

  TermReference b_2097;

  TermReference g_2097;

  TermReference h_2097;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2816:
    { 
      IStrategoTerm i_2097 = null;
      IStrategoTerm r_2097 = null;
      IStrategoTerm s_2097 = null;
      IStrategoTerm u_2097 = null;
      IStrategoTerm v_2097 = null;
      IStrategoTerm w_2097 = null;
      IStrategoTerm y_2097 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2816;
      if(g_2097.value == null)
        g_2097.value = term;
      else
        if(g_2097.value != term && !g_2097.value.match(term))
          break Fail2816;
      i_2097 = term;
      u_2097 = term;
      r_2097 = trans.const402;
      v_2097 = u_2097;
      s_2097 = trans.constCons118;
      term = v_2097;
      w_2097 = v_2097;
      if(g_2097.value == null)
        break Fail2816;
      term = termFactory.makeTuple(trans.const403, g_2097.value);
      term = dr_set_rule_0_3.instance.invoke(context, w_2097, r_2097, s_2097, term);
      if(term == null)
        break Fail2816;
      term = i_2097;
      if(c_2097.value == null)
        break Fail2816;
      term = c_2097.value;
      y_2097 = c_2097.value;
      term = context.invokePrimitive("SSL_EXT_clone_and_set_parents", y_2097, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2816;
      if(d_2097.value == null)
        d_2097.value = term;
      else
        if(d_2097.value != term && !d_2097.value.match(term))
          break Fail2816;
      if(d_2097.value == null)
        break Fail2816;
      term = origin_track_forced_1_0.instance.invoke(context, d_2097.value, analyze_tree_data_0_0.instance);
      if(term == null)
        break Fail2816;
      if(e_2097.value == null)
        e_2097.value = term;
      else
        if(e_2097.value != term && !e_2097.value.match(term))
          break Fail2816;
      if(e_2097.value == null)
        break Fail2816;
      term = analyze_uses_0_0.instance.invoke(context, e_2097.value);
      if(term == null)
        break Fail2816;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2816;
      if(f_2097.value == null)
        f_2097.value = term.getSubterm(0);
      else
        if(f_2097.value != term.getSubterm(0) && !f_2097.value.match(term.getSubterm(0)))
          break Fail2816;
      if(f_2097.value == null)
        break Fail2816;
      term = index_add_all_0_1.instance.invoke(context, f_2097.value, h_2097.value);
      if(term == null)
        break Fail2816;
      IStrategoTerm term1239 = term;
      Success1531:
      { 
        Fail2817:
        { 
          IStrategoTerm j_2097 = null;
          j_2097 = term;
          IStrategoTerm term1240 = term;
          Success1532:
          { 
            Fail2818:
            { 
              term = is_test_input_0_2.instance.invoke(context, term, a_2097.value, b_2097.value);
              if(term == null)
                break Fail2818;
              { 
                if(true)
                  break Fail2817;
                if(true)
                  break Success1532;
              }
            }
            term = term1240;
          }
          term = j_2097;
          { 
            if(g_2097.value == null)
              break Fail2816;
            term = iset_elements_0_0.instance.invoke(context, g_2097.value);
            if(term == null)
              break Fail2816;
            term = index_add_all_0_1.instance.invoke(context, term, h_2097.value);
            if(term == null)
              break Fail2816;
            if(true)
              break Success1531;
          }
        }
        term = term1239;
      }
      if(true)
        return term;
    }
    return null;
  }
}