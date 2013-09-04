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

@SuppressWarnings("all") public class bigfold_$Index_$Read$Set_1_0 extends Strategy 
{ 
  public static bigfold_$Index_$Read$Set_1_0 instance = new bigfold_$Index_$Read$Set_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_2179)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Index_ReadSet_1_0");
    Fail2564:
    { 
      IStrategoTerm x_2179 = null;
      IStrategoTerm z_2179 = null;
      z_2179 = term;
      Success1478:
      { 
        Fail2565:
        { 
          IStrategoTerm a_2180 = null;
          IStrategoTerm c_2180 = null;
          IStrategoTerm d_2180 = null;
          c_2180 = term;
          a_2180 = trans.const402;
          d_2180 = c_2180;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_2180, a_2180, trans.constCons118);
          if(term == null)
            break Fail2565;
          if(true)
            break Success1478;
        }
        term = trans.constNil1;
      }
      x_2179 = term;
      term = z_2179;
      term = termFactory.makeTuple(x_2179, term);
      term = w_2179.invoke(context, term, lifted565.instance);
      if(term == null)
        break Fail2564;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}