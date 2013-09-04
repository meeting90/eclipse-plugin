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

@SuppressWarnings("all") public class $Function_3_0 extends Strategy 
{ 
  public static $Function_3_0 instance = new $Function_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_2177, Strategy v_2177, Strategy w_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Function_3_0");
    Fail2540:
    { 
      IStrategoTerm w_2289 = null;
      IStrategoTerm t_2289 = null;
      IStrategoTerm u_2289 = null;
      IStrategoTerm v_2289 = null;
      IStrategoTerm x_2289 = null;
      IStrategoTerm y_2289 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consFunction_3 != ((IStrategoAppl)term).getConstructor())
        break Fail2540;
      t_2289 = term.getSubterm(0);
      u_2289 = term.getSubterm(1);
      v_2289 = term.getSubterm(2);
      IStrategoList annos129 = term.getAnnotations();
      w_2289 = annos129;
      term = u_2177.invoke(context, t_2289);
      if(term == null)
        break Fail2540;
      x_2289 = term;
      term = v_2177.invoke(context, u_2289);
      if(term == null)
        break Fail2540;
      y_2289 = term;
      term = w_2177.invoke(context, v_2289);
      if(term == null)
        break Fail2540;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consFunction_3, new IStrategoTerm[]{x_2289, y_2289, term}), checkListAnnos(termFactory, w_2289));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}