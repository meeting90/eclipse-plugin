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

@SuppressWarnings("all") public class $Global_2_0 extends Strategy 
{ 
  public static $Global_2_0 instance = new $Global_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_12039, Strategy o_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Global_2_0");
    Fail5421:
    { 
      IStrategoTerm v_12149 = null;
      IStrategoTerm t_12149 = null;
      IStrategoTerm u_12149 = null;
      IStrategoTerm w_12149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consGlobal_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5421;
      t_12149 = term.getSubterm(0);
      u_12149 = term.getSubterm(1);
      IStrategoList annos250 = term.getAnnotations();
      v_12149 = annos250;
      term = n_12039.invoke(context, t_12149);
      if(term == null)
        break Fail5421;
      w_12149 = term;
      term = o_12039.invoke(context, u_12149);
      if(term == null)
        break Fail5421;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consGlobal_2, new IStrategoTerm[]{w_12149, term}), checkListAnnos(termFactory, v_12149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}