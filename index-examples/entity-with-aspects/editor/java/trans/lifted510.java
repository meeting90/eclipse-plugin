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

@SuppressWarnings("all") final class lifted510 extends Strategy 
{ 
  TermReference z_2134;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2744:
    { 
      IStrategoTerm a_2135 = null;
      a_2135 = term;
      IStrategoTerm term1357 = term;
      Success1522:
      { 
        Fail2745:
        { 
          IStrategoTerm r_2295 = null;
          IStrategoTerm w_2295 = null;
          IStrategoTerm t_2295 = null;
          w_2295 = term;
          if(z_2134.value == null)
            break Fail2745;
          r_2295 = z_2134.value;
          term = w_2295;
          t_2295 = w_2295;
          term = context.invokePrimitive("LANG_index_remove", t_2295, NO_STRATEGIES, new IStrategoTerm[]{term, r_2295});
          if(term == null)
            break Fail2745;
          if(true)
            break Success1522;
        }
        term = term1357;
        TermReference b_2135 = new TermReference();
        if(b_2135.value == null)
          b_2135.value = term;
        else
          if(b_2135.value != term && !b_2135.value.match(term))
            break Fail2744;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2744;
        lifted511 lifted5110 = new lifted511();
        lifted5110.b_2135 = b_2135;
        term = report_failure_1_0.instance.invoke(context, term, lifted5110);
        if(term == null)
          break Fail2744;
      }
      term = a_2135;
      if(true)
        return term;
    }
    return null;
  }
}