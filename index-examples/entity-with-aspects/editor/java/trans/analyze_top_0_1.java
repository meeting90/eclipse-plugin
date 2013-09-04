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

@SuppressWarnings("all") public class analyze_top_0_1 extends Strategy 
{ 
  public static analyze_top_0_1 instance = new analyze_top_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_2122)
  { 
    context.push("analyze_top_0_1");
    Fail2147:
    { 
      IStrategoTerm r_2122 = null;
      IStrategoTerm s_2122 = null;
      IStrategoTerm t_2122 = null;
      IStrategoTerm v_2122 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail2147;
      t_2122 = term.getSubterm(0);
      r_2122 = term.getSubterm(1);
      s_2122 = term.getSubterm(2);
      v_2122 = t_2122;
      term = analyze_top_0_4.instance.invoke(context, v_2122, trans.constEditor0, q_2122, r_2122, s_2122);
      if(term == null)
        break Fail2147;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}