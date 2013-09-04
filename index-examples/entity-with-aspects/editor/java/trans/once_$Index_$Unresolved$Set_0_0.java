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

@SuppressWarnings("all") public class once_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static once_$Index_$Unresolved$Set_0_0 instance = new once_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Index_UnresolvedSet_0_0");
    Fail5502:
    { 
      IStrategoTerm x_12048 = null;
      TermReference y_12048 = new TermReference();
      TermReference z_12048 = new TermReference();
      IStrategoTerm a_12049 = null;
      IStrategoTerm b_12049 = null;
      IStrategoTerm d_12049 = null;
      IStrategoTerm e_12049 = null;
      IStrategoTerm g_12049 = null;
      IStrategoTerm h_12049 = null;
      if(y_12048.value == null)
        y_12048.value = term;
      else
        if(y_12048.value != term && !y_12048.value.match(term))
          break Fail5502;
      d_12049 = term;
      g_12049 = term;
      e_12049 = trans.const935;
      h_12049 = g_12049;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, h_12049, e_12049, trans.constCons250);
      if(term == null)
        break Fail5502;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5502;
      x_12048 = term.getSubterm(0);
      b_12049 = term.getSubterm(1);
      a_12049 = term.getSubterm(2);
      term = x_12048;
      lifted1179 lifted11790 = new lifted1179();
      lifted11790.y_12048 = y_12048;
      lifted11790.z_12048 = z_12048;
      term = split_fetch_1_0.instance.invoke(context, term, lifted11790);
      if(term == null)
        break Fail5502;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5502;
      term = hashtable_put_0_2.instance.invoke(context, a_12049, b_12049, term);
      if(term == null)
        break Fail5502;
      term = d_12049;
      if(z_12048.value == null)
        break Fail5502;
      term = z_12048.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}