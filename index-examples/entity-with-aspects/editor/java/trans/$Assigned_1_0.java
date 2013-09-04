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

@SuppressWarnings("all") public class $Assigned_1_0 extends Strategy 
{ 
  public static $Assigned_1_0 instance = new $Assigned_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assigned_1_0");
    Fail2541:
    { 
      IStrategoTerm b_2290 = null;
      IStrategoTerm a_2290 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAssigned_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2541;
      a_2290 = term.getSubterm(0);
      IStrategoList annos130 = term.getAnnotations();
      b_2290 = annos130;
      term = x_2177.invoke(context, a_2290);
      if(term == null)
        break Fail2541;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAssigned_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_2290));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}