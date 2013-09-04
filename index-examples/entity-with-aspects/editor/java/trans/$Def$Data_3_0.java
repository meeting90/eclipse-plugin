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

@SuppressWarnings("all") public class $Def$Data_3_0 extends Strategy 
{ 
  public static $Def$Data_3_0 instance = new $Def$Data_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_12039, Strategy g_12039, Strategy h_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DefData_3_0");
    Fail5410:
    { 
      IStrategoTerm b_12149 = null;
      IStrategoTerm y_12148 = null;
      IStrategoTerm z_12148 = null;
      IStrategoTerm a_12149 = null;
      IStrategoTerm c_12149 = null;
      IStrategoTerm d_12149 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDefData_3 != ((IStrategoAppl)term).getConstructor())
        break Fail5410;
      y_12148 = term.getSubterm(0);
      z_12148 = term.getSubterm(1);
      a_12149 = term.getSubterm(2);
      IStrategoList annos245 = term.getAnnotations();
      b_12149 = annos245;
      term = f_12039.invoke(context, y_12148);
      if(term == null)
        break Fail5410;
      c_12149 = term;
      term = g_12039.invoke(context, z_12148);
      if(term == null)
        break Fail5410;
      d_12149 = term;
      term = h_12039.invoke(context, a_12149);
      if(term == null)
        break Fail5410;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDefData_3, new IStrategoTerm[]{c_12149, d_12149, term}), checkListAnnos(termFactory, b_12149));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}