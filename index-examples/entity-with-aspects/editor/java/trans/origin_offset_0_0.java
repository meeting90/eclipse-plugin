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

@SuppressWarnings("all") public class origin_offset_0_0 extends Strategy 
{ 
  public static origin_offset_0_0 instance = new origin_offset_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5232:
    { 
      IStrategoTerm e_12013 = null;
      e_12013 = term;
      term = context.invokePrimitive("SSL_EXT_origin_offset", e_12013, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5232;
      if(true)
        return term;
    }
    context.push("origin_offset_0_0");
    context.popOnFailure();
    return null;
  }
}