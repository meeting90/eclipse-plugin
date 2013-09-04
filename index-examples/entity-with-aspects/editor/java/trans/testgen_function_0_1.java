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

@SuppressWarnings("all") public class testgen_function_0_1 extends Strategy 
{ 
  public static testgen_function_0_1 instance = new testgen_function_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_2046)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference o_2046 = new TermReference(ref_o_2046);
    context.push("testgen_function_0_1");
    Fail1612:
    { 
      IStrategoTerm p_2046 = null;
      IStrategoTerm q_2046 = null;
      IStrategoTerm s_2046 = null;
      IStrategoTerm v_2046 = null;
      v_2046 = term;
      IStrategoTerm term909 = term;
      Success889:
      { 
        Fail1613:
        { 
          IStrategoTerm a_2047 = null;
          IStrategoTerm b_2047 = null;
          IStrategoTerm c_2047 = null;
          IStrategoTerm d_2047 = null;
          IStrategoTerm f_2047 = null;
          IStrategoTerm g_2047 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1613;
          p_2046 = term;
          term = trans.constNil1;
          q_2046 = trans.constNil1;
          c_2047 = term;
          d_2047 = trans.const302;
          a_2047 = d_2047;
          f_2047 = c_2047;
          g_2047 = trans.const300;
          b_2047 = g_2047;
          term = f_2047;
          lifted353 lifted3530 = new lifted353();
          lifted3530.o_2046 = o_2046;
          term = random_apply_1_2.instance.invoke(context, term, lifted3530, a_2047, b_2047);
          if(term == null)
            break Fail1613;
          term = termFactory.makeAppl(Main._consBlock_1, new IStrategoTerm[]{term});
          term = termFactory.makeAppl(Main._consFunction_3, new IStrategoTerm[]{p_2046, q_2046, term});
          s_2046 = term;
          if(true)
            break Success889;
        }
        term = term909;
        IStrategoTerm t_2046 = null;
        IStrategoTerm u_2046 = null;
        IStrategoTerm j_2047 = null;
        t_2046 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1612;
        u_2046 = term;
        j_2047 = t_2046;
        term = report_with_failure_0_2.instance.invoke(context, j_2047, trans.const325, u_2046);
        if(term == null)
          break Fail1612;
      }
      term = v_2046;
      if(s_2046 == null)
        break Fail1612;
      term = s_2046;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}