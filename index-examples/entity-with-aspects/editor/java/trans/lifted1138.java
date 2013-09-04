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

@SuppressWarnings("all") final class lifted1138 extends Strategy 
{ 
  TermReference q_12016;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5613:
    { 
      if(q_12016.value == null)
        q_12016.value = term;
      else
        if(q_12016.value != term && !q_12016.value.match(term))
          break Fail5613;
      if(true)
        return term;
    }
    return null;
  }
}