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
    Fail5014:
    { 
      IStrategoTerm term2869 = term;
      Success2839:
      { 
        Fail5015:
        { 
          IStrategoTerm w_12154 = null;
          w_12154 = term;
          term = string_ends_with_0_1.instance.invoke(context, w_12154, trans.const963);
          if(term == null)
            break Fail5015;
          if(true)
            break Success2839;
        }
        term = index_is_fake_file_0_0.instance.invoke(context, term2869);
        if(term == null)
          break Fail5014;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}