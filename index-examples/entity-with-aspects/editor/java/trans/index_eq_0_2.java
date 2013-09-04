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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_2120, IStrategoTerm a_2121)
  { 
    context.push("index_eq_0_2");
    Fail2128:
    { 
      IStrategoTerm b_2121 = null;
      IStrategoTerm c_2121 = null;
      c_2121 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2128;
      IStrategoTerm arg692 = term.getSubterm(0);
      if(arg692.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg692).isEmpty())
        break Fail2128;
      IStrategoTerm arg694 = ((IStrategoList)arg692).tail();
      if(arg694.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg694).isEmpty())
        break Fail2128;
      b_2121 = ((IStrategoList)arg694).head();
      term = SRTS_EXT_eq_ignore_annos_0_1.instance.invoke(context, b_2121, a_2121);
      if(term == null)
        break Fail2128;
      term = c_2121;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}