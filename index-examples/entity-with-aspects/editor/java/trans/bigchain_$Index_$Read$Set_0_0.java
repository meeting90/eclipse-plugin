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
    Fail2568:
    { 
      IStrategoTerm u_2180 = null;
      IStrategoTerm w_2180 = null;
      w_2180 = term;
      Success1480:
      { 
        Fail2569:
        { 
          IStrategoTerm x_2180 = null;
          IStrategoTerm z_2180 = null;
          IStrategoTerm a_2181 = null;
          z_2180 = term;
          x_2180 = trans.const402;
          a_2181 = z_2180;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_2181, x_2180, trans.constCons118);
          if(term == null)
            break Fail2569;
          if(true)
            break Success1480;
        }
        term = trans.constNil1;
      }
      u_2180 = term;
      term = w_2180;
      term = termFactory.makeTuple(u_2180, term);
      term = foldl_1_0.instance.invoke(context, term, lifted567.instance);
      if(term == null)
        break Fail2568;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}