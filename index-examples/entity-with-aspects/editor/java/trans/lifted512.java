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

@SuppressWarnings("all") final class lifted512 extends Strategy 
{ 
  TermReference y_2135;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2743:
    { 
      IStrategoTerm b_2136 = null;
      b_2136 = term;
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2743;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2743;
      if(y_2135.value == null)
        y_2135.value = ((IStrategoList)term).head();
      else
        if(y_2135.value != ((IStrategoList)term).head() && !y_2135.value.match(((IStrategoList)term).head()))
          break Fail2743;
      term = b_2136;
      if(true)
        return term;
    }
    return null;
  }
}