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

@SuppressWarnings("all") public class fold_$Index_$Read$Set_1_0 extends Strategy 
{ 
  public static fold_$Index_$Read$Set_1_0 instance = new fold_$Index_$Read$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12043)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Index_ReadSet_1_0");
    Fail5468:
    { 
      IStrategoTerm e_12043 = null;
      IStrategoTerm g_12043 = null;
      g_12043 = term;
      Success3035:
      { 
        Fail5469:
        { 
          IStrategoTerm h_12043 = null;
          IStrategoTerm j_12043 = null;
          IStrategoTerm k_12043 = null;
          j_12043 = term;
          h_12043 = trans.const922;
          k_12043 = j_12043;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_12043, h_12043, trans.constCons250);
          if(term == null)
            break Fail5469;
          if(true)
            break Success3035;
        }
        term = trans.constNil3;
      }
      e_12043 = term;
      term = g_12043;
      term = termFactory.makeTuple(e_12043, term);
      term = d_12043.invoke(context, term, lifted1166.instance);
      if(term == null)
        break Fail5468;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}