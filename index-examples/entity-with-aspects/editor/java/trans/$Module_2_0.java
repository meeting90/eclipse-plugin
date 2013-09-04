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

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_2176, Strategy x_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail2524:
    { 
      IStrategoTerm l_2287 = null;
      IStrategoTerm j_2287 = null;
      IStrategoTerm k_2287 = null;
      IStrategoTerm m_2287 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2524;
      j_2287 = term.getSubterm(0);
      k_2287 = term.getSubterm(1);
      IStrategoList annos115 = term.getAnnotations();
      l_2287 = annos115;
      term = w_2176.invoke(context, j_2287);
      if(term == null)
        break Fail2524;
      m_2287 = term;
      term = x_2176.invoke(context, k_2287);
      if(term == null)
        break Fail2524;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consModule_2, new IStrategoTerm[]{m_2287, term}), checkListAnnos(termFactory, l_2287));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}