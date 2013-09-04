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

@SuppressWarnings("all") public class chain_$Index_$Unresolved$Set_0_0 extends Strategy 
{ 
  public static chain_$Index_$Unresolved$Set_0_0 instance = new chain_$Index_$Unresolved$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Index_UnresolvedSet_0_0");
    Fail5498:
    { 
      IStrategoTerm h_12048 = null;
      IStrategoTerm j_12048 = null;
      j_12048 = term;
      Success3044:
      { 
        Fail5499:
        { 
          IStrategoTerm k_12048 = null;
          IStrategoTerm m_12048 = null;
          IStrategoTerm n_12048 = null;
          m_12048 = term;
          k_12048 = trans.const935;
          n_12048 = m_12048;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_12048, k_12048, trans.constCons250);
          if(term == null)
            break Fail5499;
          if(true)
            break Success3044;
        }
        term = trans.constNil3;
      }
      h_12048 = term;
      term = j_12048;
      term = termFactory.makeTuple(h_12048, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1177.instance);
      if(term == null)
        break Fail5498;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}