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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_12038, Strategy v_12038)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AST_2_0");
    Fail5399:
    { 
      IStrategoTerm w_12147 = null;
      IStrategoTerm u_12147 = null;
      IStrategoTerm v_12147 = null;
      IStrategoTerm x_12147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consAST_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5399;
      u_12147 = term.getSubterm(0);
      v_12147 = term.getSubterm(1);
      IStrategoList annos237 = term.getAnnotations();
      w_12147 = annos237;
      term = u_12038.invoke(context, u_12147);
      if(term == null)
        break Fail5399;
      x_12147 = term;
      term = v_12038.invoke(context, v_12147);
      if(term == null)
        break Fail5399;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consAST_2, new IStrategoTerm[]{x_12147, term}), checkListAnnos(termFactory, w_12147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}