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

@SuppressWarnings("all") final class lifted471 extends Strategy 
{ 
  TermReference h_2128;

  TermReference k_2128;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2762:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2762;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2762;
      if(h_2128.value == null)
        h_2128.value = ((IStrategoList)term).head();
      else
        if(h_2128.value != ((IStrategoList)term).head() && !h_2128.value.match(((IStrategoList)term).head()))
          break Fail2762;
      if(k_2128.value == null)
        k_2128.value = ((IStrategoList)term).tail();
      else
        if(k_2128.value != ((IStrategoList)term).tail() && !k_2128.value.match(((IStrategoList)term).tail()))
          break Fail2762;
      if(true)
        return term;
    }
    return null;
  }
}