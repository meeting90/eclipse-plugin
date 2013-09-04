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

@SuppressWarnings("all") final class lifted588 extends Strategy 
{ 
  TermReference k_2190;

  TermReference l_2190;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2669:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, k_2190.value);
      if(term == null)
        break Fail2669;
      if(l_2190.value == null)
        l_2190.value = term;
      else
        if(l_2190.value != term && !l_2190.value.match(term))
          break Fail2669;
      if(true)
        return term;
    }
    return null;
  }
}