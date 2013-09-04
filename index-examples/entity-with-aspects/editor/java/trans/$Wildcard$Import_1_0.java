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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("WildcardImport_1_0");
    Fail2547:
    { 
      IStrategoTerm d_2291 = null;
      IStrategoTerm c_2291 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consWildcardImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2547;
      c_2291 = term.getSubterm(0);
      IStrategoList annos134 = term.getAnnotations();
      d_2291 = annos134;
      term = j_2178.invoke(context, c_2291);
      if(term == null)
        break Fail2547;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consWildcardImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_2291));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}