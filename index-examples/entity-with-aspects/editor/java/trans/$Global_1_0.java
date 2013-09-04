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

@SuppressWarnings("all") public class $Global_1_0 extends Strategy 
{ 
  public static $Global_1_0 instance = new $Global_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Global_1_0");
    Fail2518:
    { 
      IStrategoTerm w_2286 = null;
      IStrategoTerm v_2286 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consGlobal_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2518;
      v_2286 = term.getSubterm(0);
      IStrategoList annos111 = term.getAnnotations();
      w_2286 = annos111;
      term = r_2176.invoke(context, v_2286);
      if(term == null)
        break Fail2518;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consGlobal_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_2286));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}