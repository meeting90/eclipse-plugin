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

@SuppressWarnings("all") public class $Int$Lit_1_0 extends Strategy 
{ 
  public static $Int$Lit_1_0 instance = new $Int$Lit_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntLit_1_0");
    Fail2529:
    { 
      IStrategoTerm z_2287 = null;
      IStrategoTerm y_2287 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consIntLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2529;
      y_2287 = term.getSubterm(0);
      IStrategoList annos118 = term.getAnnotations();
      z_2287 = annos118;
      term = c_2177.invoke(context, y_2287);
      if(term == null)
        break Fail2529;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consIntLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_2287));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}