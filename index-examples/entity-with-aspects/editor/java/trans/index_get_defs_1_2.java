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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_2116, IStrategoTerm r_2116, IStrategoTerm s_2116)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("index_get_defs_1_2");
    Fail2087:
    { 
      IStrategoTerm t_2116 = null;
      IStrategoTerm u_2116 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail2087;
      t_2116 = ((IStrategoList)term).head();
      u_2116 = ((IStrategoList)term).tail();
      IStrategoList list63;
      list63 = checkListTail(u_2116);
      if(list63 == null)
        break Fail2087;
      term = termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(t_2116, termFactory.makeListCons(s_2116, list63))});
      term = index_get_all_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail2087;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}