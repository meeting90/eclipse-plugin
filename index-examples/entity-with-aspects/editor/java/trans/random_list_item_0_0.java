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
    Fail1595:
    { 
      IStrategoTerm y_2038 = null;
      IStrategoTerm d_2039 = null;
      IStrategoTerm f_2039 = null;
      IStrategoTerm g_2039 = null;
      y_2038 = term;
      f_2039 = term;
      d_2039 = trans.const301;
      g_2039 = f_2039;
      term = length_0_0.instance.invoke(context, y_2038);
      if(term == null)
        break Fail1595;
      term = inc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1595;
      term = random_int_0_2.instance.invoke(context, g_2039, d_2039, term);
      if(term == null)
        break Fail1595;
      term = termFactory.makeTuple(term, y_2038);
      term = index_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1595;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}