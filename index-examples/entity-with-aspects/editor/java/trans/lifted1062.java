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

@SuppressWarnings("all") final class lifted1062 extends Strategy 
{ 
  TermReference o_11988;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5671:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5671;
      if(o_11988.value == null)
        o_11988.value = term;
      else
        if(o_11988.value != term && !o_11988.value.match(term))
          break Fail5671;
      if(true)
        return term;
    }
    return null;
  }
}