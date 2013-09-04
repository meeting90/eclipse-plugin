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

@SuppressWarnings("all") final class lifted1016 extends Strategy 
{ 
  TermReference z_11967;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5706:
    { 
      term = store_index_data_results_0_1.instance.invoke(context, term, z_11967.value);
      if(term == null)
        break Fail5706;
      if(true)
        return term;
    }
    return null;
  }
}