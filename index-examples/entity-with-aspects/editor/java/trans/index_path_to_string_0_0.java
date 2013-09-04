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

@SuppressWarnings("all") public class index_path_to_string_0_0 extends Strategy 
{ 
  public static index_path_to_string_0_0 instance = new index_path_to_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("index_path_to_string_0_0");
    Fail2266:
    { 
      IStrategoTerm h_2142 = null;
      IStrategoTerm i_2142 = null;
      IStrategoTerm l_2142 = null;
      h_2142 = term;
      l_2142 = term;
      IStrategoTerm term1373 = term;
      Success1339:
      { 
        Fail2267:
        { 
          IStrategoTerm n_2142 = null;
          term = take_until_1_0.instance.invoke(context, h_2142, lifted517.instance);
          if(term == null)
            break Fail2267;
          term = reverse_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2267;
          n_2142 = term;
          term = separate_by_0_1.instance.invoke(context, n_2142, trans.const369);
          if(term == null)
            break Fail2267;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2267;
          i_2142 = term;
          if(true)
            break Success1339;
        }
        term = term1373;
        IStrategoTerm j_2142 = null;
        IStrategoTerm k_2142 = null;
        IStrategoTerm p_2142 = null;
        j_2142 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2266;
        k_2142 = term;
        p_2142 = j_2142;
        term = report_with_failure_0_2.instance.invoke(context, p_2142, trans.const474, k_2142);
        if(term == null)
          break Fail2266;
      }
      term = l_2142;
      if(i_2142 == null)
        break Fail2266;
      term = i_2142;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}