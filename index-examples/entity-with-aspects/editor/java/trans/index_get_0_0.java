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

@SuppressWarnings("all") public class index_get_0_0 extends Strategy 
{ 
  public static index_get_0_0 instance = new index_get_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_get_0_0");
    Fail2178:
    { 
      IStrategoTerm z_2127 = null;
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2178;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2178;
      z_2127 = ((IStrategoList)term).head();
      term = z_2127;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}