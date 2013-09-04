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

@SuppressWarnings("all") public class random_list_item_0_0 extends Strategy 
{ 
  public static random_list_item_0_0 instance = new random_list_item_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("random_list_item_0_0");
    Fail4497:
    { 
      IStrategoTerm t_11901 = null;
      IStrategoTerm y_11901 = null;
      IStrategoTerm a_11902 = null;
      IStrategoTerm b_11902 = null;
      t_11901 = term;
      a_11902 = term;
      y_11901 = trans.const821;
      b_11902 = a_11902;
      term = length_0_0.instance.invoke(context, t_11901);
      if(term == null)
        break Fail4497;
      term = inc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4497;
      term = random_int_0_2.instance.invoke(context, b_11902, y_11901, term);
      if(term == null)
        break Fail4497;
      term = termFactory.makeTuple(term, t_11901);
      term = index_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4497;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}