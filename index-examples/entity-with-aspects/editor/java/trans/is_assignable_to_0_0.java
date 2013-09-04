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

@SuppressWarnings("all") public class is_assignable_to_0_0 extends Strategy 
{ 
  public static is_assignable_to_0_0 instance = new is_assignable_to_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_assignable_to_0_0");
    Fail1861:
    { 
      IStrategoTerm w_2075 = null;
      IStrategoTerm x_2075 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail1861;
      x_2075 = term.getSubterm(0);
      w_2075 = term.getSubterm(1);
      term = termFactory.makeTuple(w_2075, x_2075);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail1861;
      term = x_2075;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}