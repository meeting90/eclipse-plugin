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

@SuppressWarnings("all") public class is_test_input_0_2 extends Strategy 
{ 
  public static is_test_input_0_2 instance = new is_test_input_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_2119, IStrategoTerm c_2119)
  { 
    context.push("is_test_input_0_2");
    Fail2110:
    { 
      Success1282:
      { 
        Fail2111:
        { 
          term = b_2119;
          if(term.getTermType() != IStrategoTerm.STRING || !"Spoofax-Testing".equals(((IStrategoString)term).stringValue()))
            break Fail2111;
          if(true)
            break Success1282;
        }
        IStrategoTerm z_2291 = null;
        z_2291 = c_2119;
        term = string_ends_with_0_1.instance.invoke(context, z_2291, trans.const443);
        if(term == null)
          break Fail2110;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}