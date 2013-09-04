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

@SuppressWarnings("all") public class $File$Entries_2_0 extends Strategy 
{ 
  public static $File$Entries_2_0 instance = new $File$Entries_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_2176, Strategy q_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FileEntries_2_0");
    Fail2516:
    { 
      IStrategoTerm s_2286 = null;
      IStrategoTerm q_2286 = null;
      IStrategoTerm r_2286 = null;
      IStrategoTerm t_2286 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consFileEntries_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2516;
      q_2286 = term.getSubterm(0);
      r_2286 = term.getSubterm(1);
      IStrategoList annos110 = term.getAnnotations();
      s_2286 = annos110;
      term = p_2176.invoke(context, q_2286);
      if(term == null)
        break Fail2516;
      t_2286 = term;
      term = q_2176.invoke(context, r_2286);
      if(term == null)
        break Fail2516;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consFileEntries_2, new IStrategoTerm[]{t_2286, term}), checkListAnnos(termFactory, s_2286));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}