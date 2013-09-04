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

@SuppressWarnings("all") final class lifted1017 extends Strategy 
{ 
  Strategy s_11968;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5703:
    { 
      lifted1018 lifted10180 = new lifted1018();
      lifted10180.s_11968 = s_11968;
      term = parallel_unordered_1_0.instance.invoke(context, term, lifted10180);
      if(term == null)
        break Fail5703;
      if(true)
        return term;
    }
    return null;
  }
}