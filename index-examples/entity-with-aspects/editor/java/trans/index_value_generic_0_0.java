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

@SuppressWarnings("all") public class index_value_generic_0_0 extends Strategy 
{ 
  public static index_value_generic_0_0 instance = new index_value_generic_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5183:
    { 
      IStrategoTerm q_12006 = null;
      IStrategoTerm args38 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      term = args38;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail5183;
      IStrategoTerm arg1633 = ((IStrategoList)term).tail();
      if(arg1633.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1633).isEmpty())
        break Fail5183;
      q_12006 = ((IStrategoList)arg1633).head();
      term = q_12006;
      if(true)
        return term;
    }
    context.push("index_value_generic_0_0");
    context.popOnFailure();
    return null;
  }
}