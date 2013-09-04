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

@SuppressWarnings("all") final class lifted1134 extends Strategy 
{ 
  Strategy d_12015;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5619:
    { 
      IStrategoTerm b_12015 = null;
      b_12015 = term;
      term = d_12015.invoke(context, term);
      if(term == null)
        break Fail5619;
      IStrategoTerm term2978 = term;
      Success3064:
      { 
        Fail5620:
        { 
          if(term != b_12015 && !b_12015.match(term))
            break Fail5620;
          { 
            if(true)
              break Fail5619;
            if(true)
              break Success3064;
          }
        }
        term = term2978;
      }
      if(true)
        return term;
    }
    return null;
  }
}