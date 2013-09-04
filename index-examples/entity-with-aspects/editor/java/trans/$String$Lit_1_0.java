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

@SuppressWarnings("all") public class $String$Lit_1_0 extends Strategy 
{ 
  public static $String$Lit_1_0 instance = new $String$Lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StringLit_1_0");
    Fail2530:
    { 
      IStrategoTerm c_2288 = null;
      IStrategoTerm b_2288 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consStringLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2530;
      b_2288 = term.getSubterm(0);
      IStrategoList annos119 = term.getAnnotations();
      c_2288 = annos119;
      term = d_2177.invoke(context, b_2288);
      if(term == null)
        break Fail2530;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consStringLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}