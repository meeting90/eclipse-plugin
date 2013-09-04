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

@SuppressWarnings("all") public class index_uri_parent_0_0 extends Strategy 
{ 
  public static index_uri_parent_0_0 instance = new index_uri_parent_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2259:
    { 
      IStrategoTerm l_2141 = null;
      IStrategoTerm m_2141 = null;
      IStrategoTerm n_2141 = null;
      IStrategoTerm o_2141 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2259;
      l_2141 = ((IStrategoList)term).head();
      IStrategoTerm arg768 = ((IStrategoList)term).tail();
      if(arg768.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg768).isEmpty())
        break Fail2259;
      m_2141 = ((IStrategoList)arg768).tail();
      term = m_2141;
      o_2141 = m_2141;
      n_2141 = term;
      term = o_2141;
      IStrategoList list73;
      list73 = checkListTail(n_2141);
      if(list73 == null)
        break Fail2259;
      term = (IStrategoTerm)termFactory.makeListCons(l_2141, list73);
      if(true)
        return term;
    }
    context.push("index_uri_parent_0_0");
    context.popOnFailure();
    return null;
  }
}