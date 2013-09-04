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

@SuppressWarnings("all") public class indexlib_get_all_values_0_0 extends Strategy 
{ 
  public static indexlib_get_all_values_0_0 instance = new indexlib_get_all_values_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("indexlib_get_all_values_0_0");
    Fail2233:
    { 
      IStrategoTerm x_2295 = null;
      x_2295 = term;
      term = context.invokePrimitive("LANG_index_get", term, NO_STRATEGIES, new IStrategoTerm[]{x_2295});
      if(term == null)
        break Fail2233;
      term = map_1_0.instance.invoke(context, term, index_value_0_0.instance);
      if(term == null)
        break Fail2233;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}