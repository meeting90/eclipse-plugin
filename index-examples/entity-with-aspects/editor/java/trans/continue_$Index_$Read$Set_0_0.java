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

@SuppressWarnings("all") public class continue_$Index_$Read$Set_0_0 extends Strategy 
{ 
  public static continue_$Index_$Read$Set_0_0 instance = new continue_$Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("continue_Index_ReadSet_0_0");
    Fail2559:
    { 
      IStrategoTerm k_2179 = null;
      k_2179 = term;
      term = dr_continue_0_1.instance.invoke(context, k_2179, trans.const402);
      if(term == null)
        break Fail2559;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}