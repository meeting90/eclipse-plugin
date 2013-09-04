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

@SuppressWarnings("all") public class reverse_bagof_$Index_$Unresolved$Set_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Index_$Unresolved$Set_1_0 instance = new reverse_bagof_$Index_$Unresolved$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_2186)
  { 
    context.push("reverse_bagof_Index_UnresolvedSet_1_0");
    Fail2601:
    { 
      TermReference n_2186 = new TermReference();
      if(n_2186.value == null)
        n_2186.value = term;
      else
        if(n_2186.value != term && !n_2186.value.match(term))
          break Fail2601;
      Success1490:
      { 
        Fail2602:
        { 
          IStrategoTerm r_2186 = null;
          IStrategoTerm t_2186 = null;
          IStrategoTerm u_2186 = null;
          t_2186 = term;
          r_2186 = trans.const415;
          u_2186 = t_2186;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_2186, r_2186, trans.constCons118);
          if(term == null)
            break Fail2602;
          if(true)
            break Success1490;
        }
        term = trans.constNil1;
      }
      lifted580 lifted5800 = new lifted580();
      lifted5800.n_2186 = n_2186;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted5800, p_2186);
      if(term == null)
        break Fail2601;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}