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

@SuppressWarnings("all") public class index_compare_name_substring_0_1 extends Strategy 
{ 
  public static index_compare_name_substring_0_1 instance = new index_compare_name_substring_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_11980)
  { 
    TermReference b_11980 = new TermReference(ref_b_11980);
    context.push("index_compare_name_substring_0_1");
    Fail4992:
    { 
      IStrategoTerm c_11980 = null;
      IStrategoTerm e_11980 = null;
      c_11980 = term;
      e_11980 = term;
      term = index_uri_0_0.instance.invoke(context, c_11980);
      if(term == null)
        break Fail4992;
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4992;
      lifted1047 lifted10470 = new lifted1047();
      lifted10470.b_11980 = b_11980;
      term = is_substring_1_0.instance.invoke(context, term, lifted10470);
      if(term == null)
        break Fail4992;
      term = e_11980;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}