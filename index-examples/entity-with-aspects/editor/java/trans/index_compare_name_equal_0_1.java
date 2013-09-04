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

@SuppressWarnings("all") public class index_compare_name_equal_0_1 extends Strategy 
{ 
  public static index_compare_name_equal_0_1 instance = new index_compare_name_equal_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_2117)
  { 
    context.push("index_compare_name_equal_0_1");
    Fail2089:
    { 
      IStrategoTerm b_2117 = null;
      IStrategoTerm d_2117 = null;
      b_2117 = term;
      d_2117 = term;
      term = index_uri_0_0.instance.invoke(context, b_2117);
      if(term == null)
        break Fail2089;
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2089;
      term = SRTS_EXT_eq_ignore_annos_0_1.instance.invoke(context, term, a_2117);
      if(term == null)
        break Fail2089;
      term = d_2117;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}