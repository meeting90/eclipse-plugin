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

@SuppressWarnings("all") final class lifted508 extends Strategy 
{ 
  TermReference n_2134;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2747:
    { 
      IStrategoTerm o_2134 = null;
      o_2134 = term;
      IStrategoTerm term1356 = term;
      Success1523:
      { 
        Fail2748:
        { 
          IStrategoTerm l_2295 = null;
          IStrategoTerm q_2295 = null;
          IStrategoTerm n_2295 = null;
          q_2295 = term;
          if(n_2134.value == null)
            break Fail2748;
          l_2295 = n_2134.value;
          term = q_2295;
          n_2295 = q_2295;
          term = context.invokePrimitive("LANG_index_add", n_2295, NO_STRATEGIES, new IStrategoTerm[]{term, l_2295});
          if(term == null)
            break Fail2748;
          if(true)
            break Success1523;
        }
        term = term1356;
        TermReference p_2134 = new TermReference();
        if(p_2134.value == null)
          p_2134.value = term;
        else
          if(p_2134.value != term && !p_2134.value.match(term))
            break Fail2747;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2747;
        lifted509 lifted5090 = new lifted509();
        lifted5090.p_2134 = p_2134;
        term = report_failure_1_0.instance.invoke(context, term, lifted5090);
        if(term == null)
          break Fail2747;
      }
      term = o_2134;
      if(true)
        return term;
    }
    return null;
  }
}