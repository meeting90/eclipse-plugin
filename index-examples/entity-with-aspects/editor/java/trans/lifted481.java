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

@SuppressWarnings("all") final class lifted481 extends Strategy 
{ 
  TermReference p_2130;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2758:
    { 
      term = index_compare_name_equal_0_1.instance.invoke(context, term, p_2130.value);
      if(term == null)
        break Fail2758;
      if(true)
        return term;
    }
    return null;
  }
}