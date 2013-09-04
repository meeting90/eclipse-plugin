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

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_12055)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail5545:
    { 
      IStrategoTerm q_12055 = null;
      IStrategoTerm u_12055 = null;
      IStrategoTerm w_12055 = null;
      q_12055 = term;
      w_12055 = term;
      Success3056:
      { 
        Fail5546:
        { 
          IStrategoTerm y_12055 = null;
          y_12055 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_12055, trans.const1001, q_12055);
          if(term == null)
            break Fail5546;
          if(true)
            break Success3056;
        }
        term = trans.constNil3;
      }
      u_12055 = term;
      term = w_12055;
      term = termFactory.makeTuple(u_12055, term);
      term = t_12055.invoke(context, term, lifted1192.instance);
      if(term == null)
        break Fail5545;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}