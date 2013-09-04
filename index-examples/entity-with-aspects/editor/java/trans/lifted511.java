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

@SuppressWarnings("all") final class lifted511 extends Strategy 
{ 
  TermReference b_2135;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2746:
    { 
      IStrategoTerm c_2135 = null;
      IStrategoTerm e_2135 = null;
      IStrategoTerm f_2135 = null;
      e_2135 = term;
      c_2135 = trans.constCritical0;
      f_2135 = e_2135;
      term = log_0_3.instance.invoke(context, f_2135, c_2135, trans.const458, b_2135.value);
      if(term == null)
        break Fail2746;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2746;
      if(true)
        return term;
    }
    return null;
  }
}