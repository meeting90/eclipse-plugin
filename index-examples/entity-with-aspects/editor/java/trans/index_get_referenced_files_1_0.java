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

@SuppressWarnings("all") public class index_get_referenced_files_1_0 extends Strategy 
{ 
  public static index_get_referenced_files_1_0 instance = new index_get_referenced_files_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_2130)
  { 
    context.push("index_get_referenced_files_1_0");
    Fail2186:
    { 
      IStrategoTerm b_2130 = null;
      IStrategoTerm d_2130 = null;
      IStrategoTerm k_2130 = null;
      b_2130 = term;
      term = filter_1_0.instance.invoke(context, b_2130, index_uri_0_0.instance);
      if(term == null)
        break Fail2186;
      term = filter_1_0.instance.invoke(context, term, f_2130);
      if(term == null)
        break Fail2186;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2186;
      d_2130 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2186;
      k_2130 = term;
      term = mapconcat_1_0.instance.invoke(context, d_2130, index_get_files_of_0_0.instance);
      if(term == null)
        break Fail2186;
      term = iset_addlist_0_1.instance.invoke(context, k_2130, term);
      if(term == null)
        break Fail2186;
      term = iset_elements_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2186;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}