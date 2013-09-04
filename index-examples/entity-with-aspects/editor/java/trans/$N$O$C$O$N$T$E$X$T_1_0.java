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

@SuppressWarnings("all") public class $N$O$C$O$N$T$E$X$T_1_0 extends Strategy 
{ 
  public static $N$O$C$O$N$T$E$X$T_1_0 instance = new $N$O$C$O$N$T$E$X$T_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NOCONTEXT_1_0");
    Fail2521:
    { 
      IStrategoTerm h_2287 = null;
      IStrategoTerm g_2287 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consNOCONTEXT_1 != ((IStrategoAppl)term).getConstructor())
        break Fail2521;
      g_2287 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      h_2287 = annos114;
      term = v_2176.invoke(context, g_2287);
      if(term == null)
        break Fail2521;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consNOCONTEXT_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_2287));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}