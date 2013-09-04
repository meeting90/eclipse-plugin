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

@SuppressWarnings("all") public class index_lookup_all_scoped_internal_2_3 extends Strategy 
{ 
  public static index_lookup_all_scoped_internal_2_3 instance = new index_lookup_all_scoped_internal_2_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_11976, Strategy w_11976, IStrategoTerm s_11976, IStrategoTerm t_11976, IStrategoTerm u_11976)
  { 
    context.push("index_lookup_all_scoped_internal_2_3");
    Fail4975:
    { 
      term = index_lookup_all_scoped_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, v_11976, w_11976, s_11976, t_11976, u_11976);
      if(term == null)
        break Fail4975;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}