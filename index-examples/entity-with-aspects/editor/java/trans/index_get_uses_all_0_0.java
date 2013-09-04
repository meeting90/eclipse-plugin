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

@SuppressWarnings("all") public class index_get_uses_all_0_0 extends Strategy 
{ 
  public static index_get_uses_all_0_0 instance = new index_get_uses_all_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_uses_all_0_0");
    Fail2171:
    { 
      TermReference m_2126 = new TermReference();
      IStrategoTerm o_2126 = null;
      IStrategoTerm p_2126 = null;
      p_2126 = term;
      o_2126 = trans.const452;
      term = p_2126;
      lifted465 lifted4650 = new lifted465();
      lifted4650.m_2126 = m_2126;
      term = with_1_1.instance.invoke(context, term, lifted4650, o_2126);
      if(term == null)
        break Fail2171;
      if(m_2126.value == null)
        break Fail2171;
      term = termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{m_2126.value});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2171;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}