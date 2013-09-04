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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_2134)
  { 
    Fail2213:
    { 
      IStrategoTerm k_2134 = null;
      k_2134 = term;
      term = context.invokePrimitive("LANG_index_add", k_2134, NO_STRATEGIES, new IStrategoTerm[]{term, i_2134});
      if(term == null)
        break Fail2213;
      if(true)
        return term;
    }
    context.push("index_add_0_1");
    context.popOnFailure();
    return null;
  }
}