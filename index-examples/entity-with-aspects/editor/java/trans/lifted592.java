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

@SuppressWarnings("all") final class lifted592 extends Strategy 
{ 
  public static final lifted592 instance = new lifted592();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2665:
    { 
      IStrategoTerm w_2192 = null;
      IStrategoTerm f_2193 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2665;
      f_2193 = term.getSubterm(0);
      IStrategoTerm arg850 = term.getSubterm(1);
      w_2192 = arg850;
      term = aux_$Is$Imported_0_2.instance.invoke(context, f_2193, arg850, w_2192);
      if(term == null)
        break Fail2665;
      if(true)
        return term;
    }
    return null;
  }
}