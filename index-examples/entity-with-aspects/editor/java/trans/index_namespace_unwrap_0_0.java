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

@SuppressWarnings("all") public class index_namespace_unwrap_0_0 extends Strategy 
{ 
  public static index_namespace_unwrap_0_0 instance = new index_namespace_unwrap_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2282:
    { 
      IStrategoTerm term1383 = term;
      Success1349:
      { 
        Fail2283:
        { 
          IStrategoTerm w_2143 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
            break Fail2283;
          w_2143 = term.getSubterm(0);
          term = w_2143;
          if(true)
            break Success1349;
        }
        term = term1383;
      }
      if(true)
        return term;
    }
    context.push("index_namespace_unwrap_0_0");
    context.popOnFailure();
    return null;
  }
}