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

@SuppressWarnings("all") public class $Anon_1_0 extends Strategy 
{ 
  public static $Anon_1_0 instance = new $Anon_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Anon_1_0");
    Fail5416:
    { 
      IStrategoTerm j_12149 = null;
      IStrategoTerm i_12149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAnon_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5416;
      i_12149 = term.getSubterm(0);
      IStrategoList annos247 = term.getAnnotations();
      j_12149 = annos247;
      term = j_12039.invoke(context, i_12149);
      if(term == null)
        break Fail5416;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAnon_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_12149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}