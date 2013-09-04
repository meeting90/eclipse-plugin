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

@SuppressWarnings("all") public class $Param_2_0 extends Strategy 
{ 
  public static $Param_2_0 instance = new $Param_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_12040, Strategy o_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Param_2_0");
    Fail5441:
    { 
      IStrategoTerm l_12152 = null;
      IStrategoTerm j_12152 = null;
      IStrategoTerm k_12152 = null;
      IStrategoTerm m_12152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consParam_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5441;
      j_12152 = term.getSubterm(0);
      k_12152 = term.getSubterm(1);
      IStrategoList annos266 = term.getAnnotations();
      l_12152 = annos266;
      term = n_12040.invoke(context, j_12152);
      if(term == null)
        break Fail5441;
      m_12152 = term;
      term = o_12040.invoke(context, k_12152);
      if(term == null)
        break Fail5441;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consParam_2, new IStrategoTerm[]{m_12152, term}), checkListAnnos(termFactory, l_12152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}