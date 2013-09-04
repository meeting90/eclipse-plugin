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

@SuppressWarnings("all") final class lifted977 extends Strategy 
{ 
  TermReference c_11945;

  TermReference z_12058;

  TermReference y_12058;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5738:
    { 
      IStrategoTerm n_11945 = null;
      n_11945 = term;
      if(c_11945.value == null || z_12058.value == null)
        break Fail5738;
      IStrategoList list133;
      list133 = checkListTail(z_12058.value);
      if(list133 == null)
        break Fail5738;
      term = (IStrategoTerm)termFactory.makeListCons(c_11945.value, list133);
      term = import_defs_0_2.instance.invoke(context, n_11945, y_12058.value, term);
      if(term == null)
        break Fail5738;
      if(true)
        return term;
    }
    return null;
  }
}