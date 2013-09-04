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

@SuppressWarnings("all") final class lifted1132 extends Strategy 
{ 
  Strategy d_12015;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5617:
    { 
      lifted1133 lifted11330 = new lifted1133();
      lifted11330.d_12015 = d_12015;
      term = repeat_1_0.instance.invoke(context, term, lifted11330);
      if(term == null)
        break Fail5617;
      if(true)
        return term;
    }
    return null;
  }
}