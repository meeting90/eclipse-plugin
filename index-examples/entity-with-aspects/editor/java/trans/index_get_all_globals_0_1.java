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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_12000)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_all_globals_0_1");
    Fail5143:
    { 
      IStrategoTerm k_12000 = null;
      IStrategoTerm n_12000 = null;
      n_12000 = term;
      IStrategoTerm term2918 = term;
      Success2884:
      { 
        Fail5144:
        { 
          term = index_globals_uri_0_0.instance.invoke(context, j_12000);
          if(term == null)
            break Fail5144;
          term = termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{term, trans.const882});
          term = indexlib_get_all_values_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5144;
          k_12000 = term;
          if(true)
            break Success2884;
        }
        term = term2918;
        IStrategoTerm l_12000 = null;
        IStrategoTerm m_12000 = null;
        IStrategoTerm r_12000 = null;
        l_12000 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5143;
        m_12000 = term;
        r_12000 = l_12000;
        term = report_with_failure_0_2.instance.invoke(context, r_12000, trans.const985, m_12000);
        if(term == null)
          break Fail5143;
      }
      term = n_12000;
      if(k_12000 == null)
        break Fail5143;
      term = k_12000;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}