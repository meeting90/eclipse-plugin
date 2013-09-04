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

@SuppressWarnings("all") final class lifted373 extends Strategy 
{ 
  TermReference j_2081;

  TermReference b_2196;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2840:
    { 
      IStrategoTerm v_2081 = null;
      v_2081 = term;
      if(j_2081.value == null)
        break Fail2840;
      term = (IStrategoTerm)termFactory.makeListCons(j_2081.value, (IStrategoList)trans.constNil1);
      term = import_defs_0_2.instance.invoke(context, v_2081, b_2196.value, term);
      if(term == null)
        break Fail2840;
      if(true)
        return term;
    }
    return null;
  }
}