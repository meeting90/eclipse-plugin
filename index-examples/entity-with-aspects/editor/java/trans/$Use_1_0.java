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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Use_1_0");
    Fail5404:
    { 
      IStrategoTerm g_12148 = null;
      IStrategoTerm f_12148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consUse_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5404;
      f_12148 = term.getSubterm(0);
      IStrategoList annos240 = term.getAnnotations();
      g_12148 = annos240;
      term = y_12038.invoke(context, f_12148);
      if(term == null)
        break Fail5404;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consUse_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_12148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}