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

@SuppressWarnings("all") public class random_int_0_2 extends Strategy 
{ 
  public static random_int_0_2 instance = new random_int_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_2036, IStrategoTerm x_2036)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("random_int_0_2");
    Fail1587:
    { 
      IStrategoTerm c_2037 = null;
      IStrategoTerm e_2037 = null;
      e_2037 = term;
      term = inc_0_0.instance.invoke(context, w_2036);
      if(term == null)
        break Fail1587;
      term = termFactory.makeTuple(x_2036, term);
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      c_2037 = term;
      term = e_2037;
      term = next_random_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      term = abs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      term = termFactory.makeTuple(term, trans.const306);
      term = divr_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      term = termFactory.makeTuple(c_2037, term);
      term = mul_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      term = termFactory.makeTuple(term, w_2036);
      term = add_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      term = termFactory.makeTuple(term, trans.const307);
      term = add_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      term = int_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1587;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}