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

@SuppressWarnings("all") final class lifted401 extends Strategy 
{ 
  TermReference o_2094;

  TermReference j_2094;

  TermReference k_2094;

  TermReference n_2094;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2820:
    { 
      if(o_2094.value == null)
        break Fail2820;
      term = analyze_store_diff_0_2.instance.invoke(context, o_2094.value, j_2094.value, k_2094.value);
      if(term == null)
        break Fail2820;
      if(n_2094.value == null)
        n_2094.value = term;
      else
        if(n_2094.value != term && !n_2094.value.match(term))
          break Fail2820;
      if(true)
        return term;
    }
    return null;
  }
}