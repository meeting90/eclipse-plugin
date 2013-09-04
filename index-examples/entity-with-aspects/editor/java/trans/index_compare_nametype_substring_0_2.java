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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_2084, IStrategoTerm r_2084)
  { 
    TermReference q_2084 = new TermReference(ref_q_2084);
    context.push("index_compare_nametype_substring_0_2");
    Fail1931:
    { 
      IStrategoTerm s_2084 = null;
      IStrategoTerm t_2084 = null;
      IStrategoTerm u_2084 = null;
      s_2084 = term;
      u_2084 = term;
      term = index_uri_0_0.instance.invoke(context, s_2084);
      if(term == null)
        break Fail1931;
      t_2084 = term;
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1931;
      lifted382 lifted3820 = new lifted382();
      lifted3820.q_2084 = q_2084;
      term = is_substring_1_0.instance.invoke(context, term, lifted3820);
      if(term == null)
        break Fail1931;
      term = nbl_get_type_0_0.instance.invoke(context, t_2084);
      if(term == null)
        break Fail1931;
      term = nbl_type_eq_0_1.instance.invoke(context, term, r_2084);
      if(term == null)
        break Fail1931;
      term = u_2084;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}