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

@SuppressWarnings("all") public class all_keys_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static all_keys_$Index_$Unresolved$Set_0_0 instance = new all_keys_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("all_keys_Index_UnresolvedSet_0_0");
    Fail5491:
    { 
      IStrategoTerm v_12046 = null;
      v_12046 = term;
      term = dr_all_keys_0_1.instance.invoke(context, v_12046, trans.const935);
      if(term == null)
        break Fail5491;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}