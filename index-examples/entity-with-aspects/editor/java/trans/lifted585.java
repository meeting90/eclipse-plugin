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

@SuppressWarnings("all") final class lifted585 extends Strategy 
{ 
  public static final lifted585 instance = new lifted585();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2672:
    { 
      IStrategoTerm q_2189 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2672;
      q_2189 = term.getSubterm(0);
      IStrategoTerm arg846 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, q_2189, arg846);
      if(term == null)
        break Fail2672;
      if(true)
        return term;
    }
    return null;
  }
}