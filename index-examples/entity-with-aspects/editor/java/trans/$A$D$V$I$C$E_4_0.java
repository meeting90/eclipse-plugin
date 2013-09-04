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

@SuppressWarnings("all") public class $A$D$V$I$C$E_4_0 extends Strategy 
{ 
  public static $A$D$V$I$C$E_4_0 instance = new $A$D$V$I$C$E_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_2175, Strategy g_2175, Strategy h_2175, Strategy i_2175)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ADVICE_4_0");
    Fail2489:
    { 
      IStrategoTerm k_2283 = null;
      IStrategoTerm g_2283 = null;
      IStrategoTerm h_2283 = null;
      IStrategoTerm i_2283 = null;
      IStrategoTerm j_2283 = null;
      IStrategoTerm l_2283 = null;
      IStrategoTerm m_2283 = null;
      IStrategoTerm n_2283 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consADVICE_4 != ((IStrategoAppl)term).getConstructor())
        break Fail2489;
      g_2283 = term.getSubterm(0);
      h_2283 = term.getSubterm(1);
      i_2283 = term.getSubterm(2);
      j_2283 = term.getSubterm(3);
      IStrategoList annos94 = term.getAnnotations();
      k_2283 = annos94;
      term = f_2175.invoke(context, g_2283);
      if(term == null)
        break Fail2489;
      l_2283 = term;
      term = g_2175.invoke(context, h_2283);
      if(term == null)
        break Fail2489;
      m_2283 = term;
      term = h_2175.invoke(context, i_2283);
      if(term == null)
        break Fail2489;
      n_2283 = term;
      term = i_2175.invoke(context, j_2283);
      if(term == null)
        break Fail2489;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consADVICE_4, new IStrategoTerm[]{l_2283, m_2283, n_2283, term}), checkListAnnos(termFactory, k_2283));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}