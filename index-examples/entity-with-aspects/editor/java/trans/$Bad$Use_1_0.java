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

@SuppressWarnings("all") public class $Bad$Use_1_0 extends Strategy 
{ 
  public static $Bad$Use_1_0 instance = new $Bad$Use_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BadUse_1_0");
    Fail5405:
    { 
      IStrategoTerm j_12148 = null;
      IStrategoTerm i_12148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consBadUse_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5405;
      i_12148 = term.getSubterm(0);
      IStrategoList annos241 = term.getAnnotations();
      j_12148 = annos241;
      term = z_12038.invoke(context, i_12148);
      if(term == null)
        break Fail5405;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consBadUse_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_12148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}