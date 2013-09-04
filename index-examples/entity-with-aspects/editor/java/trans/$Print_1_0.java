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

@SuppressWarnings("all") public class $Print_1_0 extends Strategy 
{ 
  public static $Print_1_0 instance = new $Print_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Print_1_0");
    Fail5436:
    { 
      IStrategoTerm n_12151 = null;
      IStrategoTerm m_12151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPrint_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5436;
      m_12151 = term.getSubterm(0);
      IStrategoList annos261 = term.getAnnotations();
      n_12151 = annos261;
      term = e_12040.invoke(context, m_12151);
      if(term == null)
        break Fail5436;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_12151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}