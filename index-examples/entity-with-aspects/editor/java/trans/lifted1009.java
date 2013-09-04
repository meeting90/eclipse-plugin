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

@SuppressWarnings("all") final class lifted1009 extends Strategy 
{ 
  TermReference u_11963;

  TermReference b_12059;

  TermReference r_11963;

  TermReference s_11963;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5712:
    { 
      term = analyze_child_defs_0_4.instance.invoke(context, term, u_11963.value, b_12059.value, r_11963.value, s_11963.value);
      if(term == null)
        break Fail5712;
      if(true)
        return term;
    }
    return null;
  }
}