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

@SuppressWarnings("all") public class $Property_2_0 extends Strategy 
{ 
  public static $Property_2_0 instance = new $Property_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_12039, Strategy w_12039)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Property_2_0");
    Fail5428:
    { 
      IStrategoTerm q_12150 = null;
      IStrategoTerm o_12150 = null;
      IStrategoTerm p_12150 = null;
      IStrategoTerm r_12150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consProperty_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5428;
      o_12150 = term.getSubterm(0);
      p_12150 = term.getSubterm(1);
      IStrategoList annos255 = term.getAnnotations();
      q_12150 = annos255;
      term = v_12039.invoke(context, o_12150);
      if(term == null)
        break Fail5428;
      r_12150 = term;
      term = w_12039.invoke(context, p_12150);
      if(term == null)
        break Fail5428;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consProperty_2, new IStrategoTerm[]{r_12150, term}), checkListAnnos(termFactory, q_12150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}