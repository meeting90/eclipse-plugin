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

@SuppressWarnings("all") public class chain_$Is$Imported_0_0 extends Strategy 
{ 
  public static chain_$Is$Imported_0_0 instance = new chain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsImported_0_0");
    Fail5549:
    { 
      IStrategoTerm n_12056 = null;
      IStrategoTerm q_12056 = null;
      IStrategoTerm s_12056 = null;
      n_12056 = term;
      s_12056 = term;
      Success3058:
      { 
        Fail5550:
        { 
          IStrategoTerm u_12056 = null;
          u_12056 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_12056, trans.const1001, n_12056);
          if(term == null)
            break Fail5550;
          if(true)
            break Success3058;
        }
        term = trans.constNil3;
      }
      q_12056 = term;
      term = s_12056;
      term = termFactory.makeTuple(q_12056, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1194.instance);
      if(term == null)
        break Fail5549;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}