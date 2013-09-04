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

@SuppressWarnings("all") public class index_remove_0_1 extends Strategy 
{ 
  public static index_remove_0_1 instance = new index_remove_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_11997)
  { 
    Fail5117:
    { 
      IStrategoTerm r_11997 = null;
      r_11997 = term;
      term = context.invokePrimitive("LANG_index_remove", r_11997, NO_STRATEGIES, new IStrategoTerm[]{term, p_11997});
      if(term == null)
        break Fail5117;
      if(true)
        return term;
    }
    context.push("index_remove_0_1");
    context.popOnFailure();
    return null;
  }
}