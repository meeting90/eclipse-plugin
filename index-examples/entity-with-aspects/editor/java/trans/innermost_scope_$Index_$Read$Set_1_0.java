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

@SuppressWarnings("all") public class innermost_scope_$Index_$Read$Set_1_0 extends Strategy 
{ 
  public static innermost_scope_$Index_$Read$Set_1_0 instance = new innermost_scope_$Index_$Read$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_12041)
  { 
    context.push("innermost_scope_Index_ReadSet_1_0");
    Fail5453:
    { 
      IStrategoTerm n_12041 = null;
      n_12041 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, n_12041, l_12041, trans.const922);
      if(term == null)
        break Fail5453;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}