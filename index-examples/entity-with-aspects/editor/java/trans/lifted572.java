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

@SuppressWarnings("all") final class lifted572 extends Strategy 
{ 
  TermReference o_2182;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2685:
    { 
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, term, o_2182.value);
      if(term == null)
        break Fail2685;
      if(true)
        return term;
    }
    return null;
  }
}