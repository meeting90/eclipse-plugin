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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_2137)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_add_global_0_1");
    Fail2243:
    { 
      IStrategoTerm a_2138 = null;
      IStrategoTerm d_2138 = null;
      a_2138 = term;
      d_2138 = term;
      IStrategoTerm term1363 = term;
      Success1329:
      { 
        Fail2244:
        { 
          IStrategoTerm g_2138 = null;
          IStrategoTerm h_2138 = null;
          IStrategoTerm i_2138 = null;
          IStrategoTerm g_2296 = null;
          IStrategoTerm l_2296 = null;
          IStrategoTerm i_2296 = null;
          term = index_globals_uri_0_0.instance.invoke(context, z_2137);
          if(term == null)
            break Fail2244;
          term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, a_2138});
          h_2138 = term;
          i_2138 = trans.const460;
          g_2138 = i_2138;
          l_2296 = h_2138;
          g_2296 = g_2138;
          term = l_2296;
          i_2296 = l_2296;
          term = context.invokePrimitive("LANG_index_add", i_2296, NO_STRATEGIES, new IStrategoTerm[]{term, g_2296});
          if(term == null)
            break Fail2244;
          if(true)
            break Success1329;
        }
        term = term1363;
        IStrategoTerm b_2138 = null;
        IStrategoTerm c_2138 = null;
        IStrategoTerm l_2138 = null;
        b_2138 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2243;
        c_2138 = term;
        l_2138 = b_2138;
        term = report_with_failure_0_2.instance.invoke(context, l_2138, trans.const466, c_2138);
        if(term == null)
          break Fail2243;
      }
      term = d_2138;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}