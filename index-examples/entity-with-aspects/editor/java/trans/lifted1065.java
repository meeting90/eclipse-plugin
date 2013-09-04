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

@SuppressWarnings("all") final class lifted1065 extends Strategy 
{ 
  TermReference h_11989;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5668:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5668;
      if(h_11989.value == null)
        h_11989.value = term;
      else
        if(h_11989.value != term && !h_11989.value.match(term))
          break Fail5668;
      if(true)
        return term;
    }
    return null;
  }
}