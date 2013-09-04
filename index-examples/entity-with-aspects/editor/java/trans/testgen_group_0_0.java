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

@SuppressWarnings("all") public class testgen_group_0_0 extends Strategy 
{ 
  public static testgen_group_0_0 instance = new testgen_group_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("testgen_group_0_0");
    Fail1602:
    { 
      TermReference e_2041 = new TermReference();
      TermReference f_2041 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1602;
      if(e_2041.value == null)
        e_2041.value = term.getSubterm(0);
      else
        if(e_2041.value != term.getSubterm(0) && !e_2041.value.match(term.getSubterm(0)))
          break Fail1602;
      if(f_2041.value == null)
        f_2041.value = term.getSubterm(1);
      else
        if(f_2041.value != term.getSubterm(1) && !f_2041.value.match(term.getSubterm(1)))
          break Fail1602;
      IStrategoTerm term892 = term;
      Success884:
      { 
        Fail1603:
        { 
          term = index_clear_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1603;
          term = range_0_0.instance.invoke(context, trans.const300);
          if(term == null)
            break Fail1603;
          lifted347 lifted3470 = new lifted347();
          lifted3470.e_2041 = e_2041;
          lifted3470.f_2041 = f_2041;
          term = map_1_0.instance.invoke(context, term, lifted3470);
          if(term == null)
            break Fail1603;
          term = reverse_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1603;
          term = map_1_0.instance.invoke(context, term, testgen_file_0_0.instance);
          if(term == null)
            break Fail1603;
          if(true)
            break Success884;
        }
        term = term892;
        IStrategoTerm g_2042 = null;
        IStrategoTerm h_2042 = null;
        IStrategoTerm u_2042 = null;
        g_2042 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1602;
        h_2042 = term;
        u_2042 = g_2042;
        term = report_with_failure_0_2.instance.invoke(context, u_2042, trans.const320, h_2042);
        if(term == null)
          break Fail1602;
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