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

@SuppressWarnings("all") final class lifted1195 extends Strategy 
{ 
  TermReference x_12056;

  TermReference y_12056;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5564:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, x_12056.value, y_12056.value);
      if(term == null)
        break Fail5564;
      if(true)
        return term;
    }
    return null;
  }
}