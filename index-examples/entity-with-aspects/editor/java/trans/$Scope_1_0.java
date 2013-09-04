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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Scope_1_0");
    Fail2498:
    { 
      IStrategoTerm f_2285 = null;
      IStrategoTerm e_2285 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consScope_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2498;
      e_2285 = term.getSubterm(0);
      IStrategoList annos100 = term.getAnnotations();
      f_2285 = annos100;
      term = b_2176.invoke(context, e_2285);
      if(term == null)
        break Fail2498;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consScope_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_2285));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}