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

@SuppressWarnings("all") public class $Var$Decl$Init_3_0 extends Strategy 
{ 
  public static $Var$Decl$Init_3_0 instance = new $Var$Decl$Init_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_2177, Strategy o_2177, Strategy p_2177)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDeclInit_3_0");
    Fail2537:
    { 
      IStrategoTerm f_2289 = null;
      IStrategoTerm c_2289 = null;
      IStrategoTerm d_2289 = null;
      IStrategoTerm e_2289 = null;
      IStrategoTerm g_2289 = null;
      IStrategoTerm h_2289 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDeclInit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail2537;
      c_2289 = term.getSubterm(0);
      d_2289 = term.getSubterm(1);
      e_2289 = term.getSubterm(2);
      IStrategoList annos126 = term.getAnnotations();
      f_2289 = annos126;
      term = n_2177.invoke(context, c_2289);
      if(term == null)
        break Fail2537;
      g_2289 = term;
      term = o_2177.invoke(context, d_2289);
      if(term == null)
        break Fail2537;
      h_2289 = term;
      term = p_2177.invoke(context, e_2289);
      if(term == null)
        break Fail2537;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consVarDeclInit_3, new IStrategoTerm[]{g_2289, h_2289, term}), checkListAnnos(termFactory, f_2289));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}