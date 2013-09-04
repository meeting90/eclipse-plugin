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

@SuppressWarnings("all") public class testgen_module_0_0 extends Strategy 
{ 
  public static testgen_module_0_0 instance = new testgen_module_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_module_0_0");
    Fail4508:
    { 
      IStrategoTerm d_11906 = null;
      IStrategoTerm e_11906 = null;
      IStrategoTerm f_11906 = null;
      IStrategoTerm g_11906 = null;
      IStrategoTerm j_11906 = null;
      j_11906 = term;
      IStrategoTerm term2462 = term;
      Success2442:
      { 
        Fail4509:
        { 
          IStrategoTerm k_11906 = null;
          IStrategoTerm o_11906 = null;
          IStrategoTerm q_11906 = null;
          IStrategoTerm r_11906 = null;
          IStrategoTerm t_11906 = null;
          IStrategoTerm u_11906 = null;
          IStrategoTerm y_11906 = null;
          IStrategoTerm a_11907 = null;
          IStrategoTerm b_11907 = null;
          IStrategoTerm d_11907 = null;
          IStrategoTerm e_11907 = null;
          k_11906 = trans.const819;
          term = trans.const819;
          d_11906 = k_11906;
          q_11906 = term;
          r_11906 = trans.const822;
          o_11906 = r_11906;
          t_11906 = q_11906;
          u_11906 = trans.const823;
          term = random_apply_1_2.instance.invoke(context, t_11906, testgen_entity_0_0.instance, o_11906, u_11906);
          if(term == null)
            break Fail4509;
          e_11906 = term;
          a_11907 = term;
          b_11907 = trans.const821;
          y_11906 = b_11907;
          d_11907 = a_11907;
          e_11907 = trans.const822;
          term = random_apply_1_2.instance.invoke(context, d_11907, testgen_aspect_0_0.instance, y_11906, e_11907);
          if(term == null)
            break Fail4509;
          f_11906 = term;
          term = termFactory.makeTuple(e_11906, f_11906);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4509;
          term = termFactory.makeAppl(Main._consModule_3, new IStrategoTerm[]{d_11906, trans.constNil3, term});
          g_11906 = term;
          if(true)
            break Success2442;
        }
        term = term2462;
        IStrategoTerm h_11906 = null;
        IStrategoTerm i_11906 = null;
        IStrategoTerm j_11907 = null;
        h_11906 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4508;
        i_11906 = term;
        j_11907 = h_11906;
        term = report_with_failure_0_2.instance.invoke(context, j_11907, trans.const842, i_11906);
        if(term == null)
          break Fail4508;
      }
      term = j_11906;
      if(g_11906 == null)
        break Fail4508;
      term = g_11906;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}