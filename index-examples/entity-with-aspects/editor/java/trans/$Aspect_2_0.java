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

@SuppressWarnings("all") public class $Aspect_2_0 extends Strategy 
{ 
  public static $Aspect_2_0 instance = new $Aspect_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_12041, Strategy h_12041)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Aspect_2_0");
    Fail5451:
    { 
      IStrategoTerm f_12154 = null;
      IStrategoTerm d_12154 = null;
      IStrategoTerm e_12154 = null;
      IStrategoTerm g_12154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAspect_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5451;
      d_12154 = term.getSubterm(0);
      e_12154 = term.getSubterm(1);
      IStrategoList annos274 = term.getAnnotations();
      f_12154 = annos274;
      term = g_12041.invoke(context, d_12154);
      if(term == null)
        break Fail5451;
      g_12154 = term;
      term = h_12041.invoke(context, e_12154);
      if(term == null)
        break Fail5451;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAspect_2, new IStrategoTerm[]{g_12154, term}), checkListAnnos(termFactory, f_12154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}