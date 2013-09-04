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

@SuppressWarnings("all") final class lifted547 extends Strategy 
{ 
  TermReference l_2156;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2709:
    { 
      if(l_2156.value == null)
        l_2156.value = term;
      else
        if(l_2156.value != term && !l_2156.value.match(term))
          break Fail2709;
      if(true)
        return term;
    }
    return null;
  }
}