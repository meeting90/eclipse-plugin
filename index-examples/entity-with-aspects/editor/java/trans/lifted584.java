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

@SuppressWarnings("all") final class lifted584 extends Strategy 
{ 
  public static final lifted584 instance = new lifted584();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2673:
    { 
      IStrategoTerm f_2189 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2673;
      f_2189 = term.getSubterm(0);
      IStrategoTerm arg845 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, f_2189, arg845);
      if(term == null)
        break Fail2673;
      if(true)
        return term;
    }
    return null;
  }
}