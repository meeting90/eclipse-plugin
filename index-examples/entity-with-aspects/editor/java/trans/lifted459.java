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

@SuppressWarnings("all") final class lifted459 extends Strategy 
{ 
  Strategy n_2124;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2774:
    { 
      lifted460 lifted4600 = new lifted460();
      lifted4600.n_2124 = n_2124;
      term = SRTS_all.instance.invoke(context, term, lifted4600);
      if(term == null)
        break Fail2774;
      if(true)
        return term;
    }
    return null;
  }
}