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

@SuppressWarnings("all") public class index_add_0_1 extends Strategy 
{ 
  public static index_add_0_1 instance = new index_add_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_11997)
  { 
    Fail5115:
    { 
      IStrategoTerm f_11997 = null;
      f_11997 = term;
      term = context.invokePrimitive("LANG_index_add", f_11997, NO_STRATEGIES, new IStrategoTerm[]{term, d_11997});
      if(term == null)
        break Fail5115;
      if(true)
        return term;
    }
    context.push("index_add_0_1");
    context.popOnFailure();
    return null;
  }
}