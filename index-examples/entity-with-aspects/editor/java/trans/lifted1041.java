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

@SuppressWarnings("all") final class lifted1041 extends Strategy 
{ 
  public static final lifted1041 instance = new lifted1041();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5695:
    { 
      IStrategoTerm n_11978 = null;
      n_11978 = term;
      term = context.invokePrimitive("SSL_EXT_get_parent", n_11978, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail5695;
      if(true)
        return term;
    }
    return null;
  }
}