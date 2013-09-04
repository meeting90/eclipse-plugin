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

@SuppressWarnings("all") final class lifted303 extends Strategy 
{ 
  TermReference p_2195;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2900:
    { 
      IStrategoTerm a_2026 = null;
      a_2026 = term;
      term = nam_annotate_use_0_2.instance.invoke(context, a_2026, p_2195.value, trans.constModule0);
      if(term == null)
        break Fail2900;
      if(true)
        return term;
    }
    return null;
  }
}