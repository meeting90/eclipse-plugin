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

@SuppressWarnings("all") final class lifted549 extends Strategy 
{ 
  TermReference w_2156;

  TermReference x_2156;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2708:
    { 
      if(w_2156.value == null)
        break Fail2708;
      term = index_lookup_0_0.instance.invoke(context, w_2156.value);
      if(term == null)
        break Fail2708;
      if(x_2156.value == null)
        x_2156.value = term;
      else
        if(x_2156.value != term && !x_2156.value.match(term))
          break Fail2708;
      if(true)
        return term;
    }
    return null;
  }
}