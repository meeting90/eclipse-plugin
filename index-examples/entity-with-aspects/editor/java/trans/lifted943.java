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

@SuppressWarnings("all") final class lifted943 extends Strategy 
{ 
  TermReference x_11902;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5772:
    { 
      if(x_11902.value == null)
        break Fail5772;
      term = dirname_0_0.instance.invoke(context, x_11902.value);
      if(term == null)
        break Fail5772;
      term = abspath_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5772;
      term = mkdir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5772;
      if(true)
        return term;
    }
    return null;
  }
}