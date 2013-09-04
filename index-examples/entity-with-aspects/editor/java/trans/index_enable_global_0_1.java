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

@SuppressWarnings("all") public class index_enable_global_0_1 extends Strategy 
{ 
  public static index_enable_global_0_1 instance = new index_enable_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_12002)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_enable_global_0_1");
    Fail5154:
    { 
      IStrategoTerm z_12002 = null;
      z_12002 = term;
      IStrategoTerm term2924 = term;
      Success2890:
      { 
        Fail5155:
        { 
          IStrategoTerm c_12003 = null;
          IStrategoTerm d_12003 = null;
          IStrategoTerm e_12003 = null;
          IStrategoTerm n_12159 = null;
          IStrategoTerm s_12159 = null;
          IStrategoTerm p_12159 = null;
          term = index_boolean_globals_uri_0_0.instance.invoke(context, w_12002);
          if(term == null)
            break Fail5155;
          term = termFactory.makeAppl(Main._consGlobal_1, new IStrategoTerm[]{term});
          d_12003 = term;
          e_12003 = trans.const980;
          c_12003 = e_12003;
          s_12159 = d_12003;
          n_12159 = c_12003;
          term = s_12159;
          p_12159 = s_12159;
          term = context.invokePrimitive("LANG_index_add", p_12159, NO_STRATEGIES, new IStrategoTerm[]{term, n_12159});
          if(term == null)
            break Fail5155;
          if(true)
            break Success2890;
        }
        term = term2924;
        IStrategoTerm x_12002 = null;
        IStrategoTerm y_12002 = null;
        IStrategoTerm h_12003 = null;
        x_12002 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5154;
        y_12002 = term;
        h_12003 = x_12002;
        term = report_with_failure_0_2.instance.invoke(context, h_12003, trans.const991, y_12002);
        if(term == null)
          break Fail5154;
      }
      term = z_12002;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}