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

@SuppressWarnings("all") public class index_sequential_analyze_1_0 extends Strategy 
{ 
  public static index_sequential_analyze_1_0 instance = new index_sequential_analyze_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_2105)
  { 
    context.push("index_sequential_analyze_1_0");
    Fail2029:
    { 
      lifted420 lifted4200 = new lifted420();
      lifted4200.y_2105 = y_2105;
      term = index_analyze_1_0.instance.invoke(context, term, lifted4200);
      if(term == null)
        break Fail2029;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}