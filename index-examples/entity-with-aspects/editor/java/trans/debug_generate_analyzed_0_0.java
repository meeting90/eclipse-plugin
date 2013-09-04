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
    Fail2399:
    { 
      IStrategoTerm z_2161 = null;
      IStrategoTerm a_2162 = null;
      IStrategoTerm b_2162 = null;
      IStrategoTerm c_2162 = null;
      IStrategoTerm d_2162 = null;
      IStrategoTerm g_2162 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail2399;
      a_2162 = term.getSubterm(0);
      b_2162 = term.getSubterm(3);
      c_2162 = term.getSubterm(4);
      g_2162 = term;
      IStrategoTerm term1458 = term;
      Success1408:
      { 
        Fail2400:
        { 
          IStrategoTerm i_2162 = null;
          IStrategoTerm k_2162 = null;
          IStrategoTerm l_2162 = null;
          term = editor_init_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2400;
          i_2162 = b_2162;
          term = guarantee_extension_0_1.instance.invoke(context, i_2162, trans.const500);
          if(term == null)
            break Fail2400;
          z_2161 = term;
          term = termFactory.makeTuple(a_2162, b_2162, c_2162);
          k_2162 = term;
          l_2162 = trans.const478;
          term = analyze_top_0_1.instance.invoke(context, k_2162, l_2162);
          if(term == null)
            break Fail2400;
          d_2162 = term;
          if(true)
            break Success1408;
        }
        term = term1458;
        IStrategoTerm e_2162 = null;
        IStrategoTerm f_2162 = null;
        IStrategoTerm o_2162 = null;
        e_2162 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2399;
        f_2162 = term;
        o_2162 = e_2162;
        term = report_with_failure_0_2.instance.invoke(context, o_2162, trans.const501, f_2162);
        if(term == null)
          break Fail2399;
      }
      term = g_2162;
      if(z_2161 == null || d_2162 == null)
        break Fail2399;
      term = termFactory.makeTuple(z_2161, d_2162);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}