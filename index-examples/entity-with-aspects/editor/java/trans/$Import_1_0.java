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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_12041)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Import_1_0");
    Fail5450:
    { 
      IStrategoTerm b_12154 = null;
      IStrategoTerm a_12154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5450;
      a_12154 = term.getSubterm(0);
      IStrategoList annos273 = term.getAnnotations();
      b_12154 = annos273;
      term = f_12041.invoke(context, a_12154);
      if(term == null)
        break Fail5450;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consImport_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_12154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}