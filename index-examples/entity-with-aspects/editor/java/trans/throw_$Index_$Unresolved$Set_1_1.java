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

@SuppressWarnings("all") public class throw_$Index_$Unresolved$Set_1_1 extends Strategy 
{ 
  public static throw_$Index_$Unresolved$Set_1_1 instance = new throw_$Index_$Unresolved$Set_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_12046, IStrategoTerm e_12046)
  { 
    context.push("throw_Index_UnresolvedSet_1_1");
    Fail5485:
    { 
      IStrategoTerm h_12046 = null;
      h_12046 = term;
      term = dr_throw_1_2.instance.invoke(context, h_12046, f_12046, e_12046, trans.const935);
      if(term == null)
        break Fail5485;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}