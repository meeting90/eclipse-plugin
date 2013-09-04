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

@SuppressWarnings("all") public class $Import_1_0 extends Strategy 
{ 
  public static $Import_1_0 instance = new $Import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail2548:
    { 
      IStrategoTerm g_2291 = null;
      IStrategoTerm f_2291 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2548;
      f_2291 = term.getSubterm(0);
      IStrategoList annos135 = term.getAnnotations();
      g_2291 = annos135;
      term = k_2178.invoke(context, f_2291);
      if(term == null)
        break Fail2548;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_2291));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}