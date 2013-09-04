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
    Fail2263:
    { 
      IStrategoTerm r_2141 = null;
      IStrategoTerm s_2141 = null;
      IStrategoTerm t_2141 = null;
      IStrategoTerm u_2141 = null;
      IStrategoTerm v_2141 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail2263;
      r_2141 = term.getSubterm(0);
      s_2141 = term.getSubterm(1);
      v_2141 = term;
      term = index_uri_unwrap_0_0.instance.invoke(context, r_2141);
      if(term == null)
        break Fail2263;
      t_2141 = term;
      term = index_uri_unwrap_0_0.instance.invoke(context, s_2141);
      if(term == null)
        break Fail2263;
      u_2141 = term;
      Success1338:
      { 
        Fail2264:
        { 
          term = termFactory.makeTuple(t_2141, u_2141);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail2264;
          if(true)
            break Success1338;
        }
        IStrategoTerm w_2141 = null;
        term = remove_all_1_0.instance.invoke(context, t_2141, lifted514.instance);
        if(term == null)
          break Fail2263;
        w_2141 = term;
        term = remove_all_1_0.instance.invoke(context, u_2141, lifted515.instance);
        if(term == null)
          break Fail2263;
        term = termFactory.makeTuple(w_2141, term);
        term = eq_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail2263;
      }
      term = v_2141;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}