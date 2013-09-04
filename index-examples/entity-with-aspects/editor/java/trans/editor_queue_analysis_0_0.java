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

@SuppressWarnings("all") public class editor_queue_analysis_0_0 extends Strategy 
{ 
  public static editor_queue_analysis_0_0 instance = new editor_queue_analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_queue_analysis_0_0");
    Fail5371:
    { 
      IStrategoTerm l_12036 = null;
      IStrategoTerm n_12036 = null;
      IStrategoTerm o_12036 = null;
      IStrategoTerm term3077 = term;
      Success3027:
      { 
        Fail5372:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail5372;
          { 
            if(true)
              break Fail5371;
            if(true)
              break Success3027;
          }
        }
        term = term3077;
      }
      n_12036 = term;
      l_12036 = trans.const1036;
      o_12036 = n_12036;
      term = queue_strategy_0_2.instance.invoke(context, o_12036, l_12036, trans.const1037);
      if(term == null)
        break Fail5371;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}