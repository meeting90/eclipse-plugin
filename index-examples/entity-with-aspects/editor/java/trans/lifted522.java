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

@SuppressWarnings("all") final class lifted522 extends Strategy 
{ 
  TermReference z_2144;

  TermReference a_2145;

  Strategy k_2145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail2738:
    { 
      IStrategoTerm f_2145 = null;
      IStrategoTerm g_2145 = null;
      IStrategoTerm s_2145 = null;
      IStrategoTerm t_2145 = null;
      IStrategoTerm v_2145 = null;
      IStrategoTerm w_2145 = null;
      IStrategoTerm x_2145 = null;
      f_2145 = term;
      if(z_2144.value == null)
        break Fail2738;
      term = z_2144.value;
      g_2145 = z_2144.value;
      v_2145 = term;
      s_2145 = trans.const479;
      w_2145 = v_2145;
      t_2145 = trans.constCons118;
      x_2145 = w_2145;
      term = termFactory.makeTuple(trans.const480, g_2145);
      term = dr_set_rule_0_3.instance.invoke(context, x_2145, s_2145, t_2145, term);
      if(term == null)
        break Fail2738;
      term = f_2145;
      if(a_2145.value == null)
        break Fail2738;
      term = k_2145.invoke(context, a_2145.value);
      if(term == null)
        break Fail2738;
      if(true)
        return term;
    }
    return null;
  }
}