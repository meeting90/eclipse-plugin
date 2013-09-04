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
    Fail2574:
    { 
      IStrategoTerm v_2181 = null;
      TermReference w_2181 = new TermReference();
      TermReference x_2181 = new TermReference();
      IStrategoTerm y_2181 = null;
      IStrategoTerm z_2181 = null;
      IStrategoTerm b_2182 = null;
      IStrategoTerm c_2182 = null;
      IStrategoTerm e_2182 = null;
      IStrategoTerm f_2182 = null;
      if(w_2181.value == null)
        w_2181.value = term;
      else
        if(w_2181.value != term && !w_2181.value.match(term))
          break Fail2574;
      b_2182 = term;
      e_2182 = term;
      c_2182 = trans.const402;
      f_2182 = e_2182;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, f_2182, c_2182, trans.constCons118);
      if(term == null)
        break Fail2574;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2574;
      v_2181 = term.getSubterm(0);
      z_2181 = term.getSubterm(1);
      y_2181 = term.getSubterm(2);
      term = v_2181;
      lifted570 lifted5700 = new lifted570();
      lifted5700.w_2181 = w_2181;
      lifted5700.x_2181 = x_2181;
      term = split_fetch_1_0.instance.invoke(context, term, lifted5700);
      if(term == null)
        break Fail2574;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2574;
      term = hashtable_put_0_2.instance.invoke(context, y_2181, z_2181, term);
      if(term == null)
        break Fail2574;
      term = b_2182;
      if(x_2181.value == null)
        break Fail2574;
      term = x_2181.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}