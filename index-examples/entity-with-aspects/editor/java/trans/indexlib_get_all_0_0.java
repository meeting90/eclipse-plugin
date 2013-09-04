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

@SuppressWarnings("all") public class indexlib_get_all_0_0 extends Strategy 
{ 
  public static indexlib_get_all_0_0 instance = new indexlib_get_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5134:
    { 
      IStrategoTerm k_11999 = null;
      k_11999 = term;
      term = context.invokePrimitive("LANG_index_get", term, NO_STRATEGIES, new IStrategoTerm[]{k_11999});
      if(term == null)
        break Fail5134;
      if(true)
        return term;
    }
    context.push("indexlib_get_all_0_0");
    context.popOnFailure();
    return null;
  }
}