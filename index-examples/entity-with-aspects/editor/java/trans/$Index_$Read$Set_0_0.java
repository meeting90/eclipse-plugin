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

@SuppressWarnings("all") public class $Index_$Read$Set_0_0 extends Strategy 
{ 
  public static $Index_$Read$Set_0_0 instance = new $Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Index_ReadSet_0_0");
    Fail5481:
    { 
      TermReference q_12045 = new TermReference();
      IStrategoTerm t_12045 = null;
      IStrategoTerm v_12045 = null;
      IStrategoTerm w_12045 = null;
      if(q_12045.value == null)
        q_12045.value = term;
      else
        if(q_12045.value != term && !q_12045.value.match(term))
          break Fail5481;
      v_12045 = term;
      t_12045 = trans.const922;
      w_12045 = v_12045;
      term = dr_lookup_rule_0_2.instance.invoke(context, w_12045, t_12045, trans.constCons250);
      if(term == null)
        break Fail5481;
      lifted1173 lifted11730 = new lifted1173();
      lifted11730.q_12045 = q_12045;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted11730);
      if(term == null)
        break Fail5481;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}