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

@SuppressWarnings("all") final class lifted1179 extends Strategy 
{ 
  TermReference y_12048;

  TermReference z_12048;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5580:
    { 
      term = aux_$Index_$Unresolved$Set_0_1.instance.invoke(context, term, y_12048.value);
      if(term == null)
        break Fail5580;
      if(z_12048.value == null)
        z_12048.value = term;
      else
        if(z_12048.value != term && !z_12048.value.match(term))
          break Fail5580;
      if(true)
        return term;
    }
    return null;
  }
}