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
    Fail1963:
    { 
      IStrategoTerm v_2090 = null;
      v_2090 = term;
      IStrategoTerm term1214 = term;
      Success1192:
      { 
        Fail1964:
        { 
          IStrategoTerm z_2090 = null;
          IStrategoTerm term1215 = term;
          Success1193:
          { 
            Fail1965:
            { 
              IStrategoTerm s_2090 = null;
              IStrategoTerm x_2090 = null;
              s_2090 = term;
              x_2090 = term;
              term = index_is_global_enabled_0_1.instance.invoke(context, x_2090, trans.const407);
              if(term == null)
                break Fail1965;
              term = s_2090;
              { 
                term = commit_and_compile_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1964;
                if(true)
                  break Success1193;
              }
            }
            term = term1215;
          }
          z_2090 = term;
          term = index_disable_global_0_1.instance.invoke(context, z_2090, trans.const406);
          if(term == null)
            break Fail1964;
          if(true)
            break Success1192;
        }
        term = term1214;
        IStrategoTerm t_2090 = null;
        IStrategoTerm u_2090 = null;
        IStrategoTerm b_2091 = null;
        t_2090 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1963;
        u_2090 = term;
        b_2091 = t_2090;
        term = report_with_failure_0_2.instance.invoke(context, b_2091, trans.const409, u_2090);
        if(term == null)
          break Fail1963;
      }
      term = v_2090;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}