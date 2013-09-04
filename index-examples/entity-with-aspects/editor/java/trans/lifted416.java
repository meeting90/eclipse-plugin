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

@SuppressWarnings("all") final class lifted416 extends Strategy 
{ 
  TermReference e_2105;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2804:
    { 
      term = store_index_data_results_0_1.instance.invoke(context, term, e_2105.value);
      if(term == null)
        break Fail2804;
      if(true)
        return term;
    }
    return null;
  }
}