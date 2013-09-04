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

@SuppressWarnings("all") public class index_create_qualifier_0_1 extends Strategy 
{ 
  public static index_create_qualifier_0_1 instance = new index_create_qualifier_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_12058)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail4471:
    { 
      IStrategoTerm j_11899 = null;
      IStrategoTerm m_11899 = null;
      IStrategoTerm n_11899 = null;
      IStrategoTerm k_11899 = null;
      IStrategoTerm o_11899 = null;
      IStrategoTerm p_11899 = null;
      m_11899 = term;
      term = t_12058;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail4471;
      n_11899 = term.getSubterm(0);
      j_11899 = n_11899;
      o_11899 = m_11899;
      term = t_12058;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail4471;
      p_11899 = term.getSubterm(1);
      k_11899 = p_11899;
      term = o_11899;
      term = termFactory.makeAppl(Main._consModule_3, new IStrategoTerm[]{j_11899, k_11899, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)});
      if(true)
        return term;
    }
    context.push("index_create_qualifier_0_1");
    context.popOnFailure();
    return null;
  }
}