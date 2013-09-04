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

@SuppressWarnings("all") public class $Prop$Access_2_0 extends Strategy 
{ 
  public static $Prop$Access_2_0 instance = new $Prop$Access_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_2177, Strategy f_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropAccess_2_0");
    Fail2531:
    { 
      IStrategoTerm g_2288 = null;
      IStrategoTerm e_2288 = null;
      IStrategoTerm f_2288 = null;
      IStrategoTerm h_2288 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPropAccess_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2531;
      e_2288 = term.getSubterm(0);
      f_2288 = term.getSubterm(1);
      IStrategoList annos120 = term.getAnnotations();
      g_2288 = annos120;
      term = e_2177.invoke(context, e_2288);
      if(term == null)
        break Fail2531;
      h_2288 = term;
      term = f_2177.invoke(context, f_2288);
      if(term == null)
        break Fail2531;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPropAccess_2, new IStrategoTerm[]{h_2288, term}), checkListAnnos(termFactory, g_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}