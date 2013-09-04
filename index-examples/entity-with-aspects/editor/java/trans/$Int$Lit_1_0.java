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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IntLit_1_0");
    Fail5431:
    { 
      IStrategoTerm u_12150 = null;
      IStrategoTerm t_12150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consIntLit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5431;
      t_12150 = term.getSubterm(0);
      IStrategoList annos256 = term.getAnnotations();
      u_12150 = annos256;
      term = x_12039.invoke(context, t_12150);
      if(term == null)
        break Fail5431;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consIntLit_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_12150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}