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

@SuppressWarnings("all") public class origin_language_0_0 extends Strategy 
{ 
  public static origin_language_0_0 instance = new origin_language_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("origin_language_0_0");
    Fail2338:
    { 
      IStrategoTerm o_2297 = null;
      IStrategoTerm s_2297 = null;
      o_2297 = term;
      term = context.invokePrimitive("SSL_EXT_origin_file", o_2297, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2338;
      s_2297 = term;
      term = context.invokePrimitive("SSL_EXT_languagedescription", s_2297, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2338;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2338;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}