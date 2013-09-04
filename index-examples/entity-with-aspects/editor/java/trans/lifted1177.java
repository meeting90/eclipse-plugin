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

@SuppressWarnings("all") final class lifted1177 extends Strategy 
{ 
  public static final lifted1177 instance = new lifted1177();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5582:
    { 
      IStrategoTerm p_12048 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5582;
      p_12048 = term.getSubterm(0);
      IStrategoTerm arg1696 = term.getSubterm(1);
      term = aux_$Index_$Unresolved$Set_0_1.instance.invoke(context, p_12048, arg1696);
      if(term == null)
        break Fail5582;
      if(true)
        return term;
    }
    return null;
  }
}