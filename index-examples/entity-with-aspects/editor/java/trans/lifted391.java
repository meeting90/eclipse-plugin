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

@SuppressWarnings("all") final class lifted391 extends Strategy 
{ 
  TermReference l_2087;

  TermReference m_2087;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2828:
    { 
      term = index_compilation_ast_0_2.instance.invoke(context, term, l_2087.value, m_2087.value);
      if(term == null)
        break Fail2828;
      if(true)
        return term;
    }
    return null;
  }
}