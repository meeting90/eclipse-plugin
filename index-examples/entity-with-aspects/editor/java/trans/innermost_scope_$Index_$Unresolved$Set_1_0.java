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

@SuppressWarnings("all") public class innermost_scope_$Index_$Unresolved$Set_1_0 extends Strategy 
{ 
  public static innermost_scope_$Index_$Unresolved$Set_1_0 instance = new innermost_scope_$Index_$Unresolved$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_2183)
  { 
    context.push("innermost_scope_Index_UnresolvedSet_1_0");
    Fail2581:
    { 
      IStrategoTerm h_2183 = null;
      h_2183 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, h_2183, f_2183, trans.const415);
      if(term == null)
        break Fail2581;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}