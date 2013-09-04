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

@SuppressWarnings("all") final class lifted473 extends Strategy 
{ 
  TermReference c_2129;

  TermReference b_2129;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2760:
    { 
      term = index_compare_name_substring_0_2.instance.invoke(context, term, c_2129.value, b_2129.value);
      if(term == null)
        break Fail2760;
      if(true)
        return term;
    }
    return null;
  }
}