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
    Fail2594:
    { 
      IStrategoTerm b_2185 = null;
      IStrategoTerm d_2185 = null;
      d_2185 = term;
      Success1487:
      { 
        Fail2595:
        { 
          IStrategoTerm e_2185 = null;
          IStrategoTerm g_2185 = null;
          IStrategoTerm h_2185 = null;
          g_2185 = term;
          e_2185 = trans.const415;
          h_2185 = g_2185;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_2185, e_2185, trans.constCons118);
          if(term == null)
            break Fail2595;
          if(true)
            break Success1487;
        }
        term = trans.constNil1;
      }
      b_2185 = term;
      term = d_2185;
      term = termFactory.makeTuple(b_2185, term);
      term = foldl_1_0.instance.invoke(context, term, lifted576.instance);
      if(term == null)
        break Fail2594;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}