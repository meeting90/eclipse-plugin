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

@SuppressWarnings("all") final class lifted356 extends Strategy 
{ 
  TermReference p_2050;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2851:
    { 
      if(p_2050.value == null)
        break Fail2851;
      term = mkdir_0_0.instance.invoke(context, p_2050.value);
      if(term == null)
        break Fail2851;
      if(true)
        return term;
    }
    return null;
  }
}