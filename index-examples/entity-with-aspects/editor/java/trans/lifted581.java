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

@SuppressWarnings("all") final class lifted581 extends Strategy 
{ 
  TermReference v_2186;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2676:
    { 
      term = aux_$Index_$Unresolved$Set_0_1.instance.invoke(context, term, v_2186.value);
      if(term == null)
        break Fail2676;
      if(true)
        return term;
    }
    return null;
  }
}