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

@SuppressWarnings("all") final class lifted396 extends Strategy 
{ 
  TermReference w_2093;

  TermReference x_2093;

  TermReference y_2093;

  TermReference f_2094;

  TermReference z_2093;

  TermReference a_2094;

  TermReference g_2094;

  TermReference b_2094;

  TermReference t_2093;

  TermReference v_2093;

  TermReference c_2094;

  TermReference d_2094;

  TermReference o_2094;

  TermReference e_2094;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2821:
    { 
      IStrategoTerm t_2094 = null;
      IStrategoTerm s_2095 = null;
      IStrategoTerm t_2095 = null;
      IStrategoTerm v_2095 = null;
      IStrategoTerm w_2095 = null;
      IStrategoTerm x_2095 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2821;
      if(w_2093.value == null)
        w_2093.value = term;
      else
        if(w_2093.value != term && !w_2093.value.match(term))
          break Fail2821;
      t_2094 = term;
      v_2095 = term;
      s_2095 = trans.const415;
      w_2095 = v_2095;
      t_2095 = trans.constCons118;
      term = w_2095;
      x_2095 = w_2095;
      if(w_2093.value == null)
        break Fail2821;
      term = termFactory.makeTuple(trans.const416, w_2093.value);
      term = dr_set_rule_0_3.instance.invoke(context, x_2095, s_2095, t_2095, term);
      if(term == null)
        break Fail2821;
      term = t_2094;
      if(x_2093.value == null)
        break Fail2821;
      term = map_1_0.instance.invoke(context, x_2093.value, analyze_top_defs_0_0.instance);
      if(term == null)
        break Fail2821;
      term = unzip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2821;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2821;
      if(z_2093.value == null)
        z_2093.value = term.getSubterm(0);
      else
        if(z_2093.value != term.getSubterm(0) && !z_2093.value.match(term.getSubterm(0)))
          break Fail2821;
      if(y_2093.value == null)
        y_2093.value = term.getSubterm(1);
      else
        if(y_2093.value != term.getSubterm(1) && !y_2093.value.match(term.getSubterm(1)))
          break Fail2821;
      if(y_2093.value == null)
        break Fail2821;
      term = concat_0_0.instance.invoke(context, y_2093.value);
      if(term == null)
        break Fail2821;
      if(f_2094.value == null)
        f_2094.value = term;
      else
        if(f_2094.value != term && !f_2094.value.match(term))
          break Fail2821;
      if(z_2093.value == null)
        break Fail2821;
      term = z_2093.value;
      lifted398 lifted3980 = new lifted398();
      lifted3980.t_2093 = t_2093;
      lifted3980.v_2093 = v_2093;
      term = map_1_0.instance.invoke(context, term, lifted3980);
      if(term == null)
        break Fail2821;
      term = unzip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2821;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2821;
      if(b_2094.value == null)
        b_2094.value = term.getSubterm(0);
      else
        if(b_2094.value != term.getSubterm(0) && !b_2094.value.match(term.getSubterm(0)))
          break Fail2821;
      if(a_2094.value == null)
        a_2094.value = term.getSubterm(1);
      else
        if(a_2094.value != term.getSubterm(1) && !a_2094.value.match(term.getSubterm(1)))
          break Fail2821;
      if(a_2094.value == null)
        break Fail2821;
      term = concat_0_0.instance.invoke(context, a_2094.value);
      if(term == null)
        break Fail2821;
      if(g_2094.value == null)
        g_2094.value = term;
      else
        if(g_2094.value != term && !g_2094.value.match(term))
          break Fail2821;
      if(b_2094.value == null)
        break Fail2821;
      term = b_2094.value;
      lifted399 lifted3990 = new lifted399();
      lifted3990.t_2093 = t_2093;
      lifted3990.v_2093 = v_2093;
      term = map_1_0.instance.invoke(context, term, lifted3990);
      if(term == null)
        break Fail2821;
      term = unzip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2821;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2821;
      if(o_2094.value == null)
        o_2094.value = term.getSubterm(0);
      else
        if(o_2094.value != term.getSubterm(0) && !o_2094.value.match(term.getSubterm(0)))
          break Fail2821;
      if(c_2094.value == null)
        c_2094.value = term.getSubterm(1);
      else
        if(c_2094.value != term.getSubterm(1) && !c_2094.value.match(term.getSubterm(1)))
          break Fail2821;
      if(c_2094.value == null)
        break Fail2821;
      term = concat_0_0.instance.invoke(context, c_2094.value);
      if(term == null)
        break Fail2821;
      if(d_2094.value == null)
        d_2094.value = term;
      else
        if(d_2094.value != term && !d_2094.value.match(term))
          break Fail2821;
      if(o_2094.value == null)
        break Fail2821;
      term = unzip_0_0.instance.invoke(context, o_2094.value);
      if(term == null)
        break Fail2821;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2821;
      if(e_2094.value == null)
        e_2094.value = term.getSubterm(0);
      else
        if(e_2094.value != term.getSubterm(0) && !e_2094.value.match(term.getSubterm(0)))
          break Fail2821;
      if(true)
        return term;
    }
    return null;
  }
}