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

@SuppressWarnings("all") public class $Wildcard$Import_1_0 extends Strategy 
{ 
  public static $Wildcard$Import_1_0 instance = new $Wildcard$Import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_12041)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardImport_1_0");
    Fail5449:
    { 
      IStrategoTerm y_12153 = null;
      IStrategoTerm x_12153 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consWildcardImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5449;
      x_12153 = term.getSubterm(0);
      IStrategoList annos272 = term.getAnnotations();
      y_12153 = annos272;
      term = e_12041.invoke(context, x_12153);
      if(term == null)
        break Fail5449;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consWildcardImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_12153));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}