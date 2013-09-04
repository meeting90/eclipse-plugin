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

@SuppressWarnings("all") final class lifted1110 extends Strategy 
{ 
  TermReference u_11997;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5646:
    { 
      IStrategoTerm v_11997 = null;
      v_11997 = term;
      IStrategoTerm term2913 = term;
      Success3078:
      { 
        Fail5647:
        { 
          IStrategoTerm m_12158 = null;
          IStrategoTerm r_12158 = null;
          IStrategoTerm o_12158 = null;
          r_12158 = term;
          if(u_11997.value == null)
            break Fail5647;
          m_12158 = u_11997.value;
          term = r_12158;
          o_12158 = r_12158;
          term = context.invokePrimitive("LANG_index_remove", o_12158, NO_STRATEGIES, new IStrategoTerm[]{term, m_12158});
          if(term == null)
            break Fail5647;
          if(true)
            break Success3078;
        }
        term = term2913;
        TermReference w_11997 = new TermReference();
        if(w_11997.value == null)
          w_11997.value = term;
        else
          if(w_11997.value != term && !w_11997.value.match(term))
            break Fail5646;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5646;
        lifted1111 lifted11110 = new lifted1111();
        lifted11110.w_11997 = w_11997;
        term = report_failure_1_0.instance.invoke(context, term, lifted11110);
        if(term == null)
          break Fail5646;
      }
      term = v_11997;
      if(true)
        return term;
    }
    return null;
  }
}