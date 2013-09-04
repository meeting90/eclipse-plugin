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

@SuppressWarnings("all") final class lifted591 extends Strategy 
{ 
  public static final lifted591 instance = new lifted591();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2666:
    { 
      IStrategoTerm k_2192 = null;
      IStrategoTerm t_2192 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2666;
      t_2192 = term.getSubterm(0);
      IStrategoTerm arg849 = term.getSubterm(1);
      k_2192 = arg849;
      term = aux_$Is$Imported_0_2.instance.invoke(context, t_2192, arg849, k_2192);
      if(term == null)
        break Fail2666;
      if(true)
        return term;
    }
    return null;
  }
}