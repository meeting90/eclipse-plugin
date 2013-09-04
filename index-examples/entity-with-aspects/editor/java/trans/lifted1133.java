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

@SuppressWarnings("all") final class lifted1133 extends Strategy 
{ 
  Strategy d_12015;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5618:
    { 
      lifted1134 lifted11340 = new lifted1134();
      lifted11340.d_12015 = d_12015;
      term = preserve_annos_1_0.instance.invoke(context, term, lifted11340);
      if(term == null)
        break Fail5618;
      if(true)
        return term;
    }
    return null;
  }
}