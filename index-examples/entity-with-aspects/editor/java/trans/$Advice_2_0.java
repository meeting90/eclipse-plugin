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

@SuppressWarnings("all") public class $Advice_2_0 extends Strategy 
{ 
  public static $Advice_2_0 instance = new $Advice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_12038, Strategy f_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Advice_2_0");
    Fail5392:
    { 
      IStrategoTerm m_12146 = null;
      IStrategoTerm k_12146 = null;
      IStrategoTerm l_12146 = null;
      IStrategoTerm n_12146 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAdvice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5392;
      k_12146 = term.getSubterm(0);
      l_12146 = term.getSubterm(1);
      IStrategoList annos233 = term.getAnnotations();
      m_12146 = annos233;
      term = e_12038.invoke(context, k_12146);
      if(term == null)
        break Fail5392;
      n_12146 = term;
      term = f_12038.invoke(context, l_12146);
      if(term == null)
        break Fail5392;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAdvice_2, new IStrategoTerm[]{n_12146, term}), checkListAnnos(termFactory, m_12146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}