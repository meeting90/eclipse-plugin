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

@SuppressWarnings("all") public class testgen_apply_1_1 extends Strategy 
{ 
  public static testgen_apply_1_1 instance = new testgen_apply_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_11901, IStrategoTerm k_11901)
  { 
    context.push("testgen_apply_1_1");
    Fail4495:
    { 
      term = range_0_0.instance.invoke(context, k_11901);
      if(term == null)
        break Fail4495;
      term = map_1_0.instance.invoke(context, term, l_11901);
      if(term == null)
        break Fail4495;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}