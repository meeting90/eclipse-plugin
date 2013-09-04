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

@SuppressWarnings("all") final class lifted593 extends Strategy 
{ 
  public static final lifted593 instance = new lifted593();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2664:
    { 
      IStrategoTerm i_2193 = null;
      IStrategoTerm q_2193 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2664;
      q_2193 = term.getSubterm(0);
      IStrategoTerm arg851 = term.getSubterm(1);
      i_2193 = arg851;
      term = aux_$Is$Imported_0_2.instance.invoke(context, q_2193, arg851, i_2193);
      if(term == null)
        break Fail2664;
      if(true)
        return term;
    }
    return null;
  }
}