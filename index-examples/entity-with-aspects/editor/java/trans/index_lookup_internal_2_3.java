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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_2112, Strategy m_2112, IStrategoTerm i_2112, IStrategoTerm j_2112, IStrategoTerm k_2112)
  { 
    context.push("index_lookup_internal_2_3");
    Fail2065:
    { 
      term = index_lookup_internal_4_3.instance.invoke(context, term, _Id.instance, _Id.instance, l_2112, m_2112, i_2112, j_2112, k_2112);
      if(term == null)
        break Fail2065;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}