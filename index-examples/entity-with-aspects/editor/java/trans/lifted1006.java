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

@SuppressWarnings("all") final class lifted1006 extends Strategy 
{ 
  TermReference d_11961;

  TermReference e_11961;

  TermReference f_11961;

  TermReference g_11961;

  TermReference b_11961;

  TermReference c_11961;

  TermReference h_11961;

  TermReference i_11961;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5715:
    { 
      IStrategoTerm j_11961 = null;
      IStrategoTerm s_11961 = null;
      IStrategoTerm t_11961 = null;
      IStrategoTerm v_11961 = null;
      IStrategoTerm w_11961 = null;
      IStrategoTerm x_11961 = null;
      IStrategoTerm z_11961 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5715;
      if(h_11961.value == null)
        h_11961.value = term;
      else
        if(h_11961.value != term && !h_11961.value.match(term))
          break Fail5715;
      j_11961 = term;
      v_11961 = term;
      s_11961 = trans.const922;
      w_11961 = v_11961;
      t_11961 = trans.constCons250;
      term = w_11961;
      x_11961 = w_11961;
      if(h_11961.value == null)
        break Fail5715;
      term = termFactory.makeTuple(trans.const923, h_11961.value);
      term = dr_set_rule_0_3.instance.invoke(context, x_11961, s_11961, t_11961, term);
      if(term == null)
        break Fail5715;
      term = j_11961;
      if(d_11961.value == null)
        break Fail5715;
      term = analyze_uses_0_0.instance.invoke(context, d_11961.value);
      if(term == null)
        break Fail5715;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5715;
      if(f_11961.value == null)
        f_11961.value = term.getSubterm(0);
      else
        if(f_11961.value != term.getSubterm(0) && !f_11961.value.match(term.getSubterm(0)))
          break Fail5715;
      if(e_11961.value == null)
        e_11961.value = term.getSubterm(1);
      else
        if(e_11961.value != term.getSubterm(1) && !e_11961.value.match(term.getSubterm(1)))
          break Fail5715;
      if(e_11961.value == null)
        break Fail5715;
      term = index_add_all_0_1.instance.invoke(context, e_11961.value, i_11961.value);
      if(term == null)
        break Fail5715;
      if(f_11961.value == null)
        break Fail5715;
      term = f_11961.value;
      z_11961 = f_11961.value;
      term = context.invokePrimitive("SSL_EXT_clone_and_set_parents", z_11961, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5715;
      if(g_11961.value == null)
        g_11961.value = term;
      else
        if(g_11961.value != term && !g_11961.value.match(term))
          break Fail5715;
      IStrategoTerm term2798 = term;
      Success3085:
      { 
        Fail5716:
        { 
          IStrategoTerm k_11961 = null;
          k_11961 = term;
          IStrategoTerm term2799 = term;
          Success3086:
          { 
            Fail5717:
            { 
              term = is_test_input_0_2.instance.invoke(context, term, b_11961.value, c_11961.value);
              if(term == null)
                break Fail5717;
              { 
                if(true)
                  break Fail5716;
                if(true)
                  break Success3086;
              }
            }
            term = term2799;
          }
          term = k_11961;
          { 
            if(h_11961.value == null)
              break Fail5715;
            term = iset_elements_0_0.instance.invoke(context, h_11961.value);
            if(term == null)
              break Fail5715;
            term = index_add_all_0_1.instance.invoke(context, term, i_11961.value);
            if(term == null)
              break Fail5715;
            if(true)
              break Success3085;
          }
        }
        term = term2798;
      }
      if(true)
        return term;
    }
    return null;
  }
}