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

@SuppressWarnings("all") final class lifted1165 extends Strategy 
{ 
  public static final lifted1165 instance = new lifted1165();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5594:
    { 
      IStrategoTerm a_12043 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5594;
      a_12043 = term.getSubterm(0);
      IStrategoTerm arg1688 = term.getSubterm(1);
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, a_12043, arg1688);
      if(term == null)
        break Fail5594;
      if(true)
        return term;
    }
    return null;
  }
}