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

@SuppressWarnings("all") public class $Read$Wildcard_2_0 extends Strategy 
{ 
  public static $Read$Wildcard_2_0 instance = new $Read$Wildcard_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_12039, Strategy c_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ReadWildcard_2_0");
    Fail5407:
    { 
      IStrategoTerm q_12148 = null;
      IStrategoTerm o_12148 = null;
      IStrategoTerm p_12148 = null;
      IStrategoTerm r_12148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consReadWildcard_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5407;
      o_12148 = term.getSubterm(0);
      p_12148 = term.getSubterm(1);
      IStrategoList annos243 = term.getAnnotations();
      q_12148 = annos243;
      term = b_12039.invoke(context, o_12148);
      if(term == null)
        break Fail5407;
      r_12148 = term;
      term = c_12039.invoke(context, p_12148);
      if(term == null)
        break Fail5407;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consReadWildcard_2, new IStrategoTerm[]{r_12148, term}), checkListAnnos(termFactory, q_12148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}