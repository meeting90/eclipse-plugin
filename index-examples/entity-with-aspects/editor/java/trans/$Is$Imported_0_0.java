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
    Fail5558:
    { 
      TermReference a_12058 = new TermReference();
      TermReference b_12058 = new TermReference();
      IStrategoTerm f_12058 = null;
      if(b_12058.value == null)
        b_12058.value = term;
      else
        if(b_12058.value != term && !b_12058.value.match(term))
          break Fail5558;
      if(a_12058.value == null)
        a_12058.value = term;
      else
        if(a_12058.value != term && !a_12058.value.match(term))
          break Fail5558;
      f_12058 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, f_12058, trans.const1001, b_12058.value);
      if(term == null)
        break Fail5558;
      lifted1199 lifted11990 = new lifted1199();
      lifted11990.a_12058 = a_12058;
      lifted11990.b_12058 = b_12058;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted11990);
      if(term == null)
        break Fail5558;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}