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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_2125)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_data_0_1");
    Fail2168:
    { 
      TermReference t_2125 = new TermReference();
      IStrategoTerm v_2125 = null;
      IStrategoTerm w_2125 = null;
      w_2125 = term;
      v_2125 = trans.const452;
      term = w_2125;
      lifted462 lifted4620 = new lifted462();
      lifted4620.t_2125 = t_2125;
      term = with_1_1.instance.invoke(context, term, lifted4620, v_2125);
      if(term == null)
        break Fail2168;
      if(t_2125.value == null)
        break Fail2168;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{t_2125.value, s_2125, trans.const362});
      term = index_get_value_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2168;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}