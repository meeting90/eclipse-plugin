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
    Fail2579:
    { 
      TermReference v_2182 = new TermReference();
      IStrategoTerm y_2182 = null;
      IStrategoTerm a_2183 = null;
      IStrategoTerm b_2183 = null;
      if(v_2182.value == null)
        v_2182.value = term;
      else
        if(v_2182.value != term && !v_2182.value.match(term))
          break Fail2579;
      a_2183 = term;
      y_2182 = trans.const402;
      b_2183 = a_2183;
      term = dr_lookup_rule_0_2.instance.invoke(context, b_2183, y_2182, trans.constCons118);
      if(term == null)
        break Fail2579;
      lifted573 lifted5730 = new lifted573();
      lifted5730.v_2182 = v_2182;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted5730);
      if(term == null)
        break Fail2579;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}