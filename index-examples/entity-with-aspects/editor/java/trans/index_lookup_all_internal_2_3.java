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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_2113, Strategy f_2113, IStrategoTerm b_2113, IStrategoTerm c_2113, IStrategoTerm d_2113)
  { 
    context.push("index_lookup_all_internal_2_3");
    Fail2068:
    { 
      term = index_lookup_all_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, e_2113, f_2113, b_2113, c_2113, d_2113);
      if(term == null)
        break Fail2068;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}