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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12049)
  { 
    context.push("reverse_bagof_Index_UnresolvedSet_1_0");
    Fail5503:
    { 
      TermReference i_12049 = new TermReference();
      if(i_12049.value == null)
        i_12049.value = term;
      else
        if(i_12049.value != term && !i_12049.value.match(term))
          break Fail5503;
      Success3046:
      { 
        Fail5504:
        { 
          IStrategoTerm m_12049 = null;
          IStrategoTerm o_12049 = null;
          IStrategoTerm p_12049 = null;
          o_12049 = term;
          m_12049 = trans.const935;
          p_12049 = o_12049;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_12049, m_12049, trans.constCons250);
          if(term == null)
            break Fail5504;
          if(true)
            break Success3046;
        }
        term = trans.constNil3;
      }
      lifted1180 lifted11800 = new lifted1180();
      lifted11800.i_12049 = i_12049;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted11800, k_12049);
      if(term == null)
        break Fail5503;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}