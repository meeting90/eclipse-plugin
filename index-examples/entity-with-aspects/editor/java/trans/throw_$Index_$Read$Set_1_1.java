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

@SuppressWarnings("all") public class throw_$Index_$Read$Set_1_1 extends Strategy 
{ 
  public static throw_$Index_$Read$Set_1_1 instance = new throw_$Index_$Read$Set_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_2179, IStrategoTerm c_2179)
  { 
    context.push("throw_Index_ReadSet_1_1");
    Fail2557:
    { 
      IStrategoTerm f_2179 = null;
      f_2179 = term;
      term = dr_throw_1_2.instance.invoke(context, f_2179, d_2179, c_2179, trans.const402);
      if(term == null)
        break Fail2557;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}