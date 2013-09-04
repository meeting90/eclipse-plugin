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

@SuppressWarnings("all") public class term_at_position_0_1 extends Strategy 
{ 
  public static term_at_position_0_1 instance = new term_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_12016)
  { 
    context.push("term_at_position_0_1");
    Fail5253:
    { 
      TermReference q_12016 = new TermReference();
      IStrategoTerm r_12016 = null;
      r_12016 = term;
      lifted1138 lifted11380 = new lifted1138();
      lifted11380.q_12016 = q_12016;
      term = at_position_1_1.instance.invoke(context, term, lifted11380, o_12016);
      if(term == null)
        break Fail5253;
      term = r_12016;
      if(q_12016.value == null)
        break Fail5253;
      term = q_12016.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}