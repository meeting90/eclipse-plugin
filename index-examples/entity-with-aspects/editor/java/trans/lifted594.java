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

@SuppressWarnings("all") final class lifted594 extends Strategy 
{ 
  public static final lifted594 instance = new lifted594();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2663:
    { 
      IStrategoTerm t_2193 = null;
      IStrategoTerm b_2194 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2663;
      b_2194 = term.getSubterm(0);
      IStrategoTerm arg852 = term.getSubterm(1);
      t_2193 = arg852;
      term = aux_$Is$Imported_0_2.instance.invoke(context, b_2194, arg852, t_2193);
      if(term == null)
        break Fail2663;
      if(true)
        return term;
    }
    return null;
  }
}