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

@SuppressWarnings("all") public class $Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static $Index_$Unresolved$Set_0_0 instance = new $Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("Index_UnresolvedSet_0_0");
    Fail5507:
    { 
      TermReference x_12049 = new TermReference();
      IStrategoTerm a_12050 = null;
      IStrategoTerm c_12050 = null;
      IStrategoTerm d_12050 = null;
      if(x_12049.value == null)
        x_12049.value = term;
      else
        if(x_12049.value != term && !x_12049.value.match(term))
          break Fail5507;
      c_12050 = term;
      a_12050 = trans.const935;
      d_12050 = c_12050;
      term = dr_lookup_rule_0_2.instance.invoke(context, d_12050, a_12050, trans.constCons250);
      if(term == null)
        break Fail5507;
      lifted1182 lifted11820 = new lifted1182();
      lifted11820.x_12049 = x_12049;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted11820);
      if(term == null)
        break Fail5507;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}