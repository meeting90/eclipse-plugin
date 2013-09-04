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

@SuppressWarnings("all") public class bagof_$Index_$Read$Set_0_0 extends Strategy 
{ 
  public static bagof_$Index_$Read$Set_0_0 instance = new bagof_$Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Index_ReadSet_0_0");
    Fail5479:
    { 
      TermReference j_12045 = new TermReference();
      if(j_12045.value == null)
        j_12045.value = term;
      else
        if(j_12045.value != term && !j_12045.value.match(term))
          break Fail5479;
      Success3040:
      { 
        Fail5480:
        { 
          IStrategoTerm m_12045 = null;
          IStrategoTerm o_12045 = null;
          IStrategoTerm p_12045 = null;
          o_12045 = term;
          m_12045 = trans.const922;
          p_12045 = o_12045;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_12045, m_12045, trans.constCons250);
          if(term == null)
            break Fail5480;
          if(true)
            break Success3040;
        }
        term = trans.constNil3;
      }
      lifted1172 lifted11720 = new lifted1172();
      lifted11720.j_12045 = j_12045;
      term = filter_1_0.instance.invoke(context, term, lifted11720);
      if(term == null)
        break Fail5479;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}