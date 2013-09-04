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

@SuppressWarnings("all") final class lifted343 extends Strategy 
{ 
  TermReference c_2040;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2870:
    { 
      if(c_2040.value == null)
        break Fail2870;
      term = dirname_0_0.instance.invoke(context, c_2040.value);
      if(term == null)
        break Fail2870;
      term = abspath_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2870;
      term = mkdir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2870;
      if(true)
        return term;
    }
    return null;
  }
}