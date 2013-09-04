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

@SuppressWarnings("all") public class index_eq_0_2 extends Strategy 
{ 
  public static index_eq_0_2 instance = new index_eq_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_11983, IStrategoTerm v_11983)
  { 
    context.push("index_eq_0_2");
    Fail5030:
    { 
      IStrategoTerm w_11983 = null;
      IStrategoTerm x_11983 = null;
      x_11983 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5030;
      IStrategoTerm arg1546 = term.getSubterm(0);
      if(arg1546.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1546).isEmpty())
        break Fail5030;
      IStrategoTerm arg1548 = ((IStrategoList)arg1546).tail();
      if(arg1548.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg1548).isEmpty())
        break Fail5030;
      w_11983 = ((IStrategoList)arg1548).head();
      term = SRTS_EXT_eq_ignore_annos_0_1.instance.invoke(context, w_11983, v_11983);
      if(term == null)
        break Fail5030;
      term = x_11983;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}