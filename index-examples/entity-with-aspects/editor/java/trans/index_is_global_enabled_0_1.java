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

@SuppressWarnings("all") public class index_is_global_enabled_0_1 extends Strategy 
{ 
  public static index_is_global_enabled_0_1 instance = new index_is_global_enabled_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_2141)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_is_global_enabled_0_1");
    Fail2256:
    { 
      IStrategoTerm g_2141 = null;
      g_2141 = term;
      term = index_boolean_globals_uri_0_0.instance.invoke(context, f_2141);
      if(term == null)
        break Fail2256;
      term = termFactory.makeAppl(Main._consGlobal_1, new IStrategoTerm[]{term});
      term = indexlib_get_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2256;
      term = g_2141;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}