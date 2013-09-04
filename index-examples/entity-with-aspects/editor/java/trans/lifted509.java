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

@SuppressWarnings("all") final class lifted509 extends Strategy 
{ 
  TermReference p_2134;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2749:
    { 
      IStrategoTerm q_2134 = null;
      IStrategoTerm s_2134 = null;
      IStrategoTerm t_2134 = null;
      s_2134 = term;
      q_2134 = trans.constCritical0;
      t_2134 = s_2134;
      term = log_0_3.instance.invoke(context, t_2134, q_2134, trans.const457, p_2134.value);
      if(term == null)
        break Fail2749;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2749;
      if(true)
        return term;
    }
    return null;
  }
}