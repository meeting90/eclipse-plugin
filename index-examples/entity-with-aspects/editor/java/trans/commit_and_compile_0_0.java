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

@SuppressWarnings("all") public class commit_and_compile_0_0 extends Strategy 
{ 
  public static commit_and_compile_0_0 instance = new commit_and_compile_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("commit_and_compile_0_0");
    Fail1955:
    { 
      IStrategoTerm s_2089 = null;
      s_2089 = term;
      IStrategoTerm term1209 = term;
      Success1187:
      { 
        Fail1956:
        { 
          term = index_commit_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1956;
          if(true)
            break Success1187;
        }
        term = term1209;
        IStrategoTerm o_2089 = null;
        IStrategoTerm p_2089 = null;
        IStrategoTerm u_2089 = null;
        o_2089 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1955;
        p_2089 = term;
        u_2089 = o_2089;
        term = report_with_failure_0_2.instance.invoke(context, u_2089, trans.const405, p_2089);
        if(term == null)
          break Fail1955;
      }
      term = s_2089;
      IStrategoTerm term1210 = term;
      Success1188:
      { 
        Fail1957:
        { 
          term = index_schedule_compilation_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail1957;
          if(true)
            break Success1188;
        }
        term = term1210;
        IStrategoTerm q_2089 = null;
        IStrategoTerm r_2089 = null;
        IStrategoTerm x_2089 = null;
        q_2089 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1955;
        r_2089 = term;
        x_2089 = q_2089;
        term = report_with_failure_0_2.instance.invoke(context, x_2089, trans.const405, r_2089);
        if(term == null)
          break Fail1955;
      }
      term = trans.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}