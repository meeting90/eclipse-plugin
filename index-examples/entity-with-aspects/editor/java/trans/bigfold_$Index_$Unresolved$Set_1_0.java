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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_2184)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Index_UnresolvedSet_1_0");
    Fail2590:
    { 
      IStrategoTerm e_2184 = null;
      IStrategoTerm g_2184 = null;
      g_2184 = term;
      Success1485:
      { 
        Fail2591:
        { 
          IStrategoTerm h_2184 = null;
          IStrategoTerm j_2184 = null;
          IStrategoTerm k_2184 = null;
          j_2184 = term;
          h_2184 = trans.const415;
          k_2184 = j_2184;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, k_2184, h_2184, trans.constCons118);
          if(term == null)
            break Fail2591;
          if(true)
            break Success1485;
        }
        term = trans.constNil1;
      }
      e_2184 = term;
      term = g_2184;
      term = termFactory.makeTuple(e_2184, term);
      term = d_2184.invoke(context, term, lifted574.instance);
      if(term == null)
        break Fail2590;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}