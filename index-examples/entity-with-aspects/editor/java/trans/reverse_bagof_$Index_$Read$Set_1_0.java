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

@SuppressWarnings("all") public class reverse_bagof_$Index_$Read$Set_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Index_$Read$Set_1_0 instance = new reverse_bagof_$Index_$Read$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_2182)
  { 
    context.push("reverse_bagof_Index_ReadSet_1_0");
    Fail2575:
    { 
      TermReference g_2182 = new TermReference();
      if(g_2182.value == null)
        g_2182.value = term;
      else
        if(g_2182.value != term && !g_2182.value.match(term))
          break Fail2575;
      Success1483:
      { 
        Fail2576:
        { 
          IStrategoTerm k_2182 = null;
          IStrategoTerm m_2182 = null;
          IStrategoTerm n_2182 = null;
          m_2182 = term;
          k_2182 = trans.const402;
          n_2182 = m_2182;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_2182, k_2182, trans.constCons118);
          if(term == null)
            break Fail2576;
          if(true)
            break Success1483;
        }
        term = trans.constNil1;
      }
      lifted571 lifted5710 = new lifted571();
      lifted5710.g_2182 = g_2182;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted5710, i_2182);
      if(term == null)
        break Fail2575;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}