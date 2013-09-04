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

@SuppressWarnings("all") public class $Entity_2_0 extends Strategy 
{ 
  public static $Entity_2_0 instance = new $Entity_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_2176, Strategy z_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Entity_2_0");
    Fail2525:
    { 
      IStrategoTerm q_2287 = null;
      IStrategoTerm o_2287 = null;
      IStrategoTerm p_2287 = null;
      IStrategoTerm r_2287 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntity_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2525;
      o_2287 = term.getSubterm(0);
      p_2287 = term.getSubterm(1);
      IStrategoList annos116 = term.getAnnotations();
      q_2287 = annos116;
      term = y_2176.invoke(context, o_2287);
      if(term == null)
        break Fail2525;
      r_2287 = term;
      term = z_2176.invoke(context, p_2287);
      if(term == null)
        break Fail2525;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntity_2, new IStrategoTerm[]{r_2287, term}), checkListAnnos(termFactory, q_2287));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}