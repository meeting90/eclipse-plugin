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

@SuppressWarnings("all") public class index_key_eq_0_0 extends Strategy 
{ 
  public static index_key_eq_0_0 instance = new index_key_eq_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_key_eq_0_0");
    Fail5109:
    { 
      IStrategoTerm u_11995 = null;
      IStrategoTerm v_11995 = null;
      IStrategoTerm w_11995 = null;
      IStrategoTerm x_11995 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5109;
      u_11995 = term.getSubterm(0);
      v_11995 = term.getSubterm(1);
      w_11995 = term;
      term = index_key_unwrap_0_0.instance.invoke(context, u_11995);
      if(term == null)
        break Fail5109;
      x_11995 = term;
      term = index_key_unwrap_0_0.instance.invoke(context, v_11995);
      if(term == null)
        break Fail5109;
      term = termFactory.makeTuple(x_11995, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5109;
      term = w_11995;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}