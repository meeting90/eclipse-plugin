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
    Fail2207:
    { 
      IStrategoTerm z_2132 = null;
      IStrategoTerm a_2133 = null;
      IStrategoTerm b_2133 = null;
      IStrategoTerm c_2133 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2207;
      z_2132 = term.getSubterm(0);
      a_2133 = term.getSubterm(1);
      b_2133 = term;
      term = index_key_unwrap_0_0.instance.invoke(context, z_2132);
      if(term == null)
        break Fail2207;
      c_2133 = term;
      term = index_key_unwrap_0_0.instance.invoke(context, a_2133);
      if(term == null)
        break Fail2207;
      term = termFactory.makeTuple(c_2133, term);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2207;
      term = b_2133;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}