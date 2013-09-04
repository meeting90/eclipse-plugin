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

@SuppressWarnings("all") final class lifted595 extends Strategy 
{ 
  TermReference c_2194;

  TermReference d_2194;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2662:
    { 
      term = aux_$Is$Imported_0_2.instance.invoke(context, term, c_2194.value, d_2194.value);
      if(term == null)
        break Fail2662;
      if(true)
        return term;
    }
    return null;
  }
}