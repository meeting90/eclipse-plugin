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

@SuppressWarnings("all") final class lifted1001 extends Strategy 
{ 
  TermReference j_11957;

  TermReference e_11957;

  TermReference f_11957;

  TermReference i_11957;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5722:
    { 
      if(j_11957.value == null)
        break Fail5722;
      term = analyze_store_diff_0_2.instance.invoke(context, j_11957.value, e_11957.value, f_11957.value);
      if(term == null)
        break Fail5722;
      if(i_11957.value == null)
        i_11957.value = term;
      else
        if(i_11957.value != term && !i_11957.value.match(term))
          break Fail5722;
      if(true)
        return term;
    }
    return null;
  }
}