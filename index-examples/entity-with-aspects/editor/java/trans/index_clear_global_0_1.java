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

@SuppressWarnings("all") public class index_clear_global_0_1 extends Strategy 
{ 
  public static index_clear_global_0_1 instance = new index_clear_global_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_12001)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_clear_global_0_1");
    Fail5149:
    { 
      IStrategoTerm z_12001 = null;
      z_12001 = term;
      IStrategoTerm term2921 = term;
      Success2887:
      { 
        Fail5150:
        { 
          IStrategoTerm c_12002 = null;
          IStrategoTerm d_12002 = null;
          IStrategoTerm e_12002 = null;
          IStrategoTerm h_12159 = null;
          IStrategoTerm m_12159 = null;
          IStrategoTerm j_12159 = null;
          term = index_globals_uri_0_0.instance.invoke(context, w_12001);
          if(term == null)
            break Fail5150;
          term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, trans.const882});
          d_12002 = term;
          e_12002 = trans.const980;
          c_12002 = e_12002;
          m_12159 = d_12002;
          h_12159 = c_12002;
          term = m_12159;
          j_12159 = m_12159;
          term = context.invokePrimitive("LANG_index_remove", j_12159, NO_STRATEGIES, new IStrategoTerm[]{term, h_12159});
          if(term == null)
            break Fail5150;
          if(true)
            break Success2887;
        }
        term = term2921;
        IStrategoTerm x_12001 = null;
        IStrategoTerm y_12001 = null;
        IStrategoTerm h_12002 = null;
        x_12001 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5149;
        y_12001 = term;
        h_12002 = x_12001;
        term = report_with_failure_0_2.instance.invoke(context, h_12002, trans.const988, y_12001);
        if(term == null)
          break Fail5149;
      }
      term = z_12001;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}