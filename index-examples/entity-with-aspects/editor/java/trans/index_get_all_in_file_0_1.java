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

@SuppressWarnings("all") public class index_get_all_in_file_0_1 extends Strategy 
{ 
  public static index_get_all_in_file_0_1 instance = new index_get_all_in_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_11998)
  { 
    TermReference t_11998 = new TermReference(ref_t_11998);
    context.push("index_get_all_in_file_0_1");
    Fail5130:
    { 
      IStrategoTerm u_11998 = null;
      IStrategoTerm v_11998 = null;
      IStrategoTerm z_11998 = null;
      u_11998 = term;
      z_11998 = term;
      IStrategoTerm term2915 = term;
      Success2881:
      { 
        Fail5131:
        { 
          term = context.invokePrimitive("LANG_index_get_all_in_file", term, NO_STRATEGIES, new IStrategoTerm[]{u_11998});
          if(term == null)
            break Fail5131;
          v_11998 = term;
          lifted1112 lifted11120 = new lifted1112();
          lifted11120.t_11998 = t_11998;
          term = filter_1_0.instance.invoke(context, term, lifted11120);
          if(term == null)
            break Fail5131;
          if(true)
            break Success2881;
        }
        term = term2915;
        IStrategoTerm x_11998 = null;
        IStrategoTerm y_11998 = null;
        IStrategoTerm d_11999 = null;
        x_11998 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5130;
        y_11998 = term;
        d_11999 = x_11998;
        term = report_with_failure_0_2.instance.invoke(context, d_11999, trans.const979, y_11998);
        if(term == null)
          break Fail5130;
      }
      term = z_11998;
      if(v_11998 == null)
        break Fail5130;
      term = v_11998;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}