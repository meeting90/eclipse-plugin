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

@SuppressWarnings("all") public class queue_analysis_0_0 extends Strategy 
{ 
  public static queue_analysis_0_0 instance = new queue_analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("queue_analysis_0_0");
    Fail2356:
    { 
      IStrategoTerm term1427 = term;
      Success1379:
      { 
        Fail2357:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2357;
          term = list_loop_1_0.instance.invoke(context, term, queue_analysis_0_0.instance);
          if(term == null)
            break Fail2357;
          if(true)
            break Success1379;
        }
        term = context.invokePrimitive("SSL_EXT_queue_analysis", term1427, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2356;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}