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

@SuppressWarnings("all") public class position_of_term_1_0 extends Strategy 
{ 
  public static position_of_term_1_0 instance = new position_of_term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12059)
  { 
    context.push("position_of_term_1_0");
    Fail5249:
    { 
      IStrategoTerm term2980 = term;
      Success2932:
      { 
        Fail5250:
        { 
          term = k_12059.invoke(context, term);
          if(term == null)
            break Fail5250;
          term = trans.constNil3;
          if(true)
            break Success2932;
        }
        term = term2980;
        IStrategoTerm a_12016 = null;
        IStrategoTerm args40 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        a_12016 = args40;
        term = position_of_term_1_1.instance.invoke(context, a_12016, k_12059, trans.const1010);
        if(term == null)
          break Fail5249;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}