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

@SuppressWarnings("all") public class $Global_2_0 extends Strategy 
{ 
  public static $Global_2_0 instance = new $Global_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_2176, Strategy t_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Global_2_0");
    Fail2519:
    { 
      IStrategoTerm a_2287 = null;
      IStrategoTerm y_2286 = null;
      IStrategoTerm z_2286 = null;
      IStrategoTerm b_2287 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consGlobal_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2519;
      y_2286 = term.getSubterm(0);
      z_2286 = term.getSubterm(1);
      IStrategoList annos112 = term.getAnnotations();
      a_2287 = annos112;
      term = s_2176.invoke(context, y_2286);
      if(term == null)
        break Fail2519;
      b_2287 = term;
      term = t_2176.invoke(context, z_2286);
      if(term == null)
        break Fail2519;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{b_2287, term}), checkListAnnos(termFactory, a_2287));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}