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

@SuppressWarnings("all") public class $Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static $Index_$Unresolved$Set_0_0 instance = new $Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Index_UnresolvedSet_0_0");
    Fail2605:
    { 
      TermReference c_2187 = new TermReference();
      IStrategoTerm f_2187 = null;
      IStrategoTerm h_2187 = null;
      IStrategoTerm i_2187 = null;
      if(c_2187.value == null)
        c_2187.value = term;
      else
        if(c_2187.value != term && !c_2187.value.match(term))
          break Fail2605;
      h_2187 = term;
      f_2187 = trans.const415;
      i_2187 = h_2187;
      term = dr_lookup_rule_0_2.instance.invoke(context, i_2187, f_2187, trans.constCons118);
      if(term == null)
        break Fail2605;
      lifted582 lifted5820 = new lifted582();
      lifted5820.c_2187 = c_2187;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted5820);
      if(term == null)
        break Fail2605;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}