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

@SuppressWarnings("all") public class index_lookup_all_internal_2_3 extends Strategy 
{ 
  public static index_lookup_all_internal_2_3 instance = new index_lookup_all_internal_2_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_11975, Strategy a_11976, IStrategoTerm w_11975, IStrategoTerm x_11975, IStrategoTerm y_11975)
  { 
    context.push("index_lookup_all_internal_2_3");
    Fail4970:
    { 
      term = index_lookup_all_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, z_11975, a_11976, w_11975, x_11975, y_11975);
      if(term == null)
        break Fail4970;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}