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

@SuppressWarnings("all") public class index_compare_nametype_substring_0_2 extends Strategy 
{ 
  public static index_compare_nametype_substring_0_2 instance = new index_compare_nametype_substring_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_l_11947, IStrategoTerm m_11947)
  { 
    TermReference l_11947 = new TermReference(ref_l_11947);
    context.push("index_compare_nametype_substring_0_2");
    Fail4833:
    { 
      IStrategoTerm n_11947 = null;
      IStrategoTerm o_11947 = null;
      IStrategoTerm p_11947 = null;
      n_11947 = term;
      p_11947 = term;
      term = index_uri_0_0.instance.invoke(context, n_11947);
      if(term == null)
        break Fail4833;
      o_11947 = term;
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4833;
      lifted982 lifted9820 = new lifted982();
      lifted9820.l_11947 = l_11947;
      term = is_substring_1_0.instance.invoke(context, term, lifted9820);
      if(term == null)
        break Fail4833;
      term = nbl_get_type_0_0.instance.invoke(context, o_11947);
      if(term == null)
        break Fail4833;
      term = nbl_type_eq_0_1.instance.invoke(context, term, m_11947);
      if(term == null)
        break Fail4833;
      term = p_11947;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}