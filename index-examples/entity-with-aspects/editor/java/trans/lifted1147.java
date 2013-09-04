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

@SuppressWarnings("all") final class lifted1147 extends Strategy 
{ 
  TermReference g_12019;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5611:
    { 
      if(g_12019.value == null)
        g_12019.value = term;
      else
        if(g_12019.value != term && !g_12019.value.match(term))
          break Fail5611;
      if(true)
        return term;
    }
    return null;
  }
}