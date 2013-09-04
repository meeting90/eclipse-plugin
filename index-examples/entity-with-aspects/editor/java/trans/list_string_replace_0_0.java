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

@SuppressWarnings("all") public class list_string_replace_0_0 extends Strategy 
{ 
  public static list_string_replace_0_0 instance = new list_string_replace_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("list_string_replace_0_0");
    Fail1563:
    { 
      IStrategoTerm a_2036 = null;
      IStrategoTerm b_2036 = null;
      IStrategoTerm c_2036 = null;
      IStrategoTerm i_2036 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1563;
      b_2036 = term.getSubterm(0);
      a_2036 = term.getSubterm(1);
      i_2036 = term;
      IStrategoTerm term886 = term;
      Success878:
      { 
        Fail1564:
        { 
          term = termFactory.makeTuple(a_2036, b_2036);
          term = foldl_1_0.instance.invoke(context, term, lifted339.instance);
          if(term == null)
            break Fail1564;
          c_2036 = term;
          if(true)
            break Success878;
        }
        term = term886;
        IStrategoTerm g_2036 = null;
        IStrategoTerm h_2036 = null;
        IStrategoTerm k_2036 = null;
        g_2036 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1563;
        h_2036 = term;
        k_2036 = g_2036;
        term = report_with_failure_0_2.instance.invoke(context, k_2036, trans.const297, h_2036);
        if(term == null)
          break Fail1563;
      }
      term = i_2036;
      if(c_2036 == null)
        break Fail1563;
      term = c_2036;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}