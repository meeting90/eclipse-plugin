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

@SuppressWarnings("all") public class index_get_global_0_1 extends Strategy 
{ 
  public static index_get_global_0_1 instance = new index_get_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_12000)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_global_0_1");
    Fail5142:
    { 
      term = index_globals_uri_0_0.instance.invoke(context, c_12000);
      if(term == null)
        break Fail5142;
      term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, trans.const882});
      term = indexlib_get_value_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5142;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}