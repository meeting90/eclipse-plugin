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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12045)
  { 
    context.push("reverse_bagof_Index_ReadSet_1_0");
    Fail5477:
    { 
      TermReference b_12045 = new TermReference();
      if(b_12045.value == null)
        b_12045.value = term;
      else
        if(b_12045.value != term && !b_12045.value.match(term))
          break Fail5477;
      Success3039:
      { 
        Fail5478:
        { 
          IStrategoTerm f_12045 = null;
          IStrategoTerm h_12045 = null;
          IStrategoTerm i_12045 = null;
          h_12045 = term;
          f_12045 = trans.const922;
          i_12045 = h_12045;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_12045, f_12045, trans.constCons250);
          if(term == null)
            break Fail5478;
          if(true)
            break Success3039;
        }
        term = trans.constNil3;
      }
      lifted1171 lifted11710 = new lifted1171();
      lifted11710.b_12045 = b_12045;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted11710, d_12045);
      if(term == null)
        break Fail5477;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}