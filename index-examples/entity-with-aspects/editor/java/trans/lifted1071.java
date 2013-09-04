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

@SuppressWarnings("all") final class lifted1071 extends Strategy 
{ 
  TermReference c_11991;

  TermReference f_11991;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5664:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5664;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5664;
      if(c_11991.value == null)
        c_11991.value = ((IStrategoList)term).head();
      else
        if(c_11991.value != ((IStrategoList)term).head() && !c_11991.value.match(((IStrategoList)term).head()))
          break Fail5664;
      if(f_11991.value == null)
        f_11991.value = ((IStrategoList)term).tail();
      else
        if(f_11991.value != ((IStrategoList)term).tail() && !f_11991.value.match(((IStrategoList)term).tail()))
          break Fail5664;
      if(true)
        return term;
    }
    return null;
  }
}