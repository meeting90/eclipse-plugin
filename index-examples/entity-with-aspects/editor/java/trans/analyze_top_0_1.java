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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_11985)
  { 
    context.push("analyze_top_0_1");
    Fail5049:
    { 
      IStrategoTerm m_11985 = null;
      IStrategoTerm n_11985 = null;
      IStrategoTerm o_11985 = null;
      IStrategoTerm q_11985 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail5049;
      o_11985 = term.getSubterm(0);
      m_11985 = term.getSubterm(1);
      n_11985 = term.getSubterm(2);
      q_11985 = o_11985;
      term = analyze_top_0_4.instance.invoke(context, q_11985, trans.constEditor0, l_11985, m_11985, n_11985);
      if(term == null)
        break Fail5049;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}