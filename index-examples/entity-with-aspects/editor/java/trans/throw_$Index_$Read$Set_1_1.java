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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12041, IStrategoTerm x_12041)
  { 
    context.push("throw_Index_ReadSet_1_1");
    Fail5459:
    { 
      IStrategoTerm a_12042 = null;
      a_12042 = term;
      term = dr_throw_1_2.instance.invoke(context, a_12042, y_12041, x_12041, trans.const922);
      if(term == null)
        break Fail5459;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}