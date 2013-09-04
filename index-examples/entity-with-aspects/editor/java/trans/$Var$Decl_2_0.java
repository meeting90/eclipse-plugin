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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_2177, Strategy r_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDecl_2_0");
    Fail2538:
    { 
      IStrategoTerm l_2289 = null;
      IStrategoTerm j_2289 = null;
      IStrategoTerm k_2289 = null;
      IStrategoTerm m_2289 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDecl_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2538;
      j_2289 = term.getSubterm(0);
      k_2289 = term.getSubterm(1);
      IStrategoList annos127 = term.getAnnotations();
      l_2289 = annos127;
      term = q_2177.invoke(context, j_2289);
      if(term == null)
        break Fail2538;
      m_2289 = term;
      term = r_2177.invoke(context, k_2289);
      if(term == null)
        break Fail2538;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consVarDecl_2, new IStrategoTerm[]{m_2289, term}), checkListAnnos(termFactory, l_2289));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}