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

@SuppressWarnings("all") public class $File$Entries_2_0 extends Strategy 
{ 
  public static $File$Entries_2_0 instance = new $File$Entries_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_12039, Strategy l_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FileEntries_2_0");
    Fail5418:
    { 
      IStrategoTerm n_12149 = null;
      IStrategoTerm l_12149 = null;
      IStrategoTerm m_12149 = null;
      IStrategoTerm o_12149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consFileEntries_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5418;
      l_12149 = term.getSubterm(0);
      m_12149 = term.getSubterm(1);
      IStrategoList annos248 = term.getAnnotations();
      n_12149 = annos248;
      term = k_12039.invoke(context, l_12149);
      if(term == null)
        break Fail5418;
      o_12149 = term;
      term = l_12039.invoke(context, m_12149);
      if(term == null)
        break Fail5418;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consFileEntries_2, new IStrategoTerm[]{o_12149, term}), checkListAnnos(termFactory, n_12149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}