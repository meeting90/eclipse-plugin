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

@SuppressWarnings("all") public class $Assigned_1_0 extends Strategy 
{ 
  public static $Assigned_1_0 instance = new $Assigned_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assigned_1_0");
    Fail5443:
    { 
      IStrategoTerm w_12152 = null;
      IStrategoTerm v_12152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAssigned_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5443;
      v_12152 = term.getSubterm(0);
      IStrategoList annos268 = term.getAnnotations();
      w_12152 = annos268;
      term = s_12040.invoke(context, v_12152);
      if(term == null)
        break Fail5443;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAssigned_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_12152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}