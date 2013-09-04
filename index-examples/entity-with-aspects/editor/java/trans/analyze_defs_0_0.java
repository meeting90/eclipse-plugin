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

@SuppressWarnings("all") public class analyze_defs_0_0 extends Strategy 
{ 
  public static analyze_defs_0_0 instance = new analyze_defs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_defs_0_0");
    Fail2000:
    { 
      IStrategoTerm s_2099 = null;
      IStrategoTerm t_2099 = null;
      IStrategoTerm x_2099 = null;
      IStrategoTerm a_2100 = null;
      IStrategoTerm b_2100 = null;
      IStrategoTerm d_2100 = null;
      IStrategoTerm e_2100 = null;
      IStrategoTerm f_2100 = null;
      s_2099 = term;
      term = new_iset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2000;
      t_2099 = term;
      d_2100 = s_2099;
      a_2100 = trans.constNil1;
      e_2100 = d_2100;
      b_2100 = trans.constAnon0;
      f_2100 = e_2100;
      term = analyze_defs_0_4.instance.invoke(context, f_2100, a_2100, t_2099, b_2100, trans.constAnon0);
      if(term == null)
        break Fail2000;
      x_2099 = term;
      term = iset_elements_0_0.instance.invoke(context, t_2099);
      if(term == null)
        break Fail2000;
      term = termFactory.makeTuple(x_2099, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}