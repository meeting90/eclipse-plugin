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

@SuppressWarnings("all") public class index_get_data_all_0_1 extends Strategy 
{ 
  public static index_get_data_all_0_1 instance = new index_get_data_all_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_11988)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_data_all_0_1");
    Fail5071:
    { 
      TermReference v_11988 = new TermReference();
      IStrategoTerm x_11988 = null;
      IStrategoTerm y_11988 = null;
      y_11988 = term;
      x_11988 = trans.const972;
      term = y_11988;
      lifted1063 lifted10630 = new lifted1063();
      lifted10630.v_11988 = v_11988;
      term = with_1_1.instance.invoke(context, term, lifted10630, x_11988);
      if(term == null)
        break Fail5071;
      if(v_11988.value == null)
        break Fail5071;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{v_11988.value, u_11988, trans.const882});
      term = index_get_all_values_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail5071;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}