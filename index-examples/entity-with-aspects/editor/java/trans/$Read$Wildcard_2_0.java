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

@SuppressWarnings("all") public class $Read$Wildcard_2_0 extends Strategy 
{ 
  public static $Read$Wildcard_2_0 instance = new $Read$Wildcard_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_2176, Strategy h_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ReadWildcard_2_0");
    Fail2505:
    { 
      IStrategoTerm v_2285 = null;
      IStrategoTerm t_2285 = null;
      IStrategoTerm u_2285 = null;
      IStrategoTerm w_2285 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consReadWildcard_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2505;
      t_2285 = term.getSubterm(0);
      u_2285 = term.getSubterm(1);
      IStrategoList annos105 = term.getAnnotations();
      v_2285 = annos105;
      term = g_2176.invoke(context, t_2285);
      if(term == null)
        break Fail2505;
      w_2285 = term;
      term = h_2176.invoke(context, u_2285);
      if(term == null)
        break Fail2505;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consReadWildcard_2, new IStrategoTerm[]{w_2285, term}), checkListAnnos(termFactory, v_2285));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}