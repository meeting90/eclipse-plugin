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

@SuppressWarnings("all") final class lifted1019 extends Strategy 
{ 
  Strategy s_11968;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5705:
    { 
      term = index_do_analysis_1_0.instance.invoke(context, term, s_11968);
      if(term == null)
        break Fail5705;
      if(true)
        return term;
    }
    return null;
  }
}