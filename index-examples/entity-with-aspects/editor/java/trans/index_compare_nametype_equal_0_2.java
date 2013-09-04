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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_2084, IStrategoTerm k_2084)
  { 
    context.push("index_compare_nametype_equal_0_2");
    Fail1930:
    { 
      IStrategoTerm l_2084 = null;
      IStrategoTerm m_2084 = null;
      IStrategoTerm n_2084 = null;
      l_2084 = term;
      n_2084 = term;
      term = index_uri_0_0.instance.invoke(context, l_2084);
      if(term == null)
        break Fail1930;
      m_2084 = term;
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1930;
      term = SRTS_EXT_eq_ignore_annos_0_1.instance.invoke(context, term, j_2084);
      if(term == null)
        break Fail1930;
      term = nbl_get_type_0_0.instance.invoke(context, m_2084);
      if(term == null)
        break Fail1930;
      term = nbl_type_eq_0_1.instance.invoke(context, term, k_2084);
      if(term == null)
        break Fail1930;
      term = n_2084;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}