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

@SuppressWarnings("all") public class index_compare_nametype_equal_0_2 extends Strategy 
{ 
  public static index_compare_nametype_equal_0_2 instance = new index_compare_nametype_equal_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_11947, IStrategoTerm f_11947)
  { 
    context.push("index_compare_nametype_equal_0_2");
    Fail4832:
    { 
      IStrategoTerm g_11947 = null;
      IStrategoTerm h_11947 = null;
      IStrategoTerm i_11947 = null;
      g_11947 = term;
      i_11947 = term;
      term = index_uri_0_0.instance.invoke(context, g_11947);
      if(term == null)
        break Fail4832;
      h_11947 = term;
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4832;
      term = SRTS_EXT_eq_ignore_annos_0_1.instance.invoke(context, term, e_11947);
      if(term == null)
        break Fail4832;
      term = nbl_get_type_0_0.instance.invoke(context, h_11947);
      if(term == null)
        break Fail4832;
      term = nbl_type_eq_0_1.instance.invoke(context, term, f_11947);
      if(term == null)
        break Fail4832;
      term = i_11947;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}