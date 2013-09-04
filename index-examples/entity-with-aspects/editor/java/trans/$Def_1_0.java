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

@SuppressWarnings("all") public class $Def_1_0 extends Strategy 
{ 
  public static $Def_1_0 instance = new $Def_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Def_1_0");
    Fail2501:
    { 
      IStrategoTerm i_2285 = null;
      IStrategoTerm h_2285 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2501;
      h_2285 = term.getSubterm(0);
      IStrategoList annos101 = term.getAnnotations();
      i_2285 = annos101;
      term = c_2176.invoke(context, h_2285);
      if(term == null)
        break Fail2501;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDef_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_2285));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}