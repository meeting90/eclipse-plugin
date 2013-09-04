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

@SuppressWarnings("all") public class indexlib_get_0_0 extends Strategy 
{ 
  public static indexlib_get_0_0 instance = new indexlib_get_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2234:
    { 
      IStrategoTerm u_2136 = null;
      IStrategoTerm a_2296 = null;
      a_2296 = term;
      term = context.invokePrimitive("LANG_index_get", term, NO_STRATEGIES, new IStrategoTerm[]{a_2296});
      if(term == null)
        break Fail2234;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2234;
      u_2136 = ((IStrategoList)term).head();
      term = u_2136;
      if(true)
        return term;
    }
    context.push("indexlib_get_0_0");
    context.popOnFailure();
    return null;
  }
}