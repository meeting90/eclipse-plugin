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
    Fail2469:
    { 
      IStrategoTerm q_2173 = null;
      IStrategoTerm s_2173 = null;
      IStrategoTerm t_2173 = null;
      IStrategoTerm term1521 = term;
      Success1471:
      { 
        Fail2470:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail2470;
          { 
            if(true)
              break Fail2469;
            if(true)
              break Success1471;
          }
        }
        term = term1521;
      }
      s_2173 = term;
      q_2173 = trans.const516;
      t_2173 = s_2173;
      term = queue_strategy_0_2.instance.invoke(context, t_2173, q_2173, trans.const517);
      if(term == null)
        break Fail2469;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}