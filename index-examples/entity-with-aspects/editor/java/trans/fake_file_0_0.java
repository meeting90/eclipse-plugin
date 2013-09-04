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

@SuppressWarnings("all") public class fake_file_0_0 extends Strategy 
{ 
  public static fake_file_0_0 instance = new fake_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("fake_file_0_0");
    Fail2112:
    { 
      IStrategoTerm term1313 = term;
      Success1283:
      { 
        Fail2113:
        { 
          IStrategoTerm b_2292 = null;
          b_2292 = term;
          term = string_ends_with_0_1.instance.invoke(context, b_2292, trans.const443);
          if(term == null)
            break Fail2113;
          if(true)
            break Success1283;
        }
        term = index_is_fake_file_0_0.instance.invoke(context, term1313);
        if(term == null)
          break Fail2112;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}