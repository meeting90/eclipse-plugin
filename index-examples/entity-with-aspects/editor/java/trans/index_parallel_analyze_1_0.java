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

@SuppressWarnings("all") public class index_parallel_analyze_1_0 extends Strategy 
{ 
  public static index_parallel_analyze_1_0 instance = new index_parallel_analyze_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_2105)
  { 
    context.push("index_parallel_analyze_1_0");
    Fail2028:
    { 
      lifted417 lifted4170 = new lifted417();
      lifted4170.x_2105 = x_2105;
      term = index_analyze_1_0.instance.invoke(context, term, lifted4170);
      if(term == null)
        break Fail2028;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}