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

@SuppressWarnings("all") public class $Scope_1_0 extends Strategy 
{ 
  public static $Scope_1_0 instance = new $Scope_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_1_0");
    Fail5400:
    { 
      IStrategoTerm a_12148 = null;
      IStrategoTerm z_12147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consScope_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5400;
      z_12147 = term.getSubterm(0);
      IStrategoList annos238 = term.getAnnotations();
      a_12148 = annos238;
      term = w_12038.invoke(context, z_12147);
      if(term == null)
        break Fail5400;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consScope_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_12148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}