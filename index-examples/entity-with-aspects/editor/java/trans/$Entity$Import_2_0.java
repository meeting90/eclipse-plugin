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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_12041, Strategy d_12041)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EntityImport_2_0");
    Fail5448:
    { 
      IStrategoTerm u_12153 = null;
      IStrategoTerm s_12153 = null;
      IStrategoTerm t_12153 = null;
      IStrategoTerm v_12153 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consEntityImport_2 != ((IStrategoAppl)term).getConstructor())
        break Fail5448;
      s_12153 = term.getSubterm(0);
      t_12153 = term.getSubterm(1);
      IStrategoList annos271 = term.getAnnotations();
      u_12153 = annos271;
      term = c_12041.invoke(context, s_12153);
      if(term == null)
        break Fail5448;
      v_12153 = term;
      term = d_12041.invoke(context, t_12153);
      if(term == null)
        break Fail5448;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consEntityImport_2, new IStrategoTerm[]{v_12153, term}), checkListAnnos(termFactory, u_12153));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}