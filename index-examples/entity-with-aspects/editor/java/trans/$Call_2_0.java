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

@SuppressWarnings("all") public class $Call_2_0 extends Strategy 
{ 
  public static $Call_2_0 instance = new $Call_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_12040, Strategy d_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail5435:
    { 
      IStrategoTerm j_12151 = null;
      IStrategoTerm h_12151 = null;
      IStrategoTerm i_12151 = null;
      IStrategoTerm k_12151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5435;
      h_12151 = term.getSubterm(0);
      i_12151 = term.getSubterm(1);
      IStrategoList annos260 = term.getAnnotations();
      j_12151 = annos260;
      term = c_12040.invoke(context, h_12151);
      if(term == null)
        break Fail5435;
      k_12151 = term;
      term = d_12040.invoke(context, i_12151);
      if(term == null)
        break Fail5435;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCall_2, new IStrategoTerm[]{k_12151, term}), checkListAnnos(termFactory, j_12151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}