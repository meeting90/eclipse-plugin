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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_2153)
  { 
    context.push("term_at_position_0_1");
    Fail2351:
    { 
      TermReference v_2153 = new TermReference();
      IStrategoTerm w_2153 = null;
      w_2153 = term;
      lifted538 lifted5380 = new lifted538();
      lifted5380.v_2153 = v_2153;
      term = at_position_1_1.instance.invoke(context, term, lifted5380, t_2153);
      if(term == null)
        break Fail2351;
      term = w_2153;
      if(v_2153.value == null)
        break Fail2351;
      term = v_2153.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}