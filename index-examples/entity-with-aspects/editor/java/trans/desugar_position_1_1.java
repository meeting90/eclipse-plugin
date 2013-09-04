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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12015, IStrategoTerm w_12014)
  { 
    context.push("desugar_position_1_1");
    Fail5246:
    { 
      IStrategoTerm x_12014 = null;
      x_12014 = term;
      term = at_position_1_1.instance.invoke(context, w_12014, lifted1131.instance, x_12014);
      if(term == null)
        break Fail5246;
      lifted1132 lifted11320 = new lifted1132();
      lifted11320.d_12015 = d_12015;
      term = topdown_1_0.instance.invoke(context, term, lifted11320);
      if(term == null)
        break Fail5246;
      term = position_of_term_1_0.instance.invoke(context, term, lifted1135.instance);
      if(term == null)
        break Fail5246;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}