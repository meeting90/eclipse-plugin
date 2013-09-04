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

@SuppressWarnings("all") public class continue_to_label_$Index_$Read$Set_0_1 extends Strategy 
{ 
  public static continue_to_label_$Index_$Read$Set_0_1 instance = new continue_to_label_$Index_$Read$Set_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_2179)
  { 
    context.push("continue_to_label_Index_ReadSet_0_1");
    Fail2558:
    { 
      IStrategoTerm i_2179 = null;
      i_2179 = term;
      term = dr_continue_0_2.instance.invoke(context, i_2179, trans.const402, g_2179);
      if(term == null)
        break Fail2558;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}