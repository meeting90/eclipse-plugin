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

@SuppressWarnings("all") public class debug_generate_analyzed_0_0 extends Strategy 
{ 
  public static debug_generate_analyzed_0_0 instance = new debug_generate_analyzed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("debug_generate_analyzed_0_0");
    Fail5301:
    { 
      IStrategoTerm u_12024 = null;
      IStrategoTerm v_12024 = null;
      IStrategoTerm w_12024 = null;
      IStrategoTerm x_12024 = null;
      IStrategoTerm y_12024 = null;
      IStrategoTerm b_12025 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail5301;
      v_12024 = term.getSubterm(0);
      w_12024 = term.getSubterm(3);
      x_12024 = term.getSubterm(4);
      b_12025 = term;
      IStrategoTerm term3014 = term;
      Success2964:
      { 
        Fail5302:
        { 
          IStrategoTerm d_12025 = null;
          IStrategoTerm f_12025 = null;
          IStrategoTerm g_12025 = null;
          term = editor_init_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5302;
          d_12025 = w_12024;
          term = guarantee_extension_0_1.instance.invoke(context, d_12025, trans.const1020);
          if(term == null)
            break Fail5302;
          u_12024 = term;
          term = termFactory.makeTuple(v_12024, w_12024, x_12024);
          f_12025 = term;
          g_12025 = trans.const998;
          term = analyze_top_0_1.instance.invoke(context, f_12025, g_12025);
          if(term == null)
            break Fail5302;
          y_12024 = term;
          if(true)
            break Success2964;
        }
        term = term3014;
        IStrategoTerm z_12024 = null;
        IStrategoTerm a_12025 = null;
        IStrategoTerm j_12025 = null;
        z_12024 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5301;
        a_12025 = term;
        j_12025 = z_12024;
        term = report_with_failure_0_2.instance.invoke(context, j_12025, trans.const1021, a_12025);
        if(term == null)
          break Fail5301;
      }
      term = b_12025;
      if(u_12024 == null || y_12024 == null)
        break Fail5301;
      term = termFactory.makeTuple(u_12024, y_12024);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}