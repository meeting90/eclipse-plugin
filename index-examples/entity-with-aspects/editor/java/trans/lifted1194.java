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

@SuppressWarnings("all") final class lifted1194 extends Strategy 
{ 
  public static final lifted1194 instance = new lifted1194();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5565:
    { 
      IStrategoTerm o_12056 = null;
      IStrategoTerm w_12056 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5565;
      w_12056 = term.getSubterm(0);
      IStrategoTerm arg1706 = term.getSubterm(1);
      o_12056 = arg1706;
      term = aux_$Is$Imported_0_2.instance.invoke(context, w_12056, arg1706, o_12056);
      if(term == null)
        break Fail5565;
      if(true)
        return term;
    }
    return null;
  }
}