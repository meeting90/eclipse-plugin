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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_2140)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_disable_global_0_1");
    Fail2254:
    { 
      IStrategoTerm u_2140 = null;
      u_2140 = term;
      IStrategoTerm term1369 = term;
      Success1335:
      { 
        Fail2255:
        { 
          IStrategoTerm x_2140 = null;
          IStrategoTerm y_2140 = null;
          IStrategoTerm z_2140 = null;
          IStrategoTerm y_2296 = null;
          IStrategoTerm d_2297 = null;
          IStrategoTerm a_2297 = null;
          term = index_boolean_globals_uri_0_0.instance.invoke(context, r_2140);
          if(term == null)
            break Fail2255;
          term = termFactory.makeAppl(Main._consGlobal_1, new IStrategoTerm[]{term});
          y_2140 = term;
          z_2140 = trans.const460;
          x_2140 = z_2140;
          d_2297 = y_2140;
          y_2296 = x_2140;
          term = d_2297;
          a_2297 = d_2297;
          term = context.invokePrimitive("LANG_index_remove", a_2297, NO_STRATEGIES, new IStrategoTerm[]{term, y_2296});
          if(term == null)
            break Fail2255;
          if(true)
            break Success1335;
        }
        term = term1369;
        IStrategoTerm s_2140 = null;
        IStrategoTerm t_2140 = null;
        IStrategoTerm c_2141 = null;
        s_2140 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2254;
        t_2140 = term;
        c_2141 = s_2140;
        term = report_with_failure_0_2.instance.invoke(context, c_2141, trans.const472, t_2140);
        if(term == null)
          break Fail2254;
      }
      term = u_2140;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}