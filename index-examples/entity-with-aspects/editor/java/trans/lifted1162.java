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

@SuppressWarnings("all") final class lifted1162 extends Strategy 
{ 
  public static final lifted1162 instance = new lifted1162();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5598:
    { 
      term = index_do_analysis_1_0.instance.invoke(context, term, analyze_0_0.instance);
      if(term == null)
        break Fail5598;
      if(true)
        return term;
    }
    return null;
  }
}