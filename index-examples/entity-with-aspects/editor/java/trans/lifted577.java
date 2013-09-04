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

@SuppressWarnings("all") final class lifted577 extends Strategy 
{ 
  public static final lifted577 instance = new lifted577();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2680:
    { 
      IStrategoTerm u_2185 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2680;
      u_2185 = term.getSubterm(0);
      IStrategoTerm arg842 = term.getSubterm(1);
      term = aux_$Index_$Unresolved$Set_0_1.instance.invoke(context, u_2185, arg842);
      if(term == null)
        break Fail2680;
      if(true)
        return term;
    }
    return null;
  }
}