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

@SuppressWarnings("all") public class testgen_0_0 extends Strategy 
{ 
  public static testgen_0_0 instance = new testgen_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("testgen_0_0");
    Fail4502:
    { 
      TermReference n_11903 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail4502;
      if(n_11903.value == null)
        n_11903.value = term.getSubterm(4);
      else
        if(n_11903.value != term.getSubterm(4) && !n_11903.value.match(term.getSubterm(4)))
          break Fail4502;
      IStrategoTerm term2447 = term;
      Success2439:
      { 
        Fail4503:
        { 
          term = range_0_0.instance.invoke(context, trans.const821);
          if(term == null)
            break Fail4503;
          lifted945 lifted9450 = new lifted945();
          lifted9450.n_11903 = n_11903;
          term = map_1_0.instance.invoke(context, term, lifted9450);
          if(term == null)
            break Fail4503;
          term = map_1_0.instance.invoke(context, term, testgen_group_0_0.instance);
          if(term == null)
            break Fail4503;
          term = index_clear_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4503;
          if(true)
            break Success2439;
        }
        term = term2447;
        IStrategoTerm q_11903 = null;
        IStrategoTerm r_11903 = null;
        IStrategoTerm w_11903 = null;
        q_11903 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4502;
        r_11903 = term;
        w_11903 = q_11903;
        term = report_with_failure_0_2.instance.invoke(context, w_11903, trans.const834, r_11903);
        if(term == null)
          break Fail4502;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}