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

@SuppressWarnings("all") final class lifted903 extends Strategy 
{ 
  TermReference k_12058;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5802:
    { 
      IStrategoTerm v_11888 = null;
      v_11888 = term;
      term = nam_annotate_use_0_2.instance.invoke(context, v_11888, k_12058.value, trans.constModule0);
      if(term == null)
        break Fail5802;
      if(true)
        return term;
    }
    return null;
  }
}