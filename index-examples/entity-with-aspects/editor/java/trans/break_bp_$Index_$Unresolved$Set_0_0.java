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

@SuppressWarnings("all") public class break_bp_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static break_bp_$Index_$Unresolved$Set_0_0 instance = new break_bp_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_bp_Index_UnresolvedSet_0_0");
    Fail2586:
    { 
      IStrategoTerm t_2183 = null;
      t_2183 = term;
      term = dr_break_bp_0_1.instance.invoke(context, t_2183, trans.const415);
      if(term == null)
        break Fail2586;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}