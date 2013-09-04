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

@SuppressWarnings("all") public class index_uri_eq_0_0 extends Strategy 
{ 
  public static index_uri_eq_0_0 instance = new index_uri_eq_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_uri_eq_0_0");
    Fail5165:
    { 
      IStrategoTerm m_12004 = null;
      IStrategoTerm n_12004 = null;
      IStrategoTerm o_12004 = null;
      IStrategoTerm p_12004 = null;
      IStrategoTerm q_12004 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail5165;
      m_12004 = term.getSubterm(0);
      n_12004 = term.getSubterm(1);
      q_12004 = term;
      term = index_uri_unwrap_0_0.instance.invoke(context, m_12004);
      if(term == null)
        break Fail5165;
      o_12004 = term;
      term = index_uri_unwrap_0_0.instance.invoke(context, n_12004);
      if(term == null)
        break Fail5165;
      p_12004 = term;
      Success2894:
      { 
        Fail5166:
        { 
          term = termFactory.makeTuple(o_12004, p_12004);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5166;
          if(true)
            break Success2894;
        }
        IStrategoTerm r_12004 = null;
        term = remove_all_1_0.instance.invoke(context, o_12004, lifted1114.instance);
        if(term == null)
          break Fail5165;
        r_12004 = term;
        term = remove_all_1_0.instance.invoke(context, p_12004, lifted1115.instance);
        if(term == null)
          break Fail5165;
        term = termFactory.makeTuple(r_12004, term);
        term = eq_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail5165;
      }
      term = q_12004;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}