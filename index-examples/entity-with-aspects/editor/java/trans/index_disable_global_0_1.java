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

@SuppressWarnings("all") public class index_disable_global_0_1 extends Strategy 
{ 
  public static index_disable_global_0_1 instance = new index_disable_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_12003)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_disable_global_0_1");
    Fail5156:
    { 
      IStrategoTerm p_12003 = null;
      p_12003 = term;
      IStrategoTerm term2925 = term;
      Success2891:
      { 
        Fail5157:
        { 
          IStrategoTerm s_12003 = null;
          IStrategoTerm t_12003 = null;
          IStrategoTerm u_12003 = null;
          IStrategoTerm t_12159 = null;
          IStrategoTerm y_12159 = null;
          IStrategoTerm v_12159 = null;
          term = index_boolean_globals_uri_0_0.instance.invoke(context, m_12003);
          if(term == null)
            break Fail5157;
          term = termFactory.makeAppl(Main._consGlobal_1, new IStrategoTerm[]{term});
          t_12003 = term;
          u_12003 = trans.const980;
          s_12003 = u_12003;
          y_12159 = t_12003;
          t_12159 = s_12003;
          term = y_12159;
          v_12159 = y_12159;
          term = context.invokePrimitive("LANG_index_remove", v_12159, NO_STRATEGIES, new IStrategoTerm[]{term, t_12159});
          if(term == null)
            break Fail5157;
          if(true)
            break Success2891;
        }
        term = term2925;
        IStrategoTerm n_12003 = null;
        IStrategoTerm o_12003 = null;
        IStrategoTerm x_12003 = null;
        n_12003 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5156;
        o_12003 = term;
        x_12003 = n_12003;
        term = report_with_failure_0_2.instance.invoke(context, x_12003, trans.const992, o_12003);
        if(term == null)
          break Fail5156;
      }
      term = p_12003;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}