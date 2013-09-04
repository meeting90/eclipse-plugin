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

@SuppressWarnings("all") final class lifted1193 extends Strategy 
{ 
  public static final lifted1193 instance = new lifted1193();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5566:
    { 
      IStrategoTerm d_12056 = null;
      IStrategoTerm l_12056 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5566;
      l_12056 = term.getSubterm(0);
      IStrategoTerm arg1705 = term.getSubterm(1);
      d_12056 = arg1705;
      term = aux_$Is$Imported_0_2.instance.invoke(context, l_12056, arg1705, d_12056);
      if(term == null)
        break Fail5566;
      if(true)
        return term;
    }
    return null;
  }
}