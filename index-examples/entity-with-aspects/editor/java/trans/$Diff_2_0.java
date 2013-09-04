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

@SuppressWarnings("all") public class $Diff_2_0 extends Strategy 
{ 
  public static $Diff_2_0 instance = new $Diff_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_2176, Strategy j_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Diff_2_0");
    Fail2506:
    { 
      IStrategoTerm a_2286 = null;
      IStrategoTerm y_2285 = null;
      IStrategoTerm z_2285 = null;
      IStrategoTerm b_2286 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDiff_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2506;
      y_2285 = term.getSubterm(0);
      z_2285 = term.getSubterm(1);
      IStrategoList annos106 = term.getAnnotations();
      a_2286 = annos106;
      term = i_2176.invoke(context, y_2285);
      if(term == null)
        break Fail2506;
      b_2286 = term;
      term = j_2176.invoke(context, z_2285);
      if(term == null)
        break Fail2506;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDiff_2, new IStrategoTerm[]{b_2286, term}), checkListAnnos(termFactory, a_2286));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}