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

@SuppressWarnings("all") final class lifted370 extends Strategy 
{ 
  TermReference a_2076;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2843:
    { 
      if(a_2076.value == null)
        a_2076.value = term;
      else
        if(a_2076.value != term && !a_2076.value.match(term))
          break Fail2843;
      if(true)
        return term;
    }
    return null;
  }
}