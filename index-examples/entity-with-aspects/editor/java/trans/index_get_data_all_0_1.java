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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_2125)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_data_all_0_1");
    Fail2169:
    { 
      TermReference a_2126 = new TermReference();
      IStrategoTerm c_2126 = null;
      IStrategoTerm d_2126 = null;
      d_2126 = term;
      c_2126 = trans.const452;
      term = d_2126;
      lifted463 lifted4630 = new lifted463();
      lifted4630.a_2126 = a_2126;
      term = with_1_1.instance.invoke(context, term, lifted4630, c_2126);
      if(term == null)
        break Fail2169;
      if(a_2126.value == null)
        break Fail2169;
      term = termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{a_2126.value, z_2125, trans.const362});
      term = index_get_all_values_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2169;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}