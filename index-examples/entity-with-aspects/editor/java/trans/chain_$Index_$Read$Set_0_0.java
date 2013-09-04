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

@SuppressWarnings("all") public class chain_$Index_$Read$Set_0_0 extends Strategy 
{ 
  public static chain_$Index_$Read$Set_0_0 instance = new chain_$Index_$Read$Set_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_Index_ReadSet_0_0");
    Fail5472:
    { 
      IStrategoTerm a_12044 = null;
      IStrategoTerm c_12044 = null;
      c_12044 = term;
      Success3037:
      { 
        Fail5473:
        { 
          IStrategoTerm d_12044 = null;
          IStrategoTerm f_12044 = null;
          IStrategoTerm g_12044 = null;
          f_12044 = term;
          d_12044 = trans.const922;
          g_12044 = f_12044;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_12044, d_12044, trans.constCons250);
          if(term == null)
            break Fail5473;
          if(true)
            break Success3037;
        }
        term = trans.constNil3;
      }
      a_12044 = term;
      term = c_12044;
      term = termFactory.makeTuple(a_12044, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1168.instance);
      if(term == null)
        break Fail5472;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}