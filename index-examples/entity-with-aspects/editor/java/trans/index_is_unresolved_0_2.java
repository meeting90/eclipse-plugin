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

@SuppressWarnings("all") public class index_is_unresolved_0_2 extends Strategy 
{ 
  public static index_is_unresolved_0_2 instance = new index_is_unresolved_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_11983, IStrategoTerm d_11983)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_is_unresolved_0_2");
    Fail5022:
    { 
      IStrategoTerm f_11983 = null;
      term = $Index_$Unresolved$Set_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5022;
      f_11983 = term;
      term = termFactory.makeTuple(c_11983, d_11983);
      term = iset_contains_0_1.instance.invoke(context, f_11983, term);
      if(term == null)
        break Fail5022;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}