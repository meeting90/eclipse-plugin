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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_11901, IStrategoTerm m_11901, IStrategoTerm n_11901)
  { 
    context.push("random_apply_1_2");
    Fail4496:
    { 
      IStrategoTerm q_11901 = null;
      q_11901 = term;
      term = random_int_0_2.instance.invoke(context, term, m_11901, n_11901);
      if(term == null)
        break Fail4496;
      term = testgen_apply_1_1.instance.invoke(context, q_11901, o_11901, term);
      if(term == null)
        break Fail4496;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}