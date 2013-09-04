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

@SuppressWarnings("all") final class lifted462 extends Strategy 
{ 
  TermReference t_2125;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2769:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2769;
      if(t_2125.value == null)
        t_2125.value = term;
      else
        if(t_2125.value != term && !t_2125.value.match(term))
          break Fail2769;
      if(true)
        return term;
    }
    return null;
  }
}