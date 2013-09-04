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
    Fail1600:
    { 
      TermReference s_2040 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail1600;
      if(s_2040.value == null)
        s_2040.value = term.getSubterm(4);
      else
        if(s_2040.value != term.getSubterm(4) && !s_2040.value.match(term.getSubterm(4)))
          break Fail1600;
      IStrategoTerm term891 = term;
      Success883:
      { 
        Fail1601:
        { 
          term = range_0_0.instance.invoke(context, trans.const301);
          if(term == null)
            break Fail1601;
          lifted345 lifted3450 = new lifted345();
          lifted3450.s_2040 = s_2040;
          term = map_1_0.instance.invoke(context, term, lifted3450);
          if(term == null)
            break Fail1601;
          term = map_1_0.instance.invoke(context, term, testgen_group_0_0.instance);
          if(term == null)
            break Fail1601;
          term = index_clear_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1601;
          if(true)
            break Success883;
        }
        term = term891;
        IStrategoTerm v_2040 = null;
        IStrategoTerm w_2040 = null;
        IStrategoTerm b_2041 = null;
        v_2040 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1600;
        w_2040 = term;
        b_2041 = v_2040;
        term = report_with_failure_0_2.instance.invoke(context, b_2041, trans.const314, w_2040);
        if(term == null)
          break Fail1600;
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