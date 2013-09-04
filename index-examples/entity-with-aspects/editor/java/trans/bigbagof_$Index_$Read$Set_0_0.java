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
    Fail2572:
    { 
      TermReference o_2181 = new TermReference();
      if(o_2181.value == null)
        o_2181.value = term;
      else
        if(o_2181.value != term && !o_2181.value.match(term))
          break Fail2572;
      Success1482:
      { 
        Fail2573:
        { 
          IStrategoTerm r_2181 = null;
          IStrategoTerm t_2181 = null;
          IStrategoTerm u_2181 = null;
          t_2181 = term;
          r_2181 = trans.const402;
          u_2181 = t_2181;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, u_2181, r_2181, trans.constCons118);
          if(term == null)
            break Fail2573;
          if(true)
            break Success1482;
        }
        term = trans.constNil1;
      }
      lifted569 lifted5690 = new lifted569();
      lifted5690.o_2181 = o_2181;
      term = filter_1_0.instance.invoke(context, term, lifted5690);
      if(term == null)
        break Fail2572;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}