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

@SuppressWarnings("all") public class $Read_1_0 extends Strategy 
{ 
  public static $Read_1_0 instance = new $Read_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Read_1_0");
    Fail5406:
    { 
      IStrategoTerm m_12148 = null;
      IStrategoTerm l_12148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consRead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail5406;
      l_12148 = term.getSubterm(0);
      IStrategoList annos242 = term.getAnnotations();
      m_12148 = annos242;
      term = a_12039.invoke(context, l_12148);
      if(term == null)
        break Fail5406;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consRead_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_12148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}