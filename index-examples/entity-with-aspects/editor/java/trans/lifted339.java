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

@SuppressWarnings("all") final class lifted339 extends Strategy 
{ 
  public static final lifted339 instance = new lifted339();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2873:
    { 
      IStrategoTerm d_2036 = null;
      IStrategoTerm e_2036 = null;
      IStrategoTerm f_2036 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2873;
      IStrategoTerm arg511 = term.getSubterm(0);
      if(arg511.getTermType() != IStrategoTerm.TUPLE || arg511.getSubtermCount() != 2)
        break Fail2873;
      d_2036 = arg511.getSubterm(0);
      e_2036 = arg511.getSubterm(1);
      f_2036 = term.getSubterm(1);
      term = string_replace_0_2.instance.invoke(context, f_2036, d_2036, e_2036);
      if(term == null)
        break Fail2873;
      if(true)
        return term;
    }
    return null;
  }
}