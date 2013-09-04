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
    Fail2603:
    { 
      TermReference v_2186 = new TermReference();
      if(v_2186.value == null)
        v_2186.value = term;
      else
        if(v_2186.value != term && !v_2186.value.match(term))
          break Fail2603;
      Success1491:
      { 
        Fail2604:
        { 
          IStrategoTerm y_2186 = null;
          IStrategoTerm a_2187 = null;
          IStrategoTerm b_2187 = null;
          a_2187 = term;
          y_2186 = trans.const415;
          b_2187 = a_2187;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_2187, y_2186, trans.constCons118);
          if(term == null)
            break Fail2604;
          if(true)
            break Success1491;
        }
        term = trans.constNil1;
      }
      lifted581 lifted5810 = new lifted581();
      lifted5810.v_2186 = v_2186;
      term = filter_1_0.instance.invoke(context, term, lifted5810);
      if(term == null)
        break Fail2603;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}