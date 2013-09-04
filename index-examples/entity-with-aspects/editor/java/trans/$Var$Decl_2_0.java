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

@SuppressWarnings("all") public class $Var$Decl_2_0 extends Strategy 
{ 
  public static $Var$Decl_2_0 instance = new $Var$Decl_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_12040, Strategy m_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDecl_2_0");
    Fail5440:
    { 
      IStrategoTerm g_12152 = null;
      IStrategoTerm e_12152 = null;
      IStrategoTerm f_12152 = null;
      IStrategoTerm h_12152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5440;
      e_12152 = term.getSubterm(0);
      f_12152 = term.getSubterm(1);
      IStrategoList annos265 = term.getAnnotations();
      g_12152 = annos265;
      term = l_12040.invoke(context, e_12152);
      if(term == null)
        break Fail5440;
      h_12152 = term;
      term = m_12040.invoke(context, f_12152);
      if(term == null)
        break Fail5440;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consVarDecl_2, new IStrategoTerm[]{h_12152, term}), checkListAnnos(termFactory, g_12152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}