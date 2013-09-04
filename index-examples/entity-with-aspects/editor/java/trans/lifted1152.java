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

@SuppressWarnings("all") final class lifted1152 extends Strategy 
{ 
  TermReference x_12021;

  TermReference y_12021;

  TermReference z_12021;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5606:
    { 
      Success3063:
      { 
        Fail5607:
        { 
          if(x_12021.value == null)
            break Fail5607;
          term = index_lookup_all_0_1.instance.invoke(context, x_12021.value, y_12021.value);
          if(term == null)
            break Fail5607;
          if(true)
            break Success3063;
        }
        term = trans.constNil3;
      }
      if(z_12021.value == null)
        z_12021.value = term;
      else
        if(z_12021.value != term && !z_12021.value.match(term))
          break Fail5606;
      if(true)
        return term;
    }
    return null;
  }
}