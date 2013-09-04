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

@SuppressWarnings("all") public class $Is$Imported_0_0 extends Strategy 
{ 
  public static $Is$Imported_0_0 instance = new $Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImported_0_0");
    Fail2656:
    { 
      TermReference f_2195 = new TermReference();
      TermReference g_2195 = new TermReference();
      IStrategoTerm k_2195 = null;
      if(g_2195.value == null)
        g_2195.value = term;
      else
        if(g_2195.value != term && !g_2195.value.match(term))
          break Fail2656;
      if(f_2195.value == null)
        f_2195.value = term;
      else
        if(f_2195.value != term && !f_2195.value.match(term))
          break Fail2656;
      k_2195 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, k_2195, trans.const481, g_2195.value);
      if(term == null)
        break Fail2656;
      lifted599 lifted5990 = new lifted599();
      lifted5990.f_2195 = f_2195;
      lifted5990.g_2195 = g_2195;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted5990);
      if(term == null)
        break Fail2656;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}