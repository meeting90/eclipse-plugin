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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StringLit_1_0");
    Fail5432:
    { 
      IStrategoTerm x_12150 = null;
      IStrategoTerm w_12150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consStringLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5432;
      w_12150 = term.getSubterm(0);
      IStrategoList annos257 = term.getAnnotations();
      x_12150 = annos257;
      term = y_12039.invoke(context, w_12150);
      if(term == null)
        break Fail5432;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consStringLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_12150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}