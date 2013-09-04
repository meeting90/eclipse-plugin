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

@SuppressWarnings("all") final class lifted1149 extends Strategy 
{ 
  TermReference r_12019;

  TermReference s_12019;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5610:
    { 
      if(r_12019.value == null)
        break Fail5610;
      term = index_lookup_0_0.instance.invoke(context, r_12019.value);
      if(term == null)
        break Fail5610;
      if(s_12019.value == null)
        s_12019.value = term;
      else
        if(s_12019.value != term && !s_12019.value.match(term))
          break Fail5610;
      if(true)
        return term;
    }
    return null;
  }
}