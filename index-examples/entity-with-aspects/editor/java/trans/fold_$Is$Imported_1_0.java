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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_2192)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail2643:
    { 
      IStrategoTerm v_2192 = null;
      IStrategoTerm z_2192 = null;
      IStrategoTerm b_2193 = null;
      v_2192 = term;
      b_2193 = term;
      Success1500:
      { 
        Fail2644:
        { 
          IStrategoTerm d_2193 = null;
          d_2193 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_2193, trans.const481, v_2192);
          if(term == null)
            break Fail2644;
          if(true)
            break Success1500;
        }
        term = trans.constNil1;
      }
      z_2192 = term;
      term = b_2193;
      term = termFactory.makeTuple(z_2192, term);
      term = y_2192.invoke(context, term, lifted592.instance);
      if(term == null)
        break Fail2643;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}