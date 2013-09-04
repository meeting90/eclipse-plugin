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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_2180)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Index_ReadSet_1_0");
    Fail2566:
    { 
      IStrategoTerm j_2180 = null;
      IStrategoTerm l_2180 = null;
      l_2180 = term;
      Success1479:
      { 
        Fail2567:
        { 
          IStrategoTerm m_2180 = null;
          IStrategoTerm o_2180 = null;
          IStrategoTerm p_2180 = null;
          o_2180 = term;
          m_2180 = trans.const402;
          p_2180 = o_2180;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_2180, m_2180, trans.constCons118);
          if(term == null)
            break Fail2567;
          if(true)
            break Success1479;
        }
        term = trans.constNil1;
      }
      j_2180 = term;
      term = l_2180;
      term = termFactory.makeTuple(j_2180, term);
      term = i_2180.invoke(context, term, lifted566.instance);
      if(term == null)
        break Fail2566;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}