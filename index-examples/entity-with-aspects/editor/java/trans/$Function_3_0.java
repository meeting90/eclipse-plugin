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

@SuppressWarnings("all") public class $Function_3_0 extends Strategy 
{ 
  public static $Function_3_0 instance = new $Function_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_12040, Strategy q_12040, Strategy r_12040)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Function_3_0");
    Fail5442:
    { 
      IStrategoTerm r_12152 = null;
      IStrategoTerm o_12152 = null;
      IStrategoTerm p_12152 = null;
      IStrategoTerm q_12152 = null;
      IStrategoTerm s_12152 = null;
      IStrategoTerm t_12152 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consFunction_3 != ((IStrategoAppl)term).getConstructor())
        break Fail5442;
      o_12152 = term.getSubterm(0);
      p_12152 = term.getSubterm(1);
      q_12152 = term.getSubterm(2);
      IStrategoList annos267 = term.getAnnotations();
      r_12152 = annos267;
      term = p_12040.invoke(context, o_12152);
      if(term == null)
        break Fail5442;
      s_12152 = term;
      term = q_12040.invoke(context, p_12152);
      if(term == null)
        break Fail5442;
      t_12152 = term;
      term = r_12040.invoke(context, q_12152);
      if(term == null)
        break Fail5442;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consFunction_3, new IStrategoTerm[]{s_12152, t_12152, term}), checkListAnnos(termFactory, r_12152));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}