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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_12040, Strategy u_12040, Strategy v_12040, Strategy w_12040, Strategy x_12040, Strategy y_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Advice_6_0");
    Fail5446:
    { 
      IStrategoTerm e_12153 = null;
      IStrategoTerm y_12152 = null;
      IStrategoTerm z_12152 = null;
      IStrategoTerm a_12153 = null;
      IStrategoTerm b_12153 = null;
      IStrategoTerm c_12153 = null;
      IStrategoTerm d_12153 = null;
      IStrategoTerm f_12153 = null;
      IStrategoTerm g_12153 = null;
      IStrategoTerm h_12153 = null;
      IStrategoTerm i_12153 = null;
      IStrategoTerm j_12153 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAdvice_6 != ((IStrategoAppl)term).getConstructor())
        break Fail5446;
      y_12152 = term.getSubterm(0);
      z_12152 = term.getSubterm(1);
      a_12153 = term.getSubterm(2);
      b_12153 = term.getSubterm(3);
      c_12153 = term.getSubterm(4);
      d_12153 = term.getSubterm(5);
      IStrategoList annos269 = term.getAnnotations();
      e_12153 = annos269;
      term = t_12040.invoke(context, y_12152);
      if(term == null)
        break Fail5446;
      f_12153 = term;
      term = u_12040.invoke(context, z_12152);
      if(term == null)
        break Fail5446;
      g_12153 = term;
      term = v_12040.invoke(context, a_12153);
      if(term == null)
        break Fail5446;
      h_12153 = term;
      term = w_12040.invoke(context, b_12153);
      if(term == null)
        break Fail5446;
      i_12153 = term;
      term = x_12040.invoke(context, c_12153);
      if(term == null)
        break Fail5446;
      j_12153 = term;
      term = y_12040.invoke(context, d_12153);
      if(term == null)
        break Fail5446;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAdvice_6, new IStrategoTerm[]{f_12153, g_12153, h_12153, i_12153, j_12153, term}), checkListAnnos(termFactory, e_12153));
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