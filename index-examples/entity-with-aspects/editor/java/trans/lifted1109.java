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

@SuppressWarnings("all") final class lifted1109 extends Strategy 
{ 
  TermReference k_11997;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5651:
    { 
      IStrategoTerm l_11997 = null;
      IStrategoTerm n_11997 = null;
      IStrategoTerm o_11997 = null;
      n_11997 = term;
      l_11997 = trans.constCritical0;
      o_11997 = n_11997;
      term = log_0_3.instance.invoke(context, o_11997, l_11997, trans.const977, k_11997.value);
      if(term == null)
        break Fail5651;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5651;
      if(true)
        return term;
    }
    return null;
  }
}