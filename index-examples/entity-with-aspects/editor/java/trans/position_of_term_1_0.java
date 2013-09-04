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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_2196)
  { 
    context.push("position_of_term_1_0");
    Fail2347:
    { 
      IStrategoTerm term1424 = term;
      Success1376:
      { 
        Fail2348:
        { 
          term = p_2196.invoke(context, term);
          if(term == null)
            break Fail2348;
          term = trans.constNil1;
          if(true)
            break Success1376;
        }
        term = term1424;
        IStrategoTerm f_2153 = null;
        IStrategoTerm args18 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        f_2153 = args18;
        term = position_of_term_1_1.instance.invoke(context, f_2153, p_2196, trans.const490);
        if(term == null)
          break Fail2347;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}