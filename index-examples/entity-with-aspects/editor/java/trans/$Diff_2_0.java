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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_12039, Strategy e_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Diff_2_0");
    Fail5408:
    { 
      IStrategoTerm v_12148 = null;
      IStrategoTerm t_12148 = null;
      IStrategoTerm u_12148 = null;
      IStrategoTerm w_12148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDiff_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5408;
      t_12148 = term.getSubterm(0);
      u_12148 = term.getSubterm(1);
      IStrategoList annos244 = term.getAnnotations();
      v_12148 = annos244;
      term = d_12039.invoke(context, t_12148);
      if(term == null)
        break Fail5408;
      w_12148 = term;
      term = e_12039.invoke(context, u_12148);
      if(term == null)
        break Fail5408;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDiff_2, new IStrategoTerm[]{w_12148, term}), checkListAnnos(termFactory, v_12148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}