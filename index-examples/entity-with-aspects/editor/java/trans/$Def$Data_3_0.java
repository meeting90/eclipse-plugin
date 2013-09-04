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

@SuppressWarnings("all") public class $Def$Data_3_0 extends Strategy 
{ 
  public static $Def$Data_3_0 instance = new $Def$Data_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_2176, Strategy l_2176, Strategy m_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefData_3_0");
    Fail2508:
    { 
      IStrategoTerm g_2286 = null;
      IStrategoTerm d_2286 = null;
      IStrategoTerm e_2286 = null;
      IStrategoTerm f_2286 = null;
      IStrategoTerm h_2286 = null;
      IStrategoTerm i_2286 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)term).getConstructor())
        break Fail2508;
      d_2286 = term.getSubterm(0);
      e_2286 = term.getSubterm(1);
      f_2286 = term.getSubterm(2);
      IStrategoList annos107 = term.getAnnotations();
      g_2286 = annos107;
      term = k_2176.invoke(context, d_2286);
      if(term == null)
        break Fail2508;
      h_2286 = term;
      term = l_2176.invoke(context, e_2286);
      if(term == null)
        break Fail2508;
      i_2286 = term;
      term = m_2176.invoke(context, f_2286);
      if(term == null)
        break Fail2508;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{h_2286, i_2286, term}), checkListAnnos(termFactory, g_2286));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}