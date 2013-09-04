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

@SuppressWarnings("all") public class $Prop$Access_2_0 extends Strategy 
{ 
  public static $Prop$Access_2_0 instance = new $Prop$Access_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_12039, Strategy a_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PropAccess_2_0");
    Fail5433:
    { 
      IStrategoTerm b_12151 = null;
      IStrategoTerm z_12150 = null;
      IStrategoTerm a_12151 = null;
      IStrategoTerm c_12151 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consPropAccess_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5433;
      z_12150 = term.getSubterm(0);
      a_12151 = term.getSubterm(1);
      IStrategoList annos258 = term.getAnnotations();
      b_12151 = annos258;
      term = z_12039.invoke(context, z_12150);
      if(term == null)
        break Fail5433;
      c_12151 = term;
      term = a_12040.invoke(context, a_12151);
      if(term == null)
        break Fail5433;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consPropAccess_2, new IStrategoTerm[]{c_12151, term}), checkListAnnos(termFactory, b_12151));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}