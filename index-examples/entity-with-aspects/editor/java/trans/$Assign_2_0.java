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

@SuppressWarnings("all") public class $Assign_2_0 extends Strategy 
{ 
  public static $Assign_2_0 instance = new $Assign_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_2177, Strategy m_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Assign_2_0");
    Fail2536:
    { 
      IStrategoTerm z_2288 = null;
      IStrategoTerm x_2288 = null;
      IStrategoTerm y_2288 = null;
      IStrategoTerm a_2289 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2536;
      x_2288 = term.getSubterm(0);
      y_2288 = term.getSubterm(1);
      IStrategoList annos125 = term.getAnnotations();
      z_2288 = annos125;
      term = l_2177.invoke(context, x_2288);
      if(term == null)
        break Fail2536;
      a_2289 = term;
      term = m_2177.invoke(context, y_2288);
      if(term == null)
        break Fail2536;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAssign_2, new IStrategoTerm[]{a_2289, term}), checkListAnnos(termFactory, z_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}