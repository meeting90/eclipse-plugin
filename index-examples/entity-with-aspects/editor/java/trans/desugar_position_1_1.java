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

@SuppressWarnings("all") public class desugar_position_1_1 extends Strategy 
{ 
  public static desugar_position_1_1 instance = new desugar_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_2152, IStrategoTerm b_2152)
  { 
    context.push("desugar_position_1_1");
    Fail2344:
    { 
      IStrategoTerm c_2152 = null;
      c_2152 = term;
      term = at_position_1_1.instance.invoke(context, b_2152, lifted531.instance, c_2152);
      if(term == null)
        break Fail2344;
      lifted532 lifted5320 = new lifted532();
      lifted5320.i_2152 = i_2152;
      term = topdown_1_0.instance.invoke(context, term, lifted5320);
      if(term == null)
        break Fail2344;
      term = position_of_term_1_0.instance.invoke(context, term, lifted535.instance);
      if(term == null)
        break Fail2344;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}