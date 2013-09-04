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

@SuppressWarnings("all") public class $Pointcut_3_0 extends Strategy 
{ 
  public static $Pointcut_3_0 instance = new $Pointcut_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_12040, Strategy a_12041, Strategy b_12041)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Pointcut_3_0");
    Fail5447:
    { 
      IStrategoTerm o_12153 = null;
      IStrategoTerm l_12153 = null;
      IStrategoTerm m_12153 = null;
      IStrategoTerm n_12153 = null;
      IStrategoTerm p_12153 = null;
      IStrategoTerm q_12153 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPointcut_3 != ((IStrategoAppl)term).getConstructor())
        break Fail5447;
      l_12153 = term.getSubterm(0);
      m_12153 = term.getSubterm(1);
      n_12153 = term.getSubterm(2);
      IStrategoList annos270 = term.getAnnotations();
      o_12153 = annos270;
      term = z_12040.invoke(context, l_12153);
      if(term == null)
        break Fail5447;
      p_12153 = term;
      term = a_12041.invoke(context, m_12153);
      if(term == null)
        break Fail5447;
      q_12153 = term;
      term = b_12041.invoke(context, n_12153);
      if(term == null)
        break Fail5447;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPointcut_3, new IStrategoTerm[]{p_12153, q_12153, term}), checkListAnnos(termFactory, o_12153));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}