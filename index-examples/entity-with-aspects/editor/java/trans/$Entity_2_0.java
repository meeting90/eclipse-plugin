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

@SuppressWarnings("all") public class $Entity_2_0 extends Strategy 
{ 
  public static $Entity_2_0 instance = new $Entity_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_12039, Strategy u_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail5427:
    { 
      IStrategoTerm l_12150 = null;
      IStrategoTerm j_12150 = null;
      IStrategoTerm k_12150 = null;
      IStrategoTerm m_12150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5427;
      j_12150 = term.getSubterm(0);
      k_12150 = term.getSubterm(1);
      IStrategoList annos254 = term.getAnnotations();
      l_12150 = annos254;
      term = t_12039.invoke(context, j_12150);
      if(term == null)
        break Fail5427;
      m_12150 = term;
      term = u_12039.invoke(context, k_12150);
      if(term == null)
        break Fail5427;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{m_12150, term}), checkListAnnos(termFactory, l_12150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}