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
    Fail2647:
    { 
      IStrategoTerm s_2193 = null;
      IStrategoTerm v_2193 = null;
      IStrategoTerm x_2193 = null;
      s_2193 = term;
      x_2193 = term;
      Success1502:
      { 
        Fail2648:
        { 
          IStrategoTerm z_2193 = null;
          z_2193 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_2193, trans.const481, s_2193);
          if(term == null)
            break Fail2648;
          if(true)
            break Success1502;
        }
        term = trans.constNil1;
      }
      v_2193 = term;
      term = x_2193;
      term = termFactory.makeTuple(v_2193, term);
      term = foldl_1_0.instance.invoke(context, term, lifted594.instance);
      if(term == null)
        break Fail2647;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}