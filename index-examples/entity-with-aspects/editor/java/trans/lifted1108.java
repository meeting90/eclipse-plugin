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

@SuppressWarnings("all") final class lifted1108 extends Strategy 
{ 
  TermReference i_11997;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5649:
    { 
      IStrategoTerm j_11997 = null;
      j_11997 = term;
      IStrategoTerm term2912 = term;
      Success3079:
      { 
        Fail5650:
        { 
          IStrategoTerm g_12158 = null;
          IStrategoTerm l_12158 = null;
          IStrategoTerm i_12158 = null;
          l_12158 = term;
          if(i_11997.value == null)
            break Fail5650;
          g_12158 = i_11997.value;
          term = l_12158;
          i_12158 = l_12158;
          term = context.invokePrimitive("LANG_index_add", i_12158, NO_STRATEGIES, new IStrategoTerm[]{term, g_12158});
          if(term == null)
            break Fail5650;
          if(true)
            break Success3079;
        }
        term = term2912;
        TermReference k_11997 = new TermReference();
        if(k_11997.value == null)
          k_11997.value = term;
        else
          if(k_11997.value != term && !k_11997.value.match(term))
            break Fail5649;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5649;
        lifted1109 lifted11090 = new lifted1109();
        lifted11090.k_11997 = k_11997;
        term = report_failure_1_0.instance.invoke(context, term, lifted11090);
        if(term == null)
          break Fail5649;
      }
      term = j_11997;
      if(true)
        return term;
    }
    return null;
  }
}