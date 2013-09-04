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

@SuppressWarnings("all") public class analysis_count_0_0 extends Strategy 
{ 
  public static analysis_count_0_0 instance = new analysis_count_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5260:
    { 
      term = context.invokePrimitive("SSL_EXT_queue_analysis_count", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail5260;
      if(true)
        return term;
    }
    context.push("analysis_count_0_0");
    context.popOnFailure();
    return null;
  }
}