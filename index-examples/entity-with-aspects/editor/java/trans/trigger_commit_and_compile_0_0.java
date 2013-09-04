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

@SuppressWarnings("all") public class trigger_commit_and_compile_0_0 extends Strategy 
{ 
  public static trigger_commit_and_compile_0_0 instance = new trigger_commit_and_compile_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("trigger_commit_and_compile_0_0");
    Fail1958:
    { 
      IStrategoTerm e_2090 = null;
      e_2090 = term;
      IStrategoTerm term1211 = term;
      Success1189:
      { 
        Fail1959:
        { 
          IStrategoTerm term1212 = term;
          Success1190:
          { 
            Fail1960:
            { 
              IStrategoTerm b_2090 = null;
              b_2090 = term;
              IStrategoTerm term1213 = term;
              Success1191:
              { 
                Fail1961:
                { 
                  IStrategoTerm g_2090 = null;
                  g_2090 = term;
                  term = index_is_global_enabled_0_1.instance.invoke(context, g_2090, trans.const406);
                  if(term == null)
                    break Fail1961;
                  { 
                    if(true)
                      break Fail1960;
                    if(true)
                      break Success1191;
                  }
                }
                term = term1213;
              }
              term = b_2090;
              { 
                term = commit_and_compile_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail1959;
                if(true)
                  break Success1190;
              }
            }
            term = term1212;
            IStrategoTerm i_2090 = null;
            i_2090 = term;
            term = index_enable_global_0_1.instance.invoke(context, i_2090, trans.const407);
            if(term == null)
              break Fail1959;
          }
          if(true)
            break Success1189;
        }
        term = term1211;
        IStrategoTerm c_2090 = null;
        IStrategoTerm d_2090 = null;
        IStrategoTerm k_2090 = null;
        c_2090 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1958;
        d_2090 = term;
        k_2090 = c_2090;
        term = report_with_failure_0_2.instance.invoke(context, k_2090, trans.const408, d_2090);
        if(term == null)
          break Fail1958;
      }
      term = e_2090;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}