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

@SuppressWarnings("all") public class origin_column_0_0 extends Strategy 
{ 
  public static origin_column_0_0 instance = new origin_column_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2333:
    { 
      IStrategoTerm r_2150 = null;
      IStrategoTerm k_2297 = null;
      k_2297 = term;
      term = context.invokePrimitive("SSL_EXT_origin_location", k_2297, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2333;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 4)
        break Fail2333;
      r_2150 = term.getSubterm(1);
      term = r_2150;
      if(true)
        return term;
    }
    context.push("origin_column_0_0");
    context.popOnFailure();
    return null;
  }
}