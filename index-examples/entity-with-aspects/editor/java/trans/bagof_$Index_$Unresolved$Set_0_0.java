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

@SuppressWarnings("all") public class bagof_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static bagof_$Index_$Unresolved$Set_0_0 instance = new bagof_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Index_UnresolvedSet_0_0");
    Fail5505:
    { 
      TermReference q_12049 = new TermReference();
      if(q_12049.value == null)
        q_12049.value = term;
      else
        if(q_12049.value != term && !q_12049.value.match(term))
          break Fail5505;
      Success3047:
      { 
        Fail5506:
        { 
          IStrategoTerm t_12049 = null;
          IStrategoTerm v_12049 = null;
          IStrategoTerm w_12049 = null;
          v_12049 = term;
          t_12049 = trans.const935;
          w_12049 = v_12049;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_12049, t_12049, trans.constCons250);
          if(term == null)
            break Fail5506;
          if(true)
            break Success3047;
        }
        term = trans.constNil3;
      }
      lifted1181 lifted11810 = new lifted1181();
      lifted11810.q_12049 = q_12049;
      term = filter_1_0.instance.invoke(context, term, lifted11810);
      if(term == null)
        break Fail5505;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}