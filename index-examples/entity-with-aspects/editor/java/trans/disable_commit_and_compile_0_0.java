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

@SuppressWarnings("all") public class disable_commit_and_compile_0_0 extends Strategy 
{ 
  public static disable_commit_and_compile_0_0 instance = new disable_commit_and_compile_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("disable_commit_and_compile_0_0");
    Fail1962:
    { 
      IStrategoTerm o_2090 = null;
      o_2090 = term;
      term = index_enable_global_0_1.instance.invoke(context, o_2090, trans.const406);
      if(term == null)
        break Fail1962;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}