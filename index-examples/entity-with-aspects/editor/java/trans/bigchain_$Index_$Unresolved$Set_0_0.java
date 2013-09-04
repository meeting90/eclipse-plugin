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

@SuppressWarnings("all") public class bigchain_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static bigchain_$Index_$Unresolved$Set_0_0 instance = new bigchain_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Index_UnresolvedSet_0_0");
    Fail5496:
    { 
      IStrategoTerm w_12047 = null;
      IStrategoTerm y_12047 = null;
      y_12047 = term;
      Success3043:
      { 
        Fail5497:
        { 
          IStrategoTerm z_12047 = null;
          IStrategoTerm b_12048 = null;
          IStrategoTerm c_12048 = null;
          b_12048 = term;
          z_12047 = trans.const935;
          c_12048 = b_12048;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_12048, z_12047, trans.constCons250);
          if(term == null)
            break Fail5497;
          if(true)
            break Success3043;
        }
        term = trans.constNil3;
      }
      w_12047 = term;
      term = y_12047;
      term = termFactory.makeTuple(w_12047, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1176.instance);
      if(term == null)
        break Fail5496;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}