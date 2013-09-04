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

@SuppressWarnings("all") public class analyze_store_diff_0_2 extends Strategy 
{ 
  public static analyze_store_diff_0_2 instance = new analyze_store_diff_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_11973, IStrategoTerm l_11973)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_store_diff_0_2");
    Fail4956:
    { 
      IStrategoTerm o_11973 = null;
      IStrategoTerm p_11973 = null;
      IStrategoTerm q_11973 = null;
      IStrategoTerm v_11973 = null;
      o_11973 = term;
      v_11973 = term;
      IStrategoTerm term2834 = term;
      Success2807:
      { 
        Fail4957:
        { 
          term = mapconcat_1_0.instance.invoke(context, k_11973, index_get_files_of_0_0.instance);
          if(term == null)
            break Fail4957;
          q_11973 = term;
          term = index_get_dependent_files_0_0.instance.invoke(context, k_11973);
          if(term == null)
            break Fail4957;
          term = remove_all_1_0.instance.invoke(context, term, fake_file_0_0.instance);
          if(term == null)
            break Fail4957;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4957;
          p_11973 = term;
          term = filter_1_0.instance.invoke(context, o_11973, analyze_astdiff_0_0.instance);
          if(term == null)
            break Fail4957;
          term = (IStrategoTerm)termFactory.makeListCons(p_11973, termFactory.makeListCons(q_11973, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4957;
          term = make_set_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4957;
          term = map_1_0.instance.invoke(context, term, analyze_add_compilediff_0_0.instance);
          if(term == null)
            break Fail4957;
          if(true)
            break Success2807;
        }
        term = term2834;
        IStrategoTerm t_11973 = null;
        IStrategoTerm u_11973 = null;
        IStrategoTerm x_11973 = null;
        t_11973 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4956;
        u_11973 = term;
        x_11973 = t_11973;
        term = report_with_failure_0_2.instance.invoke(context, x_11973, trans.const953, u_11973);
        if(term == null)
          break Fail4956;
      }
      term = v_11973;
      if(p_11973 == null)
        break Fail4956;
      term = p_11973;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}