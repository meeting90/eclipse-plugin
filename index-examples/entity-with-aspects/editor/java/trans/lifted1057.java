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

@SuppressWarnings("all") final class lifted1057 extends Strategy 
{ 
  Strategy h_11987;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5681:
    { 
      term = index_do_analysis_1_0.instance.invoke(context, term, h_11987);
      if(term == null)
        break Fail5681;
      if(true)
        return term;
    }
    return null;
  }
}