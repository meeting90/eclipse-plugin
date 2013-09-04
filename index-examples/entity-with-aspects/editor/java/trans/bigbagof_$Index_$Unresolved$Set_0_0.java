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

@SuppressWarnings("all") public class bigbagof_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static bigbagof_$Index_$Unresolved$Set_0_0 instance = new bigbagof_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Index_UnresolvedSet_0_0");
    Fail5500:
    { 
      TermReference q_12048 = new TermReference();
      if(q_12048.value == null)
        q_12048.value = term;
      else
        if(q_12048.value != term && !q_12048.value.match(term))
          break Fail5500;
      Success3045:
      { 
        Fail5501:
        { 
          IStrategoTerm t_12048 = null;
          IStrategoTerm v_12048 = null;
          IStrategoTerm w_12048 = null;
          v_12048 = term;
          t_12048 = trans.const935;
          w_12048 = v_12048;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_12048, t_12048, trans.constCons250);
          if(term == null)
            break Fail5501;
          if(true)
            break Success3045;
        }
        term = trans.constNil3;
      }
      lifted1178 lifted11780 = new lifted1178();
      lifted11780.q_12048 = q_12048;
      term = filter_1_0.instance.invoke(context, term, lifted11780);
      if(term == null)
        break Fail5500;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}