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

@SuppressWarnings("all") final class lifted565 extends Strategy 
{ 
  public static final lifted565 instance = new lifted565();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2692:
    { 
      IStrategoTerm f_2180 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2692;
      f_2180 = term.getSubterm(0);
      IStrategoTerm arg834 = term.getSubterm(1);
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, f_2180, arg834);
      if(term == null)
        break Fail2692;
      if(true)
        return term;
    }
    return null;
  }
}