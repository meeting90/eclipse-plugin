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

@SuppressWarnings("all") final class lifted1188 extends Strategy 
{ 
  TermReference f_12053;

  TermReference g_12053;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5571:
    { 
      term = aux_$Current$File_0_1.instance.invoke(context, term, f_12053.value);
      if(term == null)
        break Fail5571;
      if(g_12053.value == null)
        g_12053.value = term;
      else
        if(g_12053.value != term && !g_12053.value.match(term))
          break Fail5571;
      if(true)
        return term;
    }
    return null;
  }
}