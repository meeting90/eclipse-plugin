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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_2120, IStrategoTerm i_2120)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_is_unresolved_0_2");
    Fail2120:
    { 
      IStrategoTerm k_2120 = null;
      term = $Index_$Unresolved$Set_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2120;
      k_2120 = term;
      term = termFactory.makeTuple(h_2120, i_2120);
      term = iset_contains_0_1.instance.invoke(context, k_2120, term);
      if(term == null)
        break Fail2120;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}