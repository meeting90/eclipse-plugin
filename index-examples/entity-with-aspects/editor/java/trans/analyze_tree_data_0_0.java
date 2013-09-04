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
    Fail4924:
    { 
      IStrategoTerm t_11967 = null;
      TermReference u_11967 = new TermReference();
      t_11967 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4924;
      if(u_11967.value == null)
        u_11967.value = term;
      else
        if(u_11967.value != term && !u_11967.value.match(term))
          break Fail4924;
      term = t_11967;
      lifted1015 lifted10150 = new lifted1015();
      lifted10150.u_11967 = u_11967;
      term = topdown_1_0.instance.invoke(context, term, lifted10150);
      if(term == null)
        break Fail4924;
      if(u_11967.value == null)
        break Fail4924;
      term = iset_elements_0_0.instance.invoke(context, u_11967.value);
      if(term == null)
        break Fail4924;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}