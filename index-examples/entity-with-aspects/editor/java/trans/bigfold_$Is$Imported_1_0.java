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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_2192)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail2641:
    { 
      IStrategoTerm j_2192 = null;
      IStrategoTerm n_2192 = null;
      IStrategoTerm p_2192 = null;
      j_2192 = term;
      p_2192 = term;
      Success1499:
      { 
        Fail2642:
        { 
          IStrategoTerm r_2192 = null;
          r_2192 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_2192, trans.const481, j_2192);
          if(term == null)
            break Fail2642;
          if(true)
            break Success1499;
        }
        term = trans.constNil1;
      }
      n_2192 = term;
      term = p_2192;
      term = termFactory.makeTuple(n_2192, term);
      term = m_2192.invoke(context, term, lifted591.instance);
      if(term == null)
        break Fail2641;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}