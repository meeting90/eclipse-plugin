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

@SuppressWarnings("all") public class $Results_7_0 extends Strategy 
{ 
  public static $Results_7_0 instance = new $Results_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_2175, Strategy n_2175, Strategy o_2175, Strategy p_2175, Strategy q_2175, Strategy r_2175, Strategy s_2175)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Results_7_0");
    Fail2492:
    { 
      IStrategoTerm e_2284 = null;
      IStrategoTerm x_2283 = null;
      IStrategoTerm y_2283 = null;
      IStrategoTerm z_2283 = null;
      IStrategoTerm a_2284 = null;
      IStrategoTerm b_2284 = null;
      IStrategoTerm c_2284 = null;
      IStrategoTerm d_2284 = null;
      IStrategoTerm f_2284 = null;
      IStrategoTerm g_2284 = null;
      IStrategoTerm h_2284 = null;
      IStrategoTerm i_2284 = null;
      IStrategoTerm j_2284 = null;
      IStrategoTerm k_2284 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consResults_7 != ((IStrategoAppl)term).getConstructor())
        break Fail2492;
      x_2283 = term.getSubterm(0);
      y_2283 = term.getSubterm(1);
      z_2283 = term.getSubterm(2);
      a_2284 = term.getSubterm(3);
      b_2284 = term.getSubterm(4);
      c_2284 = term.getSubterm(5);
      d_2284 = term.getSubterm(6);
      IStrategoList annos97 = term.getAnnotations();
      e_2284 = annos97;
      term = m_2175.invoke(context, x_2283);
      if(term == null)
        break Fail2492;
      f_2284 = term;
      term = n_2175.invoke(context, y_2283);
      if(term == null)
        break Fail2492;
      g_2284 = term;
      term = o_2175.invoke(context, z_2283);
      if(term == null)
        break Fail2492;
      h_2284 = term;
      term = p_2175.invoke(context, a_2284);
      if(term == null)
        break Fail2492;
      i_2284 = term;
      term = q_2175.invoke(context, b_2284);
      if(term == null)
        break Fail2492;
      j_2284 = term;
      term = r_2175.invoke(context, c_2284);
      if(term == null)
        break Fail2492;
      k_2284 = term;
      term = s_2175.invoke(context, d_2284);
      if(term == null)
        break Fail2492;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consResults_7, new IStrategoTerm[]{f_2284, g_2284, h_2284, i_2284, j_2284, k_2284, term}), checkListAnnos(termFactory, e_2284));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 7 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5], sargs[6]);
  }
}