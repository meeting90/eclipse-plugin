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

@SuppressWarnings("all") final class lifted441 extends Strategy 
{ 
  public static final lifted441 instance = new lifted441();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2793:
    { 
      IStrategoTerm s_2115 = null;
      s_2115 = term;
      term = context.invokePrimitive("SSL_EXT_get_parent", s_2115, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2793;
      if(true)
        return term;
    }
    return null;
  }
}