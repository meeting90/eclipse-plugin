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

@SuppressWarnings("all") final class lifted379 extends Strategy 
{ 
  TermReference a_2084;

  TermReference v_2083;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2835:
    { 
      term = index_compare_nametype_equal_0_2.instance.invoke(context, term, a_2084.value, v_2083.value);
      if(term == null)
        break Fail2835;
      if(true)
        return term;
    }
    return null;
  }
}