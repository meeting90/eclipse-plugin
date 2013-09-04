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

@SuppressWarnings("all") public class analyze_tree_data_0_0 extends Strategy 
{ 
  public static analyze_tree_data_0_0 instance = new analyze_tree_data_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("analyze_tree_data_0_0");
    Fail2022:
    { 
      IStrategoTerm y_2104 = null;
      TermReference z_2104 = new TermReference();
      y_2104 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2022;
      if(z_2104.value == null)
        z_2104.value = term;
      else
        if(z_2104.value != term && !z_2104.value.match(term))
          break Fail2022;
      term = y_2104;
      lifted415 lifted4150 = new lifted415();
      lifted4150.z_2104 = z_2104;
      term = topdown_1_0.instance.invoke(context, term, lifted4150);
      if(term == null)
        break Fail2022;
      if(z_2104.value == null)
        break Fail2022;
      term = iset_elements_0_0.instance.invoke(context, z_2104.value);
      if(term == null)
        break Fail2022;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}