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

@SuppressWarnings("all") final class lifted1168 extends Strategy 
{ 
  public static final lifted1168 instance = new lifted1168();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5591:
    { 
      IStrategoTerm i_12044 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5591;
      i_12044 = term.getSubterm(0);
      IStrategoTerm arg1691 = term.getSubterm(1);
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, i_12044, arg1691);
      if(term == null)
        break Fail5591;
      if(true)
        return term;
    }
    return null;
  }
}