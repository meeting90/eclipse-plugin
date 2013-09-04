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

@SuppressWarnings("all") public class index_transaction_1_0 extends Strategy 
{ 
  public static index_transaction_1_0 instance = new index_transaction_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_11998)
  { 
    context.push("index_transaction_1_0");
    Fail5125:
    { 
      term = context.invokePrimitive("LANG_index_start_transaction", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail5125;
      term = try_1_0.instance.invoke(context, term, f_11998);
      if(term == null)
        break Fail5125;
      term = context.invokePrimitive("LANG_index_end_transaction", term, NO_STRATEGIES, NO_TERMS);
      if(term == null)
        break Fail5125;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}