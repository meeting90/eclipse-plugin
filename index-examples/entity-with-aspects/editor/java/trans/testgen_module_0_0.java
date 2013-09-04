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
    Fail1606:
    { 
      IStrategoTerm i_2043 = null;
      IStrategoTerm j_2043 = null;
      IStrategoTerm k_2043 = null;
      IStrategoTerm l_2043 = null;
      IStrategoTerm o_2043 = null;
      o_2043 = term;
      IStrategoTerm term906 = term;
      Success886:
      { 
        Fail1607:
        { 
          IStrategoTerm p_2043 = null;
          IStrategoTerm t_2043 = null;
          IStrategoTerm v_2043 = null;
          IStrategoTerm w_2043 = null;
          IStrategoTerm y_2043 = null;
          IStrategoTerm z_2043 = null;
          IStrategoTerm d_2044 = null;
          IStrategoTerm f_2044 = null;
          IStrategoTerm g_2044 = null;
          IStrategoTerm i_2044 = null;
          IStrategoTerm j_2044 = null;
          p_2043 = trans.const299;
          term = trans.const299;
          i_2043 = p_2043;
          v_2043 = term;
          w_2043 = trans.const302;
          t_2043 = w_2043;
          y_2043 = v_2043;
          z_2043 = trans.const303;
          term = random_apply_1_2.instance.invoke(context, y_2043, testgen_entity_0_0.instance, t_2043, z_2043);
          if(term == null)
            break Fail1607;
          j_2043 = term;
          f_2044 = term;
          g_2044 = trans.const301;
          d_2044 = g_2044;
          i_2044 = f_2044;
          j_2044 = trans.const302;
          term = random_apply_1_2.instance.invoke(context, i_2044, testgen_aspect_0_0.instance, d_2044, j_2044);
          if(term == null)
            break Fail1607;
          k_2043 = term;
          term = termFactory.makeTuple(j_2043, k_2043);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1607;
          term = termFactory.makeAppl(Main._consModule_3, new IStrategoTerm[]{i_2043, trans.constNil1, term});
          l_2043 = term;
          if(true)
            break Success886;
        }
        term = term906;
        IStrategoTerm m_2043 = null;
        IStrategoTerm n_2043 = null;
        IStrategoTerm o_2044 = null;
        m_2043 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1606;
        n_2043 = term;
        o_2044 = m_2043;
        term = report_with_failure_0_2.instance.invoke(context, o_2044, trans.const322, n_2043);
        if(term == null)
          break Fail1606;
      }
      term = o_2043;
      if(l_2043 == null)
        break Fail1606;
      term = l_2043;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}