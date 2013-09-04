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

@SuppressWarnings("all") final class lifted1140 extends Strategy 
{ 
  TermReference q_12017;

  TermReference r_12017;

  TermReference s_12017;

  TermReference t_12017;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5612:
    { 
      if(s_12017.value == null)
        break Fail5612;
      term = collect_all_2_0.instance.invoke(context, s_12017.value, constraint_error_0_0.instance, conc_0_0.instance);
      if(term == null)
        break Fail5612;
      if(q_12017.value == null)
        q_12017.value = term;
      else
        if(q_12017.value != term && !q_12017.value.match(term))
          break Fail5612;
      if(s_12017.value == null)
        break Fail5612;
      term = collect_all_2_0.instance.invoke(context, s_12017.value, _Fail.instance, conc_0_0.instance);
      if(term == null)
        break Fail5612;
      if(r_12017.value == null)
        r_12017.value = term;
      else
        if(r_12017.value != term && !r_12017.value.match(term))
          break Fail5612;
      if(s_12017.value == null)
        break Fail5612;
      term = collect_all_2_0.instance.invoke(context, s_12017.value, _Fail.instance, conc_0_0.instance);
      if(term == null)
        break Fail5612;
      if(t_12017.value == null)
        t_12017.value = term;
      else
        if(t_12017.value != term && !t_12017.value.match(term))
          break Fail5612;
      if(true)
        return term;
    }
    return null;
  }
}