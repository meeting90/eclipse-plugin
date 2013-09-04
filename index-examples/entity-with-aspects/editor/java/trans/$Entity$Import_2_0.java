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

@SuppressWarnings("all") public class $Entity$Import_2_0 extends Strategy 
{ 
  public static $Entity$Import_2_0 instance = new $Entity$Import_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_2178, Strategy i_2178)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EntityImport_2_0");
    Fail2546:
    { 
      IStrategoTerm z_2290 = null;
      IStrategoTerm x_2290 = null;
      IStrategoTerm y_2290 = null;
      IStrategoTerm a_2291 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntityImport_2 != ((IStrategoAppl)term).getConstructor())
        break Fail2546;
      x_2290 = term.getSubterm(0);
      y_2290 = term.getSubterm(1);
      IStrategoList annos133 = term.getAnnotations();
      z_2290 = annos133;
      term = h_2178.invoke(context, x_2290);
      if(term == null)
        break Fail2546;
      a_2291 = term;
      term = i_2178.invoke(context, y_2290);
      if(term == null)
        break Fail2546;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntityImport_2, new IStrategoTerm[]{a_2291, term}), checkListAnnos(termFactory, z_2290));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}