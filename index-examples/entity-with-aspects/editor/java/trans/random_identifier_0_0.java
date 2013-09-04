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

@SuppressWarnings("all") public class random_identifier_0_0 extends Strategy 
{ 
  public static random_identifier_0_0 instance = new random_identifier_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("random_identifier_0_0");
    Fail4491:
    { 
      IStrategoTerm h_11900 = null;
      IStrategoTerm j_11900 = null;
      IStrategoTerm k_11900 = null;
      term = new_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4491;
      j_11900 = term;
      h_11900 = trans.const828;
      k_11900 = j_11900;
      term = string_replace_0_2.instance.invoke(context, k_11900, h_11900, trans.const829);
      if(term == null)
        break Fail4491;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}