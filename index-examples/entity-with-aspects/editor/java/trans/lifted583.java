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

@SuppressWarnings("all") final class lifted583 extends Strategy 
{ 
  public static final lifted583 instance = new lifted583();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2674:
    { 
      IStrategoTerm t_2188 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2674;
      t_2188 = term.getSubterm(0);
      IStrategoTerm arg844 = term.getSubterm(1);
      term = aux_$Current$File_0_1.instance.invoke(context, t_2188, arg844);
      if(term == null)
        break Fail2674;
      if(true)
        return term;
    }
    return null;
  }
}