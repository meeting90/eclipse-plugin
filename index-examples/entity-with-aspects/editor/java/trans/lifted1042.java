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

@SuppressWarnings("all") final class lifted1042 extends Strategy 
{ 
  TermReference k_11978;

  TermReference i_11978;

  TermReference j_11978;

  TermReference l_11978;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5693:
    { 
      lifted1043 lifted10430 = new lifted1043();
      lifted10430.k_11978 = k_11978;
      term = adjust_index_lookup_1_3.instance.invoke(context, term, lifted10430, i_11978.value, j_11978.value, l_11978.value);
      if(term == null)
        break Fail5693;
      if(true)
        return term;
    }
    return null;
  }
}