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

@SuppressWarnings("all") final class lifted1184 extends Strategy 
{ 
  public static final lifted1184 instance = new lifted1184();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5575:
    { 
      IStrategoTerm a_12052 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5575;
      a_12052 = term.getSubterm(0);
      IStrategoTerm arg1699 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, a_12052, arg1699);
      if(term == null)
        break Fail5575;
      if(true)
        return term;
    }
    return null;
  }
}