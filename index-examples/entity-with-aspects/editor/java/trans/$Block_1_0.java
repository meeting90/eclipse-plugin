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

@SuppressWarnings("all") public class $Block_1_0 extends Strategy 
{ 
  public static $Block_1_0 instance = new $Block_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Block_1_0");
    Fail2535:
    { 
      IStrategoTerm v_2288 = null;
      IStrategoTerm u_2288 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consBlock_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2535;
      u_2288 = term.getSubterm(0);
      IStrategoList annos124 = term.getAnnotations();
      v_2288 = annos124;
      term = k_2177.invoke(context, u_2288);
      if(term == null)
        break Fail2535;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consBlock_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, v_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}