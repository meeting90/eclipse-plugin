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

@SuppressWarnings("all") public class bigfold_$Index_$Unresolved$Set_1_0 extends Strategy 
{ 
  public static bigfold_$Index_$Unresolved$Set_1_0 instance = new bigfold_$Index_$Unresolved$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12046)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Index_UnresolvedSet_1_0");
    Fail5492:
    { 
      IStrategoTerm z_12046 = null;
      IStrategoTerm b_12047 = null;
      b_12047 = term;
      Success3041:
      { 
        Fail5493:
        { 
          IStrategoTerm c_12047 = null;
          IStrategoTerm e_12047 = null;
          IStrategoTerm f_12047 = null;
          e_12047 = term;
          c_12047 = trans.const935;
          f_12047 = e_12047;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, f_12047, c_12047, trans.constCons250);
          if(term == null)
            break Fail5493;
          if(true)
            break Success3041;
        }
        term = trans.constNil3;
      }
      z_12046 = term;
      term = b_12047;
      term = termFactory.makeTuple(z_12046, term);
      term = y_12046.invoke(context, term, lifted1174.instance);
      if(term == null)
        break Fail5492;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}