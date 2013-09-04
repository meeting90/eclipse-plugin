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

@SuppressWarnings("all") public class index_setup_0_2 extends Strategy 
{ 
  public static index_setup_0_2 instance = new index_setup_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_2133, IStrategoTerm y_2133)
  { 
    context.push("index_setup_0_2");
    Fail2210:
    { 
      IStrategoTerm a_2134 = null;
      term = obsolete_1_0.instance.invoke(context, term, lifted507.instance);
      if(term == null)
        break Fail2210;
      a_2134 = term;
      term = index_setup_0_3.instance.invoke(context, a_2134, x_2133, y_2133, trans.const369);
      if(term == null)
        break Fail2210;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}