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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_2178, Strategy f_2178, Strategy g_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Pointcut_3_0");
    Fail2545:
    { 
      IStrategoTerm t_2290 = null;
      IStrategoTerm q_2290 = null;
      IStrategoTerm r_2290 = null;
      IStrategoTerm s_2290 = null;
      IStrategoTerm u_2290 = null;
      IStrategoTerm v_2290 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPointcut_3 != ((IStrategoAppl)term).getConstructor())
        break Fail2545;
      q_2290 = term.getSubterm(0);
      r_2290 = term.getSubterm(1);
      s_2290 = term.getSubterm(2);
      IStrategoList annos132 = term.getAnnotations();
      t_2290 = annos132;
      term = e_2178.invoke(context, q_2290);
      if(term == null)
        break Fail2545;
      u_2290 = term;
      term = f_2178.invoke(context, r_2290);
      if(term == null)
        break Fail2545;
      v_2290 = term;
      term = g_2178.invoke(context, s_2290);
      if(term == null)
        break Fail2545;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPointcut_3, new IStrategoTerm[]{u_2290, v_2290, term}), checkListAnnos(termFactory, t_2290));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}