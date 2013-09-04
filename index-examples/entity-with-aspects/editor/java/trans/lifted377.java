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

@SuppressWarnings("all") final class lifted377 extends Strategy 
{ 
  TermReference h_2082;

  TermReference e_2196;

  TermReference d_2196;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2836:
    { 
      IStrategoTerm s_2082 = null;
      s_2082 = term;
      if(h_2082.value == null || e_2196.value == null)
        break Fail2836;
      IStrategoList list57;
      list57 = checkListTail(e_2196.value);
      if(list57 == null)
        break Fail2836;
      term = (IStrategoTerm)termFactory.makeListCons(h_2082.value, list57);
      term = import_defs_0_2.instance.invoke(context, s_2082, d_2196.value, term);
      if(term == null)
        break Fail2836;
      if(true)
        return term;
    }
    return null;
  }
}