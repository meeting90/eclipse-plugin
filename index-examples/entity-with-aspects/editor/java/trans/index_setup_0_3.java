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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_2134, IStrategoTerm c_2134, IStrategoTerm d_2134)
  { 
    Fail2211:
    { 
      term = context.invokePrimitive("LANG_index_setup", term, NO_STRATEGIES, new IStrategoTerm[]{b_2134, c_2134, d_2134});
      if(term == null)
        break Fail2211;
      if(true)
        return term;
    }
    context.push("index_setup_0_3");
    context.popOnFailure();
    return null;
  }
}