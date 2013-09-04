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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_12037, Strategy z_12037)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Pointcut_2_0");
    Fail5390:
    { 
      IStrategoTerm y_12145 = null;
      IStrategoTerm w_12145 = null;
      IStrategoTerm x_12145 = null;
      IStrategoTerm z_12145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPointcut_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5390;
      w_12145 = term.getSubterm(0);
      x_12145 = term.getSubterm(1);
      IStrategoList annos231 = term.getAnnotations();
      y_12145 = annos231;
      term = y_12037.invoke(context, w_12145);
      if(term == null)
        break Fail5390;
      z_12145 = term;
      term = z_12037.invoke(context, x_12145);
      if(term == null)
        break Fail5390;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPointcut_2, new IStrategoTerm[]{z_12145, term}), checkListAnnos(termFactory, y_12145));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}