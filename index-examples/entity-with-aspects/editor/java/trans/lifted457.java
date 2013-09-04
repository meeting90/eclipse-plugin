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

@SuppressWarnings("all") final class lifted457 extends Strategy 
{ 
  Strategy m_2124;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2779:
    { 
      term = index_do_analysis_1_0.instance.invoke(context, term, m_2124);
      if(term == null)
        break Fail2779;
      if(true)
        return term;
    }
    return null;
  }
}