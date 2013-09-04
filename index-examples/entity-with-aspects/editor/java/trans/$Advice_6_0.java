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

@SuppressWarnings("all") public class $Advice_6_0 extends Strategy 
{ 
  public static $Advice_6_0 instance = new $Advice_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_2177, Strategy z_2177, Strategy a_2178, Strategy b_2178, Strategy c_2178, Strategy d_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Advice_6_0");
    Fail2544:
    { 
      IStrategoTerm j_2290 = null;
      IStrategoTerm d_2290 = null;
      IStrategoTerm e_2290 = null;
      IStrategoTerm f_2290 = null;
      IStrategoTerm g_2290 = null;
      IStrategoTerm h_2290 = null;
      IStrategoTerm i_2290 = null;
      IStrategoTerm k_2290 = null;
      IStrategoTerm l_2290 = null;
      IStrategoTerm m_2290 = null;
      IStrategoTerm n_2290 = null;
      IStrategoTerm o_2290 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAdvice_6 != ((IStrategoAppl)term).getConstructor())
        break Fail2544;
      d_2290 = term.getSubterm(0);
      e_2290 = term.getSubterm(1);
      f_2290 = term.getSubterm(2);
      g_2290 = term.getSubterm(3);
      h_2290 = term.getSubterm(4);
      i_2290 = term.getSubterm(5);
      IStrategoList annos131 = term.getAnnotations();
      j_2290 = annos131;
      term = y_2177.invoke(context, d_2290);
      if(term == null)
        break Fail2544;
      k_2290 = term;
      term = z_2177.invoke(context, e_2290);
      if(term == null)
        break Fail2544;
      l_2290 = term;
      term = a_2178.invoke(context, f_2290);
      if(term == null)
        break Fail2544;
      m_2290 = term;
      term = b_2178.invoke(context, g_2290);
      if(term == null)
        break Fail2544;
      n_2290 = term;
      term = c_2178.invoke(context, h_2290);
      if(term == null)
        break Fail2544;
      o_2290 = term;
      term = d_2178.invoke(context, i_2290);
      if(term == null)
        break Fail2544;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAdvice_6, new IStrategoTerm[]{k_2290, l_2290, m_2290, n_2290, o_2290, term}), checkListAnnos(termFactory, j_2290));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 6 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5]);
  }
}