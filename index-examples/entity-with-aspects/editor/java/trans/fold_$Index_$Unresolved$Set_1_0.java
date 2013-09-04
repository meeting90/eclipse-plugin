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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_2184)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Index_UnresolvedSet_1_0");
    Fail2592:
    { 
      IStrategoTerm q_2184 = null;
      IStrategoTerm s_2184 = null;
      s_2184 = term;
      Success1486:
      { 
        Fail2593:
        { 
          IStrategoTerm t_2184 = null;
          IStrategoTerm v_2184 = null;
          IStrategoTerm w_2184 = null;
          v_2184 = term;
          t_2184 = trans.const415;
          w_2184 = v_2184;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_2184, t_2184, trans.constCons118);
          if(term == null)
            break Fail2593;
          if(true)
            break Success1486;
        }
        term = trans.constNil1;
      }
      q_2184 = term;
      term = s_2184;
      term = termFactory.makeTuple(q_2184, term);
      term = p_2184.invoke(context, term, lifted575.instance);
      if(term == null)
        break Fail2592;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}