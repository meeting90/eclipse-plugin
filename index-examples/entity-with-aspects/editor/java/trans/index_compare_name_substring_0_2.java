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

@SuppressWarnings("all") public class index_compare_name_substring_0_2 extends Strategy 
{ 
  public static index_compare_name_substring_0_2 instance = new index_compare_name_substring_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_h_11980, IStrategoTerm i_11980)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_11980 = new TermReference(ref_h_11980);
    context.push("index_compare_name_substring_0_2");
    Fail4993:
    { 
      IStrategoTerm j_11980 = null;
      IStrategoTerm k_11980 = null;
      IStrategoTerm l_11980 = null;
      j_11980 = term;
      l_11980 = term;
      term = index_uri_0_0.instance.invoke(context, j_11980);
      if(term == null)
        break Fail4993;
      k_11980 = term;
      term = index_uri_namespace_0_0.instance.invoke(context, k_11980);
      if(term == null)
        break Fail4993;
      term = termFactory.makeTuple(i_11980, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4993;
      term = index_uri_name_0_0.instance.invoke(context, k_11980);
      if(term == null)
        break Fail4993;
      lifted1048 lifted10480 = new lifted1048();
      lifted10480.h_11980 = h_11980;
      term = is_substring_1_0.instance.invoke(context, term, lifted10480);
      if(term == null)
        break Fail4993;
      term = l_11980;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}