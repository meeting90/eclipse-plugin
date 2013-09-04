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

@SuppressWarnings("all") final class lifted1153 extends Strategy 
{ 
  public static final lifted1153 instance = new lifted1153();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail5604:
    { 
      IStrategoTerm term3003 = term;
      Success3062:
      { 
        Fail5605:
        { 
          term = index_uri_impl_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5605;
          if(true)
            break Success3062;
        }
        term = term3003;
        IStrategoTerm c_12161 = null;
        IStrategoTerm args43 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args43;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail5604;
        c_12161 = ((IStrategoList)term).head();
        term = c_12161;
      }
      term = index_uri_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5604;
      if(true)
        return term;
    }
    return null;
  }
}