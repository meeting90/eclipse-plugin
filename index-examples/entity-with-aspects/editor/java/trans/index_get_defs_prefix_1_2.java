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

@SuppressWarnings("all") public class index_get_defs_prefix_1_2 extends Strategy 
{ 
  public static index_get_defs_prefix_1_2 instance = new index_get_defs_prefix_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_11979, IStrategoTerm r_11979, IStrategoTerm s_11979)
  { 
    context.push("index_get_defs_prefix_1_2");
    Fail4990:
    { 
      term = index_get_children_2_2.instance.invoke(context, term, lifted1046.instance, u_11979, r_11979, s_11979);
      if(term == null)
        break Fail4990;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}