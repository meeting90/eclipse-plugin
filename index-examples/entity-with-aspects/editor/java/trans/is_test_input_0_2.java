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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_11981, IStrategoTerm x_11981)
  { 
    context.push("is_test_input_0_2");
    Fail5012:
    { 
      Success2838:
      { 
        Fail5013:
        { 
          term = w_11981;
          if(term.getTermType() != IStrategoTerm.STRING || !"Spoofax-Testing".equals(((IStrategoString)term).stringValue()))
            break Fail5013;
          if(true)
            break Success2838;
        }
        IStrategoTerm u_12154 = null;
        u_12154 = x_11981;
        term = string_ends_with_0_1.instance.invoke(context, u_12154, trans.const963);
        if(term == null)
          break Fail5012;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}