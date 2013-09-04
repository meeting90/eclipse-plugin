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

@SuppressWarnings("all") public class $Read_1_0 extends Strategy 
{ 
  public static $Read_1_0 instance = new $Read_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Read_1_0");
    Fail2504:
    { 
      IStrategoTerm r_2285 = null;
      IStrategoTerm q_2285 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consRead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2504;
      q_2285 = term.getSubterm(0);
      IStrategoList annos104 = term.getAnnotations();
      r_2285 = annos104;
      term = f_2176.invoke(context, q_2285);
      if(term == null)
        break Fail2504;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_2285));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}