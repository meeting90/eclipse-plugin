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

@SuppressWarnings("all") final class lifted1074 extends Strategy 
{ 
  TermReference d_11992;

  TermReference h_11992;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5661:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5661;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5661;
      if(d_11992.value == null)
        d_11992.value = ((IStrategoList)term).head();
      else
        if(d_11992.value != ((IStrategoList)term).head() && !d_11992.value.match(((IStrategoList)term).head()))
          break Fail5661;
      if(h_11992.value == null)
        h_11992.value = ((IStrategoList)term).tail();
      else
        if(h_11992.value != ((IStrategoList)term).tail() && !h_11992.value.match(((IStrategoList)term).tail()))
          break Fail5661;
      if(true)
        return term;
    }
    return null;
  }
}