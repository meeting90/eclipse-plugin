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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_2175, Strategy k_2175)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Advice_2_0");
    Fail2490:
    { 
      IStrategoTerm r_2283 = null;
      IStrategoTerm p_2283 = null;
      IStrategoTerm q_2283 = null;
      IStrategoTerm s_2283 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAdvice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2490;
      p_2283 = term.getSubterm(0);
      q_2283 = term.getSubterm(1);
      IStrategoList annos95 = term.getAnnotations();
      r_2283 = annos95;
      term = j_2175.invoke(context, p_2283);
      if(term == null)
        break Fail2490;
      s_2283 = term;
      term = k_2175.invoke(context, q_2283);
      if(term == null)
        break Fail2490;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAdvice_2, new IStrategoTerm[]{s_2283, term}), checkListAnnos(termFactory, r_2283));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}