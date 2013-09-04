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

@SuppressWarnings("all") final class lifted1059 extends Strategy 
{ 
  Strategy i_11987;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5676:
    { 
      lifted1060 lifted10600 = new lifted1060();
      lifted10600.i_11987 = i_11987;
      term = SRTS_all.instance.invoke(context, term, lifted10600);
      if(term == null)
        break Fail5676;
      if(true)
        return term;
    }
    return null;
  }
}