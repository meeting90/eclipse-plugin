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
    Fail2645:
    { 
      IStrategoTerm h_2193 = null;
      IStrategoTerm k_2193 = null;
      IStrategoTerm m_2193 = null;
      h_2193 = term;
      m_2193 = term;
      Success1501:
      { 
        Fail2646:
        { 
          IStrategoTerm o_2193 = null;
          o_2193 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_2193, trans.const481, h_2193);
          if(term == null)
            break Fail2646;
          if(true)
            break Success1501;
        }
        term = trans.constNil1;
      }
      k_2193 = term;
      term = m_2193;
      term = termFactory.makeTuple(k_2193, term);
      term = foldl_1_0.instance.invoke(context, term, lifted593.instance);
      if(term == null)
        break Fail2645;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}