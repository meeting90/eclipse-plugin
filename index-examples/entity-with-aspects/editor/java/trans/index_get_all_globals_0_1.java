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

@SuppressWarnings("all") public class index_get_all_globals_0_1 extends Strategy 
{ 
  public static index_get_all_globals_0_1 instance = new index_get_all_globals_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_2137)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_all_globals_0_1");
    Fail2241:
    { 
      IStrategoTerm p_2137 = null;
      IStrategoTerm s_2137 = null;
      s_2137 = term;
      IStrategoTerm term1362 = term;
      Success1328:
      { 
        Fail2242:
        { 
          term = index_globals_uri_0_0.instance.invoke(context, o_2137);
          if(term == null)
            break Fail2242;
          term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, trans.const362});
          term = indexlib_get_all_values_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2242;
          p_2137 = term;
          if(true)
            break Success1328;
        }
        term = term1362;
        IStrategoTerm q_2137 = null;
        IStrategoTerm r_2137 = null;
        IStrategoTerm w_2137 = null;
        q_2137 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2241;
        r_2137 = term;
        w_2137 = q_2137;
        term = report_with_failure_0_2.instance.invoke(context, w_2137, trans.const465, r_2137);
        if(term == null)
          break Fail2241;
      }
      term = s_2137;
      if(p_2137 == null)
        break Fail2241;
      term = p_2137;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}