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
    Fail5136:
    { 
      IStrategoTerm p_11999 = null;
      IStrategoTerm v_12158 = null;
      v_12158 = term;
      term = context.invokePrimitive("LANG_index_get", term, NO_STRATEGIES, new IStrategoTerm[]{v_12158});
      if(term == null)
        break Fail5136;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5136;
      p_11999 = ((IStrategoList)term).head();
      term = p_11999;
      if(true)
        return term;
    }
    context.push("indexlib_get_0_0");
    context.popOnFailure();
    return null;
  }
}