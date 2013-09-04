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

@SuppressWarnings("all") public class $Module_3_0 extends Strategy 
{ 
  public static $Module_3_0 instance = new $Module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_12041, Strategy j_12041, Strategy k_12041)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_3_0");
    Fail5452:
    { 
      IStrategoTerm l_12154 = null;
      IStrategoTerm i_12154 = null;
      IStrategoTerm j_12154 = null;
      IStrategoTerm k_12154 = null;
      IStrategoTerm m_12154 = null;
      IStrategoTerm n_12154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail5452;
      i_12154 = term.getSubterm(0);
      j_12154 = term.getSubterm(1);
      k_12154 = term.getSubterm(2);
      IStrategoList annos275 = term.getAnnotations();
      l_12154 = annos275;
      term = i_12041.invoke(context, i_12154);
      if(term == null)
        break Fail5452;
      m_12154 = term;
      term = j_12041.invoke(context, j_12154);
      if(term == null)
        break Fail5452;
      n_12154 = term;
      term = k_12041.invoke(context, k_12154);
      if(term == null)
        break Fail5452;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consModule_3, new IStrategoTerm[]{m_12154, n_12154, term}), checkListAnnos(termFactory, l_12154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}