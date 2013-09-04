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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_2177, Strategy i_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Call_2_0");
    Fail2533:
    { 
      IStrategoTerm o_2288 = null;
      IStrategoTerm m_2288 = null;
      IStrategoTerm n_2288 = null;
      IStrategoTerm p_2288 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consCall_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2533;
      m_2288 = term.getSubterm(0);
      n_2288 = term.getSubterm(1);
      IStrategoList annos122 = term.getAnnotations();
      o_2288 = annos122;
      term = h_2177.invoke(context, m_2288);
      if(term == null)
        break Fail2533;
      p_2288 = term;
      term = i_2177.invoke(context, n_2288);
      if(term == null)
        break Fail2533;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consCall_2, new IStrategoTerm[]{p_2288, term}), checkListAnnos(termFactory, o_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}