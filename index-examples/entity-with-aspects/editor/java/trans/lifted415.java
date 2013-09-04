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

@SuppressWarnings("all") final class lifted415 extends Strategy 
{ 
  TermReference z_2104;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2805:
    { 
      term = analyze_tree_data_part_0_1.instance.invoke(context, term, z_2104.value);
      if(term == null)
        break Fail2805;
      if(true)
        return term;
    }
    return null;
  }
}