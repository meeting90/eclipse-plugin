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

@SuppressWarnings("all") public class $Module_3_0 extends Strategy 
{ 
  public static $Module_3_0 instance = new $Module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_2178, Strategy o_2178, Strategy p_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_3_0");
    Fail2550:
    { 
      IStrategoTerm q_2291 = null;
      IStrategoTerm n_2291 = null;
      IStrategoTerm o_2291 = null;
      IStrategoTerm p_2291 = null;
      IStrategoTerm r_2291 = null;
      IStrategoTerm s_2291 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail2550;
      n_2291 = term.getSubterm(0);
      o_2291 = term.getSubterm(1);
      p_2291 = term.getSubterm(2);
      IStrategoList annos137 = term.getAnnotations();
      q_2291 = annos137;
      term = n_2178.invoke(context, n_2291);
      if(term == null)
        break Fail2550;
      r_2291 = term;
      term = o_2178.invoke(context, o_2291);
      if(term == null)
        break Fail2550;
      s_2291 = term;
      term = p_2178.invoke(context, p_2291);
      if(term == null)
        break Fail2550;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consModule_3, new IStrategoTerm[]{r_2291, s_2291, term}), checkListAnnos(termFactory, q_2291));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}