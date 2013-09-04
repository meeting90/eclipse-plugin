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

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_12040, Strategy h_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail5438:
    { 
      IStrategoTerm u_12151 = null;
      IStrategoTerm s_12151 = null;
      IStrategoTerm t_12151 = null;
      IStrategoTerm v_12151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5438;
      s_12151 = term.getSubterm(0);
      t_12151 = term.getSubterm(1);
      IStrategoList annos263 = term.getAnnotations();
      u_12151 = annos263;
      term = g_12040.invoke(context, s_12151);
      if(term == null)
        break Fail5438;
      v_12151 = term;
      term = h_12040.invoke(context, t_12151);
      if(term == null)
        break Fail5438;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAssign_2, new IStrategoTerm[]{v_12151, term}), checkListAnnos(termFactory, u_12151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}