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

@SuppressWarnings("all") final class lifted454 extends Strategy 
{ 
  Strategy m_2124;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2776:
    { 
      lifted455 lifted4550 = new lifted455();
      lifted4550.m_2124 = m_2124;
      term = index_analyze_1_0.instance.invoke(context, term, lifted4550);
      if(term == null)
        break Fail2776;
      if(true)
        return term;
    }
    return null;
  }
}