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
    Fail2596:
    { 
      IStrategoTerm m_2185 = null;
      IStrategoTerm o_2185 = null;
      o_2185 = term;
      Success1488:
      { 
        Fail2597:
        { 
          IStrategoTerm p_2185 = null;
          IStrategoTerm r_2185 = null;
          IStrategoTerm s_2185 = null;
          r_2185 = term;
          p_2185 = trans.const415;
          s_2185 = r_2185;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_2185, p_2185, trans.constCons118);
          if(term == null)
            break Fail2597;
          if(true)
            break Success1488;
        }
        term = trans.constNil1;
      }
      m_2185 = term;
      term = o_2185;
      term = termFactory.makeTuple(m_2185, term);
      term = foldl_1_0.instance.invoke(context, term, lifted577.instance);
      if(term == null)
        break Fail2596;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}