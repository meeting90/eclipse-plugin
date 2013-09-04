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

@SuppressWarnings("all") public class $Param_2_0 extends Strategy 
{ 
  public static $Param_2_0 instance = new $Param_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_2177, Strategy t_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_2_0");
    Fail2539:
    { 
      IStrategoTerm q_2289 = null;
      IStrategoTerm o_2289 = null;
      IStrategoTerm p_2289 = null;
      IStrategoTerm r_2289 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2539;
      o_2289 = term.getSubterm(0);
      p_2289 = term.getSubterm(1);
      IStrategoList annos128 = term.getAnnotations();
      q_2289 = annos128;
      term = s_2177.invoke(context, o_2289);
      if(term == null)
        break Fail2539;
      r_2289 = term;
      term = t_2177.invoke(context, p_2289);
      if(term == null)
        break Fail2539;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consParam_2, new IStrategoTerm[]{r_2289, term}), checkListAnnos(termFactory, q_2289));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}