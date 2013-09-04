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

@SuppressWarnings("all") public class $Anon_1_0 extends Strategy 
{ 
  public static $Anon_1_0 instance = new $Anon_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Anon_1_0");
    Fail2514:
    { 
      IStrategoTerm o_2286 = null;
      IStrategoTerm n_2286 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAnon_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2514;
      n_2286 = term.getSubterm(0);
      IStrategoList annos109 = term.getAnnotations();
      o_2286 = annos109;
      term = o_2176.invoke(context, n_2286);
      if(term == null)
        break Fail2514;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAnon_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_2286));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}