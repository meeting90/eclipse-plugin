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

@SuppressWarnings("all") final class lifted996 extends Strategy 
{ 
  TermReference r_11956;

  TermReference s_11956;

  TermReference t_11956;

  TermReference a_11957;

  TermReference u_11956;

  TermReference v_11956;

  TermReference b_11957;

  TermReference w_11956;

  TermReference o_11956;

  TermReference q_11956;

  TermReference x_11956;

  TermReference y_11956;

  TermReference j_11957;

  TermReference z_11956;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5723:
    { 
      IStrategoTerm o_11957 = null;
      IStrategoTerm n_11958 = null;
      IStrategoTerm o_11958 = null;
      IStrategoTerm q_11958 = null;
      IStrategoTerm r_11958 = null;
      IStrategoTerm s_11958 = null;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5723;
      if(r_11956.value == null)
        r_11956.value = term;
      else
        if(r_11956.value != term && !r_11956.value.match(term))
          break Fail5723;
      o_11957 = term;
      q_11958 = term;
      n_11958 = trans.const935;
      r_11958 = q_11958;
      o_11958 = trans.constCons250;
      term = r_11958;
      s_11958 = r_11958;
      if(r_11956.value == null)
        break Fail5723;
      term = termFactory.makeTuple(trans.const936, r_11956.value);
      term = dr_set_rule_0_3.instance.invoke(context, s_11958, n_11958, o_11958, term);
      if(term == null)
        break Fail5723;
      term = o_11957;
      if(s_11956.value == null)
        break Fail5723;
      term = map_1_0.instance.invoke(context, s_11956.value, analyze_top_defs_0_0.instance);
      if(term == null)
        break Fail5723;
      term = unzip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5723;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5723;
      if(u_11956.value == null)
        u_11956.value = term.getSubterm(0);
      else
        if(u_11956.value != term.getSubterm(0) && !u_11956.value.match(term.getSubterm(0)))
          break Fail5723;
      if(t_11956.value == null)
        t_11956.value = term.getSubterm(1);
      else
        if(t_11956.value != term.getSubterm(1) && !t_11956.value.match(term.getSubterm(1)))
          break Fail5723;
      if(t_11956.value == null)
        break Fail5723;
      term = concat_0_0.instance.invoke(context, t_11956.value);
      if(term == null)
        break Fail5723;
      if(a_11957.value == null)
        a_11957.value = term;
      else
        if(a_11957.value != term && !a_11957.value.match(term))
          break Fail5723;
      if(u_11956.value == null)
        break Fail5723;
      term = u_11956.value;
      lifted998 lifted9980 = new lifted998();
      lifted9980.o_11956 = o_11956;
      lifted9980.q_11956 = q_11956;
      term = map_1_0.instance.invoke(context, term, lifted9980);
      if(term == null)
        break Fail5723;
      term = unzip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5723;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5723;
      if(w_11956.value == null)
        w_11956.value = term.getSubterm(0);
      else
        if(w_11956.value != term.getSubterm(0) && !w_11956.value.match(term.getSubterm(0)))
          break Fail5723;
      if(v_11956.value == null)
        v_11956.value = term.getSubterm(1);
      else
        if(v_11956.value != term.getSubterm(1) && !v_11956.value.match(term.getSubterm(1)))
          break Fail5723;
      if(v_11956.value == null)
        break Fail5723;
      term = concat_0_0.instance.invoke(context, v_11956.value);
      if(term == null)
        break Fail5723;
      if(b_11957.value == null)
        b_11957.value = term;
      else
        if(b_11957.value != term && !b_11957.value.match(term))
          break Fail5723;
      if(w_11956.value == null)
        break Fail5723;
      term = w_11956.value;
      lifted999 lifted9990 = new lifted999();
      lifted9990.o_11956 = o_11956;
      lifted9990.q_11956 = q_11956;
      term = map_1_0.instance.invoke(context, term, lifted9990);
      if(term == null)
        break Fail5723;
      term = unzip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5723;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5723;
      if(j_11957.value == null)
        j_11957.value = term.getSubterm(0);
      else
        if(j_11957.value != term.getSubterm(0) && !j_11957.value.match(term.getSubterm(0)))
          break Fail5723;
      if(x_11956.value == null)
        x_11956.value = term.getSubterm(1);
      else
        if(x_11956.value != term.getSubterm(1) && !x_11956.value.match(term.getSubterm(1)))
          break Fail5723;
      if(x_11956.value == null)
        break Fail5723;
      term = concat_0_0.instance.invoke(context, x_11956.value);
      if(term == null)
        break Fail5723;
      if(y_11956.value == null)
        y_11956.value = term;
      else
        if(y_11956.value != term && !y_11956.value.match(term))
          break Fail5723;
      if(j_11957.value == null)
        break Fail5723;
      term = unzip_0_0.instance.invoke(context, j_11957.value);
      if(term == null)
        break Fail5723;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5723;
      if(z_11956.value == null)
        z_11956.value = term.getSubterm(0);
      else
        if(z_11956.value != term.getSubterm(0) && !z_11956.value.match(term.getSubterm(0)))
          break Fail5723;
      if(true)
        return term;
    }
    return null;
  }
}