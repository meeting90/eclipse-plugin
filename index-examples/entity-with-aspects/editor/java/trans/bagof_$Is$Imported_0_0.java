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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail2654:
    { 
      TermReference z_2194 = new TermReference();
      TermReference a_2195 = new TermReference();
      if(a_2195.value == null)
        a_2195.value = term;
      else
        if(a_2195.value != term && !a_2195.value.match(term))
          break Fail2654;
      if(z_2194.value == null)
        z_2194.value = term;
      else
        if(z_2194.value != term && !z_2194.value.match(term))
          break Fail2654;
      Success1505:
      { 
        Fail2655:
        { 
          IStrategoTerm e_2195 = null;
          e_2195 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_2195, trans.const481, a_2195.value);
          if(term == null)
            break Fail2655;
          if(true)
            break Success1505;
        }
        term = trans.constNil1;
      }
      lifted598 lifted5980 = new lifted598();
      lifted5980.z_2194 = z_2194;
      lifted5980.a_2195 = a_2195;
      term = filter_1_0.instance.invoke(context, term, lifted5980);
      if(term == null)
        break Fail2654;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}