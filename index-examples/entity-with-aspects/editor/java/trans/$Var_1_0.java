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

@SuppressWarnings("all") public class $Var_1_0 extends Strategy 
{ 
  public static $Var_1_0 instance = new $Var_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail2532:
    { 
      IStrategoTerm k_2288 = null;
      IStrategoTerm j_2288 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2532;
      j_2288 = term.getSubterm(0);
      IStrategoList annos121 = term.getAnnotations();
      k_2288 = annos121;
      term = g_2177.invoke(context, j_2288);
      if(term == null)
        break Fail2532;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}