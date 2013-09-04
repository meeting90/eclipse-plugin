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
    Fail2598:
    { 
      TermReference v_2185 = new TermReference();
      if(v_2185.value == null)
        v_2185.value = term;
      else
        if(v_2185.value != term && !v_2185.value.match(term))
          break Fail2598;
      Success1489:
      { 
        Fail2599:
        { 
          IStrategoTerm y_2185 = null;
          IStrategoTerm a_2186 = null;
          IStrategoTerm b_2186 = null;
          a_2186 = term;
          y_2185 = trans.const415;
          b_2186 = a_2186;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_2186, y_2185, trans.constCons118);
          if(term == null)
            break Fail2599;
          if(true)
            break Success1489;
        }
        term = trans.constNil1;
      }
      lifted578 lifted5780 = new lifted578();
      lifted5780.v_2185 = v_2185;
      term = filter_1_0.instance.invoke(context, term, lifted5780);
      if(term == null)
        break Fail2598;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}