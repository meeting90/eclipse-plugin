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

@SuppressWarnings("all") public class bigfold_$Is$Imported_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported_1_0 instance = new bigfold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_12055)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail5543:
    { 
      IStrategoTerm e_12055 = null;
      IStrategoTerm i_12055 = null;
      IStrategoTerm k_12055 = null;
      e_12055 = term;
      k_12055 = term;
      Success3055:
      { 
        Fail5544:
        { 
          IStrategoTerm m_12055 = null;
          m_12055 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, m_12055, trans.const1001, e_12055);
          if(term == null)
            break Fail5544;
          if(true)
            break Success3055;
        }
        term = trans.constNil3;
      }
      i_12055 = term;
      term = k_12055;
      term = termFactory.makeTuple(i_12055, term);
      term = h_12055.invoke(context, term, lifted1191.instance);
      if(term == null)
        break Fail5543;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}