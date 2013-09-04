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

@SuppressWarnings("all") final class lifted567 extends Strategy 
{ 
  public static final lifted567 instance = new lifted567();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2690:
    { 
      IStrategoTerm c_2181 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2690;
      c_2181 = term.getSubterm(0);
      IStrategoTerm arg836 = term.getSubterm(1);
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, c_2181, arg836);
      if(term == null)
        break Fail2690;
      if(true)
        return term;
    }
    return null;
  }
}