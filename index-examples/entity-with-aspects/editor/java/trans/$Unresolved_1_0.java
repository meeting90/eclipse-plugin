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

@SuppressWarnings("all") public class $Unresolved_1_0 extends Strategy 
{ 
  public static $Unresolved_1_0 instance = new $Unresolved_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Unresolved_1_0");
    Fail2510:
    { 
      IStrategoTerm l_2286 = null;
      IStrategoTerm k_2286 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2510;
      k_2286 = term.getSubterm(0);
      IStrategoList annos108 = term.getAnnotations();
      l_2286 = annos108;
      term = n_2176.invoke(context, k_2286);
      if(term == null)
        break Fail2510;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consUnresolved_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_2286));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}