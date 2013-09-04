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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Var_1_0");
    Fail5434:
    { 
      IStrategoTerm f_12151 = null;
      IStrategoTerm e_12151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5434;
      e_12151 = term.getSubterm(0);
      IStrategoList annos259 = term.getAnnotations();
      f_12151 = annos259;
      term = b_12040.invoke(context, e_12151);
      if(term == null)
        break Fail5434;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_12151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}