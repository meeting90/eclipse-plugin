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

@SuppressWarnings("all") final class lifted579 extends Strategy 
{ 
  TermReference d_2186;

  TermReference e_2186;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2678:
    { 
      term = aux_$Index_$Unresolved$Set_0_1.instance.invoke(context, term, d_2186.value);
      if(term == null)
        break Fail2678;
      if(e_2186.value == null)
        e_2186.value = term;
      else
        if(e_2186.value != term && !e_2186.value.match(term))
          break Fail2678;
      if(true)
        return term;
    }
    return null;
  }
}