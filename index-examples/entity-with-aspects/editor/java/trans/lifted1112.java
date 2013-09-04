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

@SuppressWarnings("all") final class lifted1112 extends Strategy 
{ 
  TermReference t_11998;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5645:
    { 
      IStrategoTerm w_11998 = null;
      w_11998 = term;
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5645;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5645;
      if(t_11998.value == null)
        t_11998.value = ((IStrategoList)term).head();
      else
        if(t_11998.value != ((IStrategoList)term).head() && !t_11998.value.match(((IStrategoList)term).head()))
          break Fail5645;
      term = w_11998;
      if(true)
        return term;
    }
    return null;
  }
}