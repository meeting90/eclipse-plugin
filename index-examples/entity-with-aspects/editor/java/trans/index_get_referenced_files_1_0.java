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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_11993)
  { 
    context.push("index_get_referenced_files_1_0");
    Fail5088:
    { 
      IStrategoTerm w_11992 = null;
      IStrategoTerm y_11992 = null;
      IStrategoTerm f_11993 = null;
      w_11992 = term;
      term = filter_1_0.instance.invoke(context, w_11992, index_uri_0_0.instance);
      if(term == null)
        break Fail5088;
      term = filter_1_0.instance.invoke(context, term, a_11993);
      if(term == null)
        break Fail5088;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5088;
      y_11992 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5088;
      f_11993 = term;
      term = mapconcat_1_0.instance.invoke(context, y_11992, index_get_files_of_0_0.instance);
      if(term == null)
        break Fail5088;
      term = iset_addlist_0_1.instance.invoke(context, f_11993, term);
      if(term == null)
        break Fail5088;
      term = iset_elements_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5088;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}