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

@SuppressWarnings("all") final class lifted1192 extends Strategy 
{ 
  public static final lifted1192 instance = new lifted1192();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5567:
    { 
      IStrategoTerm r_12055 = null;
      IStrategoTerm a_12056 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5567;
      a_12056 = term.getSubterm(0);
      IStrategoTerm arg1704 = term.getSubterm(1);
      r_12055 = arg1704;
      term = aux_$Is$Imported_0_2.instance.invoke(context, a_12056, arg1704, r_12055);
      if(term == null)
        break Fail5567;
      if(true)
        return term;
    }
    return null;
  }
}