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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_2175, Strategy u_2175, Strategy v_2175, Strategy w_2175, Strategy x_2175, Strategy y_2175)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ParallelResults_6_0");
    Fail2493:
    { 
      IStrategoTerm s_2284 = null;
      IStrategoTerm m_2284 = null;
      IStrategoTerm n_2284 = null;
      IStrategoTerm o_2284 = null;
      IStrategoTerm p_2284 = null;
      IStrategoTerm q_2284 = null;
      IStrategoTerm r_2284 = null;
      IStrategoTerm t_2284 = null;
      IStrategoTerm u_2284 = null;
      IStrategoTerm v_2284 = null;
      IStrategoTerm w_2284 = null;
      IStrategoTerm x_2284 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParallelResults_6 != ((IStrategoAppl)term).getConstructor())
        break Fail2493;
      m_2284 = term.getSubterm(0);
      n_2284 = term.getSubterm(1);
      o_2284 = term.getSubterm(2);
      p_2284 = term.getSubterm(3);
      q_2284 = term.getSubterm(4);
      r_2284 = term.getSubterm(5);
      IStrategoList annos98 = term.getAnnotations();
      s_2284 = annos98;
      term = t_2175.invoke(context, m_2284);
      if(term == null)
        break Fail2493;
      t_2284 = term;
      term = u_2175.invoke(context, n_2284);
      if(term == null)
        break Fail2493;
      u_2284 = term;
      term = v_2175.invoke(context, o_2284);
      if(term == null)
        break Fail2493;
      v_2284 = term;
      term = w_2175.invoke(context, p_2284);
      if(term == null)
        break Fail2493;
      w_2284 = term;
      term = x_2175.invoke(context, q_2284);
      if(term == null)
        break Fail2493;
      x_2284 = term;
      term = y_2175.invoke(context, r_2284);
      if(term == null)
        break Fail2493;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consParallelResults_6, new IStrategoTerm[]{t_2284, u_2284, v_2284, w_2284, x_2284, term}), checkListAnnos(termFactory, s_2284));
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