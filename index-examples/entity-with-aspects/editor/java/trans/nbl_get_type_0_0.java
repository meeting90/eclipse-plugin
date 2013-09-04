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

@SuppressWarnings("all") public class nbl_get_type_0_0 extends Strategy 
{ 
  public static nbl_get_type_0_0 instance = new nbl_get_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("nbl_get_type_0_0");
    Fail4834:
    { 
      IStrategoTerm u_11947 = null;
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{term});
      u_11947 = term;
      term = index_get_data_0_1.instance.invoke(context, u_11947, trans.constType0);
      if(term == null)
        break Fail4834;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}