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

@SuppressWarnings("all") public class index_lookup_internal_2_3 extends Strategy 
{ 
  public static index_lookup_internal_2_3 instance = new index_lookup_internal_2_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_11975, Strategy h_11975, IStrategoTerm d_11975, IStrategoTerm e_11975, IStrategoTerm f_11975)
  { 
    context.push("index_lookup_internal_2_3");
    Fail4967:
    { 
      term = index_lookup_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, g_11975, h_11975, d_11975, e_11975, f_11975);
      if(term == null)
        break Fail4967;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}