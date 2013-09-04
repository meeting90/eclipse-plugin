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

@SuppressWarnings("all") public class index_value_0_0 extends Strategy 
{ 
  public static index_value_0_0 instance = new index_value_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_value_0_0");
    Fail5162:
    { 
      IStrategoTerm term2927 = term;
      Success2893:
      { 
        Fail5163:
        { 
          term = index_value_impl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5163;
          if(true)
            break Success2893;
        }
        term = index_value_generic_0_0.instance.invoke(context, term2927);
        if(term == null)
          break Fail5162;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}