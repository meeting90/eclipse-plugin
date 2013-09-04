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

@SuppressWarnings("all") public class index_add_all_0_1 extends Strategy 
{ 
  public static index_add_all_0_1 instance = new index_add_all_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_11997)
  { 
    TermReference i_11997 = new TermReference(ref_i_11997);
    context.push("index_add_all_0_1");
    Fail5116:
    { 
      lifted1108 lifted11080 = new lifted1108();
      lifted11080.i_11997 = i_11997;
      term = list_loop_1_0.instance.invoke(context, term, lifted11080);
      if(term == null)
        break Fail5116;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}