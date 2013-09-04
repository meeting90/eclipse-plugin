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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_12038, Strategy i_12038, Strategy j_12038, Strategy k_12038, Strategy l_12038, Strategy m_12038, Strategy n_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Results_7_0");
    Fail5394:
    { 
      IStrategoTerm z_12146 = null;
      IStrategoTerm s_12146 = null;
      IStrategoTerm t_12146 = null;
      IStrategoTerm u_12146 = null;
      IStrategoTerm v_12146 = null;
      IStrategoTerm w_12146 = null;
      IStrategoTerm x_12146 = null;
      IStrategoTerm y_12146 = null;
      IStrategoTerm a_12147 = null;
      IStrategoTerm b_12147 = null;
      IStrategoTerm c_12147 = null;
      IStrategoTerm d_12147 = null;
      IStrategoTerm e_12147 = null;
      IStrategoTerm f_12147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consResults_7 != ((IStrategoAppl)term).getConstructor())
        break Fail5394;
      s_12146 = term.getSubterm(0);
      t_12146 = term.getSubterm(1);
      u_12146 = term.getSubterm(2);
      v_12146 = term.getSubterm(3);
      w_12146 = term.getSubterm(4);
      x_12146 = term.getSubterm(5);
      y_12146 = term.getSubterm(6);
      IStrategoList annos235 = term.getAnnotations();
      z_12146 = annos235;
      term = h_12038.invoke(context, s_12146);
      if(term == null)
        break Fail5394;
      a_12147 = term;
      term = i_12038.invoke(context, t_12146);
      if(term == null)
        break Fail5394;
      b_12147 = term;
      term = j_12038.invoke(context, u_12146);
      if(term == null)
        break Fail5394;
      c_12147 = term;
      term = k_12038.invoke(context, v_12146);
      if(term == null)
        break Fail5394;
      d_12147 = term;
      term = l_12038.invoke(context, w_12146);
      if(term == null)
        break Fail5394;
      e_12147 = term;
      term = m_12038.invoke(context, x_12146);
      if(term == null)
        break Fail5394;
      f_12147 = term;
      term = n_12038.invoke(context, y_12146);
      if(term == null)
        break Fail5394;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consResults_7, new IStrategoTerm[]{a_12147, b_12147, c_12147, d_12147, e_12147, f_12147, term}), checkListAnnos(termFactory, z_12146));
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