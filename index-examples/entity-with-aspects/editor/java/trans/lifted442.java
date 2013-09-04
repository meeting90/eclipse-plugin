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

@SuppressWarnings("all") final class lifted442 extends Strategy 
{ 
  TermReference p_2115;

  TermReference n_2115;

  TermReference o_2115;

  TermReference q_2115;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2791:
    { 
      lifted443 lifted4430 = new lifted443();
      lifted4430.p_2115 = p_2115;
      term = adjust_index_lookup_1_3.instance.invoke(context, term, lifted4430, n_2115.value, o_2115.value, q_2115.value);
      if(term == null)
        break Fail2791;
      if(true)
        return term;
    }
    return null;
  }
}