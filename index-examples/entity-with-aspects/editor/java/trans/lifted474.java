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

@SuppressWarnings("all") final class lifted474 extends Strategy 
{ 
  TermReference i_2129;

  TermReference m_2129;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2759:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2759;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2759;
      if(i_2129.value == null)
        i_2129.value = ((IStrategoList)term).head();
      else
        if(i_2129.value != ((IStrategoList)term).head() && !i_2129.value.match(((IStrategoList)term).head()))
          break Fail2759;
      if(m_2129.value == null)
        m_2129.value = ((IStrategoList)term).tail();
      else
        if(m_2129.value != ((IStrategoList)term).tail() && !m_2129.value.match(((IStrategoList)term).tail()))
          break Fail2759;
      if(true)
        return term;
    }
    return null;
  }
}