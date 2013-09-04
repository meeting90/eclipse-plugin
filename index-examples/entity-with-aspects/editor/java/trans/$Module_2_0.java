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

@SuppressWarnings("all") public class $Module_2_0 extends Strategy 
{ 
  public static $Module_2_0 instance = new $Module_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_12039, Strategy s_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_2_0");
    Fail5426:
    { 
      IStrategoTerm g_12150 = null;
      IStrategoTerm e_12150 = null;
      IStrategoTerm f_12150 = null;
      IStrategoTerm h_12150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5426;
      e_12150 = term.getSubterm(0);
      f_12150 = term.getSubterm(1);
      IStrategoList annos253 = term.getAnnotations();
      g_12150 = annos253;
      term = r_12039.invoke(context, e_12150);
      if(term == null)
        break Fail5426;
      h_12150 = term;
      term = s_12039.invoke(context, f_12150);
      if(term == null)
        break Fail5426;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consModule_2, new IStrategoTerm[]{h_12150, term}), checkListAnnos(termFactory, g_12150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}