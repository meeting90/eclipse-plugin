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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Unresolved_1_0");
    Fail5412:
    { 
      IStrategoTerm g_12149 = null;
      IStrategoTerm f_12149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consUnresolved_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5412;
      f_12149 = term.getSubterm(0);
      IStrategoList annos246 = term.getAnnotations();
      g_12149 = annos246;
      term = i_12039.invoke(context, f_12149);
      if(term == null)
        break Fail5412;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consUnresolved_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_12149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}