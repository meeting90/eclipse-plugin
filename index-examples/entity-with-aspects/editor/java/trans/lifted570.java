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

@SuppressWarnings("all") final class lifted570 extends Strategy 
{ 
  TermReference w_2181;

  TermReference x_2181;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2687:
    { 
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, term, w_2181.value);
      if(term == null)
        break Fail2687;
      if(x_2181.value == null)
        x_2181.value = term;
      else
        if(x_2181.value != term && !x_2181.value.match(term))
          break Fail2687;
      if(true)
        return term;
    }
    return null;
  }
}