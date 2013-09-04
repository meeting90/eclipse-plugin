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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail5547:
    { 
      IStrategoTerm c_12056 = null;
      IStrategoTerm f_12056 = null;
      IStrategoTerm h_12056 = null;
      c_12056 = term;
      h_12056 = term;
      Success3057:
      { 
        Fail5548:
        { 
          IStrategoTerm j_12056 = null;
          j_12056 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_12056, trans.const1001, c_12056);
          if(term == null)
            break Fail5548;
          if(true)
            break Success3057;
        }
        term = trans.constNil3;
      }
      f_12056 = term;
      term = h_12056;
      term = termFactory.makeTuple(f_12056, term);
      term = foldl_1_0.instance.invoke(context, term, lifted1193.instance);
      if(term == null)
        break Fail5547;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}