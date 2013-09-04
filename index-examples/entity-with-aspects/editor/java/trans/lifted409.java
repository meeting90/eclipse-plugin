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

@SuppressWarnings("all") final class lifted409 extends Strategy 
{ 
  TermReference z_2100;

  TermReference g_2196;

  TermReference w_2100;

  TermReference x_2100;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2810:
    { 
      term = analyze_child_defs_0_4.instance.invoke(context, term, z_2100.value, g_2196.value, w_2100.value, x_2100.value);
      if(term == null)
        break Fail2810;
      if(true)
        return term;
    }
    return null;
  }
}