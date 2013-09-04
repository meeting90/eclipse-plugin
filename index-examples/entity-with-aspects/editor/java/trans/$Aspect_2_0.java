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

@SuppressWarnings("all") public class $Aspect_2_0 extends Strategy 
{ 
  public static $Aspect_2_0 instance = new $Aspect_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_2178, Strategy m_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Aspect_2_0");
    Fail2549:
    { 
      IStrategoTerm k_2291 = null;
      IStrategoTerm i_2291 = null;
      IStrategoTerm j_2291 = null;
      IStrategoTerm l_2291 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAspect_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2549;
      i_2291 = term.getSubterm(0);
      j_2291 = term.getSubterm(1);
      IStrategoList annos136 = term.getAnnotations();
      k_2291 = annos136;
      term = l_2178.invoke(context, i_2291);
      if(term == null)
        break Fail2549;
      l_2291 = term;
      term = m_2178.invoke(context, j_2291);
      if(term == null)
        break Fail2549;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAspect_2, new IStrategoTerm[]{l_2291, term}), checkListAnnos(termFactory, k_2291));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}