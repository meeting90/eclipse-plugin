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

@SuppressWarnings("all") public class index_setup_0_3 extends Strategy 
{ 
  public static index_setup_0_3 instance = new index_setup_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_11996, IStrategoTerm x_11996, IStrategoTerm y_11996)
  { 
    Fail5113:
    { 
      term = context.invokePrimitive("LANG_index_setup", term, NO_STRATEGIES, new IStrategoTerm[]{w_11996, x_11996, y_11996});
      if(term == null)
        break Fail5113;
      if(true)
        return term;
    }
    context.push("index_setup_0_3");
    context.popOnFailure();
    return null;
  }
}