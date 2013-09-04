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

@SuppressWarnings("all") final class lifted1008 extends Strategy 
{ 
  TermReference a_12059;

  TermReference q_11963;

  TermReference p_11963;

  TermReference l_11963;

  TermReference m_11963;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5713:
    { 
      term = construct_index_path_0_5.instance.invoke(context, term, a_12059.value, q_11963.value, p_11963.value, l_11963.value, m_11963.value);
      if(term == null)
        break Fail5713;
      if(true)
        return term;
    }
    return null;
  }
}