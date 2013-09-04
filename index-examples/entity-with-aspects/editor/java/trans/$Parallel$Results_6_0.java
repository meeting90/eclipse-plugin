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

@SuppressWarnings("all") public class $Parallel$Results_6_0 extends Strategy 
{ 
  public static $Parallel$Results_6_0 instance = new $Parallel$Results_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_12038, Strategy p_12038, Strategy q_12038, Strategy r_12038, Strategy s_12038, Strategy t_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParallelResults_6_0");
    Fail5395:
    { 
      IStrategoTerm n_12147 = null;
      IStrategoTerm h_12147 = null;
      IStrategoTerm i_12147 = null;
      IStrategoTerm j_12147 = null;
      IStrategoTerm k_12147 = null;
      IStrategoTerm l_12147 = null;
      IStrategoTerm m_12147 = null;
      IStrategoTerm o_12147 = null;
      IStrategoTerm p_12147 = null;
      IStrategoTerm q_12147 = null;
      IStrategoTerm r_12147 = null;
      IStrategoTerm s_12147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParallelResults_6 != ((IStrategoAppl)term).getConstructor())
        break Fail5395;
      h_12147 = term.getSubterm(0);
      i_12147 = term.getSubterm(1);
      j_12147 = term.getSubterm(2);
      k_12147 = term.getSubterm(3);
      l_12147 = term.getSubterm(4);
      m_12147 = term.getSubterm(5);
      IStrategoList annos236 = term.getAnnotations();
      n_12147 = annos236;
      term = o_12038.invoke(context, h_12147);
      if(term == null)
        break Fail5395;
      o_12147 = term;
      term = p_12038.invoke(context, i_12147);
      if(term == null)
        break Fail5395;
      p_12147 = term;
      term = q_12038.invoke(context, j_12147);
      if(term == null)
        break Fail5395;
      q_12147 = term;
      term = r_12038.invoke(context, k_12147);
      if(term == null)
        break Fail5395;
      r_12147 = term;
      term = s_12038.invoke(context, l_12147);
      if(term == null)
        break Fail5395;
      s_12147 = term;
      term = t_12038.invoke(context, m_12147);
      if(term == null)
        break Fail5395;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consParallelResults_6, new IStrategoTerm[]{o_12147, p_12147, q_12147, r_12147, s_12147, term}), checkListAnnos(termFactory, n_12147));
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