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

@SuppressWarnings("all") public class testgen_file_0_0 extends Strategy 
{ 
  public static testgen_file_0_0 instance = new testgen_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("testgen_file_0_0");
    Fail4506:
    { 
      IStrategoTerm s_11905 = null;
      IStrategoTerm t_11905 = null;
      t_11905 = term;
      IStrategoTerm term2461 = term;
      Success2441:
      { 
        Fail4507:
        { 
          IStrategoTerm x_11905 = null;
          term = testgen_module_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4507;
          x_11905 = term;
          s_11905 = term;
          term = testgen_add_ast_0_1.instance.invoke(context, x_11905, t_11905);
          if(term == null)
            break Fail4507;
          term = testgen_write_file_0_1.instance.invoke(context, s_11905, t_11905);
          if(term == null)
            break Fail4507;
          if(true)
            break Success2441;
        }
        term = term2461;
        IStrategoTerm u_11905 = null;
        IStrategoTerm v_11905 = null;
        IStrategoTerm a_11906 = null;
        u_11905 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4506;
        v_11905 = term;
        a_11906 = u_11905;
        term = report_with_failure_0_2.instance.invoke(context, a_11906, trans.const841, v_11905);
        if(term == null)
          break Fail4506;
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