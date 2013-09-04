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

@SuppressWarnings("all") public class $Print_1_0 extends Strategy 
{ 
  public static $Print_1_0 instance = new $Print_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Print_1_0");
    Fail2534:
    { 
      IStrategoTerm s_2288 = null;
      IStrategoTerm r_2288 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPrint_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2534;
      r_2288 = term.getSubterm(0);
      IStrategoList annos123 = term.getAnnotations();
      s_2288 = annos123;
      term = j_2177.invoke(context, r_2288);
      if(term == null)
        break Fail2534;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPrint_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_2288));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}