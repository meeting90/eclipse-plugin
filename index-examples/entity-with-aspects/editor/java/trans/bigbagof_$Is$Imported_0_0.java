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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail5551:
    { 
      TermReference x_12056 = new TermReference();
      TermReference y_12056 = new TermReference();
      if(y_12056.value == null)
        y_12056.value = term;
      else
        if(y_12056.value != term && !y_12056.value.match(term))
          break Fail5551;
      if(x_12056.value == null)
        x_12056.value = term;
      else
        if(x_12056.value != term && !x_12056.value.match(term))
          break Fail5551;
      Success3059:
      { 
        Fail5552:
        { 
          IStrategoTerm c_12057 = null;
          c_12057 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_12057, trans.const1001, y_12056.value);
          if(term == null)
            break Fail5552;
          if(true)
            break Success3059;
        }
        term = trans.constNil3;
      }
      lifted1195 lifted11950 = new lifted1195();
      lifted11950.x_12056 = x_12056;
      lifted11950.y_12056 = y_12056;
      term = filter_1_0.instance.invoke(context, term, lifted11950);
      if(term == null)
        break Fail5551;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}