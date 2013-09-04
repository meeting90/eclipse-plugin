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
    Fail4763:
    { 
      IStrategoTerm r_11938 = null;
      IStrategoTerm s_11938 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail4763;
      s_11938 = term.getSubterm(0);
      r_11938 = term.getSubterm(1);
      term = termFactory.makeTuple(r_11938, s_11938);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4763;
      term = s_11938;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}