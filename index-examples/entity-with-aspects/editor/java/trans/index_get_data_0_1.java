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

@SuppressWarnings("all") public class index_get_data_0_1 extends Strategy 
{ 
  public static index_get_data_0_1 instance = new index_get_data_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_11988)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_data_0_1");
    Fail5070:
    { 
      TermReference o_11988 = new TermReference();
      IStrategoTerm q_11988 = null;
      IStrategoTerm r_11988 = null;
      r_11988 = term;
      q_11988 = trans.const972;
      term = r_11988;
      lifted1062 lifted10620 = new lifted1062();
      lifted10620.o_11988 = o_11988;
      term = with_1_1.instance.invoke(context, term, lifted10620, q_11988);
      if(term == null)
        break Fail5070;
      if(o_11988.value == null)
        break Fail5070;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{o_11988.value, n_11988, trans.const882});
      term = index_get_value_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5070;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}