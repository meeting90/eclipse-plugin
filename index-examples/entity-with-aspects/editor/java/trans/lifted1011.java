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

@SuppressWarnings("all") final class lifted1011 extends Strategy 
{ 
  TermReference s_11966;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5709:
    { 
      IStrategoTerm t_11966 = null;
      IStrategoTerm u_11966 = null;
      IStrategoTerm v_11966 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5709;
      t_11966 = term.getSubterm(0);
      term = t_11966;
      v_11966 = t_11966;
      u_11966 = term;
      term = v_11966;
      if(s_11966.value == null)
        break Fail5709;
      term = termFactory.makeTuple(u_11966, s_11966.value);
      term = lookup_p__0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5709;
      if(true)
        return term;
    }
    return null;
  }
}