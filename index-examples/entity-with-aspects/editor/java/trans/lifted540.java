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

@SuppressWarnings("all") final class lifted540 extends Strategy 
{ 
  TermReference v_2154;

  TermReference w_2154;

  TermReference x_2154;

  TermReference y_2154;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2710:
    { 
      if(x_2154.value == null)
        break Fail2710;
      term = collect_all_2_0.instance.invoke(context, x_2154.value, constraint_error_0_0.instance, conc_0_0.instance);
      if(term == null)
        break Fail2710;
      if(v_2154.value == null)
        v_2154.value = term;
      else
        if(v_2154.value != term && !v_2154.value.match(term))
          break Fail2710;
      if(x_2154.value == null)
        break Fail2710;
      term = collect_all_2_0.instance.invoke(context, x_2154.value, _Fail.instance, conc_0_0.instance);
      if(term == null)
        break Fail2710;
      if(w_2154.value == null)
        w_2154.value = term;
      else
        if(w_2154.value != term && !w_2154.value.match(term))
          break Fail2710;
      if(x_2154.value == null)
        break Fail2710;
      term = collect_all_2_0.instance.invoke(context, x_2154.value, _Fail.instance, conc_0_0.instance);
      if(term == null)
        break Fail2710;
      if(y_2154.value == null)
        y_2154.value = term;
      else
        if(y_2154.value != term && !y_2154.value.match(term))
          break Fail2710;
      if(true)
        return term;
    }
    return null;
  }
}