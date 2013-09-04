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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_2116, IStrategoTerm w_2116, IStrategoTerm x_2116)
  { 
    context.push("index_get_defs_prefix_1_2");
    Fail2088:
    { 
      term = index_get_children_2_2.instance.invoke(context, term, lifted446.instance, z_2116, w_2116, x_2116);
      if(term == null)
        break Fail2088;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}