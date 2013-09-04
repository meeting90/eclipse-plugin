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
    Fail2281:
    { 
      IStrategoTerm v_2143 = null;
      IStrategoTerm args16 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
      term = args16;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2281;
      IStrategoTerm arg779 = ((IStrategoList)term).tail();
      if(arg779.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg779).isEmpty())
        break Fail2281;
      v_2143 = ((IStrategoList)arg779).head();
      term = v_2143;
      if(true)
        return term;
    }
    context.push("index_value_generic_0_0");
    context.popOnFailure();
    return null;
  }
}