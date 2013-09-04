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

@SuppressWarnings("all") public class index_uri_0_0 extends Strategy 
{ 
  public static index_uri_0_0 instance = new index_uri_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_uri_0_0");
    Fail2257:
    { 
      IStrategoTerm term1370 = term;
      Success1336:
      { 
        Fail2258:
        { 
          term = index_uri_impl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2258;
          if(true)
            break Success1336;
        }
        term = index_uri_generic_0_0.instance.invoke(context, term1370);
        if(term == null)
          break Fail2257;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}