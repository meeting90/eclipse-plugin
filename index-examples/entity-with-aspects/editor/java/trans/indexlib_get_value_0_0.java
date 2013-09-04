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

@SuppressWarnings("all") public class indexlib_get_value_0_0 extends Strategy 
{ 
  public static indexlib_get_value_0_0 instance = new indexlib_get_value_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("indexlib_get_value_0_0");
    Fail2235:
    { 
      IStrategoTerm w_2136 = null;
      IStrategoTerm d_2296 = null;
      d_2296 = term;
      term = context.invokePrimitive("LANG_index_get", term, NO_STRATEGIES, new IStrategoTerm[]{d_2296});
      if(term == null)
        break Fail2235;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2235;
      w_2136 = ((IStrategoList)term).head();
      term = index_value_0_0.instance.invoke(context, w_2136);
      if(term == null)
        break Fail2235;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}