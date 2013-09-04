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

@SuppressWarnings("all") public class random_apply_1_2 extends Strategy 
{ 
  public static random_apply_1_2 instance = new random_apply_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_2038, IStrategoTerm r_2038, IStrategoTerm s_2038)
  { 
    context.push("random_apply_1_2");
    Fail1594:
    { 
      IStrategoTerm v_2038 = null;
      v_2038 = term;
      term = random_int_0_2.instance.invoke(context, term, r_2038, s_2038);
      if(term == null)
        break Fail1594;
      term = testgen_apply_1_1.instance.invoke(context, v_2038, t_2038, term);
      if(term == null)
        break Fail1594;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}