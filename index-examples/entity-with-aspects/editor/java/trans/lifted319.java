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

@SuppressWarnings("all") final class lifted319 extends Strategy 
{ 
  TermReference p_2195;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2892:
    { 
      IStrategoTerm q_2024 = null;
      q_2024 = term;
      term = nam_annotate_use_0_2.instance.invoke(context, q_2024, p_2195.value, trans.constEntity0);
      if(term == null)
        break Fail2892;
      if(true)
        return term;
    }
    return null;
  }
}