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

@SuppressWarnings("all") public class $A$S$T_2_0 extends Strategy 
{ 
  public static $A$S$T_2_0 instance = new $A$S$T_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_2175, Strategy a_2176)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AST_2_0");
    Fail2497:
    { 
      IStrategoTerm b_2285 = null;
      IStrategoTerm z_2284 = null;
      IStrategoTerm a_2285 = null;
      IStrategoTerm c_2285 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAST_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2497;
      z_2284 = term.getSubterm(0);
      a_2285 = term.getSubterm(1);
      IStrategoList annos99 = term.getAnnotations();
      b_2285 = annos99;
      term = z_2175.invoke(context, z_2284);
      if(term == null)
        break Fail2497;
      c_2285 = term;
      term = a_2176.invoke(context, a_2285);
      if(term == null)
        break Fail2497;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{c_2285, term}), checkListAnnos(termFactory, b_2285));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}