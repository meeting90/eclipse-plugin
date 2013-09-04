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

@SuppressWarnings("all") public class index_add_global_0_1 extends Strategy 
{ 
  public static index_add_global_0_1 instance = new index_add_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_12000)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_add_global_0_1");
    Fail5145:
    { 
      IStrategoTerm v_12000 = null;
      IStrategoTerm y_12000 = null;
      v_12000 = term;
      y_12000 = term;
      IStrategoTerm term2919 = term;
      Success2885:
      { 
        Fail5146:
        { 
          IStrategoTerm b_12001 = null;
          IStrategoTerm c_12001 = null;
          IStrategoTerm d_12001 = null;
          IStrategoTerm b_12159 = null;
          IStrategoTerm g_12159 = null;
          IStrategoTerm d_12159 = null;
          term = index_globals_uri_0_0.instance.invoke(context, u_12000);
          if(term == null)
            break Fail5146;
          term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, v_12000});
          c_12001 = term;
          d_12001 = trans.const980;
          b_12001 = d_12001;
          g_12159 = c_12001;
          b_12159 = b_12001;
          term = g_12159;
          d_12159 = g_12159;
          term = context.invokePrimitive("LANG_index_add", d_12159, NO_STRATEGIES, new IStrategoTerm[]{term, b_12159});
          if(term == null)
            break Fail5146;
          if(true)
            break Success2885;
        }
        term = term2919;
        IStrategoTerm w_12000 = null;
        IStrategoTerm x_12000 = null;
        IStrategoTerm g_12001 = null;
        w_12000 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5145;
        x_12000 = term;
        g_12001 = w_12000;
        term = report_with_failure_0_2.instance.invoke(context, g_12001, trans.const986, x_12000);
        if(term == null)
          break Fail5145;
      }
      term = y_12000;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}