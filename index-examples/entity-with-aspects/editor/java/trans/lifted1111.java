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

@SuppressWarnings("all") final class lifted1111 extends Strategy 
{ 
  TermReference w_11997;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5648:
    { 
      IStrategoTerm x_11997 = null;
      IStrategoTerm z_11997 = null;
      IStrategoTerm a_11998 = null;
      z_11997 = term;
      x_11997 = trans.constCritical0;
      a_11998 = z_11997;
      term = log_0_3.instance.invoke(context, a_11998, x_11997, trans.const978, w_11997.value);
      if(term == null)
        break Fail5648;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5648;
      if(true)
        return term;
    }
    return null;
  }
}