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

@SuppressWarnings("all") final class lifted374 extends Strategy 
{ 
  TermReference j_2081;

  TermReference b_2196;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2839:
    { 
      IStrategoTerm a_2082 = null;
      a_2082 = term;
      if(j_2081.value == null)
        break Fail2839;
      term = (IStrategoTerm)termFactory.makeListCons(j_2081.value, (IStrategoList)trans.constNil1);
      term = import_defs_0_2.instance.invoke(context, a_2082, b_2196.value, term);
      if(term == null)
        break Fail2839;
      if(true)
        return term;
    }
    return null;
  }
}