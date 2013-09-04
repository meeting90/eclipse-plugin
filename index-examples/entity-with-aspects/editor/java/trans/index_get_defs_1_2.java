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

@SuppressWarnings("all") public class index_get_defs_1_2 extends Strategy 
{ 
  public static index_get_defs_1_2 instance = new index_get_defs_1_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_11979, IStrategoTerm m_11979, IStrategoTerm n_11979)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_defs_1_2");
    Fail4989:
    { 
      IStrategoTerm o_11979 = null;
      IStrategoTerm p_11979 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail4989;
      o_11979 = ((IStrategoList)term).head();
      p_11979 = ((IStrategoList)term).tail();
      IStrategoList list139;
      list139 = checkListTail(p_11979);
      if(list139 == null)
        break Fail4989;
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(o_11979, termFactory.makeListCons(n_11979, list139))});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail4989;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}