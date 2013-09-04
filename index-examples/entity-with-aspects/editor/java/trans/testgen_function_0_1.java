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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_11909)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_11909 = new TermReference(ref_j_11909);
    context.push("testgen_function_0_1");
    Fail4514:
    { 
      IStrategoTerm k_11909 = null;
      IStrategoTerm l_11909 = null;
      IStrategoTerm n_11909 = null;
      IStrategoTerm q_11909 = null;
      q_11909 = term;
      IStrategoTerm term2465 = term;
      Success2445:
      { 
        Fail4515:
        { 
          IStrategoTerm v_11909 = null;
          IStrategoTerm w_11909 = null;
          IStrategoTerm x_11909 = null;
          IStrategoTerm y_11909 = null;
          IStrategoTerm a_11910 = null;
          IStrategoTerm b_11910 = null;
          term = random_identifier_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4515;
          k_11909 = term;
          term = trans.constNil3;
          l_11909 = trans.constNil3;
          x_11909 = term;
          y_11909 = trans.const822;
          v_11909 = y_11909;
          a_11910 = x_11909;
          b_11910 = trans.const820;
          w_11909 = b_11910;
          term = a_11910;
          lifted953 lifted9530 = new lifted953();
          lifted9530.j_11909 = j_11909;
          term = random_apply_1_2.instance.invoke(context, term, lifted9530, v_11909, w_11909);
          if(term == null)
            break Fail4515;
          term = termFactory.makeAppl(Main._consBlock_1, new IStrategoTerm[]{term});
          term = termFactory.makeAppl(Main._consFunction_3, new IStrategoTerm[]{k_11909, l_11909, term});
          n_11909 = term;
          if(true)
            break Success2445;
        }
        term = term2465;
        IStrategoTerm o_11909 = null;
        IStrategoTerm p_11909 = null;
        IStrategoTerm e_11910 = null;
        o_11909 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4514;
        p_11909 = term;
        e_11910 = o_11909;
        term = report_with_failure_0_2.instance.invoke(context, e_11910, trans.const845, p_11909);
        if(term == null)
          break Fail4514;
      }
      term = q_11909;
      if(n_11909 == null)
        break Fail4514;
      term = n_11909;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}