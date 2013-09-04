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

@SuppressWarnings("all") final class lifted411 extends Strategy 
{ 
  TermReference x_2103;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2807:
    { 
      IStrategoTerm y_2103 = null;
      IStrategoTerm z_2103 = null;
      IStrategoTerm a_2104 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2807;
      y_2103 = term.getSubterm(0);
      term = y_2103;
      a_2104 = y_2103;
      z_2103 = term;
      term = a_2104;
      if(x_2103.value == null)
        break Fail2807;
      term = termFactory.makeTuple(z_2103, x_2103.value);
      term = lookup_p__0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2807;
      if(true)
        return term;
    }
    return null;
  }
}