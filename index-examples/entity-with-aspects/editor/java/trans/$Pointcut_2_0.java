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

@SuppressWarnings("all") public class $Pointcut_2_0 extends Strategy 
{ 
  public static $Pointcut_2_0 instance = new $Pointcut_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_2175, Strategy e_2175)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Pointcut_2_0");
    Fail2488:
    { 
      IStrategoTerm d_2283 = null;
      IStrategoTerm b_2283 = null;
      IStrategoTerm c_2283 = null;
      IStrategoTerm e_2283 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPointcut_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2488;
      b_2283 = term.getSubterm(0);
      c_2283 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      d_2283 = annos93;
      term = d_2175.invoke(context, b_2283);
      if(term == null)
        break Fail2488;
      e_2283 = term;
      term = e_2175.invoke(context, c_2283);
      if(term == null)
        break Fail2488;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPointcut_2, new IStrategoTerm[]{e_2283, term}), checkListAnnos(termFactory, d_2283));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}