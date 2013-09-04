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
    Fail2570:
    { 
      IStrategoTerm f_2181 = null;
      IStrategoTerm h_2181 = null;
      h_2181 = term;
      Success1481:
      { 
        Fail2571:
        { 
          IStrategoTerm i_2181 = null;
          IStrategoTerm k_2181 = null;
          IStrategoTerm l_2181 = null;
          k_2181 = term;
          i_2181 = trans.const402;
          l_2181 = k_2181;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_2181, i_2181, trans.constCons118);
          if(term == null)
            break Fail2571;
          if(true)
            break Success1481;
        }
        term = trans.constNil1;
      }
      f_2181 = term;
      term = h_2181;
      term = termFactory.makeTuple(f_2181, term);
      term = foldl_1_0.instance.invoke(context, term, lifted568.instance);
      if(term == null)
        break Fail2570;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}