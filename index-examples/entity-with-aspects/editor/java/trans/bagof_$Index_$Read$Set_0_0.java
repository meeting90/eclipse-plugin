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
    Fail2577:
    { 
      TermReference o_2182 = new TermReference();
      if(o_2182.value == null)
        o_2182.value = term;
      else
        if(o_2182.value != term && !o_2182.value.match(term))
          break Fail2577;
      Success1484:
      { 
        Fail2578:
        { 
          IStrategoTerm r_2182 = null;
          IStrategoTerm t_2182 = null;
          IStrategoTerm u_2182 = null;
          t_2182 = term;
          r_2182 = trans.const402;
          u_2182 = t_2182;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_2182, r_2182, trans.constCons118);
          if(term == null)
            break Fail2578;
          if(true)
            break Success1484;
        }
        term = trans.constNil1;
      }
      lifted572 lifted5720 = new lifted572();
      lifted5720.o_2182 = o_2182;
      term = filter_1_0.instance.invoke(context, term, lifted5720);
      if(term == null)
        break Fail2577;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}