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

@SuppressWarnings("all") public class fold_$Index_$Unresolved$Set_1_0 extends Strategy 
{ 
  public static fold_$Index_$Unresolved$Set_1_0 instance = new fold_$Index_$Unresolved$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12047)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Index_UnresolvedSet_1_0");
    Fail5494:
    { 
      IStrategoTerm l_12047 = null;
      IStrategoTerm n_12047 = null;
      n_12047 = term;
      Success3042:
      { 
        Fail5495:
        { 
          IStrategoTerm o_12047 = null;
          IStrategoTerm q_12047 = null;
          IStrategoTerm r_12047 = null;
          q_12047 = term;
          o_12047 = trans.const935;
          r_12047 = q_12047;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_12047, o_12047, trans.constCons250);
          if(term == null)
            break Fail5495;
          if(true)
            break Success3042;
        }
        term = trans.constNil3;
      }
      l_12047 = term;
      term = n_12047;
      term = termFactory.makeTuple(l_12047, term);
      term = k_12047.invoke(context, term, lifted1175.instance);
      if(term == null)
        break Fail5494;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}