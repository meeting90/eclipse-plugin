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

@SuppressWarnings("all") final class lifted553 extends Strategy 
{ 
  public static final lifted553 instance = new lifted553();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2702:
    { 
      IStrategoTerm term1447 = term;
      Success1506:
      { 
        Fail2703:
        { 
          term = index_uri_impl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2703;
          if(true)
            break Success1506;
        }
        term = term1447;
        IStrategoTerm h_2298 = null;
        IStrategoTerm args21 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args21;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail2702;
        h_2298 = ((IStrategoList)term).head();
        term = h_2298;
      }
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2702;
      if(true)
        return term;
    }
    return null;
  }
}