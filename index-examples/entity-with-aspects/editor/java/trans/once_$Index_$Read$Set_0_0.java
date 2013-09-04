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

@SuppressWarnings("all") public class once_$Index_$Read$Set_0_0 extends Strategy 
{ 
  public static once_$Index_$Read$Set_0_0 instance = new once_$Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Index_ReadSet_0_0");
    Fail5476:
    { 
      IStrategoTerm q_12044 = null;
      TermReference r_12044 = new TermReference();
      TermReference s_12044 = new TermReference();
      IStrategoTerm t_12044 = null;
      IStrategoTerm u_12044 = null;
      IStrategoTerm w_12044 = null;
      IStrategoTerm x_12044 = null;
      IStrategoTerm z_12044 = null;
      IStrategoTerm a_12045 = null;
      if(r_12044.value == null)
        r_12044.value = term;
      else
        if(r_12044.value != term && !r_12044.value.match(term))
          break Fail5476;
      w_12044 = term;
      z_12044 = term;
      x_12044 = trans.const922;
      a_12045 = z_12044;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, a_12045, x_12044, trans.constCons250);
      if(term == null)
        break Fail5476;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5476;
      q_12044 = term.getSubterm(0);
      u_12044 = term.getSubterm(1);
      t_12044 = term.getSubterm(2);
      term = q_12044;
      lifted1170 lifted11700 = new lifted1170();
      lifted11700.r_12044 = r_12044;
      lifted11700.s_12044 = s_12044;
      term = split_fetch_1_0.instance.invoke(context, term, lifted11700);
      if(term == null)
        break Fail5476;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5476;
      term = hashtable_put_0_2.instance.invoke(context, t_12044, u_12044, term);
      if(term == null)
        break Fail5476;
      term = w_12044;
      if(s_12044.value == null)
        break Fail5476;
      term = s_12044.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}