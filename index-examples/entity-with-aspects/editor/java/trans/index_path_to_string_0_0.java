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
    Fail5168:
    { 
      IStrategoTerm c_12005 = null;
      IStrategoTerm d_12005 = null;
      IStrategoTerm g_12005 = null;
      c_12005 = term;
      g_12005 = term;
      IStrategoTerm term2929 = term;
      Success2895:
      { 
        Fail5169:
        { 
          IStrategoTerm i_12005 = null;
          term = take_until_1_0.instance.invoke(context, c_12005, lifted1117.instance);
          if(term == null)
            break Fail5169;
          term = reverse_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5169;
          i_12005 = term;
          term = separate_by_0_1.instance.invoke(context, i_12005, trans.const889);
          if(term == null)
            break Fail5169;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5169;
          d_12005 = term;
          if(true)
            break Success2895;
        }
        term = term2929;
        IStrategoTerm e_12005 = null;
        IStrategoTerm f_12005 = null;
        IStrategoTerm k_12005 = null;
        e_12005 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5168;
        f_12005 = term;
        k_12005 = e_12005;
        term = report_with_failure_0_2.instance.invoke(context, k_12005, trans.const994, f_12005);
        if(term == null)
          break Fail5168;
      }
      term = g_12005;
      if(d_12005 == null)
        break Fail5168;
      term = d_12005;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}