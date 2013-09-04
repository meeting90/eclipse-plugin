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

@SuppressWarnings("all") final class lifted1199 extends Strategy 
{ 
  TermReference a_12058;

  TermReference b_12058;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5560:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, a_12058.value, b_12058.value);
      if(term == null)
        break Fail5560;
      if(true)
        return term;
    }
    return null;
  }
}