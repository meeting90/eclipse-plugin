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

@SuppressWarnings("all") public class testgen_aspect_0_0 extends Strategy 
{ 
  public static testgen_aspect_0_0 instance = new testgen_aspect_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("testgen_aspect_0_0");
    Fail4520:
    { 
      IStrategoTerm i_11911 = null;
      IStrategoTerm k_11911 = null;
      IStrategoTerm n_11911 = null;
      n_11911 = term;
      IStrategoTerm term2469 = term;
      Success2448:
      { 
        Fail4521:
        { 
          IStrategoTerm s_11911 = null;
          IStrategoTerm u_11911 = null;
          IStrategoTerm v_11911 = null;
          IStrategoTerm x_11911 = null;
          IStrategoTerm y_11911 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4521;
          i_11911 = term;
          u_11911 = term;
          v_11911 = trans.const821;
          s_11911 = v_11911;
          x_11911 = u_11911;
          y_11911 = trans.const822;
          term = random_apply_1_2.instance.invoke(context, x_11911, testgen_pointcutadvice_0_0.instance, s_11911, y_11911);
          if(term == null)
            break Fail4521;
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4521;
          term = termFactory.makeAppl(Main._consAspect_2, new IStrategoTerm[]{i_11911, term});
          k_11911 = term;
          if(true)
            break Success2448;
        }
        term = term2469;
        IStrategoTerm l_11911 = null;
        IStrategoTerm m_11911 = null;
        IStrategoTerm b_11912 = null;
        l_11911 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4520;
        m_11911 = term;
        b_11912 = l_11911;
        term = report_with_failure_0_2.instance.invoke(context, b_11912, trans.const847, m_11911);
        if(term == null)
          break Fail4520;
      }
      term = n_11911;
      if(k_11911 == null)
        break Fail4520;
      term = k_11911;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}