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

@SuppressWarnings("all") final class lifted1166 extends Strategy 
{ 
  public static final lifted1166 instance = new lifted1166();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5593:
    { 
      IStrategoTerm m_12043 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5593;
      m_12043 = term.getSubterm(0);
      IStrategoTerm arg1689 = term.getSubterm(1);
      term = aux_$Index_$Read$Set_0_1.instance.invoke(context, m_12043, arg1689);
      if(term == null)
        break Fail5593;
      if(true)
        return term;
    }
    return null;
  }
}