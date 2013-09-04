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

@SuppressWarnings("all") public class bigbagof_$Index_$Read$Set_0_0 extends Strategy 
{ 
  public static bigbagof_$Index_$Read$Set_0_0 instance = new bigbagof_$Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_Index_ReadSet_0_0");
    Fail5474:
    { 
      TermReference j_12044 = new TermReference();
      if(j_12044.value == null)
        j_12044.value = term;
      else
        if(j_12044.value != term && !j_12044.value.match(term))
          break Fail5474;
      Success3038:
      { 
        Fail5475:
        { 
          IStrategoTerm m_12044 = null;
          IStrategoTerm o_12044 = null;
          IStrategoTerm p_12044 = null;
          o_12044 = term;
          m_12044 = trans.const922;
          p_12044 = o_12044;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_12044, m_12044, trans.constCons250);
          if(term == null)
            break Fail5475;
          if(true)
            break Success3038;
        }
        term = trans.constNil3;
      }
      lifted1169 lifted11690 = new lifted1169();
      lifted11690.j_12044 = j_12044;
      term = filter_1_0.instance.invoke(context, term, lifted11690);
      if(term == null)
        break Fail5474;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}