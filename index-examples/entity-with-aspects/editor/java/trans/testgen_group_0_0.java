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
    Fail4504:
    { 
      TermReference z_11903 = new TermReference();
      TermReference a_11904 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4504;
      if(z_11903.value == null)
        z_11903.value = term.getSubterm(0);
      else
        if(z_11903.value != term.getSubterm(0) && !z_11903.value.match(term.getSubterm(0)))
          break Fail4504;
      if(a_11904.value == null)
        a_11904.value = term.getSubterm(1);
      else
        if(a_11904.value != term.getSubterm(1) && !a_11904.value.match(term.getSubterm(1)))
          break Fail4504;
      IStrategoTerm term2448 = term;
      Success2440:
      { 
        Fail4505:
        { 
          term = index_clear_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4505;
          term = range_0_0.instance.invoke(context, trans.const820);
          if(term == null)
            break Fail4505;
          lifted947 lifted9470 = new lifted947();
          lifted9470.z_11903 = z_11903;
          lifted9470.a_11904 = a_11904;
          term = map_1_0.instance.invoke(context, term, lifted9470);
          if(term == null)
            break Fail4505;
          term = reverse_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4505;
          term = map_1_0.instance.invoke(context, term, testgen_file_0_0.instance);
          if(term == null)
            break Fail4505;
          if(true)
            break Success2440;
        }
        term = term2448;
        IStrategoTerm b_11905 = null;
        IStrategoTerm c_11905 = null;
        IStrategoTerm p_11905 = null;
        b_11905 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4504;
        c_11905 = term;
        p_11905 = b_11905;
        term = report_with_failure_0_2.instance.invoke(context, p_11905, trans.const840, c_11905);
        if(term == null)
          break Fail4504;
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