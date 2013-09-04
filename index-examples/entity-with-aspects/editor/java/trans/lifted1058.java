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

@SuppressWarnings("all") final class lifted1058 extends Strategy 
{ 
  Strategy i_11987;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5675:
    { 
      lifted1059 lifted10590 = new lifted1059();
      lifted10590.i_11987 = i_11987;
      term = index_analyze_1_0.instance.invoke(context, term, lifted10590);
      if(term == null)
        break Fail5675;
      if(true)
        return term;
    }
    return null;
  }
}