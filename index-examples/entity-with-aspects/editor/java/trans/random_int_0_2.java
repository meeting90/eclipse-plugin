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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_11899, IStrategoTerm s_11899)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("random_int_0_2");
    Fail4489:
    { 
      IStrategoTerm x_11899 = null;
      IStrategoTerm z_11899 = null;
      z_11899 = term;
      term = inc_0_0.instance.invoke(context, r_11899);
      if(term == null)
        break Fail4489;
      term = termFactory.makeTuple(s_11899, term);
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      x_11899 = term;
      term = z_11899;
      term = next_random_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      term = abs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      term = termFactory.makeTuple(term, trans.const826);
      term = divr_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      term = termFactory.makeTuple(x_11899, term);
      term = mul_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      term = termFactory.makeTuple(term, r_11899);
      term = add_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      term = termFactory.makeTuple(term, trans.const827);
      term = add_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      term = int_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4489;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}