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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_12042)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Index_ReadSet_1_0");
    Fail5466:
    { 
      IStrategoTerm s_12042 = null;
      IStrategoTerm u_12042 = null;
      u_12042 = term;
      Success3034:
      { 
        Fail5467:
        { 
          IStrategoTerm v_12042 = null;
          IStrategoTerm x_12042 = null;
          IStrategoTerm y_12042 = null;
          x_12042 = term;
          v_12042 = trans.const922;
          y_12042 = x_12042;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_12042, v_12042, trans.constCons250);
          if(term == null)
            break Fail5467;
          if(true)
            break Success3034;
        }
        term = trans.constNil3;
      }
      s_12042 = term;
      term = u_12042;
      term = termFactory.makeTuple(s_12042, term);
      term = r_12042.invoke(context, term, lifted1165.instance);
      if(term == null)
        break Fail5466;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}