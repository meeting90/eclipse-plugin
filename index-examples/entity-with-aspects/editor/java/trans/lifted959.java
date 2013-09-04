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

@SuppressWarnings("all") final class lifted959 extends Strategy 
{ 
  public static final lifted959 instance = new lifted959();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5751:
    { 
      term = index_uri_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5751;
      term = termFactory.makeAppl(Main._consAdvice_2, new IStrategoTerm[]{term, trans.const882});
      term = index_get_all_values_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5751;
      if(true)
        return term;
    }
    return null;
  }
}