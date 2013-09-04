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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_2135)
  { 
    TermReference y_2135 = new TermReference(ref_y_2135);
    context.push("index_get_all_in_file_0_1");
    Fail2228:
    { 
      IStrategoTerm z_2135 = null;
      IStrategoTerm a_2136 = null;
      IStrategoTerm e_2136 = null;
      z_2135 = term;
      e_2136 = term;
      IStrategoTerm term1359 = term;
      Success1325:
      { 
        Fail2229:
        { 
          term = context.invokePrimitive("LANG_index_get_all_in_file", term, NO_STRATEGIES, new IStrategoTerm[]{z_2135});
          if(term == null)
            break Fail2229;
          a_2136 = term;
          lifted512 lifted5120 = new lifted512();
          lifted5120.y_2135 = y_2135;
          term = filter_1_0.instance.invoke(context, term, lifted5120);
          if(term == null)
            break Fail2229;
          if(true)
            break Success1325;
        }
        term = term1359;
        IStrategoTerm c_2136 = null;
        IStrategoTerm d_2136 = null;
        IStrategoTerm i_2136 = null;
        c_2136 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2228;
        d_2136 = term;
        i_2136 = c_2136;
        term = report_with_failure_0_2.instance.invoke(context, i_2136, trans.const459, d_2136);
        if(term == null)
          break Fail2228;
      }
      term = e_2136;
      if(a_2136 == null)
        break Fail2228;
      term = a_2136;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}