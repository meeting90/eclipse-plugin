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

@SuppressWarnings("all") final class lifted534 extends Strategy 
{ 
  Strategy i_2152;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2717:
    { 
      IStrategoTerm g_2152 = null;
      g_2152 = term;
      term = i_2152.invoke(context, term);
      if(term == null)
        break Fail2717;
      IStrategoTerm term1422 = term;
      Success1508:
      { 
        Fail2718:
        { 
          if(term != g_2152 && !g_2152.match(term))
            break Fail2718;
          { 
            if(true)
              break Fail2717;
            if(true)
              break Success1508;
          }
        }
        term = term1422;
      }
      if(true)
        return term;
    }
    return null;
  }
}