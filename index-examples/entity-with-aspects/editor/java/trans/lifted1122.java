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

@SuppressWarnings("all") final class lifted1122 extends Strategy 
{ 
  TermReference u_12007;

  TermReference v_12007;

  Strategy f_12008;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail5640:
    { 
      IStrategoTerm a_12008 = null;
      IStrategoTerm b_12008 = null;
      IStrategoTerm n_12008 = null;
      IStrategoTerm o_12008 = null;
      IStrategoTerm q_12008 = null;
      IStrategoTerm r_12008 = null;
      IStrategoTerm s_12008 = null;
      a_12008 = term;
      if(u_12007.value == null)
        break Fail5640;
      term = u_12007.value;
      b_12008 = u_12007.value;
      q_12008 = term;
      n_12008 = trans.const999;
      r_12008 = q_12008;
      o_12008 = trans.constCons250;
      s_12008 = r_12008;
      term = termFactory.makeTuple(trans.const1000, b_12008);
      term = dr_set_rule_0_3.instance.invoke(context, s_12008, n_12008, o_12008, term);
      if(term == null)
        break Fail5640;
      term = a_12008;
      if(v_12007.value == null)
        break Fail5640;
      term = f_12008.invoke(context, v_12007.value);
      if(term == null)
        break Fail5640;
      if(true)
        return term;
    }
    return null;
  }
}