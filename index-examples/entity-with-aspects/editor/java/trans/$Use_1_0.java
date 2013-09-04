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

@SuppressWarnings("all") public class $Use_1_0 extends Strategy 
{ 
  public static $Use_1_0 instance = new $Use_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Use_1_0");
    Fail2502:
    { 
      IStrategoTerm l_2285 = null;
      IStrategoTerm k_2285 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consUse_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2502;
      k_2285 = term.getSubterm(0);
      IStrategoList annos102 = term.getAnnotations();
      l_2285 = annos102;
      term = d_2176.invoke(context, k_2285);
      if(term == null)
        break Fail2502;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_2285));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}