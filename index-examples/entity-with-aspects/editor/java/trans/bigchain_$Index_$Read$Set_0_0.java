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

@SuppressWarnings("all") public class bigchain_$Index_$Read$Set_0_0 extends Strategy 
{ 
  public static bigchain_$Index_$Read$Set_0_0 instance = new bigchain_$Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_Index_ReadSet_0_0");
    Fail5470:
    { 
      IStrategoTerm p_12043 = null;
      IStrategoTerm r_12043 = null;
      r_12043 = term;
      Success3036:
      { 
        Fail5471:
        { 
          IStrategoTerm s_12043 = null;
          IStrategoTerm u_12043 = null;
          IStrategoTerm v_12043 = null;
          u_12043 = term;
          s_12043 = trans.const922;
          v_12043 = u_12043;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, v_12043, s_12043, trans.constCons250);
          if(term == null)
            break Fail5471;
          if(true)
            break Success3036;
        }
        term = trans.constNil3;
      }
      p_12043 = term;
      term = r_12043;
      term = termFactory.makeTuple(p_12043, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1167.instance);
      if(term == null)
        break Fail5470;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}