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

@SuppressWarnings("all") final class lifted1170 extends Strategy 
{ 
  TermReference r_12044;

  TermReference s_12044;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5589:
    { 
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, term, r_12044.value);
      if(term == null)
        break Fail5589;
      if(s_12044.value == null)
        s_12044.value = term;
      else
        if(s_12044.value != term && !s_12044.value.match(term))
          break Fail5589;
      if(true)
        return term;
    }
    return null;
  }
}