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

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_2177, Strategy b_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail2526:
    { 
      IStrategoTerm v_2287 = null;
      IStrategoTerm t_2287 = null;
      IStrategoTerm u_2287 = null;
      IStrategoTerm w_2287 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2526;
      t_2287 = term.getSubterm(0);
      u_2287 = term.getSubterm(1);
      IStrategoList annos117 = term.getAnnotations();
      v_2287 = annos117;
      term = a_2177.invoke(context, t_2287);
      if(term == null)
        break Fail2526;
      w_2287 = term;
      term = b_2177.invoke(context, u_2287);
      if(term == null)
        break Fail2526;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{w_2287, term}), checkListAnnos(termFactory, v_2287));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}