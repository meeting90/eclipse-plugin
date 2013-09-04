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

@SuppressWarnings("all") public class index_set_current_file_0_0 extends Strategy 
{ 
  public static index_set_current_file_0_0 instance = new index_set_current_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2212:
    { 
      IStrategoTerm f_2134 = null;
      f_2134 = term;
      term = context.invokePrimitive("LANG_index_set_current_file", f_2134, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail2212;
      if(true)
        return term;
    }
    context.push("index_set_current_file_0_0");
    context.popOnFailure();
    return null;
  }
}