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

@SuppressWarnings("all") final class lifted455 extends Strategy 
{ 
  Strategy m_2124;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2777:
    { 
      lifted456 lifted4560 = new lifted456();
      lifted4560.m_2124 = m_2124;
      term = parallel_unordered_1_0.instance.invoke(context, term, lifted4560);
      if(term == null)
        break Fail2777;
      if(true)
        return term;
    }
    return null;
  }
}