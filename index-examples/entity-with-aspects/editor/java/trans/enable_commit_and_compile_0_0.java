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

@SuppressWarnings("all") public class enable_commit_and_compile_0_0 extends Strategy 
{ 
  public static enable_commit_and_compile_0_0 instance = new enable_commit_and_compile_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("enable_commit_and_compile_0_0");
    Fail4865:
    { 
      IStrategoTerm q_11953 = null;
      q_11953 = term;
      IStrategoTerm term2770 = term;
      Success2748:
      { 
        Fail4866:
        { 
          IStrategoTerm u_11953 = null;
          IStrategoTerm term2771 = term;
          Success2749:
          { 
            Fail4867:
            { 
              IStrategoTerm n_11953 = null;
              IStrategoTerm s_11953 = null;
              n_11953 = term;
              s_11953 = term;
              term = index_is_global_enabled_0_1.instance.invoke(context, s_11953, trans.const927);
              if(term == null)
                break Fail4867;
              term = n_11953;
              { 
                term = commit_and_compile_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail4866;
                if(true)
                  break Success2749;
              }
            }
            term = term2771;
          }
          u_11953 = term;
          term = index_disable_global_0_1.instance.invoke(context, u_11953, trans.const926);
          if(term == null)
            break Fail4866;
          if(true)
            break Success2748;
        }
        term = term2770;
        IStrategoTerm o_11953 = null;
        IStrategoTerm p_11953 = null;
        IStrategoTerm w_11953 = null;
        o_11953 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4865;
        p_11953 = term;
        w_11953 = o_11953;
        term = report_with_failure_0_2.instance.invoke(context, w_11953, trans.const929, p_11953);
        if(term == null)
          break Fail4865;
      }
      term = q_11953;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}