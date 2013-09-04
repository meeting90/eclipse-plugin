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
    Fail5240:
    { 
      IStrategoTerm j_12160 = null;
      IStrategoTerm n_12160 = null;
      j_12160 = term;
      term = context.invokePrimitive("SSL_EXT_origin_file", j_12160, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5240;
      n_12160 = term;
      term = context.invokePrimitive("SSL_EXT_languagedescription", n_12160, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5240;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5240;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}